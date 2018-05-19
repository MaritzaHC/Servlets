
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author kevin
 */
public class UsuarioController extends Connection{

    public UsuarioController() {
    }
    
    public UsuarioModel login(UsuarioModel usuario){
        ResultSet resultSet;
        UsuarioModel result = new UsuarioModel();
        try {
            PreparedStatement statement = con.prepareCall(
                    "SELECT * FROM usuarios WHERE username= ?  AND password= ?"
            );
            statement.setString(1, usuario.getUsername());
            statement.setString(2, usuario.getPassword());
            resultSet = statement.executeQuery();
            if(resultSet.first()){
                result.setId(resultSet.getInt("id"));
                result.setUsername(resultSet.getString("username"));
                return result;
            }else return null;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return result;
        }
    }
    public boolean registro(UsuarioModel usuario){
        try {
            PreparedStatement statement = con.prepareStatement(
                    "INSERT INTO usuarios (username, password) values (?, ?)"
            );
            statement.setString(1, usuario.getUsername());
            statement.setString(2, usuario.getPassword());
            statement.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }
}

<%-- 
    Document   : registro
    Created on : 18/05/2018, 10:49:15 PM
    Author     : Maritza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Registro</h1>
        <form action="Regist" method="POST">
            <p>Nombre</p>
            <input type="text" name="name">
            <p>Contraseña</p>
            <input type="password" name="password">
            <input type="submit" value="enviar">
        </form>
    </body>
</html>

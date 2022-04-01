<%-- 
    Document   : registro
    Created on : 28/03/2022, 11:49:31 PM
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <form action="Registro" method="POST">
                <div>
                    <label>Nombre:</label>
                    <input type="text" name="txtnombre">
                </div>
                <div>
                    <label>Correo:</label>
                    <input type="email" name="txtcorreo">
                </div>
                <div>
                    <label>Contraseña:</label>
                    <input type="password" name="txtpassword">
                </div>
                <div>
                    <label>Cedula:</label>
                    <input type="text" name="txtid"
                </div>
                <input type="submit" name="accion" value="Registrar">
            </form>
        </div>
    </body>
</html>

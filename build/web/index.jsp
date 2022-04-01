<%-- 
    Document   : index
    Created on : 28/03/2022, 11:48:55 PM
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
            <div>
                <div>
                    <form action="Validar" method="POST">
                        <h3>Login</h3>
                        <label>Bienvenidos al sistema</label>
                        <div class="form-group">

                        </div>
                        
                        <div class="form-group">
                            <label>Email:</label>
                            <input type="email" name="txtuser">
                            
                        </div>
                        <div class="form-group">
                            <label>Contraseña:</label>
                            <input type="password" name="txtpass">
                        </div>
                        <input type="submit" name="accion" value="Ingresar">
                        <label>¿No tiene una cuenta?</label>
                        <label><a href="registro.jsp">Clic aquí</label>
                        <label>¿Es usted administrador?</label>
                        <label><a href="loginadmin.jsp">Clic aquí para ingresar al sistema</label>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

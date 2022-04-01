<%-- 
    Document   : loginadmin
    Created on : 31/03/2022, 12:38:57 PM
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
                    <form action="Validaradmin" method="POST">
                        <h3>Login</h3>
                        <label>Bienvenidos al sistema</label>
                        <div class="form-group">

                        </div>

                        <div class="form-group">
                            <label>Usuario:</label>
                            <input type="text" name="txtuser">

                        </div>
                        <div class="form-group">
                            <label>Contraseña:</label>
                            <input type="password" name="txtpass">
                        </div>
                        <input type="submit" name="accion" value="Ingresar">
                        <label>¿No tiene una cuenta?</label>
                        <label><a href="registro.jsp">Clic aquí</label>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>

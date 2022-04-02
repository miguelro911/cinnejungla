<%-- 
    Document   : landingadmin
    Created on : 31/03/2022, 12:39:48 PM
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
        <h1>Escoge la sede en la que quieres ingresar</h1>
        <form action="Modulos" method="POST">
            <select  name="Centro">
                <option>Las Americas</option>
                <option>Embajador</option>
                <option>Gran Estacion</option>
                <option>Plaza Central</option>
                <option>Unicentro</option>
                <option>Titan</option>
            </select>
            <input type="submit" name="accion" value="escogecc">
        </form>

    </body>
</html>

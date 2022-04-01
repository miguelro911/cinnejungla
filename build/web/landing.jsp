<%-- 
    Document   : landing
    Created on : 28/03/2022, 11:50:15 PM
    Author     : Miguel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenidos a CineJungla</title>
    </head>
    <body>
        <nav>
            <h1>Hola mundo</h1>
            <h2>${usuario.getNombre()}</h2>
        </nav>
        
            <c:forEach var="pelicula" items="${lista}">
                <img src="<c:out value="${pelicula.img}"/>"
                <p><c:out value="${pelicula.nombre}"/></p>
                <p><c:out value="${pelicula.genero}"/></p>
                <p><c:out value="${pelicula.año}"/></p>
                <p><c:out value="${pelicula.duracion}"/></p>
            </c:forEach>
       
    </body>
</html>

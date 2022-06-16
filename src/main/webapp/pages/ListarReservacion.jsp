<%-- 
    Document   : ListarReservacion
    Created on : 14 jun 2022, 10:56:38
    Author     : labso02
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table id="customers">
            <tr>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Lugar</th>
                <th>Personas</th>
                <th>Fecha de entrada</th>
                <th>Fecha de salida</th>
                <th>Editar</th>
                <th>Eliminar</th>
            </tr>
            <c:forEach var="reservacion" items="${listaReservacion}">
                <tr>
                    <td><c:out value="${reservacion.nombre}"/></td>
                    <td><c:out value="${reservacion.apellido}"/></td>
                    <td><c:out value="${reservacion.lugar}"/></td>
                    <td><c:out value="${reservacion.personas}"/></td>
                    <td><c:out value="${reservacion.fechaEntrada}"/></td>
                    <td><c:out value="${reservacion.fechaSalida}"/></td>
                    <td><a href="ReservacionServletController?action=editar&id=<c:out value="${reservacion.codigo}"/>">Editar</a></td>
                    <td><a href="ReservacionServletController?action=eliminar&id=<c:out value="${reservacion.codigo}"/>">Eliminar</a></td>
                </tr>
            </c:forEach>    
        </table>
    </body>
</html>

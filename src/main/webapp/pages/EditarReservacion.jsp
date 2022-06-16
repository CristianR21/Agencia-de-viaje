<%-- 
    Document   : EditarReservacion
    Created on : 14 jun 2022, 10:56:24
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
        <form action='${pageContext.request.contextPath}/ReservacionServletController?action=guardar' method='POST'>
                <fieldset>
                    <legend>Registro de Reservaciones</legend>
                    
                    <input  type='hidden' name='id' value="<c:out value="${reservacion.codigo}"/>"><br>
                    
                    <label>Nombre</label><br>
                    <input  name="Nombre" type="text" value="<c:out value="${reservacion.nombre}"/>"><br>
                        
                        <label>Apellido</label><br>
                        <input  name="Apellido" type="text" value="<c:out value="${reservacion.apellido}"/>"><br>
                        
                        <label>Lugar</label><br>
                        <input  name="Lugar" type="text" value="<c:out value="${reservacion.lugar}"/>"><br>
                        
                        <label>Personas</label><br>
                        <input  name="Personas" type="number"><br>
                        
                        <label>Fecha de entrada</label><br>
                        <input  name="FechaE" type="date"><br>
                        
                        <label>Fecha de salida</label><br>
                        <input  name="FechaS" type="date"><br>
                        
                        <input type="submit" value="Submit">
                                
                </fieldset>
            </form>
    </body>
</html>

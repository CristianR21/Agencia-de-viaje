<%-- 
    Document   : CrearReservacion
    Created on : 14 jun 2022, 10:56:13
    Author     : labso02
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action='../ReservacionServletController?action=crear' method='POST'>
                <fieldset>
                    <legend>Registro de Reservaciones</legend>
                    
                    <label>Nombre</label><br>
                        <input  name="Nombre" type="text"><br>
                        
                        <label>Apellido</label><br>
                        <input  name="Apellido" type="text"><br>
                        
                        <label>Lugar</label><br>
                        <input  name="Lugar" type="text"><br>
                        
                        <label>Personas</label><br>
                        <input  name="Personas" type="number"><br>
                        
                        <label>Fecha de entrada</label><br>
                        <input  name="FechaE" type="date"><br>
                        
                        <label>Fecha de salida</label><br>
                        <input  name="FechaS" type="date"><br>
                        
                        <input type="submit" value="Reservar">
                                
                </fieldset>
            </form>
    </body>
</html>

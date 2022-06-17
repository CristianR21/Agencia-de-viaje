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
<style type="text/css">
        <%@include file="../resources/css/crearreservacion.css" %>
        </style>
    </head>
    <body class="fondo">
<div id="main">
	<header>
		<h1>Registro de Reservaciones</h1>
	</header>	<!-- FIN cabecera -->
        <form action='../ReservacionServletController?action=crear' method='POST'>
                <fieldset>
	<div id="contenido">
                    <label>Nombre</label><br>
                        <input  name="Nombre" type="text"><br>
                        <label>Apellido</label><br>

                        <input  name="Apellido" type="text"><br>
                        <label>Lugares disponibles</label><br>

                        <select name="Lugar"type="text"><br>
                        <option value="Ventanilla"> Ventanilla</option>
                        <option value="Mazunte"> Mazunte</option>
                        <option value="Puerto Angel"> Puerto Angel</option>
                        <option value="Playa la entrega"> Playa la entrega</option>
                        <option value="Bahia Cacaluta"> Bahia Cacaluta</option>
                        <option value="Playa Chahue"> Playa Chahue</option>
                        </select>
                        <br>

                        <label>Personas</label><br>
                        <input  name="Personas" type="number"><br>
                        
                        <label>Fecha de entrada</label><br>
                        <input  name="FechaE" type="date"><br>
                        
                        <label>Fecha de salida</label><br>
                        <input  name="FechaS" type="date"><br>
                        
                        <input type="submit" value="Reservar">
                        	</div> <!-- FIN contenido -->  
                       </div> <!-- FIN main -->
    </body>
</html>

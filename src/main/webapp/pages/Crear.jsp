<%-- 
    Autor: Cristian Adair Ramirez R
    Fecha de creación: 19 de abril de 2022
    Fecha de modificación: 10 de mayo de 2022
    Descripción: Creacion de nuevo cliente
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style type="text/css">
<%@include file="../resources/css/Crear.css" %>
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>

    <body>


        <div id="wrapper">
            <form class="login" action="ClienteServletController?action=crear" method="POST">
                
                <h2 class="tituloForm1">Registro</h2> 
                <p class="texto">Suscripcion a la agencia de viajes</p>
                <label>Nombre:</label>
                <label class="label-input">
                    <i class="far fa-envelope icon-modificado"></i>
                    <input type="text" name="nombre" placeholder="Nombre">
                </label>
                <label>Apellido:</label>
                <label class="label-input">
                    <i class="far fa-envelope icon-modificado"></i>
                    <input type="text" name="apellido" placeholder="Nombre">
                </label>
                <label>Telefono</label>
                <label class="label-input">
                    <i class="fas fa-lock icon-modificado"></i>
                    <input type="text" name="telefono" placeholder="Telefono">
                </label>
                <label>Edad</label>
                <label class="label-input">
                    <i class="fas fa-lock icon-modificado"></i>
                    <input type="text" name="edad" placeholder="Edad">
                </label>
                <label>Correo</label>
                <label class="label-input">
                    <i class="fas fa-lock icon-modificado"></i>
                    <input type="text" name="correo" placeholder="correo">
                </label>
                <br>
                <center> <button class="btn btnLogin1">Confirmar</button></center>
            </form>

        </div>
        <footer>&copy Cristian Adair</footer>
    </body>
</html>

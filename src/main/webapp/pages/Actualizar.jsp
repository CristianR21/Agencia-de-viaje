<%-- 
    Autor: Cristian Adair Ramirez R
    Fecha de creación: 19 de abril de 2022
    Fecha de modificación: 1 de mayo de 2022
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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
            <form class="login" action="ClienteServletController?action=actualizar" method="POST">
                 <input type="hidden" name="codigo" value="<c:out value="${cliente.codigo}"></c:out>">
                <h2 class="tituloForm1">Registro</h2> 
                <p class="texto">Forma parte del equipo</p>
                <label>Nombre:</label>
                <label class="label-input">
                    <i class="far fa-envelope icon-modificado"></i>
                    <input type="text" name="nombre" placeholder="Nombre"value="<c:out value="${cliente.nombrecliente}"></c:out>"> 
                </label>
                <label>Apellido:</label>
                <label class="label-input">
                    <i class="far fa-envelope icon-modificado"></i>
                    <input type="text" name="apellido" placeholder="Apellido"value="<c:out value="${cliente.apellido}"></c:out>">
                </label>
                <label>Telefono</label>
                <label class="label-input">
                    <i class="fas fa-lock icon-modificado"></i>
                    <input type="text" name="telefono" placeholder="Telefono"value="<c:out value="${cliente.telefono}"></c:out>">
                </label>
                <label>Edad</label>
                <label class="label-input">
                    <i class="fas fa-lock icon-modificado"></i>
                    <input type="text" name="edad" placeholder="Edad"value="<c:out value="${cliente.edad}"></c:out>">
                </label>
                <label>Correo</label>
                <label class="label-input">
                    <i class="fas fa-lock icon-modificado"></i>
                    <input type="text" name="correo" placeholder="correo"value="<c:out value="${cliente.correo}"></c:out>">
                </label>
                <br>
                <center><button class="btn btnLogin1">Actualizar</button></center>
            </form>

        </div>
        <footer>&copy Cristian Adair</footer>    </body>
</html>

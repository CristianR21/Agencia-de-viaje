<%-- 
    Autor: Cristian Adair Ramirez R
    Fecha de creación: 19 de abril de 2022
    Fecha de modificación: 10 de mayo de 2022
    Descripción: Creacion de la tabla de en listar
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    
    <head>
        <style type="text/css">
            <%@include file="../resources/css/tabla.css" %>
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 
    </head>
    <body>
    <center><p class="georgia">Registro de clientes</p></center>
        <hr/>
        <table border="1" width="100%" class="table">			
            <tr>
                <th>id</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Telefono</th>
                <th>Edad</th>
                <th>Correo</th>
                <th colspan=2>Acciones</th>  
            </tr>
            <tr>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
                <td></td>
            </tr>
            <c:forEach var="cliente" items="${ListaCliente}">
                <tr>
                    <td><c:out value="${cliente.codigo}"/></td>
                    <td><c:out value="${cliente.nombrecliente}"/></td>
                    <td><c:out value="${cliente.apellido}"/></td>
                    <td><c:out value="${cliente.telefono}"/></td>
                    <td><c:out value="${cliente.edad}"/></td>
                    <td><c:out value="${cliente.correo}"/></td>

                    <td><a href="ClienteServletController?action=actualizaForm&codigo=<c:out value="${cliente.codigo}"/>">Editar</a></td>
                    <td><a href="ClienteServletController?action=eliminar&codigo=<c:out value="${cliente.codigo}"/>" onclick="return confirm('Estás seguro que deseas eliminar el registro?')"  >Eliminar</a></td>

                </tr> 
            </c:forEach>
        </table> 


    </body>
</html>

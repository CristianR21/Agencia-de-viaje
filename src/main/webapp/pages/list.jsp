<%-- 
    Document   : list
    Created on : 9 jun 2022, 17:33:09
    Author     : labso07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
<table class="highlight centered responsive-table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Nombre de usuario</th>
                    <th>Contraseña</th>
                    <th>Nombre</th>
                    <th>Sexo</th>
                    <th>Edad</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="usuario" items="${ListaUsuario}">
                    <tr>
                        <td><c:out value="${usuario.id}"/></td> 
                        <td><c:out value="${usuario.nombreusuario}"/></td>
                        <td><c:out value="${usuario.contrasena}"/></td>
                        <td><c:out value="${usuario.nombre}"/></td>
                        <td><c:out value="${usuario.sexo}"/></td>
                        <td><c:out value="${usuario.edad}"/></td>
                        
                        <td>
                                    <a class="tooltip_left btn-floating btn-large waves-effect cyan darken-2" href="UsuarioServletController?action=actualizarForm&id=<c:out value="${usuario.id}"/>">
                                        <i class="fa-solid fa-pen"></i>
                                    </a>
                                    <a class="tooltip_right btn-floating btn-large waves-effect cyan darken-2" href="UsuarioServletController?action=eliminar&id=<c:out value="${usuario.id}"/>">
                                       <i class="fa-solid fa-rectangle-xmark"></i>
                                    </a>
                                </td>
                    </tr> 
                </c:forEach>


            </tbody>
        </table><!-- FIN TABLE -->    </body>
</html>

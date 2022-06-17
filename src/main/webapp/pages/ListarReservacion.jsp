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
<link rel="Stylesheet" 
              href="webjars/bootstrap/5.1.3/css/bootstrap.min.css">
        <script src="webjars/jquery/3.6.0/dist/jquery.min.js"></script> 
        <script src="webjars/bootstrap/5.1.3/js/bootstrap.bundle.js"></script>
        <link rel="Stylesheet" 
              href="webjars/fontawesome/4.7.0/css/font-awesome.min.css"> 
    </head>
    <body>

            <c:forEach var="reservacion" items="${listaReservacion}">
<center>
    <div class="card mb-3" style="max-width: 800px;">
  <div class="row g-0">
    <div class="col-md-4">
      <img src="resources/img/playita.jpg" width="5000" height="1000" class="img-fluid rounded-start" alt="">
</picture>
    </div>
    <div class="col-md-8">
      <div class="card-body">
        <h5 class="card-title">Reservaciones de costa serena</h5>
          <tr>
        <p class="card-text"><td><c:out value="${reservacion.nombre}"/></td></p>
        <p class="card-text"><td><c:out value="${reservacion.apellido}"/></td></p>
        <p class="card-text"><td><c:out value="${reservacion.lugar}"/></td></p>
        <p class="card-text"><td><c:out value="${reservacion.personas}"/></td></p>
        <p class="card-text"><td><c:out value="${reservacion.fechaEntrada}"/></td></p>
        <p class="card-text"><td><c:out value="${reservacion.fechaSalida}"/></td></p>
        <td><a href="ReservacionServletController?action=editar&id=<c:out value="${reservacion.codigo}"/>">Editar</a></td>
         <td><a href="ReservacionServletController?action=eliminar&id=<c:out value="${reservacion.codigo}"/>">Eliminar</a></td>
         </tr>
      </div>
    </div>
  </div>
</div>
</center>
            </c:forEach>    


    </body>
</html>

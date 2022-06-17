<%-- 
    Document   : Createform
    Created on : 9 jun 2022, 17:21:10
    Author     : labso07
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <style type="text/css">
<%@include file="../resources/css/RegistrarEditar.css" %>

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 <div class="containerForm">
            <div class="row card hoverable">
                <div class="card-content ">
                    <h4 class="center blue-text">Registrar usuario</h4>
                    <form class="row s12" action="UsuarioServletController?action=listar" method="post">
                        <input type='hidden' name='idUsuario' ><br>  
                        <div class="col s12">
                            <div class="input-field">
                                <input type="text" name="nombreusuario" placeholder="Nombre de ususario*" class="validate" required>
                            </div>
                        </div>
                        <div class="col s12">
                            <div class="input-field">
                                <input type="password" name="contrasena" placeholder="Contraseña*" class="validate" required>
                            </div>
                        </div>
                        <div class="col s12">
                            <div class="input-field">
                                <input type="text" name="nombre" placeholder="Nombre" class="validate" required>
                            </div>
                        </div>
                        <div class="col s12">
                            <div class="input-field">

                                <input type='text' name='sexo' placeholder="Sexo" class="validate" required><br>
                            </div>
                        </div>

                        <div class="col s12">
                            <div class="input-field">

                                <input type="text" name="edad" placeholder="Edad" class="validate" required onkeypress="return event.charCode >= 48 && event.charCode <= 57"   ><br>

                            </div>
                        </div>



                        <div class="col s12">
                            <p><label><input type="checkbox"></label></p>
                        </div>
                        <div class="col s12 center">
                            <button type="submit" class="btn btn-large waves-effect waves-light blue" value='Guardar'>Registrarse<i class="material-icons right"></i></button>

                        </div>
                    </form>
                </div>
            </div>
        </div>    </body>
</html>

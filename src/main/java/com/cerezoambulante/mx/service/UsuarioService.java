/*
    Autor: Cristian Adair Ramirez R
    Fecha de creación: 19 de abril de 2022
    Fecha de modificación: 10 de mayo de 2022

 */
package com.cerezoambulante.mx.service;

import com.cerezoambulante.mx.entity.Usuario;
import java.util.List;

public interface UsuarioService {
      public List<Usuario> obtenerRegistros();
   
   public void actualizarRegistro(Usuario usuario);
   
   public void eliminarRegistro(Usuario usuario);
   
   public void crearRegistro(Usuario usuario);
    
   public Usuario obtenerRegistro (int idUsuario); 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cerezoambulante.mx.service;

import com.cerezoambulante.mx.entity.Usuario;
import java.util.List;

/**
 *
 * @author labso07
 */
public interface IUsuarioService {
     public List<Usuario> obtenerRegistros();
   
   public void actualizarRegistro(Usuario usuario);
   
   public void eliminarRegistro(Usuario usuario);
   
   public void crearRegistro(Usuario usuario);
    
   public Usuario obtenerRegistro (int idUsuario);  
}

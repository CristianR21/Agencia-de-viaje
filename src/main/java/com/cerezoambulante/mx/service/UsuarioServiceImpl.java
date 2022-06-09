/*
 Autor: cristian ramirez rodriguez
 Fecha de creacion: 16 de mayo de 2022
 Fecha de modificacion: 30 de mayo de 2022
 Descripcion: Se crea una clase que implementa los metodos de la interface.
 */
package com.cerezoambulante.mx.service;

import com.cerezoambulante.mx.entity.Usuario;
import com.cerezoambulante.mx.model.IUsuarioImpl;
import com.cerezoambulante.mx.model.UsuarioModel;
import java.util.List;

/**
 *
 * @author labso07
 */
public class UsuarioServiceImpl implements UsuarioService{

   UsuarioModel model =new IUsuarioImpl();
    
    @Override
    public List<Usuario> obtenerRegistros() {
        return model.obtenerRegistros();
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
       model.actualizarRegistro(usuario);
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
       model.eliminarRegistro(usuario);
    }

    @Override
    public void crearRegistro(Usuario usuario) {
        model.crearRegistro(usuario);
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
     return model.obtenerRegistro(idUsuario);
    }
    
    
}

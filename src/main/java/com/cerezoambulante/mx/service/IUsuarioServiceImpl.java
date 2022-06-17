/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cerezoambulante.mx.service;

import com.cerezoambulante.mx.entity.Usuario;
import com.cerezoambulante.mx.model.IUsuarioModel;
import com.cerezoambulante.mx.model.UsuarioModelImpl;
import java.util.List;

/**
 *
 * @author labso07
 */
public class IUsuarioServiceImpl implements IUsuarioService{
    IUsuarioModel model =new UsuarioModelImpl();

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

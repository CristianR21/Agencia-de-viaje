/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.cerezoambulante.mx.model;

import com.cerezoambulante.mx.entity.Cliente;
import java.util.List;

/**
 *
 * @author labso07
 */
public interface IViajesModel {
          public void crearRegistro(Cliente cliente);

    public void actualizarRegistro(Cliente cliente);

    public List<Cliente> obtenerRegistros();

    public Cliente obtenerRegistro(int codigo);

    public void eliminarRegistro(Cliente cliente);  
}

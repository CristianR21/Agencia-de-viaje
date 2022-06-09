/*
    Autor: Cristian Adair Ramirez R
    Fecha de creación: 19 de abril de 2022
    Fecha de modificación: 7 de mayo de 2022
 */
package com.cerezoambulante.mx.service;

import com.cerezoambulante.mx.entity.Cliente;
import java.util.List;


public interface IClienteService {
       public void crearRegistro(Cliente cliente);

    public void actualizarRegistro(Cliente cliente);

    public List<Cliente> obtenerRegistros();

    public Cliente obtenerRegistro(int codigo);

    public void eliminarRegistro(Cliente cliente); 
}

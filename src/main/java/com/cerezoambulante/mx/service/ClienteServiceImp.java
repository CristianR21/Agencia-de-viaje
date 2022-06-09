/*

    Autor: Cristian Adair Ramirez R
    Fecha de creación: 19 de abril de 2022
    Fecha de modificación: 10 de mayo de 2022

 */
package com.cerezoambulante.mx.service;

import com.cerezoambulante.mx.entity.Cliente;
import com.cerezoambulante.mx.model.ClienteModelImpl;
import com.cerezoambulante.mx.model.IClientemodel;
import java.util.List;

public class ClienteServiceImp implements IClienteService {

    IClientemodel modelo = new ClienteModelImpl();

    @Override
    public void crearRegistro(Cliente cliente) {
        modelo.crearRegistro(cliente);
    }

    @Override
    public void actualizarRegistro(Cliente cliente) {
      modelo.actualizarRegistro(cliente);
    }

    @Override
    public List<Cliente> obtenerRegistros() {
      return modelo.obtenerRegistros();  
    }

    @Override
    public Cliente obtenerRegistro(int codigo) {
        return modelo.obtenerRegistro(codigo);
    }

    @Override
    public void eliminarRegistro(Cliente cliente) {
        modelo.eliminarRegistro(cliente);
    }

}

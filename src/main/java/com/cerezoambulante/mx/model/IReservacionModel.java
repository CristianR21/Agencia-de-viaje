
package com.cerezoambulante.mx.model;

import com.cerezoambulante.mx.entity.Reservacion;
import java.util.List;

public interface IReservacionModel {
    public void crearRegistro(Reservacion reservacion);

    public void actualizarRegistro(Reservacion reservacion);

    public void eliminarRegistro(Reservacion reservacion);

    public List<Reservacion> obtenerRegistros();

    public Reservacion obtenerRegistro(int idReservacion);
}

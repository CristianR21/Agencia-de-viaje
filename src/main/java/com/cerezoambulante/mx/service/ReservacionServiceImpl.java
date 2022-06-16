package com.cerezoambulante.mx.service;

import com.cerezoambulante.mx.entity.Reservacion;
import com.cerezoambulante.mx.model.IReservacionModel;
import com.cerezoambulante.mx.model.ReservacionModelImpl;
import java.util.List;

public class ReservacionServiceImpl implements IReservacionService {

    IReservacionModel modelo = new ReservacionModelImpl();

    @Override
    public void crearRegistro(Reservacion reservacion) {
        modelo.crearRegistro(reservacion);
    }

    @Override
    public void actualizarRegistro(Reservacion reservacion) {
        modelo.actualizarRegistro(reservacion);
    }

    @Override
    public void eliminarRegistro(Reservacion reservacion) {
        modelo.eliminarRegistro(reservacion);
    }

    @Override
    public List<Reservacion> obtenerRegistros() {
        return modelo.obtenerRegistros();
    }

    @Override
    public Reservacion obtenerRegistro(int idReservacion) {
        return modelo.obtenerRegistro(idReservacion);
    }

}

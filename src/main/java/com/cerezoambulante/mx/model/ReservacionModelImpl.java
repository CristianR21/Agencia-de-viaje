package com.cerezoambulante.mx.model;

import com.cerezoambulante.mx.entity.Reservacion;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReservacionModelImpl implements IReservacionModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Reservacion reservacion) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(reservacion);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al crear los registros: " + e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Reservacion reservacion) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(reservacion);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al recuperar los registros: " + e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(Reservacion reservacion) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(reservacion);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (HibernateException e) {
            System.out.println("Error al eliminar los registros: " + e.getMessage());
        }
    }

    @Override
    public List<Reservacion> obtenerRegistros() {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            List<Reservacion> lista = s.createCriteria(Reservacion.class).list();
            s.close();
            sf.close();
            return lista;
        } catch (HibernateException e) {
            System.out.println("Error al recuperar los registros: " + e.getMessage());
        }
        return null;
    }

    @Override
    public Reservacion obtenerRegistro(int idReservacion) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            Reservacion reservacion = (Reservacion) s.get(Reservacion.class, idReservacion);
            s.close();
            sf.close();
            return reservacion;
        } catch (HibernateException e) {
            System.out.println("Error al recuperar los registros: " + e.getMessage());
        }
        return null;
    }

}

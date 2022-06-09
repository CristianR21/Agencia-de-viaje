/*
    Autor: Cristian Adair Ramirez R
    Fecha de creación: 15 de mayo de 2022
    Fecha de modificación: 20 de mayo de 2022
 */
package com.cerezoambulante.mx.model;

import com.cerezoambulante.mx.entity.Cliente;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class ClienteModelImpl implements IClientemodel {

    private SessionFactory sf;
    private Session s;

    @Override
    public void crearRegistro(Cliente clnt) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(clnt);
            s.getTransaction().commit();
            s.close();
            sf.close();
            System.out.println("Creado con exito");
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro: " + e.getMessage());
        }
    }

    @Override
    public void actualizarRegistro(Cliente clnt) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(clnt);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    @Override
    public List<Cliente> obtenerRegistros() {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            List<Cliente> lista = s.createCriteria(Cliente.class).list();

            s.close();
            sf.close();
            return lista;
        } catch (HibernateException e) {
            System.out.println("Error al recuperar los registros " + e.getMessage());
        }
        return null;
    }

    @Override
    public Cliente obtenerRegistro(int codigo) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            Cliente usuario = (Cliente) s.get(Cliente.class, codigo);
            s.close();
            sf.close();
            return usuario;
        } catch (HibernateException e) {
            System.out.println("Error al recuperar los registros: " + e.getMessage());
        }
        return null;
    }

    @Override
    public void eliminarRegistro(Cliente clnt) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(clnt);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("INGRESADO...");
        IClientemodel model = new ClienteModelImpl();
        Cliente u = new Cliente();
        u.setCodigo(5);
        u.setNombrecliente("Actualizado");
        u.setApellido("Actua");
        u.setTelefono("1232323232");
        u.setEdad(23);
        u.setCorreo("sfdfer@sdsds.com");
        model.crearRegistro(u);
        System.out.println("Ingresado correctamente");
    }

}

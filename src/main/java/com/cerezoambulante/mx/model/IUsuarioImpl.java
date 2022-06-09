/*
    Autor: Cristian Adair Ramirez R
    Fecha de creación: 20 de abril de 2022
    Fecha de modificación: 25 de mayo de 2022
 */
package com.cerezoambulante.mx.model;

import com.cerezoambulante.mx.entity.Usuario;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author labso07
 */
public class IUsuarioImpl implements UsuarioModel {

    private SessionFactory sf;
    private Session s;

    @Override
    public List<Usuario> obtenerRegistros() {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            List<Usuario> lista = s.createCriteria(Usuario.class).list();
            s.close();

            sf.close();
            return lista;
        } catch (HibernateException e) {
            System.out.println("Error al recuperar los registros:" + e.getMessage());
        }
        return null;
    }

    @Override
    public void actualizarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.update(usuario);
            s.getTransaction().commit();
            s.close();
            sf.close();

        } catch (Exception e) {
            System.out.println("Error al actualizar el registro:" + e.getMessage());
        }
    }

    @Override
    public void eliminarRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.delete(usuario);
            s.getTransaction().commit();
            s.close();
            sf.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar el registro:" + e.getMessage());
        }
    }

    @Override
    public void crearRegistro(Usuario usuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            s.beginTransaction();
            s.save(usuario);
            s.getTransaction().commit();
            s.close();
            sf.close();
            System.out.println("Ingresado correctamente");
        } catch (HibernateException e) {
            System.out.println("Error al crear el registro:" + e.getMessage());
        }
    }

    @Override
    public Usuario obtenerRegistro(int idUsuario) {
        try {
            sf = new Configuration().configure().buildSessionFactory();
            s = sf.openSession();
            Usuario usuario = (Usuario) s.get(Usuario.class, idUsuario);

            s.close();
            sf.close();
            return usuario;
        } catch (Exception e) {
            System.out.println("Error al recuperar el registro:" + e.getMessage());
        }
        return null;
    }

    public static void main(String[] args) {
        UsuarioModel c = new IUsuarioImpl();
        Usuario u = new Usuario();
        u.setNombreusuario("cris");
        u.setContrasena("1234");
        u.setNombre("cristian");
        u.setSexo("masculino");
        u.setEdad(10);
        c.crearRegistro(u);
    }
}

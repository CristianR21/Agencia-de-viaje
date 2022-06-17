
package com.cerezoambulante.mx.controller;

import com.cerezoambulante.mx.entity.Reservacion;
import com.cerezoambulante.mx.service.IReservacionService;
import com.cerezoambulante.mx.service.ReservacionServiceImpl;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ReservacionServletController extends HttpServlet {
    private IReservacionService service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("switch: " + action);
        switch (action) {
            case "crear":
                crear(request, response);
                break;
            case "listar":
                listar(request, response);
                break;
            case "eliminar":
                eliminar(request, response);
                break;
            case "editar":
                editar(request, response);
                break;
            case "guardar":
                guardar(request, response);
                break; 
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        System.out.println("switch: " + action);
        switch (action) {
            case "crear":
                crear(request, response);
                break;
            case "listar":
                listar(request, response);
                break;
            case "eliminar":
                eliminar(request, response);
                break;
            case "editar":
                editar(request, response);
                break;
            case "guardar":
                guardar(request, response);
                break; 
        }
    }
private void crear(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(request.getParameter("Contra"));
        IReservacionService service = new ReservacionServiceImpl();
        Reservacion r = new Reservacion();
        int persona = Integer.parseInt(request.getParameter("Personas"));
        r.setNombre(request.getParameter("Nombre"));
        r.setApellido(request.getParameter("Apellido"));
        r.setLugar(request.getParameter("Lugar"));
        r.setPersonas(persona);
        r.setFechaEntrada(request.getParameter("FechaE"));
        r.setFechaSalida(request.getParameter("FechaS"));
        service.crearRegistro(r);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/ListarReservacion.jsp");
        this.service = new ReservacionServiceImpl();
        List<Reservacion> listaReservacion = this.service.obtenerRegistros();
        request.setAttribute("listaReservacion", listaReservacion);
        dispatcher.forward(request, response);
    }


    private void listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/ListarReservacion.jsp");
        this.service = new ReservacionServiceImpl();
        List<Reservacion> listaReservacion = this.service.obtenerRegistros();
        request.setAttribute("listaReservacion", listaReservacion);
        dispatcher.forward(request, response);
    }

    private void eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idReservacion = Integer.parseInt(request.getParameter("id"));
        Reservacion r = new Reservacion();
        this.service = new ReservacionServiceImpl();
        r = this.service.obtenerRegistro(idReservacion);
        IReservacionService service = new ReservacionServiceImpl();
        service.eliminarRegistro(r);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/ListarReservacion.jsp");
        List<Reservacion> listaReservacion = this.service.obtenerRegistros();
        request.setAttribute("listaReservacion", listaReservacion);
        dispatcher.forward(request, response);
    }

    private void editar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idReservacion = Integer.parseInt(request.getParameter("id"));
        Reservacion reservacion = new Reservacion();
        this.service = new ReservacionServiceImpl();
        reservacion = this.service.obtenerRegistro(idReservacion);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/EditarReservacion.jsp");
        request.setAttribute("reservacion", reservacion);
        dispatcher.forward(request, response);
    }

    private void guardar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idReservacion = Integer.parseInt(request.getParameter("id"));
        Reservacion r = new Reservacion();
        this.service = new ReservacionServiceImpl();
        r = this.service.obtenerRegistro(idReservacion);
        int persona = Integer.parseInt(request.getParameter("Personas"));
        r.setNombre(request.getParameter("Nombre"));
        r.setApellido(request.getParameter("Apellido"));
        r.setLugar(request.getParameter("Lugar"));
        r.setPersonas(persona);
        r.setFechaEntrada(request.getParameter("FechaE"));
        r.setFechaSalida(request.getParameter("FechaS"));
        IReservacionService service = new ReservacionServiceImpl();
        service.actualizarRegistro(r);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/ListarReservacion.jsp");
        List<Reservacion> listaReservacion = this.service.obtenerRegistros();
        request.setAttribute("listaReservacion", listaReservacion);
        dispatcher.forward(request, response);
    }

}

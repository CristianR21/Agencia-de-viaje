/*
    Autor: Cristian Adair Ramirez R
    Fecha de creación: 19 de abril de 2022
    Fecha de modificación: 5 de mayo de 2022
 */
package com.cerezoambulante.mx.controller;

import com.cerezoambulante.mx.entity.Cliente;
import com.cerezoambulante.mx.service.ClienteServiceImp;
import com.cerezoambulante.mx.service.IClienteService;
import java.io.IOException;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ClienteServletController extends HttpServlet {

    IClienteService service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "Listar":
                out.println("listando....");
                Listar(request, response);
                break;
            case "crear":
                System.out.println("Creando....");
                crear(request, response);
                break;
            case "CrearFormulario":
                CrearFormulario(request, response);
                break;
            case "eliminar":
                Eliminar(request, response);
                break;
            case "actualizaForm":
                ActualizarForm(request, response);
                break;
            case "actualizar":
                System.out.println("Actualizando....");
                Actualizar(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    private void Listar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/Listar.jsp");
        this.service = new ClienteServiceImp();
        List<Cliente> ListaCliente = this.service.obtenerRegistros();
        request.setAttribute("ListaCliente", ListaCliente);
        dispatcher.forward(request, response);
    }

    private void CrearFormulario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/pages/Crear.jsp");
        dispatcher.forward(request, response);
    }

    private void crear(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente cliente = new Cliente();
        cliente.setNombrecliente(request.getParameter("nombre"));
        cliente.setApellido(request.getParameter("apellido"));
        cliente.setTelefono(request.getParameter("telefono"));
        int e = Integer.parseInt(request.getParameter("edad"));
        cliente.setEdad(e);
        cliente.setCorreo(request.getParameter("correo"));
        service = new ClienteServiceImp();
        service.crearRegistro(cliente);
        System.out.println("INGRESADO: " + cliente.getNombrecliente());
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/Listar.jsp");
        this.service = new ClienteServiceImp();
        List<Cliente> ListaCliente = this.service.obtenerRegistros();
        request.setAttribute("ListaCliente", ListaCliente);
        dispatcher.forward(request, response);
    }

    private void Eliminar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/Listar.jsp");
        this.service = new ClienteServiceImp();
        Cliente cliente = new Cliente();
        cliente = this.service.obtenerRegistro(Integer.parseInt(request.getParameter("codigo")));
        service.eliminarRegistro(cliente);
        System.out.println("eliminando.....");
        List<Cliente> ListaCliente = this.service.obtenerRegistros();
        request.setAttribute("ListaCliente", ListaCliente);
        dispatcher.forward(request, response);
    }

  private void ActualizarForm(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente cliente = this.service.obtenerRegistro(Integer.parseInt(request.getParameter("codigo")));
        request.setAttribute("cliente", cliente);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/Actualizar.jsp");
        dispatcher.forward(request, response);
    }

    private void Actualizar(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Cliente cliente = new Cliente();
        int i=Integer.parseInt(request.getParameter("codigo"));
        cliente.setCodigo(i);
        cliente.setNombrecliente(request.getParameter("nombre"));
        cliente.setApellido(request.getParameter("apellido"));
        cliente.setTelefono(request.getParameter("telefono"));
        int e = Integer.parseInt(request.getParameter("edad"));
        cliente.setEdad(e);
        cliente.setCorreo(request.getParameter("correo"));
                service.actualizarRegistro(cliente);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/pages/Listar.jsp");
        List<Cliente> ListaCliente = this.service.obtenerRegistros();
        request.setAttribute("ListaCliente", ListaCliente);
        dispatcher.forward(request, response);
    }

}

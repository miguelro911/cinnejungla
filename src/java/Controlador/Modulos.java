/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Empleado;
import Modelo.MultiplexDAO;
import Modelo.MultiplexFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Miguel
 */
public class Modulos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        String accion = request.getParameter("accion");
        String comercial = request.getParameter("Centro");
        System.out.println(comercial);
        System.out.println(accion);
        if (accion.equalsIgnoreCase("escogecc")) {
            request.getRequestDispatcher("Controlador?accion=escogemodulo").forward(request, response);
        }

        if (accion.equalsIgnoreCase("empleados")) {
            request.getRequestDispatcher("Controlador?accion=empleados").forward(request, response);
            if (comercial == "Plaza Central") {

                MultiplexFactory mul = new MultiplexFactory();
                MultiplexDAO multi = mul.CrearMultiplex("Plaza Central");
                List<Empleado> emp = multi.consultaremo();
                request.setAttribute("empleado", emp);
                request.getRequestDispatcher("Controlador?accion=empleados").forward(request, response);

            }
            if (comercial == "Unicentro") {
                MultiplexFactory mul = new MultiplexFactory();
                MultiplexDAO multi = mul.CrearMultiplex("Unicentro");
                List<Empleado> emp = multi.consultaremo();
                request.setAttribute("empleado", emp);
                request.getRequestDispatcher("Controlador?accion=empleados").forward(request, response);

            }
            if (comercial == "Titan") {
                MultiplexFactory mul = new MultiplexFactory();
                MultiplexDAO multi = mul.CrearMultiplex("Titan");
                List<Empleado> emp = multi.consultaremo();
                request.setAttribute("empleado", emp);
                request.getRequestDispatcher("Controlador?accion=empleados").forward(request, response);

            }
            if (comercial == "Las Americas") {
                MultiplexFactory mul = new MultiplexFactory();
                MultiplexDAO multi = mul.CrearMultiplex("Las Americas");
                List<Empleado> emp = multi.consultaremo();
                request.setAttribute("empleado", emp);
                request.getRequestDispatcher("Controlador?accion=empleados").forward(request, response);

            }
            if (comercial == "Embajador") {
                MultiplexFactory mul = new MultiplexFactory();
                MultiplexDAO multi = mul.CrearMultiplex("Embajador");
                List<Empleado> emp = multi.consultaremo();
                request.setAttribute("empleado", emp);
                request.getRequestDispatcher("Controlador?accion=empleados").forward(request, response);

            }
            if (comercial == "Gran Estacion") {
                MultiplexFactory mul = new MultiplexFactory();
                MultiplexDAO multi = mul.CrearMultiplex("Gran Estacion");
                List<Empleado> emp = multi.consultaremo();
                request.setAttribute("empleado", emp);
                request.getRequestDispatcher("Controlador?accion=empleados").forward(request, response);

            }
        }
        if (accion.equalsIgnoreCase("funciones")) {

            if (comercial == "Plaza Central") {
                request.getRequestDispatcher("Controlador?accion=funciones").forward(request, response);
            }
            if (comercial == "Unicentro") {
                request.getRequestDispatcher("Controlador?accion=funciones").forward(request, response);
            }
            if (comercial == "Titan") {
                request.getRequestDispatcher("Controlador?accion=funciones").forward(request, response);
            }
            if (comercial == "Las Americas") {
                request.getRequestDispatcher("Controlador?accion=funciones").forward(request, response);
            }
            if (comercial == "Embajador") {
                request.getRequestDispatcher("Controlador?accion=funciones").forward(request, response);
            }
            if (comercial == "Gran Estacion") {
                request.getRequestDispatcher("Controlador?accion=funciones").forward(request, response);
            }

        }  
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

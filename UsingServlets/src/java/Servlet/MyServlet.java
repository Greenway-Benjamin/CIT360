/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Benjamin Greenway
 */
@WebServlet(name = "MyServlet", urlPatterns = {"/MyServlet"})
public class MyServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @param name
     * @param gardens
     * @param carrots
     * @param slugs
     * @param total
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, 
            String name, int gardens, int carrots, int slugs, int total)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>What's the slugs?</h1>");
            out.println("<Strong>" + name + "</Strong>, my friend, with " + gardens + " garden(s), " + 
                    carrots + " carrots in each garden, and " + slugs + " slugs on each carrot,"
                            + " you have exactly <Strong>" + total + "</Strong> slugs in your gardens!");
            out.println("<h1>SO MANY SLUGS!!!</h1></body>");
            out.println("<a href='http://localhost:8080/UsingServlets/Servletta.html'>Go Back</a>");
            out.println("</html>");
        }
        
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
        
        String name = request.getParameter("yourname");
        
        int gardens = Integer.parseInt(request.getParameter("gardens"));
        
        int carrots = Integer.parseInt(request.getParameter("carrots"));
        
        int slugs = Integer.parseInt(request.getParameter("slugs"));
        
        int total = gardens * carrots * slugs;
        
        processRequest(request, response, name, gardens, carrots, slugs, total);
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
        doGet(request, response);
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

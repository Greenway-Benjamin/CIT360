/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.buf.StringUtils;

/**
 *
 * @author Benjamin Greenway
 */
@WebServlet(name = "WebGrab", urlPatterns = {"/WebGrab"})
public class WebGrab extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @param url
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.net.MalformedURLException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String url)
            throws ServletException, IOException {
        
        //set response type
        response.setContentType("text/html;charset=UTF-8");
        
        //Set printwriter
        PrintWriter out = response.getWriter();
        try {
        //set URL to requested URL
        URL theurl = new URL(url);
        
        
         
            //open URL connection
            
        HttpURLConnection connect = (HttpURLConnection) theurl.openConnection();
        
        //Create a new bufferedreader to the webpage
        BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));       
        
        //While the page has more lines, read and print out that new line's HTML
        String page;              
        while((page = in.readLine()) != null) {
            out.println(page);
        }
        }
        //Catch malformed url error
            catch (MalformedURLException e) { 
            
            //Create test string for URL
            String firstfour;
            
            //Test if the URL submitted by user starts with a protocol, if it does then respond the page can't be found
            //if not, add http protocol to the beginning and try the request again
            if (url.length()<4) {
                firstfour = url;
            }
            else {
                firstfour = url.substring(0,4);
            }
            
            if ("www.".equals(firstfour)) {
                url = "https://" + url;
            }
            else if ("http".equals(firstfour)){
                out.print(url + " is invalid, please try another <br> <a href='http://localhost:8080/UsingServlets/WebPageGrab.html'>Go back</a>");
                return;
            }
            else {
                url = "https://www." + url;
            }
            processRequest(request, response, url);
        }
            
            //Catch unknown host exception
            catch (UnknownHostException e) {
                out.print(url + " cannot be reached, or is an invalid address. Check your spelling, or your network connection. <br> <a href='http://localhost:8080/UsingServlets/WebPageGrab.html'>Go back</a>");
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
        
        String url = request.getParameter("URL");
        
        processRequest(request, response, url);
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

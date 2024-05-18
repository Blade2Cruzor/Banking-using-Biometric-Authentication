/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Connection.DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sluser
 */
@WebServlet(name = "Accountreg", urlPatterns = {"/Accountreg"})
public class Accountreg extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        HttpSession session=request.getSession(true);
        boolean st=false;
        try {

            String pn = request.getParameter("vid");
            String bn = request.getParameter("BankName");
            String an = request.getParameter("an");
             String ps = request.getParameter("ps");
            DB Db=new DB();
               ResultSet rs=Db.Select("select * from accountdetails where bn='"+bn+"' and pn='"+pn+"'");
            if(rs.next())
            {
             session.setAttribute("msg", "This Bank Name is  Already Exist for this VoterId!!! ");
            session.setAttribute("color", "red");
                    response.sendRedirect("AddAccount.jsp?vid="+pn);   
            }
else
            {
              st=true;  
            }
            rs.close();
            if(st==true)
            {
          rs=Db.Select("select * from accountdetails where accno='"+an+"'");
            if(rs.next())
            {
             session.setAttribute("msg", "This Account Number Already Exist !!! ");
            session.setAttribute("color", "red");
                    response.sendRedirect("AddAccount.jsp?vid="+pn);   
            }
else
            {
            String query = "insert into Accountdetails values('" + pn + "','" + bn + "','" + an + "','"+ps+"','500','no')";

            try {
              
                int result = Db.Insert(query);
                out.println("Result = " + result);
                
                
                if (result > 0) {
                    session.setAttribute("vn", pn);
                     session.setAttribute("msg", "Account Details Added Successfully");
            session.setAttribute("color", "green");
                    response.sendRedirect("AddAccount.jsp?vid="+pn);
                } else {
                     session.setAttribute("msg", "Failed !!! ");
            session.setAttribute("color", "red");
                    response.sendRedirect("AddAccount.jsp?vid="+pn);
                }


            } catch (Exception ex) {
                ex.printStackTrace();
            }
            }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        } finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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

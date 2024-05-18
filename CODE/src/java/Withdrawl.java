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
@WebServlet(name = "Withdrawl", urlPatterns = {"/Withdrawl"})
public class Withdrawl extends HttpServlet {

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
        HttpSession session =request.getSession(true);
       try {

           String cn = (String)session.getAttribute("cn");
            System.out.println(cn);
            String fbn = request.getParameter("fbn");
             System.out.println(fbn);
            String facn = request.getParameter("facn");
             System.out.println(facn);
             String pin = request.getParameter("ps");
              System.out.println(pin);
              String tobn = request.getParameter("tobn");
               System.out.println(tobn);
              String toan = request.getParameter("toac");
               System.out.println(toan);    
               String o = request.getParameter("o").trim();
               
          session.setAttribute("bn",fbn);
          session.setAttribute("an",facn);
            double amt=Double.valueOf(request.getParameter("amt"));
            double dbamt=0;

            try {
                  int result=0;
              DB Db=new DB();
              ResultSet rs=Db.Select("select * from Accountdetails where cn='" + cn + "' and bn='" +fbn + "' and accno='" + facn + "'");
                      if(rs.next())
                      {
                          dbamt=rs.getDouble("amt");
                      }
                      if(dbamt>0 && dbamt>=amt)
                      {
                int j = Db.Insert("Update Accountdetails set amt = amt - "+amt+" where cn='" + cn + "' and bn='" +fbn + "' and accno='" + facn + "' and pinno='"+pin+"'");
               if(j>0)
               {
                   if(o.compareToIgnoreCase("Transfer.jsp")==0)
                result=Db.Insert("Update Accountdetails set amt = amt + "+amt+" where cn='" + cn + "' and bn='" +tobn + "' and accno='" + toan + "'");
                   else if(o.compareToIgnoreCase("OuterTransfer.jsp")==0)
                        result=Db.Insert("Update Accountdetails set amt = amt + "+amt+" where bn='" +tobn + "' and accno='" + toan + "'");
                out.println("Result = " + result);
               }
                
                if (j==1 && result==1) {
                     session.setAttribute("msg", "Transaction Successfully Completed");
            session.setAttribute("color", "green");
                    response.sendRedirect("TransOptions.jsp");
                } 
                else if(j==1 && result==0){
                     session.setAttribute("msg", "Transaction Successfully Completed");
            session.setAttribute("color", "green");
                    response.sendRedirect("TransOptions.jsp");
                }
                else if(j==0 && result==0){
                     session.setAttribute("msg", "Transaction Failed.Please Check Your Pin Number!!!");
            session.setAttribute("color", "red");
                    response.sendRedirect(o);
                }

                      }
                      else
                      {
                          session.setAttribute("msg", "Transaction Failed.You Don't Have A Enough Balance To Transfer!!!");
            session.setAttribute("color", "red");
                    response.sendRedirect(o);
                      }
                      rs.close();
            } catch (Exception ex) {
                ex.printStackTrace();
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

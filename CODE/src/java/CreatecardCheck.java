/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Connection.DB;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
/**
 *
 * @author sluser
 */
@WebServlet(name = "CreatecardCheck", urlPatterns = {"/CreatecardCheck"})
public class CreatecardCheck extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
      HttpSession session=request.getSession(true);

         try {
              DB Db=new DB();
            String plan = request.getParameter("plan");
            System.out.println("Plan Type " + plan);
            String saveFile="",fn="",ln="",mname="",dob="",celno="";
                String sex="",voterno="",email="",bg="",pstreet="",cstreet="",parea="",carea="",pcity="",ccity="";
                   String ppinno="",cpinno="",pass="",repass="";
            int fileidnum=0,downloadcount=0;
            String contentType = request.getContentType();
            // Create a factory for disk-based file items
            DiskFileItemFactory factory = new DiskFileItemFactory();

// Set factory constraints
            factory.setSizeThreshold(4012);
//factory.setRepository("c:");

// Create a new file upload handler
            ServletFileUpload upload = new ServletFileUpload(factory);

// Set overall request size constraint
            //upload.setSizeMax(10024);

// Parse the request
            List items = null;
            try {
                items = upload.parseRequest(request);
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
            byte[] data = null;
            String fileName = null;
// Process the uploaded items
            Iterator iter = items.iterator();
            while (iter.hasNext()) {
                FileItem item = (FileItem) iter.next();

                if (item.isFormField()) {
                    //processFormField(item);

                    String name = item.getFieldName();
                    String value = item.getString();

                    if (name.equalsIgnoreCase("fname")) {
                        fn = value;
                        System.out.println("fn" + fn);
                    } else if (name.equalsIgnoreCase("lname")) {
                       ln = value;
                        System.out.println("ln " + ln);
                    } else if (name.equalsIgnoreCase("datepicker")) {
                        dob = value;
                        System.out.println("dob " + dob);
                    } else if (name.equalsIgnoreCase("cellno")) {
                        celno = value;
                        System.out.println("sims " + celno);
                    } else if (name.equalsIgnoreCase("sex")) {
                        sex = value;
                        System.out.println("camera " + sex);
                    } else if (name.equalsIgnoreCase("voterno")) {
                        voterno = value;
                        System.out.println("bluetooth " + voterno);
                    } else if (name.equalsIgnoreCase("email")) {
                        email = value;
                        System.out.println("memory " + email);
                    } else if (name.equalsIgnoreCase("bg")) {
                        bg = value;
                        System.out.println("radio " + bg);
                    } else if (name.equalsIgnoreCase("p_streetname")) {
                        pstreet = value;
                        System.out.println("internet " + pstreet);
                    }
                    else if (name.equalsIgnoreCase("c_streetname")) {
                        cstreet = value;
                        System.out.println("internet " + cstreet);
                    }
                    else if (name.equalsIgnoreCase("p_area")) {
                        parea = value;
                        System.out.println("internet " + parea);
                    }
                    else if (name.equalsIgnoreCase("c_area")) {
                        carea = value;
                        System.out.println("internet " + carea);
                    }
                    else if (name.equalsIgnoreCase("p_city")) {
                        pcity = value;
                        System.out.println("internet " + pcity);
                    }
                    else if (name.equalsIgnoreCase("c_city")) {
                        ccity = value;
                        System.out.println("internet " + ccity);
                    }
                    else if (name.equalsIgnoreCase("p_pinno")) {
                        ppinno = value;
                        System.out.println("internet " + ppinno);
                    }
                    else if (name.equalsIgnoreCase("c_pinno")) {
                        cpinno = value;
                        System.out.println("internet " + cpinno);
                    }
                    else if (name.equalsIgnoreCase("passwd")) {
                        pass = value;
                        System.out.println("internet " + pass);
                    }
                    else if (name.equalsIgnoreCase("retypepassword")) {
                        repass = value;
                        System.out.println("internet " + repass);
                    }
                    else {
                        System.out.println("ERROR");
                    }
                } else {
                    data = item.get();
                    fileName = item.getName();
                }
            }
            boolean st=false;
             ResultSet rs=Db.Select("select * from createcard where voterno="+voterno);
            if(rs.next())
            {
                session.setAttribute("msg", "This VoterId Number is already Exist!!!");
            session.setAttribute("color", "red");
                        response.sendRedirect("Createcard.jsp");
            }
            else
            {
                st=true;
            }
             rs.close();
             if(st==true)
             {
          rs=Db.Select("select * from accountdetails where pn="+voterno);
            if(rs.next())
            {
            saveFile = fileName;
             String path = request.getSession().getServletContext().getRealPath("/");
            File ff = new File(path+saveFile);
            FileOutputStream fileOut = new FileOutputStream(ff);
            fileOut.write(data, 0, data.length);
            fileOut.flush();
            fileOut.close();
            System.out.println(path+saveFile);
            System.out.println("Thrid");
            Connection con = null;
            PreparedStatement psmnt = null;
            FileInputStream fis;
            InputStream sImage;
            try {
                java.util.Date now = new java.util.Date();
                String DATE_FORMAT = "yyyy-MM-dd hh:mm:ss";
                SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
                String strDateNew = sdf.format(now);
                System.out.println(strDateNew);
                try {
                    
                    File f = new File(path+saveFile);
                    long length = f.length();
                    System.out.println("length " + length);
                     String query = "insert into createcard values('" + fn + "','" + ln + "','" + dob + "','" + celno + "','" + sex + "','"+voterno+"','" + email + "','" + bg + "','" + pstreet + "','" + cstreet + "','" + parea + "','"+carea+"','" + pcity + "','" + ccity + "','" + ppinno + "','" + cpinno + "','" + pass + "','"+repass+"')";
                 
                  con=Db.con;
                   int s=Db.Insert(query);
                   String queryString = "insert into fbauthentication(voterno,email,cardno,pass, FileName, Content, Fdate,otp)values (? ,?,? ,? ,?,?,?,?)";
psmnt = con.prepareStatement(queryString);
                        fis = new FileInputStream(f);
                        psmnt.setString(1, voterno);
                          psmnt.setString(2, email);
                        psmnt.setString(3, "no");
                        psmnt.setString(4, "no");
                        psmnt.setString(5, saveFile);
                        psmnt.setBinaryStream(6, (InputStream) fis, (int) (f.length()));
                           psmnt.setString(7, strDateNew);
                            psmnt.setString(8, "no");
                        int i = psmnt.executeUpdate();
                   
                     if (s > 0 && i>0) {
                         session.removeAttribute("vn");
                         
                          session.setAttribute("msg", "Hi, "+fn+" ");
            session.setAttribute("color", "green");
            session.setAttribute("pass", pass);
            session.setAttribute("vn", voterno);
                        response.sendRedirect("Uniquecode.jsp");
                    } else {
                          session.setAttribute("msg", "Card Number Creation Failed!!!");
            session.setAttribute("color", "red");
                        response.sendRedirect("Createcard.jsp");
                    }
                         
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            }
            else
            {
                 session.setAttribute("msg", "Card Number Creation Failed.Please Give your Account Details or Check ur VoterId Number!!!");
            session.setAttribute("color", "red");
                        response.sendRedirect("Createcard.jsp"); 
            }
            rs.close();
         } 
         } 
        
        finally {            
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CreatecardCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(CreatecardCheck.class.getName()).log(Level.SEVERE, null, ex);
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

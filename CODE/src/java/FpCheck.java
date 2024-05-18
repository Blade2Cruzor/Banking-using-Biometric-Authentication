/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Connection.DB;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.imageio.ImageIO;
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
@WebServlet(name = "FpCheck", urlPatterns = {"/FpCheck"})
public class FpCheck extends HttpServlet {

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
         try {
            String plan = request.getParameter("plan");
            System.out.println("Plan Type " + plan);
            String saveFile="",cn="";
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

                    if (name.equalsIgnoreCase("cn")) {
                        cn = value;
                        System.out.println("cn " + cn);
                    } 
                    else {
                        System.out.println("ERROR");
                    }
                } else {
                    data = item.get();
                    fileName = item.getName();
                }
            }
            saveFile = fileName;
            String path = request.getSession().getServletContext().getRealPath("/"); File ff = new File(path+saveFile);
            FileOutputStream fileOut = new FileOutputStream(ff);
            fileOut.write(data, 0, data.length);
            fileOut.flush();
            fileOut.close();
            
            File file1 = new File(path+saveFile);
            
   
 try
    {
      //create FileInputStream object
     FileInputStream fin = new FileInputStream(file1);
     
      /*
       * Create byte array large enough to hold the content of the file.
       * Use File.length to determine size of the file in bytes.
       */
     
     
     byte fileContent[] = new byte[(int)file1.length()];
     
       /*
        * To read content of the file in byte array, use
        * int read(byte[] byteArray) method of java FileInputStream class.
        *
        */
       /*fin.read(fileContent);
     
       //create string from byte array
       String strFileContent = new String(fileContent);
     
       System.out.println("File content : ");
       System.out.println(fileContent.toString());
       try {
         byte Content[]={};

        String filename = "Desert.jpg";
        System.out.println("File Name 2 :" + filename);
       DB Db=new DB();
        String qry = "select * from fbauthentication where cardno='"+cn+"'";

        ResultSet rst = Db.Select(qry);

        if (rst.next()) {

            Content = rst.getBytes("Content");

        }
rst.close();
        System.out.println("****"+Content.toString());
  boolean blnResult = Arrays.equals(fileContent,Content);
  System.out.println(blnResult);
       if(Arrays.equals(fileContent,Content))
       {
           System.out.println("Success");
           response.sendRedirect("mail?cn="+cn+"");
       }
       else
       {
          System.out.println("not"); 
          response.sendRedirect("Fpauthentication.jsp?msg=Authenication Failed&&cn="+cn+"");
       }*/
       DB Db=new DB();
        byte Content[]={};String saveFile1="org";
       String qry = "select * from fbauthentication where cardno='"+cn+"'";

        ResultSet rst = Db.Select(qry);

        if (rst.next()) {

            Content = rst.getBytes("Content");
            saveFile1=saveFile1+rst.getString("FileName");

        }
        File ff1 = new File(path+saveFile1);
          FileOutputStream fileOut1 = new FileOutputStream(ff1);
            fileOut1.write(Content, 0, Content.length);
            fileOut1.flush();
            fileOut1.close();
long start = System.currentTimeMillis();
    File file= new File(path+saveFile);
    BufferedImage image = ImageIO.read(file);
 int width = image.getWidth(null);
    int height = image.getHeight(null);
int[][] clr=  new int[width][height]; 
File files= new File(path+saveFile1 );
    BufferedImage images = ImageIO.read(files);
 int widthe = images.getWidth(null);
    int heighte = images.getHeight(null);
int[][] clre=  new int[widthe][heighte]; 
int smw=0;
int smh=0;
int p=0;
//CALUCLATING THE SMALLEST VALUE AMONG WIDTH AND HEIGHT
if(width>widthe){ smw =widthe;}
else {smw=width;}
if(height>heighte){smh=heighte;}
else {smh=height;}
//CHECKING NUMBER OF PIXELS SIMILARITY
for(int a=0;a<smw;a++){
for(int b=0;b<smh;b++){
clre[a][b]=images.getRGB(a,b);
clr[a][b]=image.getRGB(a,b);
if(clr[a][b]==clre[a][b]) {p=p+1;}
}}

float w,h=0;
if(width>widthe) {w=width;}
else {w=widthe;}
if(height>heighte){ h = height;}
else{h = heighte;}
float s = (smw*smh);
//CALUCLATING PERCENTAGE
float x =(100*p)/s;

System.out.println("THE PERCENTAGE SIMILARITY IS APPROXIMATELY ="+x+"%");
long stop = System.currentTimeMillis();
System.out.println("TIME TAKEN IS ="+(stop-start));
session.setAttribute("score", String.valueOf(x));
session.setAttribute("cn", cn);
if(x==100)
       {
          out.println("success"+x);
            response.sendRedirect("Fpauthentication_1.jsp");
       }
else if(x<10)
       {
          out.println("success"+x);
            response.sendRedirect("Fpauthentication.jsp?cn="+cn+"&score="+x+"&msg=Upload Finger Print Image");
       }

       else
       {
       out.println("failure"+x); 
        response.sendRedirect("Fpauthentication_1.jsp?cn="+cn+"&score="+x);
           //session.setAttribute("msg", "Authentication Failed!!!!");
            //session.setAttribute("color", "red");
         // response.sendRedirect("Fpauthentication.jsp");
       }
    } catch (Exception e) {

        e.printStackTrace();

    }

     
    }
    catch(FileNotFoundException e)
    {
      System.out.println("File not found" + e);
    }
    catch(IOException ioe)
    {
      System.out.println("Exception while reading the file " + ioe);
    }
          
                catch (Exception ex) {
                    ex.printStackTrace();
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

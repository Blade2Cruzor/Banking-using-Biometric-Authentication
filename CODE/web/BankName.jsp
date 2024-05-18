<%-- 
    Document   : state
    Created on : 8 May, 2013, 9:35:10 PM
    Author     : Ragupathi
--%>
<%@page import="Connection.DB"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
<%
String opt=request.getParameter("count"); 
 System.out.println("***"+opt);
 String toac="";  
 String cn = (String)session.getAttribute("cn");
 DB Db=new DB();
 ResultSet rs=Db.Select("select * from Accountdetails where cn='"+cn+"'and bn='"+opt+"'");
          if(rs.next())
                             {
              toac=rs.getString(3);
                           }
           rs.close();
                                                
             %>
            <tr  height="38"><td><font  size="3">To Account No        </font></td><td><input type="text" id='toac1' name="toac" readonly value="<%=toac%>"/></td></tr>



    </body>
</html>

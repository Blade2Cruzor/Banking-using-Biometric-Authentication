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
 DB Db=new DB();
  
      
      ResultSet rs=Db.Select("select * from createcard where voterno='"+opt+"'");
     if(rs.next())
     {
         %>
       
   <td width="179"  height="25" id="us"><FONT color="red">
       <INPUT name=voterno tabIndex=8 size="16" value="Already Exist" style="color:crimson  ">&nbsp;</FONT></td>
                 <% }
                 else
     {%>
   <td width="179"  height="25" id="us"><FONT color=#004080>
       <INPUT name=voterno tabIndex=8 size="16" value="<%=opt%>">&nbsp;</FONT></td>            
<%         
}
       
       %>                                   
         
    
                                              
       </select></td></tr>                             
                                    
    </body>
</html>

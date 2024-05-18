<%-- 
    Document   : Logout
    Created on : Feb 19, 2013, 8:15:36 PM
    Author     : sluser
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><%
        if(session!=null)
session.invalidate();  
System.out.println("session Cleared");   
response.sendRedirect("Mainform.jsp");
        %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Thank You....You Have Successfully Logged Out.....</h1>
    </body>
</html>

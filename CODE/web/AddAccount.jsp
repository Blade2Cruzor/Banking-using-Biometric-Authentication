<%-- 
    Document   : AddAccount
    Created on : Mar 16, 2013, 12:48:19 PM
    Author     : sluser
--%>

<%@page import="Connection.DB"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><% 
    String vn="";
    if(session.getAttribute("vn")==null)
    {
    vn="";
    }
    else
    {
        vn=(String)session.getAttribute("vn");
    }
 String Servlet_Msg = (String) session.getAttribute("msg");
              String color = (String) session.getAttribute("color");
System.out.println(vn);
ResultSet rs=null;
%>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Account</title>
        <script>
      function formValidation()
{
var vn = document.form1.vid;
var bn = document.form1.BankName;
var an = document.form1.an;
var ps= document.form1.ps;
if(Vn_validation(vn,7))
{
if(Bn_validation(bn))
{
if(An_validation(an,16))
{ 
if(Ps_validation(ps,4))
{ 
    return true;  
}                            
}
}
}
return false;
}
function Vn_validation(uzip,mx)
{
    var uid_len = uzip.value.length;
var numbers = /^[0-9]+$/;
if(uzip.value.match(numbers) && uid_len==mx)
{
return true;
}
else if (uid_len == 0)
{
alert('VoterId No Should Not be Empty');
uzip.focus();
return false;
}else if ((uzip.value.match(numbers)) && (uid_len<mx || uid_len>mx))
{
alert("VoterId No Length Should be "+mx+"");
uzip.focus();
return false;
}

else if(uzip.value.match(numbers)!=0)
    {
alert('VoterId No must have numeric characters only');
uzip.focus();
return false;
}
}
function Bn_validation(uid)
{
if(uid.value == "Select")
{
alert("Please Select the Bank");
uid.focus();
return false;
    }
return true;
}
function An_validation(uzip,mx)
{
    var uid_len = uzip.value.length;
var numbers = /^[0-9]+$/;
if(uzip.value.match(numbers) && uid_len==mx)
{
return true;
}
else if (uid_len == 0)
{
alert('Account No Should Not be Empty');
uzip.focus();
return false;
}else if ((uzip.value.match(numbers)) && (uid_len<mx || uid_len>mx))
{
alert("Account No Length Should be "+mx+"");
uzip.focus();
return false;
}

else if(uzip.value.match(numbers)!=0)
    {
alert('Account No must have numeric characters only');
uzip.focus();
return false;
}
}
function Ps_validation(uzip,mx)
{
    var uid_len = uzip.value.length;
var numbers = /^[0-9]+$/;
if(uzip.value.match(numbers) && uid_len==mx)
{
return true;
}
else if (uid_len == 0)
{
alert('Pin No Should Not be Empty');
uzip.focus();
return false;
}else if ((uzip.value.match(numbers)) && (uid_len<mx || uid_len>mx))
{
alert("Pin No Length Should be "+mx+"");
uzip.focus();
return false;
}

else if(uzip.value.match(numbers)!=0)
    {
alert('Pin No must have numeric characters only');
uzip.focus();
return false;
}
}
</script>
    </head>
    <body>
        <%
        String vid=request.getParameter("vid");
        %>
      <form name="form1" method="post" action="Accountreg" onsubmit="return formValidation();">
          <br><br><br>
               <center>   <font size="5" color="red">ACCOUNT INFORMATION</font>  <table border="0" cellpadding="0" cellspacing="0" align="center">
                       <tr><br><br><td><font  size="3">VoterId No        </font></td><td><input type="text" id='User' name="vid" readonly="" value="<%=vid%>" /></td></tr><tr></tr><tr></tr>
<tr><td><font  size="4">Select Bank</font></td><td><select id='BankName' name="BankName">
<option value="Select">Please Choose</option>
<option>State Bank of India</option>
<option>Allahabad Bank</option>
<option>Bank of India</option>
<option>Central Bank of India</option>
<option>Indian Bank</option>
<option>Punjab National Bank</option>
<option>Union Bank of India</option>
<option>Axis Bank </option>
<option>ICICI Bank</option>
<option>HDFC Bank</option></select></td></tr><tr></tr><tr></tr>

<tr><td><font  size="3">Account No        </font></td><td><input type="text" id='User' name="an"/></td></tr><tr></tr><tr></tr>
<tr><td><font  size="3">PIN No        </font></td><td><input type="password" id='ps' name="ps"/></td></tr><tr></tr><tr></tr>
<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
<tr><td></td><td>
        <input type="submit" value="Add" style="font-size:10pt"/>
        <input type="reset" value="Reset" style="font-size:10pt"/>
</td></tr>
    	
                   </table> </center>
        </form><br>
         <%
             
 if(Servlet_Msg!=null){
                                    %>
                                    <center><blink> <font size="3" color="<%=color%>"><label><%=Servlet_Msg%></label></font></blink></center><br><br><% 
                                            session.removeAttribute("msg");
                                               session.removeAttribute("color");
                                            }%>
                            <table border="1" cellpadding="0" cellspacing="0" align="center"> 
        <% try{
                                            String ph="",bn="",an=""; 

System.out.println("***"+vn);
if(session.getAttribute("vn")!=null)        
{                                         
           DB Db=new DB();
         DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
 Calendar cal = Calendar.getInstance();
 String d1=dateFormat.format(cal.getTime());
System.out.println(d1);
             out.println("<tr><td><font color=black size=4>Bankname        </font></td><td><font color=black size=4>Account Number        </font></td>");
          out.println("<td><font color=black size=4>Process         </font></td></tr>");
         
           rs=Db.Select("select * from Accountdetails where pn='"+vn+"'");
           while(rs.next())
                             {
               bn=rs.getString(2);
               an=rs.getString(3);
        out.println("<tr><td><font color=brown size=3>"+bn+"</font></td>");
        out.println("<td><font color=brown size=3>"+an+"</font></font></td>");
        out.print("<td><a href=\"Remove?pn="+vn+"&an="+an+"\"><font color=blue size=3>Remove</font></a></td>");
        out.println("</tr>");


      }
            rs.close();
}
        }catch(Exception ex){
            ex.printStackTrace();
        }%>
                            </table>
    </body>
</html>

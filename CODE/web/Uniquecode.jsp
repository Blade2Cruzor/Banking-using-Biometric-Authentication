<%-- 
    Document   : index
    Created on : Aug 23, 2014, 5:16:45 PM
    Author     : vinoth
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="Connection.DB"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
     <script language="javascript" type="text/javascript" src="datetimepicker.js"></script>
      <%
      String Servlet_Msg = (String) session.getAttribute("msg");
              String color = (String) session.getAttribute("color");

        %>
<script type='text/javascript'>
     function formValidation()
{
var uid = document.form1.username;
var pass= document.form1.password ;
if(card_validation(uid,15))
{
if(userpass_validation(pass))
{}
}

return false;
}

function card_validation(uzip,mx)
{
    var uid_len = uzip.value.length;
var numbers = /^[0-9]+$/;
if(uzip.value.match(numbers) && uid_len==mx)
{
return true;
}
else if (uid_len == 0)
{
alert('Card Number Should Not be Empty');
uzip.focus();
return false;
}else if (uzip.value.match(numbers) && uid_len<mx)
{
alert("Card Number Length Should be "+mx+"");
uzip.focus();
return false;
}

else if(uzip.value.match(numbers)!=0)
    {
alert('Card Number must have numeric characters only');
uzip.focus();
return false;
}
}


function userpass_validation(uid)
{
var uid_len = uid.value.length;
if (uid_len === 0 )
{
alert("Password should not be empty ");
uid.focus();
return false;
}
else
{
//alert('Form Succesfully Submitted');
document.form1.action = "TranLoginCheck";
document.form1.submit();
return true;
}
}

</script>
</script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Simple Grid Theme, Free CSS Template</title>
<meta name="keywords" content="simple, grid, theme, free templates, web design, one page layout, slategray, steelblue, templatemo, CSS, HTML" />
<meta name="description" content="Simple Grid is a one-page website template provided by templatemo.com" />
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
<script type='text/javascript' src='js/jquery.min.js'></script>
<script type='text/javascript' src='js/jquery.scrollTo-min.js'></script>
<script type='text/javascript' src='js/jquery.localscroll-min.js'></script>
<script type="text/javascript">
$(document).ready(function () {
$.localScroll();
});
</script> 

</head>   
<body>

<div id="templatemo_wrapper">
	<div id="templatemo_header">
    	<div id="site_title">Security Evaluation of Pattern Classifiers under Attack</a></div><br>
    </div>
    
    <div id="templatmeo_menu">
    	<ul>
        	<li><a href="#home" class="home"><span></span></a></li>
            <li><a href="#about" class="about"><span></span></a></li>
            <li><a href="#portfolio" class="portfolio"><span></span></a></li>
            <li><a href="#services" class="services"><span></span></a></li>
            <li><a href="#contact" class="contact"><span></span></a></li>
		</ul>
    </div>
    
    <div id="templatemo_main">
    	 <%
 if(Servlet_Msg!=null){
                                    %>
                                    <center><blink> <font size="3" color="<%=color%>"><label><%=Servlet_Msg%></label></font></blink></center><br><br><% 
                                           session.removeAttribute("msg");
                                             session.removeAttribute("color");
                                            }%> <% 
  String vn=(String)session.getAttribute("vn");
  String pass=(String)session.getAttribute("pass");
  DB Db=new DB();
  ResultSet rs=Db.Select("select * from fbauthentication where voterno='"+vn+"' and cardno!='no'");
  if(rs.next())
  {
    %>
                                    <div id="container" class="clearfix">
                     
            	<div id="mainCol" class="clearfix">
                    <br><br><br>  <center><Font size="4">Your Card Number is: <%=rs.getString("cardno")%><br><br>
                    Your Password is: <%=rs.getString("pass")%><br><br>
                    Go to Transaction for Further Process.....</font> </center>
                                    <%
  }
  else
  {
  int value = (int)(Math.random() * 8847);
System.out.println(value);
if((String.valueOf(value)).length()<4)
{
   String val=(String.valueOf(value))+"1";
   value=Integer.parseInt(val);
}
int value1 = (int)(Math.random() * 8847);
if((String.valueOf(value1)).length()<4)
{
   String val=(String.valueOf(value))+"2";
   value1=Integer.parseInt(val);
}
System.out.println(value1);
String cardno=(String.valueOf(value))+vn+(String.valueOf(value1));
System.out.println(cardno);
int i=Db.Insert("Update fbauthentication set cardno='"+cardno+"',pass='"+pass+"' where voterno='"+vn+"'");  
if(i>0)
{  
  response.sendRedirect("Createcard_1.jsp?cardno="+cardno);
  %>
        	<div id="container" class="clearfix">
                     
            	<div id="mainCol" class="clearfix">
                    <br><br><br>  <center><Font size="4">Your Card Number is: <%=cardno%><br><br>
                    Your Password is: <%=pass%><br><br>
                    Go to Transaction for Further Process.....</font> </center>
                    
                     <%
                     
                                         }


int j=Db.Insert("Update Accountdetails set cn='"+cardno+"' where pn='"+vn+"'");  
  
  }
  session.removeAttribute("vn");
   session.removeAttribute("pass");
  rs.close();
                     %>   
                </div>
                
            </div>
        </div>
    </div>
    
  
    </div> <!-- END of -->
                </div></div></div>
    <div id="templatemo_footer">
    	Copyright © 2048 Your Company Name<br /> Designed by <a href="" rel="nofollow" target="_parent">Free CSS Templates</a>
    </div> 
</div> 


<script type='text/javascript' src='js/logging.js'></script>
</body>
</html>
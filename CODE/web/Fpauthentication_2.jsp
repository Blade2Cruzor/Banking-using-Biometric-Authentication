<%-- 
    Document   : index
    Created on : Aug 23, 2014, 5:16:45 PM
    Author     : vinoth
--%>

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
      <%
 String cn = (String)session.getAttribute("cn");
 if (cn == null) {
                session.invalidate(); 
                session=request.getSession(true);
    session.setAttribute("msg", "Sorry!!! Your Login Time Out.Please Login Again "); 
    session.setAttribute("color", "red ");
response.sendRedirect("Transaction.jsp");
                
            }
 
String score = (String) session.getAttribute("score");
String score1 = (String) session.getAttribute("score1");
             
%>
<script>
      function formValidation()
{
    var filen = document.getElementById('file');
    if(File_validation(filen))
{
  return true;  
}
return false;
}
function File_validation(uid)
{
var uid_len = uid.value.length;
var file=uid.files[0];
var uid_len = uid.value.length;
if (uid_len == 0 )
{
alert("Fingerprint image Should not be empty");
uid.focus();
return false;
}
 else if (uid_len > 0 && !/(\.bmp|\.gif|\.jpg|\.jpeg)$/i.test(uid.value))
{
  alert("Please Make Sure You Choosen only Image File");
return false;
}
else if(uid_len > 0 && uid_len > 0 && /(\.bmp|\.gif|\.jpg|\.jpeg)$/i.test(file) && file.size >= 1048576)
    {
       alert("Fingerprint image Size Should be less than 1MB only");
uid.focus();
return false;
    }

return true;
}



</script>

</head>   
<body>

<div id="templatemo_wrapper">
	<div id="templatemo_header">
    	<div id="site_title">Security Evaluation of Pattern Classifiers under Attack</a></div><br>
    </div>
    
    <div id="templatmeo_menu">
    	<ul>
        	<li><a href="" class="home"><span></span></a></li>
            <li><a href="" class="about"><span></span></a></li>
            <li><a href="" class="portfolio"><span></span></a></li>
            <li><a href="" class="services"><span></span></a></li>
            <li><a href="Logout.jsp" class="contact"><span></span></a></li>
		</ul>
    </div>
    
    <div id="templatemo_main">
    	
    <font color="white" size="5" style="margin-left: 200px"><h>Fingerprint Authentication-3</h></font>
                   <br>
     <%if(Servlet_Msg!=null){
                                    %>
                                    <blink> <font size="3" color="<%=color%>"><label><%=Servlet_Msg%></label></font></blink><br><br><% 
                                            session.removeAttribute("msg");
                                               session.removeAttribute("color");
                                            }%>	<div id="container" class="clearfix">
                     
            	<div id="mainCol" class="clearfix">
                  
                    <form name="form1" id="form1" method="post" action="FpCheck2" enctype="multipart/form-data" onsubmit="return formValidation();">
                        <%
                         
                        %>
                        <input type="hidden" value="<%=score%>" name="score">
                             <input type="hidden" value="<%=score1%>" name="score1">
               <center>     <table border="0" cellpadding="0" cellspacing="0" align="center">
                       <tr height="38"><td><font  size="3">Your Card No       </font></td><td><input type="text" id='cn' name="cn" readonly value="<%=cn%>"/></td><br></tr><tr></tr><tr></tr>
<tr height="38"><td><font  size="3">Select Image        </font></td><td> <input type="file" id="file" name="file" value="Browse"/></td></tr><tr></tr><tr></tr>


<tr height="38"><td></td><td>
        <input type="submit" value="Authenticate" style="font-size:10pt"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" value="Reset" style="font-size:10pt"/>
</td></tr>
    	
                   </table> </center>
        </form>
                      
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
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
 
<script>
  $(function() {
    $( "#datepicker" ).datepicker({
     changeMonth : true,
      changeYear : true,
      yearRange: '-100y:c+nn'
      
    });
  });
  </script>

    <script type="text/javascript">
// Popup window code
function db(ele)
{
    var k=ele;
    alert(k)
  <%
   
   
             
  %>
          alert("hi");
          <%//} %>
}
var co=0;
function newPopup(url) {
    co=1;
	popupWindow = window.open(
		url,'popUpWindow','height=500,width=500,left=300,top=100,resizable=yes,scrollbars=yes,toolbar=yes,menubar=no,location=no,directories=no,status=yes')
}
</script>

	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>STCARD - Create Card</title>
	<link rel="stylesheet" type="text/css" href="style.css" />
        <%
 String Servlet_Msg = (String) session.getAttribute("msg");
              String color = (String) session.getAttribute("color");
%>
 <%!
        String k2="";
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
                                            }%><% DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
 Calendar cal = Calendar.getInstance();
 String d1=dateFormat.format(cal.getTime());
System.out.println(d1);
 session.removeAttribute("vn"); 
   /*
            }*/
                                            %>
        	<div id="container" class="clearfix">
                   
            	<div id="mainCol" class="clearfix">
                   
                        <center>    
                            <form name="form1" id="form1" method="post" action="CreatecardCheck2" enctype="multipart/form-data"  onsubmit="return formValidation();"><TABLE style=" margin-right: "cellSpacing=0 cellPadding=0 width=590 bgColor=#6699cc border=0>
  
                                <TBODY>
  <TR>
    <TD vAlign=top height=321 width="592">
      <TABLE cellSpacing=0 cellPadding=0 width="592" border=1 height="381">
        <TBODY>
        
          
          <TD vAlign=top width=612  style="background-color:#1b1d1f"
    bgColor=#ffffff height="381">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <b>&nbsp;&nbsp;</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<p align="center"> 
<font face="Arial" color="#6699CC" size="4"><b>Account Holder Registration Form-3&nbsp;</b></font><table border="0" cellpadding="0" cellspacing="0" style="border-collapse: collapse" bordercolor="#111111" width="610" id="AutoNumber6" height="470">
 
    <%String cardno=request.getParameter("cardno");


%>
  <tr>
   
    <td width="567" height="228">
    <TABLE border=0 cellPadding=0 cellSpacing=0 style="LEFT: 527px; TOP: 1709px" width="515" height="40">
   <tr>
    <td width="97" height="26">
    Card Number :<sup><font size="3" color="red">*</font></sup></td>
    <td width="161" height="26"><FONT color=#004080><INPUT name="cardno" value="<%=cardno%>" size="16" tabIndex=1></FONT></td>
    <td width="116" height="25">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
     
  </tr>
 
 
  <TR>
    <TD width="284" height="28">Fingerprint Image <sup><font size="3" color="red">*</font></sup></TD>
    <TD width="367" height="28">
    <input type="file" name="file" id="file" value="Browse"tabIndex=42 size="20"/></TD></TR>
    </TABLE>
    <p>
    <FONT color=#004080>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <INPUT name=submit tabIndex=43 type=Submit value=Create>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <INPUT name=reset style="LEFT: 386px; TOP: 1893px" tabIndex=44 type=reset value=Reset>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <a href="#top" style="text-decoration: none">Top</a></FONT>

</td>
  </tr>
</table>
            
        </TBODY></TABLE></TD></TR>

</TBODY></TABLE> </form></center>
        
                        
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
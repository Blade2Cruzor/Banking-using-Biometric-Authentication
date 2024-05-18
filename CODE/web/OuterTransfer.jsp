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
 
String cn = (String)session.getAttribute("cn");
 if (cn == null) {
                session.invalidate(); 
                session=request.getSession(true);
    session.setAttribute("msg", "Sorry!!! Your Login Time Out.Please Login Again "); 
    session.setAttribute("color", "red ");
response.sendRedirect("Transaction.jsp");
                
            }
 String Servlet_Msg = (String) session.getAttribute("msg");
              String color = (String) session.getAttribute("color");
%>
<script>
      function formValidation()
{
    var pin = document.form1.ps;
    var amt = document.form1.amt;
    var tobn = document.form1.tobn
    var toac = document.form1.toac
    if(Pin_validation(pin,4))
{
    if(Amt_validation(amt))
{
    if(Bn_validation(tobn))
{
    if(An_validation(toac,16))
{
  return true;  
}
}
}
}
return false;
}
function Pin_validation(uzip,mx)
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
}else if (uzip.value.match(numbers) && uid_len<mx)
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
function Amt_validation(uzip)
{
    var uid_len = uzip.value.length;
   var decimal=  /^[-+]?[0-9]+\.[0-9]+$/;   
   var numbers = /^[0-9]+$/;
if(uzip.value.match(decimal) || uzip.value.match(numbers))   
{ 
return true;  
}   
 else if (uid_len == 0)
{
alert('Amount Should Not be Empty');
uzip.focus();
return false;
}

else if(uzip.value.match(decimal)!=0 && uzip.value.match(numbers)!=0){
 alert("Amount is not valid.Give Number Format");
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
}else if (uzip.value.match(numbers) && uid_len<mx)
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
        <li><a href="TransOptions.jsp" class="home"><span></span></a></li>
            <li><a href="#about" class="about"><span></span></a></li>
            <li><a href="#portfolio" class="portfolio"><span></span></a></li>
            <li><a href="#services" class="services"><span></span></a></li>
            <li><a href="Logout.jsp" class="contact"><span></span></a></li>
		</ul>
    </div>
    
    <div id="templatemo_main">
    	
        <%
               String an="",bn="";
                    if(session.getAttribute("bn")==null)
                   bn = request.getParameter("bn");
                   else
                      bn=(String)session.getAttribute("bn");  
                   if(session.getAttribute("bn")==null)
                   an = request.getParameter("an");
                   else
                      an=(String)session.getAttribute("an");
                   
   
                    %>
                     <form name="form1" id="form1" method="post" action="Withdrawl?o=OuterTransfer.jsp" onsubmit="return formValidation();"> 
                    <center>   <font size="5" color="green">ACCOUNT INFORMATION</font>  <table border="0" cellpadding="0" cellspacing="0" align="center">
                   <%
 if(Servlet_Msg!=null){
                                    %>
                                    <br><center><blink> <font size="3" color="<%=color%>"><label><%=Servlet_Msg%></label></font></blink></center><br><% 
                                            session.removeAttribute("msg");
                                               session.removeAttribute("color");
                                            }%>
               <tr  height="38"><td><font  size="3">Card No        </font></td><td><input type="text" id='cn' name="cn" readonly value="<%=cn%>" /></td></tr><tr></tr><tr></tr>
  <tr  height="38"><td><font  size="3">From Bank        </font></td><td><input type="text" id='fbn' name="fbn" readonly value="<%=bn%>" /></td></tr><tr></tr><tr></tr>
<tr  height="38"><td><font  size="3">From Account No        </font></td><td><input type="text" id='facn' name="facn" readonly value="<%=an%>"/></td></tr><tr></tr><tr></tr>
<tr  height="38"><td><font  size="3">PIN No        </font></td><td><input type="password" id='ps' name="ps"/></td></tr><tr></tr><tr></tr>
<tr  height="38"><td><font  size="3">Amount      </font></td><td><input type="text" id='amt' name="amt"/></td></tr>
<tr  height="38"><td><font  size="3">To Bank</font></td><td><select id='tobn' name="tobn">
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
<option>HDFC Bank</option>
</select></td></tr>
     <tr  height="38"><td><font  size="3">To Account No        </font></td><td><input type="text" id='toac1' name="toac" /></td></tr>
    	<tr  height="38"><td></td><td>
        <input type="submit" value="Transfer" style="font-size:10pt"/>
        <input type="reset" value="Reset" style="font-size:10pt"/>
</td></tr> </table>          </center>
        </form>
                 
    </div> <!-- END of -->
                </div></div></div>
    <div id="templatemo_footer">
    	Copyright © 2048 Your Company Name<br /> Designed by <a href="" rel="nofollow" target="_parent">Free CSS Templates</a>
    </div> 
</div> 


<script type='text/javascript' src='js/logging.js'></script>
</body>
</html>
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
        <script type="text/javascript">  
      var xmlHttp 
      function showBank(str){
      if (typeof XMLHttpRequest != "undefined"){
      xmlHttp= new XMLHttpRequest();
      }
      else if (window.ActiveXObject){
      xmlHttp= new ActiveXObject("Microsoft.XMLHTTP");
      }
      if (xmlHttp==null){
      alert("Browser does not support XMLHTTP Request")
      return;
      } 
      var vn = "";
      
             vn= document.form1.voterno.value;
      var url="CSPNAME.jsp";
      url +="?count=" +vn;
     // alert(vn);
      xmlHttp.onreadystatechange = stateChange;
      xmlHttp.open("GET", url, true);
      xmlHttp.send(null);
      }

      function stateChange(){   
      if (xmlHttp.readyState==4 || xmlHttp.readyState=="complete"){   
      document.getElementById("us").innerHTML=xmlHttp.responseText   
    
      }   
      }
      
      </script>
<script>
      function formValidation()
{
var fn = document.form1.fname;
var dob = document.form1.datepicker;
var ph = document.form1.cellno;
var sex = document.form1.sex;
var vn = document.form1.voterno;
var email = document.form1.email;

var pwd =document.form1.passwd;
var repwd = document.form1.retypepassword;
var filen = document.getElementById('file');
if(fn_validation(fn,3))
{
if(Date_validation(dob))
{
if(Ph_validation(ph,10))
{ 
if(Sex_validation(sex))
{
if(Vn_validation(vn,7))
{
if(Email_validation(email))
{

 if(Link_validation(co))
{
if(Pwd_validation(pwd,5))
{
if(RePwd_validation(pwd,repwd))
{
if(File_validation(filen))
{
  return true;  
} 
}
}
}
}
}
}
}




}
}

return false;
}
function fn_validation(uid,mx)
{
var uid_len = uid.value.length;
if (uid_len == 0 )
{
alert("First Name should not be empty ");
uid.focus();
return false;
}
else if( uid_len < mx)
    {
alert("First Name length Should be >= "+mx+" ");
uid.focus();
return false; 
    }
return true;
}
function Date_validation(uid)
{
var uid_len = uid.value.length;
if (uid_len == 0)
{
alert('Date of Birth Should Not be Empty');
uid.focus();
return false;
} 
        return true;
}
function Ph_validation(uzip,mx)
{
    var uid_len = uzip.value.length;
var numbers = /^[0-9]+$/;
if(uzip.value.match(numbers) && uid_len==mx)
{
return true;
}
else if (uid_len == 0)
{
alert('Cell No Should Not be Empty');
uzip.focus();
return false;
}else if ((uzip.value.match(numbers)) && (uid_len<mx) ||(uid_len>mx) )
{
alert("Cell No Length Should be "+mx+"");
uzip.focus();
return false;
}

else if(uzip.value.match(numbers)!=0)
    {
alert('Cell No must have numeric characters only');
uzip.focus();
return false;
}
}
function Sex_validation(uid)
{
if(uid.value == "Sex")
{
alert("Please Choose the Gender");
uid.focus();
return false;
    }
return true;
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
}else if ((uzip.value.match(numbers)) && (uid_len<mx ||uid_len>mx ))
{
alert("VoterId No Length Should be "+mx+"");
uzip.focus();
return false;
}
else if(uzip.value.match(numbers)!=0 && uzip.value=="Already Exist")
    {
alert('VoterId No Already Exist');
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
function Email_validation(uid)
{
var uid_len = uid.value.length;
        var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
if (uid_len == 0)
{
alert('Email Address Should Not be Empty');
uid.focus();
return false;
}
else if (reg.test(uid.value) == false) 
        {
            alert('Invalid Email Address.Email Address Should be Like This Example:Alice@PLC.com');
            return false;
        }
      
        return true;
}
function Ps_validation(uid)
{
var uid_len = uid.value.length;
if (uid_len == 0 )
{
alert("Permanent Street should not be empty ");
uid.focus();
return false;
}

return true;
}
function Pa_validation(uid)
{
var uid_len = uid.value.length;
if (uid_len == 0 )
{
alert("Permanent Area should not be empty ");
uid.focus();
return false;
}

return true;
}
function Pc_validation(uid)
{
var uid_len = uid.value.length;
if (uid_len == 0 )
{
alert("Permanent Place should not be empty ");
uid.focus();
return false;
}

return true;
}
function Pp_validation(uzip,mx)
{
    var uid_len = uzip.value.length;
var numbers = /^[0-9]+$/;
if(uzip.value.match(numbers) && uid_len==mx)
{
return true;
}
else if (uid_len == 0)
{
alert('Pin Number Should Not be Empty');
uzip.focus();
return false;
}else if ((uzip.value.match(numbers)) && (uid_len<mx || uid_len>mx))
{
alert("Pin Number Length Should be "+mx+"");
uzip.focus();
return false;
}

else if(uzip.value.match(numbers)!=0)
    {
alert('Pin Number must have numeric characters only');
uzip.focus();
return false;
}
}
function Link_validation(c)
{
if(c==1)
    {
      return true;  
    }
    else
        {
            alert("Please Click the Account Details");
            return false;
        }
        return true;  
}

function Pwd_validation(uid,mx)
{
var uid_len = uid.value.length;
if (uid_len == 0 )
{
alert("Password should not be empty ");
uid.focus();
return false;
}
else if (uid_len > 0 && uid_len < mx)
{
alert("Password length should be >= "+mx);
uid.focus();
return false;
}
return true;
}
function RePwd_validation(uid,rep)
{
var uid_len = rep.value.length;
if (uid_len == 0 )
{
alert("Please Re-Type Your Password");
rep.focus();
return false;
}
else if(uid_len > 0 && uid.value!=rep.value)
    {
     alert("Password Not match");
rep.focus();
return false;   
    }

return true;
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
                   
                        <center>   <form name="form1" id="form1" method="post" action="CreatecardCheck" enctype="multipart/form-data"  onsubmit="return formValidation();"><TABLE style=" margin-right: "cellSpacing=0 cellPadding=0 width=590 bgColor=#6699cc border=0>
  
                                <TBODY>
  <TR>
    <TD vAlign=top height=321 width="592">
      <TABLE cellSpacing=0 cellPadding=0 width="592" border=1 height="381">
        <TBODY>
        
          
                <TD vAlign=top width=612 style="background-color:#1b1d1f"
    height="381">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <b>&nbsp;&nbsp;</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<p align="center"> 
<font face="Arial" color="#6699CC" size="4"><b>Account Holder
Registration Form&nbsp;</b></font>
               
           </TBODY></TABLE></TD></TR>

</TBODY></TABLE> </form></center> 
        
        
  
    </div> <!-- END of -->
                </div></div></div>
    <div id="templatemo_footer">
    	Copyright © 2048 Your Company Name<br /> Designed by <a href="" rel="nofollow" target="_parent">Free CSS Templates</a>
    </div> 
</div> 


<script type='text/javascript' src='js/logging.js'></script>
</body>
</html>
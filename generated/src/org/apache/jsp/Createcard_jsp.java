package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;

public final class Createcard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


        String k2="";
       
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("     <script language=\"javascript\" type=\"text/javascript\" src=\"datetimepicker.js\"></script>\n");
      out.write("      \n");
      out.write("<script>\n");
      out.write("  $(function() {\n");
      out.write("    $( \"#datepicker\" ).datepicker({\n");
      out.write("     changeMonth : true,\n");
      out.write("      changeYear : true,\n");
      out.write("      yearRange: '-100y:c+nn'\n");
      out.write("      \n");
      out.write("    });\n");
      out.write("  });\n");
      out.write("  </script>\n");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("// Popup window code\n");
      out.write("function db(ele)\n");
      out.write("{\n");
      out.write("    var k=ele;\n");
      out.write("    alert(k)\n");
      out.write("  ");

   
   
             
  
      out.write("\n");
      out.write("          alert(\"hi\");\n");
      out.write("          ");
//} 
      out.write("\n");
      out.write("}\n");
      out.write("var co=0;\n");
      out.write("function newPopup(url) {\n");
      out.write("    co=1;\n");
      out.write("\tpopupWindow = window.open(\n");
      out.write("\t\turl,'popUpWindow','height=500,width=500,left=300,top=100,resizable=yes,scrollbars=yes,toolbar=yes,menubar=no,location=no,directories=no,status=yes')\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\t<title>STCARD - Create Card</title>\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("        ");

 String Servlet_Msg = (String) session.getAttribute("msg");
              String color = (String) session.getAttribute("color");

      out.write('\n');
      out.write(' ');
      out.write("\n");
      out.write("        <script type=\"text/javascript\">  \n");
      out.write("      var xmlHttp \n");
      out.write("      function showBank(str){\n");
      out.write("      if (typeof XMLHttpRequest != \"undefined\"){\n");
      out.write("      xmlHttp= new XMLHttpRequest();\n");
      out.write("      }\n");
      out.write("      else if (window.ActiveXObject){\n");
      out.write("      xmlHttp= new ActiveXObject(\"Microsoft.XMLHTTP\");\n");
      out.write("      }\n");
      out.write("      if (xmlHttp==null){\n");
      out.write("      alert(\"Browser does not support XMLHTTP Request\")\n");
      out.write("      return;\n");
      out.write("      } \n");
      out.write("      var vn = \"\";\n");
      out.write("      \n");
      out.write("             vn= document.form1.voterno.value;\n");
      out.write("      var url=\"CSPNAME.jsp\";\n");
      out.write("      url +=\"?count=\" +vn;\n");
      out.write("     // alert(vn);\n");
      out.write("      xmlHttp.onreadystatechange = stateChange;\n");
      out.write("      xmlHttp.open(\"GET\", url, true);\n");
      out.write("      xmlHttp.send(null);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      function stateChange(){   \n");
      out.write("      if (xmlHttp.readyState==4 || xmlHttp.readyState==\"complete\"){   \n");
      out.write("      document.getElementById(\"us\").innerHTML=xmlHttp.responseText   \n");
      out.write("    \n");
      out.write("      }   \n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      </script>\n");
      out.write("<script>\n");
      out.write("      function formValidation()\n");
      out.write("{\n");
      out.write("var fn = document.form1.fname;\n");
      out.write("var dob = document.form1.datepicker;\n");
      out.write("var ph = document.form1.cellno;\n");
      out.write("var sex = document.form1.sex;\n");
      out.write("var vn = document.form1.voterno;\n");
      out.write("var email = document.form1.email;\n");
      out.write("\n");
      out.write("var pwd =document.form1.passwd;\n");
      out.write("var repwd = document.form1.retypepassword;\n");
      out.write("var filen = document.getElementById('file');\n");
      out.write("if(fn_validation(fn,3))\n");
      out.write("{\n");
      out.write("if(Date_validation(dob))\n");
      out.write("{\n");
      out.write("if(Ph_validation(ph,10))\n");
      out.write("{ \n");
      out.write("if(Sex_validation(sex))\n");
      out.write("{\n");
      out.write("if(Vn_validation(vn,7))\n");
      out.write("{\n");
      out.write("if(Email_validation(email))\n");
      out.write("{\n");
      out.write("\n");
      out.write(" if(Link_validation(co))\n");
      out.write("{\n");
      out.write("if(Pwd_validation(pwd,5))\n");
      out.write("{\n");
      out.write("if(RePwd_validation(pwd,repwd))\n");
      out.write("{\n");
      out.write("if(File_validation(filen))\n");
      out.write("{\n");
      out.write("  return true;  \n");
      out.write("} \n");
      out.write("}\n");
      out.write("}\n");
      out.write("}\n");
      out.write("}\n");
      out.write("}\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("function fn_validation(uid,mx)\n");
      out.write("{\n");
      out.write("var uid_len = uid.value.length;\n");
      out.write("if (uid_len == 0 )\n");
      out.write("{\n");
      out.write("alert(\"First Name should not be empty \");\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if( uid_len < mx)\n");
      out.write("    {\n");
      out.write("alert(\"First Name length Should be >= \"+mx+\" \");\n");
      out.write("uid.focus();\n");
      out.write("return false; \n");
      out.write("    }\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("function Date_validation(uid)\n");
      out.write("{\n");
      out.write("var uid_len = uid.value.length;\n");
      out.write("if (uid_len == 0)\n");
      out.write("{\n");
      out.write("alert('Date of Birth Should Not be Empty');\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("} \n");
      out.write("        return true;\n");
      out.write("}\n");
      out.write("function Ph_validation(uzip,mx)\n");
      out.write("{\n");
      out.write("    var uid_len = uzip.value.length;\n");
      out.write("var numbers = /^[0-9]+$/;\n");
      out.write("if(uzip.value.match(numbers) && uid_len==mx)\n");
      out.write("{\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("else if (uid_len == 0)\n");
      out.write("{\n");
      out.write("alert('Cell No Should Not be Empty');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}else if ((uzip.value.match(numbers)) && (uid_len<mx) ||(uid_len>mx) )\n");
      out.write("{\n");
      out.write("alert(\"Cell No Length Should be \"+mx+\"\");\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("else if(uzip.value.match(numbers)!=0)\n");
      out.write("    {\n");
      out.write("alert('Cell No must have numeric characters only');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("function Sex_validation(uid)\n");
      out.write("{\n");
      out.write("if(uid.value == \"Sex\")\n");
      out.write("{\n");
      out.write("alert(\"Please Choose the Gender\");\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("    }\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("function Vn_validation(uzip,mx)\n");
      out.write("{\n");
      out.write("    var uid_len = uzip.value.length;\n");
      out.write("var numbers = /^[0-9]+$/;\n");
      out.write("if(uzip.value.match(numbers) && uid_len==mx)\n");
      out.write("{\n");
      out.write("   \n");
      out.write("   return true;\n");
      out.write("\n");
      out.write("}\n");
      out.write("else if (uid_len == 0)\n");
      out.write("{\n");
      out.write("alert('VoterId No Should Not be Empty');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}else if ((uzip.value.match(numbers)) && (uid_len<mx ||uid_len>mx ))\n");
      out.write("{\n");
      out.write("alert(\"VoterId No Length Should be \"+mx+\"\");\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if(uzip.value.match(numbers)!=0 && uzip.value==\"Already Exist\")\n");
      out.write("    {\n");
      out.write("alert('VoterId No Already Exist');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if(uzip.value.match(numbers)!=0)\n");
      out.write("    {\n");
      out.write("alert('VoterId No must have numeric characters only');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("function Email_validation(uid)\n");
      out.write("{\n");
      out.write("var uid_len = uid.value.length;\n");
      out.write("        var reg = /^([A-Za-z0-9_\\-\\.])+\\@([A-Za-z0-9_\\-\\.])+\\.([A-Za-z]{2,4})$/;\n");
      out.write("if (uid_len == 0)\n");
      out.write("{\n");
      out.write("alert('Email Address Should Not be Empty');\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if (reg.test(uid.value) == false) \n");
      out.write("        {\n");
      out.write("            alert('Invalid Email Address.Email Address Should be Like This Example:Alice@PLC.com');\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("      \n");
      out.write("        return true;\n");
      out.write("}\n");
      out.write("function Ps_validation(uid)\n");
      out.write("{\n");
      out.write("var uid_len = uid.value.length;\n");
      out.write("if (uid_len == 0 )\n");
      out.write("{\n");
      out.write("alert(\"Permanent Street should not be empty \");\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("function Pa_validation(uid)\n");
      out.write("{\n");
      out.write("var uid_len = uid.value.length;\n");
      out.write("if (uid_len == 0 )\n");
      out.write("{\n");
      out.write("alert(\"Permanent Area should not be empty \");\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("function Pc_validation(uid)\n");
      out.write("{\n");
      out.write("var uid_len = uid.value.length;\n");
      out.write("if (uid_len == 0 )\n");
      out.write("{\n");
      out.write("alert(\"Permanent Place should not be empty \");\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("function Pp_validation(uzip,mx)\n");
      out.write("{\n");
      out.write("    var uid_len = uzip.value.length;\n");
      out.write("var numbers = /^[0-9]+$/;\n");
      out.write("if(uzip.value.match(numbers) && uid_len==mx)\n");
      out.write("{\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("else if (uid_len == 0)\n");
      out.write("{\n");
      out.write("alert('Pin Number Should Not be Empty');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}else if ((uzip.value.match(numbers)) && (uid_len<mx || uid_len>mx))\n");
      out.write("{\n");
      out.write("alert(\"Pin Number Length Should be \"+mx+\"\");\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("else if(uzip.value.match(numbers)!=0)\n");
      out.write("    {\n");
      out.write("alert('Pin Number must have numeric characters only');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("function Link_validation(c)\n");
      out.write("{\n");
      out.write("if(c==1)\n");
      out.write("    {\n");
      out.write("      return true;  \n");
      out.write("    }\n");
      out.write("    else\n");
      out.write("        {\n");
      out.write("            alert(\"Please Click the Account Details\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        return true;  \n");
      out.write("}\n");
      out.write("\n");
      out.write("function Pwd_validation(uid,mx)\n");
      out.write("{\n");
      out.write("var uid_len = uid.value.length;\n");
      out.write("if (uid_len == 0 )\n");
      out.write("{\n");
      out.write("alert(\"Password should not be empty \");\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if (uid_len > 0 && uid_len < mx)\n");
      out.write("{\n");
      out.write("alert(\"Password length should be >= \"+mx);\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("function RePwd_validation(uid,rep)\n");
      out.write("{\n");
      out.write("var uid_len = rep.value.length;\n");
      out.write("if (uid_len == 0 )\n");
      out.write("{\n");
      out.write("alert(\"Please Re-Type Your Password\");\n");
      out.write("rep.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if(uid_len > 0 && uid.value!=rep.value)\n");
      out.write("    {\n");
      out.write("     alert(\"Password Not match\");\n");
      out.write("rep.focus();\n");
      out.write("return false;   \n");
      out.write("    }\n");
      out.write("\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("function File_validation(uid)\n");
      out.write("{\n");
      out.write("var uid_len = uid.value.length;\n");
      out.write("var file=uid.files[0];\n");
      out.write("var uid_len = uid.value.length;\n");
      out.write("if (uid_len == 0 )\n");
      out.write("{\n");
      out.write("alert(\"Fingerprint image Should not be empty\");\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write(" else if (uid_len > 0 && !/(\\.bmp|\\.gif|\\.jpg|\\.jpeg)$/i.test(uid.value))\n");
      out.write("{\n");
      out.write("  alert(\"Please Make Sure You Choosen only Image File\");\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else if(uid_len > 0 && uid_len > 0 && /(\\.bmp|\\.gif|\\.jpg|\\.jpeg)$/i.test(file) && file.size >= 1048576)\n");
      out.write("    {\n");
      out.write("       alert(\"Fingerprint image Size Should be less than 1MB only\");\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<title>Simple Grid Theme, Free CSS Template</title>\n");
      out.write("<meta name=\"keywords\" content=\"simple, grid, theme, free templates, web design, one page layout, slategray, steelblue, templatemo, CSS, HTML\" />\n");
      out.write("<meta name=\"description\" content=\"Simple Grid is a one-page website template provided by templatemo.com\" />\n");
      out.write("<link href=\"css/templatemo_style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<script type='text/javascript' src='js/jquery.min.js'></script>\n");
      out.write("<script type='text/javascript' src='js/jquery.scrollTo-min.js'></script>\n");
      out.write("<script type='text/javascript' src='js/jquery.localscroll-min.js'></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function () {\n");
      out.write("$.localScroll();\n");
      out.write("});\n");
      out.write("</script> \n");
      out.write("\n");
      out.write("</head>   \n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div id=\"templatemo_wrapper\">\n");
      out.write("\t<div id=\"templatemo_header\">\n");
      out.write("    \t<div id=\"site_title\">Security Evaluation of Pattern Classifiers under Attack</a></div><br>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"templatmeo_menu\">\n");
      out.write("    \t<ul>\n");
      out.write("        \t<li><a href=\"#home\" class=\"home\"><span></span></a></li>\n");
      out.write("            <li><a href=\"#about\" class=\"about\"><span></span></a></li>\n");
      out.write("            <li><a href=\"#portfolio\" class=\"portfolio\"><span></span></a></li>\n");
      out.write("            <li><a href=\"#services\" class=\"services\"><span></span></a></li>\n");
      out.write("            <li><a href=\"#contact\" class=\"contact\"><span></span></a></li>\n");
      out.write("\t\t</ul>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_main\">\n");
      out.write("    \t\n");
      out.write("       \n");
      out.write("        ");

 if(Servlet_Msg!=null){
                                    
      out.write("\n");
      out.write("                                    <center><blink> <font size=\"3\" color=\"");
      out.print(color);
      out.write("\"><label>");
      out.print(Servlet_Msg);
      out.write("</label></font></blink></center><br><br>");
 
                                            session.removeAttribute("msg");
                                               session.removeAttribute("color");
                                            }
 DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
 Calendar cal = Calendar.getInstance();
 String d1=dateFormat.format(cal.getTime());
System.out.println(d1);
 session.removeAttribute("vn"); 
   /*
            }*/
                                            
      out.write("\n");
      out.write("        \t<div id=\"container\" class=\"clearfix\">\n");
      out.write("                   \n");
      out.write("            \t<div id=\"mainCol\" class=\"clearfix\">\n");
      out.write("                   \n");
      out.write("                        <center>   <form name=\"form1\" id=\"form1\" method=\"post\" action=\"CreatecardCheck\" enctype=\"multipart/form-data\"  onsubmit=\"return formValidation();\"><TABLE style=\" margin-right: \"cellSpacing=0 cellPadding=0 width=590 bgColor=#6699cc border=0>\n");
      out.write("  \n");
      out.write("                                <TBODY>\n");
      out.write("  <TR>\n");
      out.write("    <TD vAlign=top height=321 width=\"592\">\n");
      out.write("      <TABLE cellSpacing=0 cellPadding=0 width=\"592\" border=1 height=\"381\">\n");
      out.write("        <TBODY>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("            <TD vAlign=top width=612 style=\"background-color:#1b1d1f\"\n");
      out.write("    height=\"381\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <b>&nbsp;&nbsp;</b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<p align=\"center\"> \n");
      out.write("<font face=\"Arial\" color=\"#6699CC\" size=\"4\"><b>Account Holder\n");
      out.write("Registration Form&nbsp;</b></font><table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#111111\" width=\"610\" id=\"AutoNumber6\" height=\"470\">\n");
      out.write("  <td width=\"39\">\n");
      out.write("  <br>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"39\" height=\"58\">&nbsp;</td>\n");
      out.write("    <td width=\"567\" height=\"58\"><b>Personal Information</b> \n");
      out.write("<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse: collapse\" bordercolor=\"#111111\" width=\"561\" id=\"AutoNumber7\" height=\"51\">\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"97\" height=\"26\">\n");
      out.write("      First Name<sup><font size=\"3\" color=\"red\">*</font></sup></td>\n");
      out.write("    <td width=\"161\" height=\"26\"><FONT color=#004080><INPUT name=fname size=\"16\" tabIndex=1></FONT></td>\n");
      out.write("    <td width=\"116\" height=\"25\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("      Last Name</td>\n");
      out.write("    <td width=\"179\" height=\"25\"><FONT color=#004080>\n");
      out.write("    <INPUT name=lname size=\"16\" tabIndex=2></FONT></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("      <td width=\"97\" height=\"13\">Date Of Birth<sup><font size=\"3\" color=\"red\">*</font></sup></td>\n");
      out.write("    <td width=\"161\" height=\"13\">\n");
      out.write("\n");
      out.write("    <FONT color=#004080><input name=\"datepicker\" id=\"datepicker\" class=\"validate-email required input_field\"  />\n");
      out.write("</td>\n");
      out.write("    <td width=\"116\" height=\"24\" rowspan=\"2\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Cell \n");
      out.write("    No<sup><font size=\"3\" color=\"red\">*</font></sup> </td>\n");
      out.write("    <td width=\"179\" height=\"24\" rowspan=\"2\"><FONT color=#004080>\n");
      out.write("    <INPUT name=cellno size=\"16\" tabIndex=6></FONT></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("   \n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"97\" height=\"12\">Gender<sup><font size=\"3\" color=\"red\">*</font></sup></td>\n");
      out.write("    <td width=\"161\" height=\"12\">\n");
      out.write("\n");
      out.write("<FONT color=#ae0000>\n");
      out.write("<SELECT name=sex size=1 tabIndex=7> <OPTION \n");
      out.write("        value=\"Sex\">Sex<OPTION value=Male>Male<OPTION value=Female>Female\n");
      out.write("      </OPTION></SELECT></FONT></td>\n");
      out.write("    <td width=\"116\" height=\"25\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;VoterId \n");
      out.write("    No <sup><font size=\"3\" color=\"red\">*</font></sup></td>\n");
      out.write("    <td width=\"179\"  height=\"25\" id=\"us\"><FONT color=#004080>\n");
      out.write("        <INPUT name=voterno tabIndex=8 size=\"16\">&nbsp;</FONT></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"97\" height=\"25\">E-mail<sup><font size=\"3\" color=\"red\">*</font></sup></td>\n");
      out.write("    <td width=\"161\" height=\"25\"  ><FONT color=#004080>\n");
      out.write("    <INPUT name=email tabIndex=9 size=\"16\" onclick=\"showBank(this.value)\"></FONT></td>\n");
      out.write("    <td width=\"116\" height=\"24\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Blood\n");
      out.write("    Group </td>\n");
      out.write("    <td width=\"179\" height=\"24\"><FONT color=#004080>\n");
      out.write("  <INPUT name=bg tabIndex=10 size=\"16\">&nbsp;</FONT></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("  <td width=\"555\" colspan=\"4\">\n");
      out.write("  <br>\n");
      out.write("  \n");
      out.write("  </tr>\n");
      out.write("\n");
      out.write(" \n");
      out.write("  \n");
      out.write("</table>\n");
      out.write("\n");
      out.write("    </td>\n");
      out.write("  </tr>\n");
      out.write(" <tr>\n");
      out.write("    <td width=\"39\" height=\"50\">\n");
      out.write("&nbsp;</td>\n");
      out.write("    <td width=\"567\" height=\"50\">\n");
      out.write("<p>\n");
      out.write("  <b>Account Details <sup><font size=\"3\" color=\"red\">*</font></sup></b> </p>\n");
      out.write("\n");
      out.write("  <table border=\"0\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" height=\"40\">\n");
      out.write("      <tr>\n");
      out.write("      <td>Add Account Details</td>\n");
      out.write("      <td>\n");
      out.write("          <label name=\"link\"><a href=\"JavaScript:newPopup('AddAccount.jsp');\" size=1 tabIndex=18 >Click Here</a></label></font></td>\n");
      out.write("      </tr>  \n");
      out.write("     </table>\n");
      out.write(" \n");
      out.write(" </td> </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td width=\"39\" height=\"228\">\n");
      out.write("    &nbsp;</td>\n");
      out.write("    <td width=\"567\" height=\"228\">\n");
      out.write("    <TABLE border=0 cellPadding=0 cellSpacing=0 style=\"LEFT: 527px; TOP: 1709px\" width=\"515\" height=\"40\">\n");
      out.write("    <br>\n");
      out.write("    <b>Login Details</b>\n");
      out.write("  <TR>\n");
      out.write("    <TD width=\"284\" height=\"28\"></TD>\n");
      out.write("    <TD width=\"367\" height=\"28\"></TD></TR>\n");
      out.write("  <TR>\n");
      out.write("    <TD width=\"284\" height=\"23\">Enter Your Password <sup><font size=\"3\" color=\"red\">*</font></sup></TD>\n");
      out.write("    <TD width=\"367\" height=\"23\"><INPUT name=passwd  tabIndex=39 type=password size=\"20\"></TD></TR>\n");
      out.write("  <TR>\n");
      out.write("    <TD width=\"284\" height=\"26\">Re-Type Your Password <sup><font size=\"3\" color=\"red\">*</font></sup></TD>\n");
      out.write("    <TD width=\"367\" height=\"26\"><INPUT name=\"retypepassword\" tabIndex=40 type=password size=\"20\"></TD></TR>\n");
      out.write(" \n");
      out.write("  <TR>\n");
      out.write("    <TD width=\"284\" height=\"28\">Fingerprint Image <sup><font size=\"3\" color=\"red\">*</font></sup></TD>\n");
      out.write("    <TD width=\"367\" height=\"28\">\n");
      out.write("    <input type=\"file\" name=\"file\" id=\"file\" value=\"Browse\"tabIndex=42 size=\"20\"/></TD></TR>\n");
      out.write("    </TABLE>\n");
      out.write("    <p>\n");
      out.write("    <FONT color=#004080>\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <INPUT name=submit tabIndex=43 type=Submit value=Create>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    <INPUT name=reset style=\"LEFT: 386px; TOP: 1893px\" tabIndex=44 type=reset value=Reset>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("    <a href=\"#top\" style=\"text-decoration: none\">Top</a></FONT>\n");
      out.write("\n");
      out.write("</td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("            <font color=\"#6699CC\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <font color=\"black\">Note:</font> Your Card Number Provides after Creation Only&nbsp;<br>\n");
      out.write("             &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <sup><font size=\"3\" color=\"red\">*</font> - Mandatory</sup></font></TD>\n");
      out.write("        \n");
      out.write("        </TBODY></TABLE></TD></TR>\n");
      out.write("\n");
      out.write("</TBODY></TABLE> </form></center> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("  \n");
      out.write("    </div> <!-- END of -->\n");
      out.write("                </div></div></div>\n");
      out.write("    <div id=\"templatemo_footer\">\n");
      out.write("    \tCopyright © 2048 Your Company Name<br /> Designed by <a href=\"http://www.templatemo.com\" rel=\"nofollow\" target=\"_parent\">Free CSS Templates</a>\n");
      out.write("    </div> \n");
      out.write("</div> \n");
      out.write("\n");
      out.write("\n");
      out.write("<script type='text/javascript' src='js/logging.js'></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
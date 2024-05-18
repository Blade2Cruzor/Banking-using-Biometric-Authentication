package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import Connection.DB;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;

public final class Transfer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("    ");

 
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

      out.write("\n");
      out.write("     <script language=\"javascript\" type=\"text/javascript\" src=\"datetimepicker.js\"></script>\n");
      out.write("      ");

     
        
      out.write("\n");
      out.write("<script type='text/javascript'>\n");
      out.write("     function formValidation()\n");
      out.write("{\n");
      out.write("var uid = document.form1.username;\n");
      out.write("var pass= document.form1.password ;\n");
      out.write("if(card_validation(uid,15))\n");
      out.write("{\n");
      out.write("if(userpass_validation(pass))\n");
      out.write("{}\n");
      out.write("}\n");
      out.write("\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("function card_validation(uzip,mx)\n");
      out.write("{\n");
      out.write("    var uid_len = uzip.value.length;\n");
      out.write("var numbers = /^[0-9]+$/;\n");
      out.write("if(uzip.value.match(numbers) && uid_len==mx)\n");
      out.write("{\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("else if (uid_len == 0)\n");
      out.write("{\n");
      out.write("alert('Card Number Should Not be Empty');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}else if (uzip.value.match(numbers) && uid_len<mx)\n");
      out.write("{\n");
      out.write("alert(\"Card Number Length Should be \"+mx+\"\");\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("else if(uzip.value.match(numbers)!=0)\n");
      out.write("    {\n");
      out.write("alert('Card Number must have numeric characters only');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("function userpass_validation(uid)\n");
      out.write("{\n");
      out.write("var uid_len = uid.value.length;\n");
      out.write("if (uid_len === 0 )\n");
      out.write("{\n");
      out.write("alert(\"Password should not be empty \");\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("else\n");
      out.write("{\n");
      out.write("//alert('Form Succesfully Submitted');\n");
      out.write("document.form1.action = \"TranLoginCheck\";\n");
      out.write("document.form1.submit();\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
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
      out.write("             ");

                    String an="",bn="";
                  
                   if(session.getAttribute("bn")==null)
                   bn = request.getParameter("bn");
                   else
                      bn=(String)session.getAttribute("bn");  
                   if(session.getAttribute("bn")==null)
                   an = request.getParameter("an");
                   else
                      an=(String)session.getAttribute("an");
                   
   
                    
      out.write("\n");
      out.write("                     <form name=\"form1\" id=\"form1\" method=\"post\" action=\"Withdrawl?o=Transfer.jsp\" onsubmit=\"return formValidation();\"> \n");
      out.write("                    <center>   <font size=\"5\" color=\"green\">ACCOUNT INFORMATION</font>  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\n");
      out.write("                   ");

 if(Servlet_Msg!=null){
                                    
      out.write("\n");
      out.write("                                    <br><center><blink> <font size=\"3\" color=\"");
      out.print(color);
      out.write("\"><label>");
      out.print(Servlet_Msg);
      out.write("</label></font></blink></center><br>");
 
                                            session.removeAttribute("msg");
                                               session.removeAttribute("color");
                                            }
      out.write("\n");
      out.write("               <tr  height=\"38\"><td><font  size=\"3\">Card No        </font></td><td><input type=\"text\" id='cn' name=\"cn\" readonly value=\"");
      out.print(cn);
      out.write("\" /></td></tr><tr></tr><tr></tr>\n");
      out.write("  <tr  height=\"38\"><br><br><td><font  size=\"3\">From Bank        </font></td><td><input type=\"text\" id='fbn' name=\"fbn\" readonly value=\"");
      out.print(bn);
      out.write("\" /></td></tr><tr></tr><tr></tr>\n");
      out.write("<tr  height=\"38\"><td><font  size=\"3\">From Account No        </font></td><td><input type=\"text\" id='facn' name=\"facn\" readonly value=\"");
      out.print(an);
      out.write("\"/></td></tr><tr></tr><tr></tr>\n");
      out.write("<tr  height=\"38\"><td><font  size=\"3\">PIN No        </font></td><td><input type=\"password\" id='ps' name=\"ps\"/></td></tr><tr></tr><tr></tr>\n");
      out.write("<tr  height=\"38\"><td><font  size=\"3\">Amount      </font></td><td><input type=\"text\" id='amt' name=\"amt\"/></td></tr>\n");
      out.write("<tr  height=\"38\"><td><font  size=\"3\">To Bank</font></td><td><select id='tobn' name=\"tobn\" onchange=\"showBank(this.value)\">\n");
      out.write("<option value=\"Select\">Please Choose</option>\n");
      out.write(" ");

      DB Db=new DB();
 try{
           ResultSet rs=Db.Select("select * from Accountdetails where cn='"+cn+"' and bn!='"+bn+"'");
           while(rs.next())
                             {
         
      out.write("\n");
      out.write("                                            <option>");
      out.print(rs.getString(2));
      out.write("</option> ");
 }
           rs.close();
 
 }catch(Exception ex){
            ex.printStackTrace();
        }
      out.write("\n");
      out.write("</select></td></tr>\n");
      out.write("<tr id=\"toac1\">\n");
      out.write("    \t<tr  height=\"38\"><td></td><td>\n");
      out.write("        <input type=\"submit\" value=\"Transfer\" style=\"font-size:10pt\"/>\n");
      out.write("        <input type=\"reset\" value=\"Reset\" style=\"font-size:10pt\"/>\n");
      out.write("</td></tr> </table>          </center>\n");
      out.write("        </form>\n");
      out.write("                 \n");
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

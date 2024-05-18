package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Connection.DB;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.sql.*;

public final class AddAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>");
 
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

      out.write("\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Add Account</title>\n");
      out.write("        <script>\n");
      out.write("      function formValidation()\n");
      out.write("{\n");
      out.write("var vn = document.form1.vid;\n");
      out.write("var bn = document.form1.BankName;\n");
      out.write("var an = document.form1.an;\n");
      out.write("var ps= document.form1.ps;\n");
      out.write("if(Vn_validation(vn,7))\n");
      out.write("{\n");
      out.write("if(Bn_validation(bn))\n");
      out.write("{\n");
      out.write("if(An_validation(an,16))\n");
      out.write("{ \n");
      out.write("if(Ps_validation(ps,4))\n");
      out.write("{ \n");
      out.write("    return true;  \n");
      out.write("}                            \n");
      out.write("}\n");
      out.write("}\n");
      out.write("}\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("function Vn_validation(uzip,mx)\n");
      out.write("{\n");
      out.write("    var uid_len = uzip.value.length;\n");
      out.write("var numbers = /^[0-9]+$/;\n");
      out.write("if(uzip.value.match(numbers) && uid_len==mx)\n");
      out.write("{\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("else if (uid_len == 0)\n");
      out.write("{\n");
      out.write("alert('VoterId No Should Not be Empty');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}else if ((uzip.value.match(numbers)) && (uid_len<mx || uid_len>mx))\n");
      out.write("{\n");
      out.write("alert(\"VoterId No Length Should be \"+mx+\"\");\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("else if(uzip.value.match(numbers)!=0)\n");
      out.write("    {\n");
      out.write("alert('VoterId No must have numeric characters only');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("function Bn_validation(uid)\n");
      out.write("{\n");
      out.write("if(uid.value == \"Select\")\n");
      out.write("{\n");
      out.write("alert(\"Please Select the Bank\");\n");
      out.write("uid.focus();\n");
      out.write("return false;\n");
      out.write("    }\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("function An_validation(uzip,mx)\n");
      out.write("{\n");
      out.write("    var uid_len = uzip.value.length;\n");
      out.write("var numbers = /^[0-9]+$/;\n");
      out.write("if(uzip.value.match(numbers) && uid_len==mx)\n");
      out.write("{\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("else if (uid_len == 0)\n");
      out.write("{\n");
      out.write("alert('Account No Should Not be Empty');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}else if ((uzip.value.match(numbers)) && (uid_len<mx || uid_len>mx))\n");
      out.write("{\n");
      out.write("alert(\"Account No Length Should be \"+mx+\"\");\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("else if(uzip.value.match(numbers)!=0)\n");
      out.write("    {\n");
      out.write("alert('Account No must have numeric characters only');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("function Ps_validation(uzip,mx)\n");
      out.write("{\n");
      out.write("    var uid_len = uzip.value.length;\n");
      out.write("var numbers = /^[0-9]+$/;\n");
      out.write("if(uzip.value.match(numbers) && uid_len==mx)\n");
      out.write("{\n");
      out.write("return true;\n");
      out.write("}\n");
      out.write("else if (uid_len == 0)\n");
      out.write("{\n");
      out.write("alert('Pin No Should Not be Empty');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}else if ((uzip.value.match(numbers)) && (uid_len<mx || uid_len>mx))\n");
      out.write("{\n");
      out.write("alert(\"Pin No Length Should be \"+mx+\"\");\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("\n");
      out.write("else if(uzip.value.match(numbers)!=0)\n");
      out.write("    {\n");
      out.write("alert('Pin No must have numeric characters only');\n");
      out.write("uzip.focus();\n");
      out.write("return false;\n");
      out.write("}\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String vid=request.getParameter("vid");
        
      out.write("\n");
      out.write("      <form name=\"form1\" method=\"post\" action=\"Accountreg\" onsubmit=\"return formValidation();\">\n");
      out.write("          <br><br><br>\n");
      out.write("               <center>   <font size=\"5\" color=\"red\">ACCOUNT INFORMATION</font>  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\">\n");
      out.write("                       <tr><br><br><td><font  size=\"3\">VoterId No        </font></td><td><input type=\"text\" id='User' name=\"vid\" readonly=\"\" value=\"");
      out.print(vid);
      out.write("\" /></td></tr><tr></tr><tr></tr>\n");
      out.write("<tr><td><font  size=\"4\">Select Bank</font></td><td><select id='BankName' name=\"BankName\">\n");
      out.write("<option value=\"Select\">Please Choose</option>\n");
      out.write("<option>State Bank of India</option>\n");
      out.write("<option>Allahabad Bank</option>\n");
      out.write("<option>Bank of India</option>\n");
      out.write("<option>Central Bank of India</option>\n");
      out.write("<option>Indian Bank</option>\n");
      out.write("<option>Punjab National Bank</option>\n");
      out.write("<option>Union Bank of India</option>\n");
      out.write("<option>Axis Bank </option>\n");
      out.write("<option>ICICI Bank</option>\n");
      out.write("<option>HDFC Bank</option></select></td></tr><tr></tr><tr></tr>\n");
      out.write("\n");
      out.write("<tr><td><font  size=\"3\">Account No        </font></td><td><input type=\"text\" id='User' name=\"an\"/></td></tr><tr></tr><tr></tr>\n");
      out.write("<tr><td><font  size=\"3\">PIN No        </font></td><td><input type=\"password\" id='ps' name=\"ps\"/></td></tr><tr></tr><tr></tr>\n");
      out.write("<tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>\n");
      out.write("<tr><td></td><td>\n");
      out.write("        <input type=\"submit\" value=\"Add\" style=\"font-size:10pt\"/>\n");
      out.write("        <input type=\"reset\" value=\"Reset\" style=\"font-size:10pt\"/>\n");
      out.write("</td></tr>\n");
      out.write("    \t\n");
      out.write("                   </table> </center>\n");
      out.write("        </form><br>\n");
      out.write("         ");

             
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
      out.write("\n");
      out.write("                            <table border=\"1\" cellpadding=\"0\" cellspacing=\"0\" align=\"center\"> \n");
      out.write("        ");
 try{
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
        }
      out.write("\n");
      out.write("                            </table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

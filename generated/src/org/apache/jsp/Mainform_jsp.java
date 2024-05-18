package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;

public final class Mainform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("     <script language=\"javascript\" type=\"text/javascript\" src=\"datetimepicker.js\"></script>\n");
      out.write("     ");


           
 String Servlet_Msg = (String) session.getAttribute("msg");
              String color = (String) session.getAttribute("color");

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
      out.write("        \t<li><a href=\"Mainform.jsp\" class=\"home\"><span></span></a></li>\n");
      out.write("            <li><a href=\"Createcard.jsp\" class=\"about\"><span></span></a></li>\n");
      out.write("            <li><a href=\"Transaction.jsp\" class=\"portfolio\"><span></span></a></li>\n");
      out.write("            <li><a href=\"\" class=\"services\"><span></span></a></li>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("\t\t</ul>\n");
      out.write("        \t\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div id=\"templatemo_main\">\n");
      out.write("    \t<div id=\"home\" class=\"main_box\">\n");
      out.write("        \t<h1>Welcome to Pattern Classifiers</h1>\n");
      out.write("        \t<div class=\"col col_23\">\n");
      out.write("            \t<img src=\"images/templatemo_image_01.jpg\" alt=\"image\" class=\"img_frame\" />\n");
      out.write("                <p><em>Pattern classification systems are commonly used in adversarial applications, like biometric authentication, network\n");
      out.write("intrusion detection, and spam filtering, in which data can be purposely manipulated by humans to undermine their operation. As this\n");
      out.write("adversarial scenario is not taken into account by classical design methods, pattern classification systems may exhibit vulnerabilities,\n");
      out.write("whose exploitation may severely affect their performance, and consequently limit their practical utility. Extending pattern classification\n");
      out.write("theory and design methods to adversarial settings is thus a novel and very relevant research direction, which has not yet been pursued\n");
      out.write("in a systematic way. In this paper, we address one of the main open issues: evaluating at design phase the security of pattern\n");
      out.write("classifiers, namely, the performance degradation under potential attacks they may incur during operation. We propose a framework for\n");
      out.write("empirical evaluation of classifier security that formalizes and generalizes the main ideas proposed in the literature, and give examples\n");
      out.write("of its use in three real applications. Reported results show that security evaluation can provide a more complete understanding of the\n");
      out.write("classifier’s behavior in adversarial environments, and lead to better design choices..</em></p>\n");
      out.write("                \n");
      out.write("\t\t\t</div>\n");
      out.write("            <div class=\"col col_13 no_margin_right\">\n");
      out.write("            \t<h3>Testimonials</h3>\n");
      out.write("                <blockquote>\n");
      out.write("                    <p>Fusce nec felis id lacus sollicitudin vulputate. Proin tincidunt, arcu id pellentesque accumsan, neque dolor imperdiet ligula, quis viverra tellus nulla a odio. Curabitur vitae enim risus, at placerat turpis. </p>\n");
      out.write("                    <cite>Juvin Nile - <span>Senior Webmaster</span></cite>\n");
      out.write("\t\t\t\t</blockquote>\n");
      out.write("                <blockquote>\n");
      out.write("\t\t\t\t\t<p>Donec purus nulla, egestas ac porttitor et, pharetra nec felis. Donec lobortis fringilla blandit. Fusce a purus vel justo pulvinar tempor.  In ligula arcu, facilisis commodo lacinia in, vehicula  lacus. </p>\n");
      out.write("\t\t\t\t\t<cite>Paul - <span>Web Designer</span></cite> \n");
      out.write("\t\t\t\t</blockquote>\n");
      out.write("                \n");
      out.write("                <div class=\"cleaner h40\"></div>\n");
      out.write("                \n");
      out.write("            \t<h3>Twitter</h3>\n");
      out.write("                <ul class=\"twitter_post\">\n");
      out.write("                \t<li>Suspendisse at scelerisque urna. Aenean tincidunt massa in tellus varius ultricies. <a href=\"#\"></a></li>\n");
      out.write("                    <li>Aliquam odio nibh, suscipit quis venenatis vitae, fringilla at quam. <a href=\"#\"></a></li>\n");
      out.write("                    <li>Proin tincidunt, arcu id pellentesque accumsan, neque dolor imperdiet ligula, quis viverra tellus nulla odio. <a href=\"#\"></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"cleaner\"></div>\n");
      out.write("            <a href=\"\" class=\"gototop\">Go To Top</a>\n");
      out.write("            <div class=\"cleaner\"></div>\n");
      out.write("\t\t</div> <!-- END of home -->\n");
      out.write("        \n");
      out.write("       \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("  \n");
      out.write("    </div> <!-- END of -->\n");
      out.write("                </div></div></div>\n");
      out.write("    <div id=\"templatemo_footer\">\n");
      out.write("    \tCopyright © 2048 Your Company Name<br /> Designed by <a href=\"\" rel=\"nofollow\" target=\"_parent\">Free CSS Templates</a>\n");
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

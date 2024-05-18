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
var pass= document.form1.password;
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
if(uzip.value.match(numbers) && uid_len===mx)
{
return true;
}
else if (uid_len === 0)
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

else if(uzip.value.match(numbers)!==0)
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
    	<div id="site_title">Banking with Pattern Classifiers</a></div><br>
    </div>
    
    <div id="templatmeo_menu">
    	<ul>
        	<li><a href="Mainform.jsp" class="home"><span></span></a></li>
            <li><a href="Createcard.jsp" class="about"><span></span></a></li>
            <li><a href="Transaction.jsp" class="portfolio"><span></span></a></li>
            <li><a href="" class="services"><span></span></a></li>
           
           
		</ul>
        	
    </div>
    
    <div id="templatemo_main">
    	<div id="home" class="main_box">
        	<h1>Welcome to Pattern Classifiers</h1>
        	<div class="col col_23">
            	<img src="images/templatemo_image_01.jpg" alt="image" class="img_frame" />
                <p><em>Pattern classification systems are commonly used in adversarial applications, like biometric authentication, network
intrusion detection, and spam filtering, in which data can be purposely manipulated by humans to undermine their operation. As this
adversarial scenario is not taken into account by classical design methods, pattern classification systems may exhibit vulnerabilities,
whose exploitation may severely affect their performance, and consequently limit their practical utility. Extending pattern classification
theory and design methods to adversarial settings is thus a novel and very relevant research direction, which has not yet been pursued
in a systematic way. In this paper, we address one of the main open issues: evaluating at design phase the security of pattern
classifiers, namely, the performance degradation under potential attacks they may incur during operation. We propose a framework for
empirical evaluation of classifier security that formalizes and generalizes the main ideas proposed in the literature, and give examples
of its use in three real applications. Reported results show that security evaluation can provide a more complete understanding of the
classifier’s behavior in adversarial environments, and lead to better design choices..</em></p>
                
			</div>
            <div class="col col_13 no_margin_right">
            	<h3>Here are some Testimonials</h3>
                <blockquote>
                    <p>"I recently switched to SecureBank for their advanced biometric authentication, and I couldn’t be happier with my decision. The fingerprint and facial recognition features make accessing my accounts incredibly fast and secure. I no longer worry about forgetting passwords or the risk of my account being hacked. The setup was straightforward, and the system works flawlessly every time. SecureBank's use of biometrics has given me peace of mind knowing that my financial information is protected by the latest technology. I highly recommend SecureBank to anyone looking for a safe and convenient banking experience."</p>
                    <cite>Jane Smith - <span>Senior Webmaster</span></cite>
				</blockquote>
                <blockquote>
					<p>"As someone who values both security and convenience, switching to FinGuard Bank was a game-changer. Their biometric authentication system is incredibly reliable and easy to use. I love the fact that I can access my accounts with just a quick fingerprint scan or facial recognition, without the hassle of remembering multiple passwords. This advanced security measure not only speeds up my transactions but also gives me confidence that my sensitive information is well-protected. FinGuard Bank has truly enhanced my banking experience with their cutting-edge technology. Highly recommended!" </p>
					<cite>Paul - <span>Web Designer</span></cite> 
				</blockquote>
                
                <div class="cleaner h40"></div>
                
            	<h3>Contact Us</h3>
                <ul class="twitter_post">
                	<li>1800 103 1906 (toll free) <a href="#"></a></li>
                    <li>1800 220 229 (toll free) <a href="#"></a></li>
                   </ul>
            </div>
            <div class="cleaner"></div>
            <a href="" class="gototop">Go To Top</a>
            <div class="cleaner"></div>
		</div> <!-- END of home -->
        
       
        
        
        
  
    </div> <!-- END of -->
                </div></div></div>
    <div id="templatemo_footer">
    	Copyright © 2048<br /> Designed by <a href="" rel="nofollow" target="_parent">BHUVANESH A</a>
    </div> 
</div> 


<script type='text/javascript' src='js/logging.js'></script>
</body>
</html>
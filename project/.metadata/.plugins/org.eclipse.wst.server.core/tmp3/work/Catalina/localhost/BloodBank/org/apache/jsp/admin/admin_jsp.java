/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.40
 * Generated at: 2019-12-04 17:42:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/admin/../Designs/footer.jsp", Long.valueOf(1575371736000L));
    _jspx_dependants.put("/admin/../includes/menu_admin.jsp", Long.valueOf(1575351220000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../Designs/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Swiper CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"../Designs/css/swiper.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Styles -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h1>ADMIN PAGE</h1>\r\n");
      out.write("\t");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("ul {\r\n");
      out.write("\tlist-style-type: none;\r\n");
      out.write("\tmargin: 0;\r\n");
      out.write("\tpadding: 0;\r\n");
      out.write("\toverflow: hidden;\r\n");
      out.write("\tbackground-color: blue;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li {\r\n");
      out.write("\tfloat: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a {\r\n");
      out.write("\tdisplay: block;\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tpadding: 14px 16px;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("li a:hover:not (.active ) {\r\n");
      out.write("\tbackground-color: red;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".active {\r\n");
      out.write("\tbackground-color: blue;\r\n");
      out.write("\torange\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<ul>\r\n");
      out.write("\t\t<li><a href=\"../Designs/index.jsp\">Home</a></li>\r\n");
      out.write("\t\t<li><a href=\"../admin/admin_view_donor.jsp\">Donor Request</a></li>\r\n");
      out.write("\t\t<li><a href=\"../admin/admin_view_receiver.jsp\">Receiver\r\n");
      out.write("\t\t\t\tRequest</a></li>\r\n");
      out.write("\t\t<li><a href=\"../admin/onetimeDonation.jsp\">ADD Donor</a></li>\r\n");
      out.write("\t\t<li><a href=\"../admin/admin_view_all_donor.jsp\">Donor Details</a></li>\r\n");
      out.write("\t\t<li><a href=\"../admin/admin_view_all_receiver.jsp\">Receiver\r\n");
      out.write("\t\t\t\tDetails</a></li>\r\n");
      out.write("\t\t<li><a href=\"../admin/blood_stock_view.jsp\">Stock Details</a></li>\r\n");
      out.write("\t\t<li><a href=\"../login/adminlogout.jsp\">Log Out</a></li>\r\n");
      out.write("\r\n");
      out.write("\t</ul>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<!-- Required meta tags -->\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("\thref=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Swiper CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/swiper.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Styles -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("<script src=\"js/custom.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"background-image: url('images/footer-bg.png')\">\r\n");
      out.write("\t<footer class=\"site-footer\">\r\n");
      out.write("\t\t<div class=\"footer-widgets\">\r\n");
      out.write("\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-md-6 col-lg-4\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"foot-about\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>\r\n");
      out.write("\t\t\t\t\t\t\t\t<a href=\"#\"><img src=\"images/logo.png\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t\t\t\t</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p>This project is designed for successful completion of a\r\n");
      out.write("\t\t\t\t\t\t\t\tproject on blood bank management system. This project aims at\r\n");
      out.write("\t\t\t\t\t\t\t\tmaintaining all the information pertaining to blood donors,\r\n");
      out.write("\t\t\t\t\t\t\t\tdifferent blood groups available in each blood bank and help\r\n");
      out.write("\t\t\t\t\t\t\t\tthem manage in a better way.</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"copyright\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\t\t\t\tCopyright &copy;\r\n");
      out.write("\t\t\t\t\t\t\t\t<script>\r\n");
      out.write("\t\t\t\t\t\t\t\t\tdocument.write(new Date().getFullYear());\r\n");
      out.write("\t\t\t\t\t\t\t\t</script>\r\n");
      out.write("\t\t\t\t\t\t\t\tAll rights reserved</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- .foot-about -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- .col -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-md-6 col-lg-4 mt-5 mt-md-0\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"foot-contact\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Contact</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p class=\"p-0 m-0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>Addtress:</span>ABCD Trivandrum Kerala India </br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>Phone:</span>+91 773 636 7984<br> <br>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span>Email:</span>mbvishnu17@gmail.com</br>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- .col -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"col-12 col-md-6 col-lg-4 mt-5 mt-md-0\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"foot-links\">\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Usefull Links</h2>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Designs/index.jsp\">Home</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/donor_add.jsp\">Donor Register</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/receiver_add.jsp\">Receiver Register</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/donor_view_all.jsp\">View Donor</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t\t\t<A href=\"../Blood/receiver_view_all.jsp\">View Receiver</A><br>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<!-- .foot-links -->\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- .col -->\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<!-- .row -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- .container -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- .footer-widgets -->\r\n");
      out.write("\t</footer>\r\n");
      out.write("\t<!-- .site-footer -->\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.collapsible.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/swiper.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.countdown.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/circle-progress.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.countTo.min.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/jquery.barfiller.js'></script>\r\n");
      out.write("\t<script type='text/javascript' src='js/custom.js'></script>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

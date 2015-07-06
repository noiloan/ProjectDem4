package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("<body>\n");
      out.write("<div id=\"wrapper\">\n");
      out.write("  <h1><a href=\"#\"><img src=\"images/logo.gif\" width=\"554\" height=\"47\" alt=\"Travel Agency\" /></a></h1>\n");
      out.write("  <div id=\"booking\">\n");
      out.write("    <h2>Bookings &amp; Reservations</h2>\n");
      out.write("    <form action=\"#\" method=\"get\">\n");
      out.write("      <div class=\"jtype\">\n");
      out.write("        <label for=\"flight\">Flight</label>\n");
      out.write("        <input name=\"flight\" id=\"flight\" type=\"checkbox\" value=\"flight\" />\n");
      out.write("        &nbsp; &nbsp;\n");
      out.write("        <label for=\"hotel\">Hotel</label>\n");
      out.write("        <input name=\"hotel\" id=\"hotel\" type=\"checkbox\" value=\"hotel\" />\n");
      out.write("        &nbsp; &nbsp;\n");
      out.write("        <label for=\"cruise\">Cruise</label>\n");
      out.write("        <input name=\"cruise\" id=\"cruise\" type=\"checkbox\" value=\"cruise\" />\n");
      out.write("      </div>\n");
      out.write("      <!-- end .jtype -->\n");
      out.write("      <table summary=\"\" cellspacing=\"0\" cellpadding=\"0\" border=\"0\">\n");
      out.write("        <tr>\n");
      out.write("          <th>Check in</th>\n");
      out.write("          <td><input name=\"in\" type=\"text\" value=\"\" class=\"text\" />\n");
      out.write("            <input type=\"submit\" value=\"submit\" class=\"submit\" /></td>\n");
      out.write("        </tr>\n");
      out.write("        <tr>\n");
      out.write("          <th>Check out</th>\n");
      out.write("          <td><input name=\"out\" type=\"text\" value=\"\" class=\"text\" />\n");
      out.write("            <input type=\"submit\" value=\"submit\" class=\"submit\" /></td>\n");
      out.write("        </tr>\n");
      out.write("      </table>\n");
      out.write("      <p class=\"advanced\"><a href=\"#\"><img src=\"images/advanced.gif\" width=\"11\" height=\"11\" alt=\"\" /> Advanced Search</a></p>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("  <!-- end booking -->\n");
      out.write("  <div id=\"nav\">\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"#\">Home</a></li>\n");
      out.write("      <li><a href=\"#\">Tours</a></li>\n");
      out.write("      <li><a href=\"#\">Bookings</a></li>\n");
      out.write("      <li><a href=\"#\">Services</a></li>\n");
      out.write("      <li><a href=\"#\">Contacts</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  <!-- end nav -->\n");
      out.write("  <h2  id=\"packagesheader\"><img src=\"images/title_our_packages.gif\" width=\"352\" height=\"23\" alt=\"our packages\" /></h2>\n");
      out.write("  <div id=\"packages\">\n");
      out.write("    <h3 class=\"golden\">Golden Package</h3>\n");
      out.write("    <p>Don't forgot to check free website templates every day, because we add at least one free website template daily.</p>\n");
      out.write("    <p>This is a template designed by free website templates for you for free you can replace all the text by your own \n");
      out.write("      text. This is just a place holder so you can see how the site would look like.</p>\n");
      out.write("    <p class=\"readmore\"><a href=\"#\"><img src=\"images/readmore.gif\" width=\"68\" height=\"15\" alt=\"readmore\" /></a></p>\n");
      out.write("    <h3 class=\"silveren\">Silver Package</h3>\n");
      out.write("    <p>If you're having problems editing the template please don't hesitate to ask for help on the forum.</p>\n");
      out.write("    <p class=\"readmore\"><a href=\"#\"><img src=\"images/readmore.gif\" width=\"68\" height=\"15\" alt=\"readmore\" /></a></p>\n");
      out.write("    <div id=\"special\"> <a href=\"#\"><img src=\"images/ad_special_offer.gif\" width=\"293\" height=\"79\" alt=\"special offer\" /></a> </div>\n");
      out.write("    <!-- end special -->\n");
      out.write("  </div>\n");
      out.write("  <!-- end packages -->\n");
      out.write("  <div id=\"main\"> <img src=\"images/people.jpg\" width=\"447\" height=\"298\" alt=\"two people having a walk\" class=\"block\" />\n");
      out.write("    <h2><img src=\"images/title_hottest_locations.gif\" width=\"447\" height=\"24\" alt=\"hottest locations\" /></h2>\n");
      out.write("    <div class=\"inner\">\n");
      out.write("      <h3 class=\"blue\">Italy</h3>\n");
      out.write("      <img src=\"images/photo_1.jpg\" width=\"109\" height=\"71\" alt=\"stunning italian history\" class=\"left\" />\n");
      out.write("      <p>You can remove any link to our websites from this template you're  free to use the template without linking \n");
      out.write("        back to us. Don't want your boss to know you used a free website template ;) .</p>\n");
      out.write("      <br />\n");
      out.write("      <br />\n");
      out.write("      <h3 class=\"green\">Hawai</h3>\n");
      out.write("      <img src=\"images/photo_2.jpg\" width=\"109\" height=\"71\" alt=\"sea, the beaches\" class=\"left\" />\n");
      out.write("      <p>If you're looking for beautiful and professionally made templates you can find them at Template Beauty.com.</p>\n");
      out.write("      <p>To find great hosting providers visit Web Hosting Zoom.</p>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div>\n");
      out.write("  <!-- end main -->\n");
      out.write("  <div id=\"footer\"> &copy; Copyright Information here | designed by <a href=\"http://www.freewebsitetemplates.com\">free website templates</a></div>\n");
      out.write("  <!-- end footer -->\n");
      out.write("</div>\n");
      out.write("<!-- end wrapper -->\n");
      out.write("</body>\n");
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

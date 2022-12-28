/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.9.v20180320
 * Generated at: 2022-12-27 07:48:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import springTest.model.UserData;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("springTest.model.UserData");
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

final boolean hasUserData = session.getAttribute("user_info") != null;
System.out.println( "여기는 index.jsp > "+ hasUserData );

      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>연습용 페이지 입니다.</title>\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\" crossorigin=\"anonymous\">\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        .bd-placeholder-img {\r\n");
      out.write("            font-size: 1.125rem;\r\n");
      out.write("            text-anchor: middle;\r\n");
      out.write("            -webkit-user-select: none;\r\n");
      out.write("            -moz-user-select: none;\r\n");
      out.write("            user-select: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        @media (min-width: 768px) {\r\n");
      out.write("            .bd-placeholder-img-lg {\r\n");
      out.write("                font-size: 3.5rem;\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/common/top.jsp", out, false);
      out.write("\r\n");
      out.write(" <header>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"px-3 py-2 border-bottom mb-3\">\r\n");
      out.write("      <div class=\"container d-flex flex-wrap justify-content-center\">\r\n");
      out.write("        <form class=\"col-12 col-lg-auto mb-2 mb-lg-0 me-lg-auto\">\r\n");
      out.write("          <input type=\"search\" class=\"form-control\" placeholder=\"Search...\" aria-label=\"Search\">\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"text-end\">\r\n");
        if(!hasUserData){ 
      out.write("\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-light text-dark me-2\" onclick=\"location.href='/view/login.jsp'\">Login</button>\r\n");
      out.write("          <button type=\"button\" class=\"btn btn-primary\" onclick=\"location.href='/view/userJoin.jsp'\">Sign-up</button>\r\n");
       }else{ 
      out.write("\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-light text-dark me-2\" onclick=\"location.href='view/logout.jsp'\">Logout</button>\r\n");
      out.write("\r\n");
       } 
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </header>\r\n");
      out.write("\r\n");
      out.write("<main>\r\n");
      out.write("\r\n");
      out.write("    <section class=\"py-5 text-center container\">\r\n");
      out.write("        <div class=\"row py-lg-5\">\r\n");
      out.write("            <div class=\"col-lg-6 col-md-8 mx-auto\">\r\n");
      out.write("                <h1 class=\"fw-light\">연습용 페이지입니다.</h1>\r\n");
      out.write("                <p class=\"lead text-muted\">이 페이지에는 온갖 예제가 들어올 예정입니다. DB불러오기, DB전송하기, 부트스트랩, 제이쿼리 등 연습용 페이지로 활용될 계획이며, 만약에 더 괜찮은 연습 자료가 있다면 수정해서 Push해주세요. 감사합니다.</p>\r\n");
      out.write("                <p>\r\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary my-2\">버튼을 눌렀을 때 Modal 페이지 띄우는 예제(미구현)</a>\r\n");
      out.write("                    <a href=\"main.kgu\" class=\"btn btn-secondary my-2\">홈으로 돌아가기</a>\r\n");
      out.write("                </p>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </section>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"album py-5 bg-light\">\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3\">\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <div class=\"card shadow-sm\">\r\n");
      out.write("                        <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"/><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <div class=\"card shadow-sm\">\r\n");
      out.write("                        <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"/><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <div class=\"card shadow-sm\">\r\n");
      out.write("                        <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"/><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <div class=\"card shadow-sm\">\r\n");
      out.write("                        <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"/><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <div class=\"card shadow-sm\">\r\n");
      out.write("                        <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"/><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <div class=\"card shadow-sm\">\r\n");
      out.write("                        <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"/><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <div class=\"card shadow-sm\">\r\n");
      out.write("                        <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"/><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <div class=\"card shadow-sm\">\r\n");
      out.write("                        <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"/><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col\">\r\n");
      out.write("                    <div class=\"card shadow-sm\">\r\n");
      out.write("                        <svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"225\" xmlns=\"http://www.w3.org/2000/svg\" role=\"img\" aria-label=\"Placeholder: Thumbnail\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\"><title>Placeholder</title><rect width=\"100%\" height=\"100%\" fill=\"#55595c\"/><text x=\"50%\" y=\"50%\" fill=\"#eceeef\" dy=\".3em\">Thumbnail</text></svg>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <p class=\"card-text\">This is a wider card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>\r\n");
      out.write("                            <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                                <div class=\"btn-group\">\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">View</button>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-sm btn-outline-secondary\">Edit</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <small class=\"text-muted\">9 mins</small>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("</main>\r\n");
      out.write("\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/view/common/footer.jsp", out, false);
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

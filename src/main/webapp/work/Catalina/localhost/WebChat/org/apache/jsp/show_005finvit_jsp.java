/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.7
 * Generated at: 2023-04-14 14:50:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;

public final class show_005finvit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/WEB-INF/includes/sidebar.jsp", Long.valueOf(1680847070195L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "Les JSPs ne permettent que GET, POST ou HEAD. Jasper permet aussi OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
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
      out.write("\r\n");
      out.write("<!-- <!DOCTYPE html>\r\n");
      out.write("<html> -->\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>ChatApp</title>\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"/>\r\n");
      out.write("<link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(" *{\r\n");
      out.write("margin:0;\r\n");
      out.write("padding:0;\r\n");
      out.write("outline:none;\r\n");
      out.write("border:none;\r\n");
      out.write("text-decoration:none;\r\n");
      out.write("box-sizing:border-box;\r\n");
      out.write("font-family:sans-serif;\r\n");
      out.write("\r\n");
      out.write("} \r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("   background-color: #fbab7e; \r\n");
      out.write(" background-image: linear-gradient(62deg, #fbab7e 0%, #d90647 100%);\r\n");
      out.write("   height: 300vh;\r\n");
      out.write("  width: 100vw; } \r\n");
      out.write("nav{\r\n");
      out.write("position:absolute;\r\n");
      out.write("top:0;\r\n");
      out.write("bottom:0;\r\n");
      out.write("height: 300vh;\r\n");
      out.write("left:0;\r\n");
      out.write("background:#fff;\r\n");
      out.write("width:110px;\r\n");
      out.write("overflow:hidden;\r\n");
      out.write("transition:width 0.2s linear;\r\n");
      out.write("box-shadow:0 20px 35px rgba(0,0,0,0.1);\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo{\r\n");
      out.write("text-align:center;\r\n");
      out.write("display:flex;\r\n");
      out.write("transition:all 0.5s ease;\r\n");
      out.write("margin:10px 0 0 ;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("ul{\r\n");
      out.write(" list-style-type: none;\r\n");
      out.write("}\r\n");
      out.write(".logo img{\r\n");
      out.write("width:75px;\r\n");
      out.write("height:75px;\r\n");
      out.write("border-radius:50%;\r\n");
      out.write("}\r\n");
      out.write(".logo span{\r\n");
      out.write("font-weight:bold;\r\n");
      out.write("padding-left:15px;\r\n");
      out.write("font-size:18px;\r\n");
      out.write("text-transform:uppercase;\r\n");
      out.write("}\r\n");
      out.write("a{\r\n");
      out.write("position:relative;\r\n");
      out.write("color:rgb(85,83,83);\r\n");
      out.write("font-size:14px;\r\n");
      out.write("display:table;\r\n");
      out.write("width:300px;\r\n");
      out.write("padding:10px;\r\n");
      out.write("text-decoration:none;\r\n");
      out.write("}\r\n");
      out.write(".fas{\r\n");
      out.write("position:relative;\r\n");
      out.write("width:70px;\r\n");
      out.write("height:40px;\r\n");
      out.write("top:14px;\r\n");
      out.write("font-size:20px;\r\n");
      out.write("text-align:center;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".nav-item{\r\n");
      out.write("position:relative;\r\n");
      out.write("top:12px;\r\n");
      out.write("margin-left:10px;\r\n");
      out.write("}\r\n");
      out.write("a:hover{\r\n");
      out.write("backgound:#eee;\r\n");
      out.write("text-decoration:none;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("nav:hover{\r\n");
      out.write("text-decoration:none;\r\n");
      out.write("width:280px;\r\n");
      out.write("transition:all 0.5s ease;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".logout{\r\n");
      out.write("position:absolute;\r\n");
      out.write("bottom:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- <body> -->\r\n");
      out.write("	<nav>\r\n");
      out.write("		<ul>\r\n");
      out.write("			<li>\r\n");
      out.write("				\r\n");
      out.write("				<a href=\"#\" class=\"logo\">\r\n");
      out.write("					<img src=\"./photos/logo.png\" alt=\"\" class=\"logo_img\">\r\n");
      out.write("					<span class=\"nav-item\">ChatApp</span>\r\n");
      out.write("				</a>\r\n");
      out.write("			</li>\r\n");
      out.write("			<li><a href=\"\" >\r\n");
      out.write("				<i class=\"fas fa-home\" style=\"color: #000000;\"></i>\r\n");
      out.write("				<span class=\"nav-item\" style=\"color: #000000;\">Home </span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a href=\"Show\" >\r\n");
      out.write("				<i class=\"fas fa-user\" style=\"color: #000000;\"></i>\r\n");
      out.write("				<span class=\"nav-item\" style=\"color: #000000;\">Profile </span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a href=\"Ajouter.jsp\" >\r\n");
      out.write("				<i class=\"fas fa-wallet\" style=\"color: #000000;\"></i>\r\n");
      out.write("				<span class=\"nav-item\" style=\"color: #000000;\">Add contact </span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a href=\"show_invit.jsp\" >\r\n");
      out.write("				<i class=\"fas fa-chart-bar\" style=\"color: #000000;\"></i>\r\n");
      out.write("				<span class=\"nav-item\" style=\"color: #000000;\">display invitations </span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a href=\"FetchData\" >\r\n");
      out.write("				<i class=\"fas fa-tasks\" style=\"color: #000000;\"></i>\r\n");
      out.write("				<span class=\"nav-item\" style=\"color: #000000;\">Display contact </span>\r\n");
      out.write("				\r\n");
      out.write("			\r\n");
      out.write("			</a></li>\r\n");
      out.write("			<li><a href=\"ListeMessages\" >\r\n");
      out.write("				<i class=\"fas fa-envelope\" style=\"color: #000000;\"></i>\r\n");
      out.write("				<span class=\"nav-item\" style=\"color: #000000;\">Liste Discussions </span>\r\n");
      out.write("			</a></li>\r\n");
      out.write("			\r\n");
      out.write("			<!-- <li><a href=\"#\" >\r\n");
      out.write("				<i class=\"fas fa-question-circle\" style=\"color: #000000;\"></i>\r\n");
      out.write("				<span class=\"nav-item\" style=\"color: #000000;\">Help </span>\r\n");
      out.write("			</a></li> -->\r\n");
      out.write("			\r\n");
      out.write("						\r\n");
      out.write("			<li><a  >\r\n");
      out.write("				<i  class=\"fas fa-sign-out\" class=\"logout\" style=\"color: #000000;\"></i>\r\n");
      out.write("			\r\n");
      out.write("				<button type=\"button\" class=\"nav-item\" data-toggle=\"modal\" data-target=\"#e\">\r\n");
      out.write("				 Se déconnecter\r\n");
      out.write("				</button>\r\n");
      out.write("<div class=\"modal fade\" id=\"e\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"ex\" aria-hidden=\"true\">\r\n");
      out.write("  <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("    <div class=\"modal-content\" >\r\n");
      out.write("      <div class=\"modal-header\">\r\n");
      out.write("        <h5 class=\"modal-title\" id=\"ex\">Déconnexion</h5>\r\n");
      out.write("        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("          <span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("        </button>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-body\">\r\n");
      out.write("        <p>Si vous vous déconnecter, tous vos discussions actuelles seront supprimés</p>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"modal-footer\">\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-secondary\" data-dismiss=\"modal\">Annuler</button>\r\n");
      out.write("        <button type=\"button\" class=\"btn btn-primary\"  onclick=\"deconnecter()\">Se déconnecter</button>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("				</a>\r\n");
      out.write("				\r\n");
      out.write("			</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</ul>\r\n");
      out.write("	</nav>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("function deconnecter(){\r\n");
      out.write("	\r\n");
      out.write("	 window.location.href = 'http://localhost:8081/WebChat/Login';\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- </body>\r\n");
      out.write("</html> -->");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>hey</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"//cdn.datatables.net/1.13.4/css/jquery.dataTables.min.css\"/>\r\n");
      out.write("<script  type=\"text/javascript\" src=\"//cdn.datatables.net/1.13.4/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"jquery-1.11.2.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("    $('#myTable').dataTable({\r\n");
      out.write("    	lengthMenu: [5,10,20,30,40,50,100],\r\n");
      out.write("    	language: {\r\n");
      out.write("    		 \"emptyTable\": \"Aucun enregistrement trouvé\",\r\n");
      out.write("    		\"info\": \"Affichage de _START_ à _END_ sur _TOTAL_ entrées\", /* set custom text for info */\r\n");
      out.write("    		\"paginate\": {\r\n");
      out.write("    		          \"next\": \"Suivant\", /* set text for \"Next\" button */\r\n");
      out.write("    		          \"previous\": \"Précédent\", /* set text for \"Previous\" button */\r\n");
      out.write("    		        	  \r\n");
      out.write("    		        },\r\n");
      out.write("    		\r\n");
      out.write("            search: \"\" ,\r\n");
      out.write("            lengthMenu: \"Afficher _MENU_ contact\", \r\n");
      out.write("            searchPlaceholder: \"Cherchez un contact spécifique\" // add placeholder text\r\n");
      out.write("          }\r\n");
      out.write("    \r\n");
      out.write("    });\r\n");
      out.write("  });\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".img_cont {\r\n");
      out.write("	position: relative;\r\n");
      out.write("	height: 70px;\r\n");
      out.write("	width: 70px;\r\n");
      out.write("}\r\n");
      out.write(".online_icon {\r\n");
      out.write("	position: absolute;\r\n");
      out.write("	height: 15px;\r\n");
      out.write("	width: 15px;\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("	bottom: 13px;\r\n");
      out.write("	right: 13px;\r\n");
      out.write("	left:55px;\r\n");
      out.write("	top:50px;\r\n");
      out.write("	border: 1.5px solid white;\r\n");
      out.write("}\r\n");
      out.write(".user_img {\r\n");
      out.write("	height: 60px;\r\n");
      out.write("	width: 60px;\r\n");
      out.write("	border: 1.5px solid #f5f6fa;\r\n");
      out.write("}\r\n");
      out.write(" .dataTables_length {\r\n");
      out.write("    margin-top: 40px; \r\n");
      out.write("    margin-left: 50px;/* add margin */\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("    .dataTables_paginate {\r\n");
      out.write("    text-align: center; /* center pagination controls */\r\n");
      out.write("    margin-top: 20px; /* add margin to top of pagination controls */\r\n");
      out.write("  }\r\n");
      out.write("  div#myTable_info.dataTables_info{\r\n");
      out.write("  margin-left:45px;\r\n");
      out.write("  margin-top:20px;\r\n");
      out.write("  }\r\n");
      out.write("  .dataTables_paginate .paginate_button {\r\n");
      out.write("    padding: 5px 10px; /* adjust padding of pagination buttons */\r\n");
      out.write("    margin: 0 5px; /* add margin between pagination buttons */\r\n");
      out.write("    width:100px;\r\n");
      out.write("    margin-right:20px;\r\n");
      out.write("     margin-bottom:20px;\r\n");
      out.write("  }\r\n");
      out.write("  .dataTables_paginate .paginate_button.current {\r\n");
      out.write("    background-color: #fff; /* set background color of current page button */\r\n");
      out.write("    color: black; /* set text color of current page button */\r\n");
      out.write("    width:50px;\r\n");
      out.write("  }\r\n");
      out.write("div.dataTables_filter input {\r\n");
      out.write("\r\n");
      out.write("    width: 300px;\r\n");
      out.write("    margin-top:40px;\r\n");
      out.write("    margin-bottom:40px;\r\n");
      out.write("    margin-right:50px;\r\n");
      out.write("    background:red;\r\n");
      out.write("  }\r\n");
      out.write("ul{\r\n");
      out.write(" list-style-type: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table {\r\n");
      out.write(" \r\n");
      out.write("  border-collapse: collapse;\r\n");
      out.write("  background-color: #fff;\r\n");
      out.write("  box-shadow: 0px 0px 5px rgba(0, 0, 0, 0.2);\r\n");
      out.write("  border-radius: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("th {\r\n");
      out.write("  background-color: #f2f2f2;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("  width:70px;\r\n");
      out.write("}\r\n");
      out.write(" a{\r\n");
      out.write("  text-decoration:none;\r\n");
      out.write(" }\r\n");
      out.write("td {\r\n");
      out.write("  width:70px;\r\n");
      out.write(" text-align: left;\r\n");
      out.write(" text-decoration:none;\r\n");
      out.write("\r\n");
      out.write("  padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("tbody tr:nth-child(even) {\r\n");
      out.write("  background-color: #f2f2f2;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("function supprimerLigne(button, id) {\r\n");
      out.write("  var row = button.parentNode.parentNode;\r\n");
      out.write("  row.parentNode.removeChild(row);\r\n");
      out.write("  var xhr = new XMLHttpRequest();\r\n");
      out.write("  xhr.open('GET', 'FetchData?id2=' + id, true);\r\n");
      out.write("  xhr.send();\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("   <div class=\"container\">\r\n");
      out.write("    <div class=\"row justify-content-center \">\r\n");
      out.write("      <div class=\"cold-md-2 ml-6 \">\r\n");
      out.write("       <div class=\"card \" style=\"background:#dfe9f5;width:700px;margin-top:50px;margin-left:300px;\" >\r\n");
      out.write("           \r\n");
      out.write("          \r\n");
      out.write("\r\n");
      out.write("              \r\n");
      out.write("          \r\n");
      out.write("			<table id=\"myTable\" style=\"width:600px;\">\r\n");
      out.write("			<thead>\r\n");
      out.write("				\r\n");
      out.write("			 <th style=\"width:30px;\"></th>\r\n");
      out.write("			 <th >Contact</th>\r\n");
      out.write("			 <th >Action</th>\r\n");
      out.write("			   \r\n");
      out.write("			</thead>\r\n");
      out.write("			  <tbody>\r\n");
      out.write("			\r\n");
      out.write("			\r\n");

			try {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/application_chat_reseau", "root", "");
				 HttpSession varS=request.getSession();
				 int id_recepteur= (Integer)varS.getAttribute("id");
				
				 PreparedStatement pst=con.prepareStatement("SELECT invitation.id_invit,utilisateur.nom,utilisateur.prenom,utilisateur.state FROM invitation,utilisateur WHERE invitation.id_user_emetteur =utilisateur.id_user and  etat='attente' and id_user_recepteur=? ");
			
				pst.setInt(1,id_recepteur);
				
				
				ResultSet rs=pst.executeQuery();
				
				while(rs.next()){
					String stateInit=(rs.getInt(4)==1)?"green":"red";
					
      out.write("\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td style=\"width:30px;\">\r\n");
      out.write("							<div class=\"img_cont\">\r\n");
      out.write("				\r\n");
      out.write("									<a href=\"show_contact.jsp?id=");
      out.print(rs.getString(1));
      out.write("\" ><img src=\"https://static.turbosquid.com/Preview/001292/481/WV/_D.jpg\" class=\"rounded-circle user_img\">\r\n");
      out.write("									</a>\r\n");
      out.write("						\r\n");
      out.write("						</div>\r\n");
      out.write("						</td>\r\n");
      out.write("						<td  style=\"margin-left:-100px;width:70px;\">");
      out.print(rs.getString(2) );
      out.write(' ');
      out.print(rs.getString(3));
      out.write(" </td>\r\n");
      out.write("						<td style=\"display:flex;margin-top:15px;margin-left:50px; width:200px;\">\r\n");
      out.write("							<a style=\"margin-left:-30px;\" href=\"AcceptInvit?id=");
      out.print(rs.getString(1));
      out.write("\">\r\n");
      out.write("								<button class=\"btn btn-sm btn-info\" style=\"width:100px;\" >Accepter</button>\r\n");
      out.write("							</a>\r\n");
      out.write("							<a style=\"margin-left:10px;margin-right:0px;\"href=\"Refuser?id=");
      out.print(rs.getString(1));
      out.write("\">\r\n");
      out.write("								<button class=\"btn btn-sm btn-danger\" style=\"width:100px;\" >Refuser</button>\r\n");
      out.write("							</a>\r\n");
      out.write("						</td>\r\n");
      out.write("						\r\n");
      out.write("					</tr>\r\n");
      out.write("	\r\n");
      out.write("    ");

				}
	rs.close();
	pst.close();
	con.close();
	
      } catch (Exception e) {
        e.printStackTrace();
      }
    
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("\r\n");
      out.write("     </div>\r\n");
      out.write("       </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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

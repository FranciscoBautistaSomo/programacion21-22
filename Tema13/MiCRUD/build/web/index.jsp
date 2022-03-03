<%-- 
    Document   : index
    Created on : 01-mar-2022, 11:38:57
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>MiCRUD</title>
  </head>
  <body>
    <h1>LOGIN</h1>
    <%
      request.setCharacterEncoding("UTF-8");
      Class.forName("com.mysql.jdbc.Driver");
      Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/INSTITUTO", "admin", "admin");
      Statement s = conect.createStatement();
      //ResultSet list = s.executeQuery("SELECT  NomPro, ApePro FROM profesor");
      ResultSet list = s.executeQuery ("SELECT  NumMatri, NomEst, ApeEst FROM estudiante");

      //FORMULARIO DE LOGIN
      out.print("<form action=\"datos.jsp\" method=\"get\">");
      out.print("<label for=\"nombre\">Nombre:</label>");
      out.print("<input type=\"text\" id=\"fname\" name=\"fname\"><br><br> ");
      out.print("<label for=\"pssword\">Password:</label>");
      out.print("<input type=\"password\" id=\"pssword\" name=\"pssword\"><br><br>");
      out.print("<input type=\"submit\" value=\"Log in\">");
      /*out.print("<table border=1>");
      out.print("<tr><th>Numero Matricula</th><th>Nombre</th><th>Apellido</th></tr>");

      while (list.next()) {
        out.print("<tr><td>" + list.getString("NumMatri") + "</td><td>" + list.getString("NomEst") + "</td><td>" + list.getString("ApeEst") + "</td></tr>");
       
      }
      out.print("</table>");*/
      conect.close();
     

    %>   
  </body>
</html>

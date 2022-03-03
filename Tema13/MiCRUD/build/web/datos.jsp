<%-- 
    Document   : datos.jsp
    Created on : 01-mar-2022, 19:50:21
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
    <title>Informacion</title>
  </head>
  <body>
    <h1>Datos almacenados</h1>
    <%
      boolean encontrado = false;
      request.setCharacterEncoding("UTF-8");
      Class.forName("com.mysql.jdbc.Driver");
      Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/INSTITUTO", "admin", "admin");
      Statement s = conect.createStatement();
      ResultSet list = s.executeQuery("SELECT  NomPro, ApePro, pssword FROM profesor");
      String nombreProfesor = request.getParameter("fname");
      String contraseñaProfesor = request.getParameter("pssword");

      while (list.next()) {
        if (list.getString("NomPro").equals(nombreProfesor) && list.getString("pssword").equals(contraseñaProfesor)) {
          encontrado = true;
          out.print("<h2>Usuario encontrado</h2><br>");
          out.println("<table border=1>");
          out.println("<tr><th>Nombre</th><th>Apellido</th></tr>");
          out.print("<tr><td>" + list.getString("NomPro") + "</td><td>" + list.getString("ApePro") + "</td></tr><br>");
        }
      }
      if (!encontrado) {
        out.print("<h2>Usuario  no encontrado</h2>");
      }
      conect.close();
    %>
    <p>
      <a href="index.jsp"> Volver a Log in</a>
    </p>
  </body>
</html>

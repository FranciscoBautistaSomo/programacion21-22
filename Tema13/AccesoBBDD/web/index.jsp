<%-- 
    Document   : index
    Created on : 21-feb-2022, 11:01:28
    Author     : usuario
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <%
      request.setCharacterEncoding("UTF-8");
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "admin", "admin");

      Statement s = conexion.createStatement();

      ResultSet listado = s.executeQuery("SELECT DNI, nombre FROM gente");
      
      out.print("<table border=1>");
       out.print("<tr><th>DNI</th><th>Nombre</th></tr>");
      while (listado.next()) {
        out.println("<tr><td>"+listado.getString("DNI") + "</td><td>" + listado.getString("nombre") + "</td><tr>");
      }
      out.print("</table>");
      conexion.close();
    %>
    
  </body>
</html>

<%-- 
    Document   : procesodelete
    Created on : 07-mar-2022, 12:10:23
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
    <title>Proceso de borrado</title>
  </head>
  <body>
    <h1>Proceso delete</h1>
    <%
      request.setCharacterEncoding("UTF-8");
      Class.forName("com.mysql.jdbc.Driver");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/prueba", "admin", "admin");
      Statement s = conexion.createStatement();
      Statement d = conexion.createStatement();
      ResultSet listado = s.executeQuery("SELECT DNI FROM gente");
      
      boolean encontrado = false;
      
      String dniFormulario = request.getParameter("dni");
      String dniPrueba = "123456";
      while (listado.next() &&  ! encontrado) {
        if (dniFormulario.equals(listado.getString("DNI"))) {            
            encontrado = true;
            out.print("<h3>Usuario encontrado  DNI: "+dniFormulario+"</h3>)");
            String sentencia = "DELETE FROM gente WHERE DNI =   "+dniFormulario+"  ";
            d.execute(sentencia);
          }          
        }
        if (!encontrado) {
            out.print("<h3>Error. Usuario no encontrado</h3>)");
          }
        

      //String sentencia = "DELETE FROM gente WHERE DNI = ' "+dniFormulario+" ' ";
      //s.execute(sentencia);

      conexion.close();

    %>

    <a href="index.jsp">VOLVER</a> 

  </body>
</html>

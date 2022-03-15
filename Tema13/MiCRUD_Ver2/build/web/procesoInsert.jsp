<%-- 
    Document   : procesoinsert
    Created on : 07-mar-2022, 11:03:17
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
        <title>Procesamiento alta</title>
    </head>
    <body>
        <h1>Dando de alta alumno...</h1>
        <%
          request.setCharacterEncoding("UTF-8");
          Class.forName("com.mysql.jdbc.Driver");
          Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD_Bautista_Somosierra_INSTITUTO", "admin", "admin");
          Statement s = conexion.createStatement();
          
          String sentencia= "INSERT INTO estudiante  (NumMatri, NomEst, DirecEst, ApeEst, pssword) VALUES (";
          sentencia += Integer.parseInt(request.getParameter("numMatri"))+",";
          sentencia += "'"+request.getParameter("nombre")+"',";          
          sentencia += "'"+request.getParameter("direccion")+"', ";
          sentencia += "'"+request.getParameter("apellido")+"', ";
          sentencia += "'"+request.getParameter("password")+"'";
          sentencia += ")";
          
          s.execute(sentencia);
          //out.print(sentencia);
          conexion.close();
          %>
          <a href="index.jsp">Ir al principio</a>
          <a href="consulta.jsp">Consultar alumnos</a>
    </body>
</html>

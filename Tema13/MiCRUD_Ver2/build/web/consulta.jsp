<%-- 
    Document   : consulta
    Created on : 08-mar-2022, 13:10:31
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
    <title>Consulta Alumnos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">
  </head>
  <body class="bg-secondary">
    <div id="wrapper" class="container-fluid bg-light p-5">
      <h1 class="text-center py-3 text-danger">Listado de alumnos</h1>
      <div class="table-responsive">
        <table class="table table-striped table-hover align-middle">
          <thead>
            <tr class="table-success">
              <th scope="col">#</th>
              <th scope="col">Matricula</th>
              <th scope="col">Nombre</th>
              <th scope="col">Apellido</th>
              <th scope="col">Direccion</th>
              <th scope="col">Editar</th>
              <th scope="col">Borrar</th>
            </tr>
          </thead>
          <tbody>
            <%

              String nombrePro = "";
              String apePro = "";
              String pass = "";
              request.setCharacterEncoding("UTF-8");
              Class.forName("com.mysql.jdbc.Driver");
              Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD_Bautista_Somosierra_INSTITUTO", "admin", "admin");
              Statement s = conect.createStatement();
              ResultSet list = s.executeQuery("SELECT  CodEstu,  NumMatri, NomEst, ApeEst, DirecEst FROM estudiante");
              //String nombreProfesor = request.getParameter("identificador");
              //String contraseñaProfesor = request.getParameter("pass");

              while (list.next()) {
                out.println("<tr><td>" + list.getString("CodEstu") + "</td><td>"
                        + list.getString("NumMatri") + "</td><td>"
                        + list.getString("NomEst") + "</td><td>"
                        + list.getString("ApeEst") + "</td><td>"
                        + list.getString("DirecEst") + "</td>"
                        + "<td><a href=\"./datos.jsp\" target=\"_blank\"><i class=\"bi bi-pencil-square fs-3 text-success\"></i></a></td>"
                        + "<td><i class=\"bi bi-trash text-danger fs-3\" onclick=\"confirm('Estás seguro de que quieres BORRAR este registro?')\"></i></td></tr>") ;
              }
              conect.close();
            %> 
          </tbody>
        </table>
      </div><!-- fin de table-responsive-->
      <a class="btn btn-success" href="datosInsert.jsp" role="button">Insertar estudiante</a>
      <!--<button type="button" class="btn btn-success" 
              data-bs-toggle="modal" href="datosInsert.jsp" >Insertar cliente</button>-->

      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  </body>
</html>

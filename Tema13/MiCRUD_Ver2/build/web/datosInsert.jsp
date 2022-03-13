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
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Formulario de inserción (Añadir un nuevo registro)</title>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
  <style>
    textarea {height:200px !important;}
  </style>
  <body class="bg-secondary">
    <!--<%
      boolean encontrado = false;
      String nombrePro = "";
      String apePro = "";
      String pass = "";
      request.setCharacterEncoding("UTF-8");
      Class.forName("com.mysql.jdbc.Driver");
      Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD_Bautista_Somosierra_INSTITUTO", "admin", "admin");
      Statement s = conect.createStatement();
      ResultSet list = s.executeQuery("SELECT  NomPro, ApePro, pssword FROM profesor");

      conect.close();
    %>-->
    <div id="wrapper" class="container bg-light p-5">
      <div class="row">
        <div class="col-xs-12 col-md-8 col-lg-6 m-auto">
          <!-- formulario de bootstrap -->
          <form method="post" action="procesoInsert.jsp" class="border border-primary p-4">
            <h1 class="text-center py-3 text-danger">Inserción de datos</h1>
            <!-- Numero de matricula -->
            <div class="mb-3">
              <label for="numMatri" class="form-label">Numero Matricula *:</label>              
              <input type="text" class="form-control" id="numMatri" name="numMatri" aria-describedby="numMatriHelp" required>        
              <div id="numMatriHelp" class="form-text">Campo obligatorio</div>
            </div>
            <!-- Nombre -->
            <div class="mb-3">
              <label for="nombre" class="form-label">Nombre *:</label>
              <input type="text" class="form-control" id="nombre" name="nombre" aria-describedby="nombreHelp" required>
              <div id="nombreHelp" class="form-text">Campo obligatorio</div>
            </div>
            <!-- Apellido -->
            <div class="mb-3">
              <label for="apellido" class="form-label">Apellido*:</label>
              <input type="text"  class="form-control" id="apellido" name="apellido" aria-describedby="apellidoHelp" required> 
              <div id="apellidoHelp" class="form-text">Campo obligatorio</div>
            </div>
            <!-- Direccion -->
            <div class="mb-3">
              <label for="direccion" class="form-label">Direccion*:</label>
              <input type="text"  class="form-control" id="direccion" name="direccion" aria-describedby="direccionHelp" required> 
              <div id="direccionHelp" class="form-text">Campo obligatorio</div>
            </div>
            <!-- Password -->
            <div class="mb-3">
              <label for="password" class="form-label">Password*:</label>
              <input type="text"  class="form-control" id="password" name="password" aria-describedby="passwordHelp" required> 
              <div id="passwordHelp" class="form-text">Campo obligatorio</div>
            </div> 
            <button type="submit" class="btn btn-primary">Guardar nuevo estudiante</button>
            <p><br>            
            </p>
            <p>
              <a class="btn btn-success" href="consulta.jsp" role="button">Consultar estudiantes</a>              
            </p>  
          </form>           
        </div>
      </div>
    </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
  </body>
</html>

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
    <%
      boolean encontrado = false;
      String nombrePro = "";
      String apePro = "";
      String pass = "";
      request.setCharacterEncoding("UTF-8");
      Class.forName("com.mysql.jdbc.Driver");
      Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD_Bautista_Somosierra_INSTITUTO", "admin", "admin");
      Statement s = conect.createStatement();
      ResultSet list = s.executeQuery("SELECT  NomPro, ApePro, pssword FROM profesor");
      String nombreProfesor = request.getParameter("identificador");
      String contraseñaProfesor = request.getParameter("pass");
      
      while (list.next()) {
        if (list.getString("NomPro").equals(nombreProfesor) && list.getString("pssword").equals(contraseñaProfesor)) {
          encontrado = true;
          nombrePro = list.getString("NomPro");
          apePro = list.getString("ApePro");
          pass = list.getString("pssword");        
        }
      }
      if (!encontrado) {
        nombrePro ="Usuario  no encontrado";
        apePro = "Usuario  no encontrado";
        pass ="......";
      }
      conect.close();
    %>
    <div id="wrapper" class="container bg-light p-5">
      <div class="row">
        <div class="col-xs-12 col-md-8 col-lg-6 m-auto">
          <!-- formulario de bootstrap -->
          <form method="post" action="..." class="border border-primary p-4">
            <h1 class="text-center py-3 text-danger">Inserción de datos</h1>
            <!-- introducción de nombre con efecto placeholder -->
            <div class="mb-3">
              <label for="nombre" class="form-label">Nombre *:</label>              
              <input type="text" class="form-control" id="nombre" name="nombre" aria-describedby="nombreHelp" value="<%=nombrePro%>" required>        
              <div id="nombreHelp" class="form-text">Campo obligatorio</div>
            </div>
            <!-- introducción de apellidos con label y aclaración por debajo -->
            <div class="mb-3">
              <label for="apellidos" class="form-label">Apellidos *:</label>
              <input type="text" class="form-control" id="apellidos" name="apellidos" aria-describedby="apellidosHelp" value="<%=apePro%>" required>
              <div id="apellidosHelp" class="form-text">Campo obligatorio</div>
            </div>
            <!-- campo de tipo number con un mínimo y un máximo -->
            <div class="mb-3">
              <label for="pssword" class="form-label">Password*:</label>
              <input type="text"  class="form-control" id="pssword" name="pssword" aria-describedby="passwordHelp" value="<%=pass%>" required> 
              <div id="passwordHelp" class="form-text">Campo obligatorio</div>
            </div> 
            <button type="submit" class="btn btn-primary">Enviar</button>
            <p>
              <a class="btn btn-secondary" href="index.jsp" role="button">Volver a Log in</a>  
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

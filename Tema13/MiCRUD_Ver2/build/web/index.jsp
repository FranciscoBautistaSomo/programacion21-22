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
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - Aplicación CRUD</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body class="bg-secondary">
    <%
      request.setCharacterEncoding("UTF-8");
      Class.forName("com.mysql.jdbc.Driver");
      Connection conect = DriverManager.getConnection("jdbc:mysql://localhost:3306/CRUD_Bautista_Somosierra_INSTITUTO", "admin", "admin");
      Statement s = conect.createStatement();
      %>
    <div class="container bg-light vh-100">
       
       <!-- formulario de login-->
       <div class="row d-flex justify-content-center vh-100 align-items-center">
         <div class="col-xs-12 col-md-8 col-lg-6">
            <!-- aquí empieza formulario bootstrap-->
            <form class="my-5 p-3 border border-primary"
                    action=" datos.jsp"
                    method="post">
                
                <h1 class="py-3 text-center text-danger">Login para CRUD de Programación</h1>
                <div class="form-floating mb-3">
                    <input type="text" class="form-control" id="identificador" name="identificador" aria-describedby="identificadorHelp"
                    placeholder="Dame tu identificador">
                    <label for="identificador" class="form-label">Identificador (cuidado con las mayúsculas)</label>
                </div>
                <div class="form-floating mb-3"> 
                    <input type="password" class="form-control" id="pass" name="pass" placeholder="password"
                aria-describedby="passHelp">
                <label for="pass" class="form-label">Contraseña: mayúsculas, minúsculas, números, car espec.</label>
                   
                </div>            
                <button type="submit" class="btn btn-primary">Enviar</button>
            </form>
            <!-- aqui termina el formulario bootstrap -->
         </div><!-- de las col-->
      </div><!-- de la row-->
    </div><!-- del container -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
    <!--  
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
  </body>-->
</html>

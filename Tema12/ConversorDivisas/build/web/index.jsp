<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
  <head>
    <title>Conversor Divisas</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <%
          request.setCharacterEncoding("UTF-8");
          float euros0 = Float.parseFloat(request.getParameter("euros0"));
    %>
    
    <div>
      <form action="conversor.jsp" method="POST">
        Cantidad en ?: <input type="text" name="euros" value="98"><br>
        <button type="submit">CONVERTIR</button>
      </form>
      </form>
    </div>
  </body>
</html>

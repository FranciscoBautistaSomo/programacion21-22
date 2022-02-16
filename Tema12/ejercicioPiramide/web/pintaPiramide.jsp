<%-- 
    Document   : pintaPiramide
    Created on : 15-feb-2022, 12:50:13
    Author     : usuario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <style>
      <%
         String colorP = request.getParameter("color");
        %>
                body {
                font-family: monospace;
                }
                
                #triangulo {
                      color: <%=colorP%>;                    
                }      
        
    </style>
  </head>
  <body>
    
          <%
                request.setCharacterEncoding("UTF-8");
                int altura = Integer.parseInt(request.getParameter("alturaP"));
                String caracterO = request.getParameter("caracteOut");
                String caracterI = request.getParameter("caracteIn");
                out.print("<div id=\"triangulo\">");
                for (int i = 0; i < altura; i++) {
                    for (int j = 0; j < i; j++) {
                      if (i< altura-1) {
                          if ((j>0) && (j<i-1)) {
                            out.print(caracterI);
                          }else{
                          out.print(caracterO);
                        }
                     }else {
                        out.print(caracterO);
                     }          
                        
                    }
                    out.print("<br>");
                  }
                out.print("</div>");

            %>
            <p><br>
             <a href="index.html">Volver</a> 
  </body>
          
  
  
  
  
</html>

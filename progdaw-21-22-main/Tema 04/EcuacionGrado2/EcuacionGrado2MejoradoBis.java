public class EcuacionGrado2Mejorado {
  
  public static void main (String[] args) {
    double a,b,c;
    double x1, x2;
    
    /* captura de datos */
    System.out.println("RESOLUCION ECUACIONES GRADO 2 ax²+bx+c=0");
    System.out.print("Introduzca coeficiente a: ");
    a = Double.parseDouble (System.console().readLine());
    System.out.print("Introduzca coeficiente b: ");
    b = Double.parseDouble (System.console().readLine());
    System.out.print("Introduzca coeficiente c: ");
    c = Double.parseDouble (System.console().readLine());
    
    /* calculo de las soluciones y presentación de resultados */
    
    if (a==0) {
      if (b==0) {
        System.out.println("Esto no es una ecuación.");
      } else {
        x1 = -c/b;
        System.out.println("La solución es:");
        System.out.println("x1 = "+x1);
      }      
    } else {
      double radicando;
      radicando = b*b-4*a*c;
      if (radicando >= 0) {
        x1 = (-b + Math.sqrt(radicando))/(2*a);
        x2 = (-b - Math.sqrt(radicando))/(2*a);
        System.out.println("Las soluciones son:");
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
      } else {
        System.out.println("Esta ecuación tiene soluciones imaginarias.");
      }
      
    }
    
    
    
  }
  
}

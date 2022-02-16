public class EcuacionGrado2 {
  
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
    
    /* calculo de las soluciones */
    double radicando;
    radicando = b*b-4*a*c;
    x1 = (-b + Math.sqrt(radicando))/(2*a);
    x2 = (-b - Math.sqrt(radicando))/(2*a);
    
    /* presentacion de resultados */
    System.out.println("Las soluciones son:");
    System.out.println("x1 = "+x1);
    System.out.println("x2 = "+x2);
    
  }
  
}

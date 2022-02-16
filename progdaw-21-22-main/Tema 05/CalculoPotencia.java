public class CalculoPotencia
{
  public static void main (String[] args) {
    int resultado;
    int base;
    int exponente;
    
    System.out.print("Introduzca la base: ");
    base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la exponente: ");
    exponente = Integer.parseInt(System.console().readLine());
    
    
    
    resultado = 1;
    
    for (int i=0; i<exponente; i++) {
      resultado = resultado * base;
    }
    
    System.out.println(base + " ^ " + exponente + " = " +resultado);
    
    
  }
}

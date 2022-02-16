public class VueltasTierra {
  public static void main (String[] args) {
    int anios;
    
    long numeroVueltas;
    
    System.out.print("Introduzca el número de años: ");
    anios = Integer.parseInt(System.console().readLine());
    
    numeroVueltas = (long)anios * 365;
    
    System.out.printf("En ese tiempo, la Tierra ha dado %d vueltas sobre sí misma.\n",numeroVueltas);
    
    
  }
}

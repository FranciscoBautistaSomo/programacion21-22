public class Ej34bis {
  public static void main (String[] args) {
    int a, b;
    long impares=0;
    long pares=0;
    
    System.out.print("Introduzca el primer número: ");
    a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el segundo número: ");
    b = Integer.parseInt(System.console().readLine());
    
    int aux = a;
    
    int potencia10 = 1;
    while (aux >= 10) {
      potencia10 = potencia10 * 10;
      aux = aux /10;
    }
    
    
    while (a>0) {
      int digitoA;
      int digitoB;
      
      digitoA = a / potencia10;
      digitoB = b / potencia10;
      
      if (digitoA % 2 == 0) {
        pares = pares*10+digitoA;
      } else {
        impares = impares*10+digitoA;
      }
      
      if (digitoB % 2 == 0) {
        pares = pares*10+digitoB;
      } else {
        impares = impares*10+digitoB;
      }
      
      a = a % potencia10;
      b = b % potencia10;
      
      potencia10 = potencia10 / 10;
      
    }
    
    System.out.println("Pares : " + pares);
    System.out.println("Impares : " + impares);
    
  }
}

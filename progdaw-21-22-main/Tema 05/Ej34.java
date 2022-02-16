public class Ej34 {
  public static void main (String[] args) {
    int a, b;
    long impares=0;
    long pares=0;
    
    System.out.print("Introduzca el primer número: ");
    a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el segundo número: ");
    b = Integer.parseInt(System.console().readLine());
    
    int longitud = 0;
    int aux = a;
    
    while (aux > 0) {
      longitud ++;
      aux = aux /10;
    }
    
    int potencia10 = 1;
    for (int i=0; i<longitud-1; i++) {
      potencia10 = potencia10 * 10;
    }
    
    for (int i=0; i<longitud; i++) {
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

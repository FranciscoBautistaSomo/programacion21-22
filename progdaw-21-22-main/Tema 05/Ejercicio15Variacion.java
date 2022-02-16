public class Ejercicio15Variacion {
/*
Escribe un programa que dados dos números, uno real (base) y un entero positivo (exponente),
saque por pantalla todas las potencias con base sucesivas al numero dado y exponentes entre
uno y el exponente introducido. No se deben utilizar funciones de exponenciación. Por ejemplo,
si introducimos el 2 y el 5, se deberán mostrar 2^1 , 3^2 , 4^3 , 5^4 y 6^5.

2,5

2¹, 3², 4³, 5⁴, 6⁵


11,7

11¹, 12², 13³, 14⁴, 15⁵, 16⁶, 17⁷





bucle (i): tantas vueltas como b, empezando en 1
      inicializar resultado a 1
      bucle: de "i" vueltas
        resultado = resultado * "a"
      a = a +1;
*/      
      
  public static void main (String[] args) {
    int a,b;
    
    System.out.print("Indique la base: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el exponente: ");
    b = Integer.parseInt(System.console().readLine());
    
    for (int i=1; i<=b; i++) {
      int resultado = 1;
      for (int j=1; j<=i; j++) {
        resultado = resultado * a;
      }
      System.out.println(a+" elevado a "+i+" es: "+resultado);
      a = a + 1;
    }
    
  }
}
  
  
  

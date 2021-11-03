//Ejercicio 43 de la relación de ejercicios Tema 5 Bucles.


public class Ejercicio43 {
	/*Escribe un programa que permita partir un número introducido por teclado en
  dos partes. Las posiciones se cuentan de izquierda a derecha empezando por
  el 1. Suponemos que el usuario introduce correctamente los datos, es decir,
  el número introducido tiene dos dígitos como mínimo y la posición en la que
  se parte el número está entre 2 y la longitud del número. No se permite en
  este ejercicio el uso de funciones de manejo de String (por ej. para extraer
  subcadenas dentro de una cadena).*/
  
	public static void main (String[] args) {
	
		int numeroIntroducido;
    int longitud=0;
    int digitos = 0;
    int numero, posicion;    
      
      //Comprobar que el número introducido es mayor de 10.     
      do
      {
        System.out.print("Introduzca un número entero positivo mayor de 10: ");
        numeroIntroducido = Integer.parseInt(System.console().readLine());
      } while (numeroIntroducido<10);
      
        numero = numeroIntroducido;
        
        System.out.print("Introduzca la posición a partir de la cual quiere partir del número: ");
        posicion = Integer.parseInt(System.console().readLine());
        
      //Obtenemos digitos.
      while (numero > 0)
      {        
        digitos %= 10;
        numero /= 10;
        longitud++;
      }
      
            
      long numeroPart1= numeroIntroducido / (long)(Math.pow(10,longitud-posicion+1));
      
      long numeroPart2= numeroIntroducido % (long)(Math.pow(10,longitud-posicion+1));
      
      System.out.print("El "+numeroIntroducido+" partido se queda en "+numeroPart1+ " y el "+numeroPart2+".");  
      
      
      
	}
}


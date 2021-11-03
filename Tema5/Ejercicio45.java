//Ejercicio 45 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio45 {
	
  /*Escribe un programa que cambie un dígito dentro de un número dando la
  posición y el valor nuevo. Las posiciones se cuentan de izquierda a derecha
  empezando por el 1. Se recomienda usar long en lugar de int ya que el
  primero admite números más largos. Suponemos que el usuario introduce
  correctamente los datos.*/
   
	public static void main (String[] args) {
      int numeroIntroducido, posicion;
      int numeroIN=0;
      int longitud=0;
      long numeroCambiado=0;
      
      System.out.print("Introduzca un número entero positivo mayor de 10: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      int numero = numeroIntroducido;
      
      System.out.print("Introduzca la posición dentro del número: ");
      posicion = Integer.parseInt(System.console().readLine());
        
      System.out.print("Introduzca el nuevo dígito: ");
      numeroIN = Integer.parseInt(System.console().readLine());
      
      //Obtenemos digitos.
      while (numero > 0)
      {        
        numero /= 10;
        longitud++;
      }
      //Se divide el número por el digito introducido.
      long numeroIzquierda = numeroIntroducido / (long)(Math.pow(10,longitud-posicion+1));
      //Añadimos el numero nuevo y se amplia.
      numeroCambiado = numeroIzquierda*10 + numeroIN;
      //Se añaden ceros para colocar el resto de los números originales.
      numeroCambiado = numeroCambiado * (long)(Math.pow(10,longitud-posicion));
      //Se obtienen el resto de los números.
      long numeroDerecha = numeroIntroducido % (long)(Math.pow(10,longitud-posicion));
      //Se añaden los números restantes.
      numeroCambiado=numeroCambiado+numeroDerecha;
      
      System.out.println("numero nuevo: "+numeroCambiado);
      //System.out.print("lado derecho: "+numeroDerecha);
    
		
	}
}


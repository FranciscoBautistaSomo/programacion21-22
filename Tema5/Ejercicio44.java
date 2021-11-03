//Ejercicio 44 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio44 {
  
  /*Escribe un programa que sea capaz de insertar un dígito dentro de un número
  indicando la posición. El nuevo dígito se colocará en la posición indicada y el
  resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
  izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
  correctamente los datos. Se recomienda usar long en lugar de int ya que el
  primero admite números más largos.*/
	
	public static void main (String[] args) {
      int numeroIntroducido, posicion;
      int nuevoNum=0;
      int longitud=0;
      long numeroAmpliado=0;
      
      System.out.print("Introduzca un número entero positivo mayor de 10: ");
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      int numero = numeroIntroducido;
      
      System.out.print("Introduzca la posición donde quiere insertar: ");
      posicion = Integer.parseInt(System.console().readLine());
        
      System.out.print("Introduzca el dígito que quiere insertar: ");
      nuevoNum = Integer.parseInt(System.console().readLine());
      
      //Obtenemos digitos.
      while (numero > 0)
      {        
        numero /= 10;
        longitud++;
      }
      //Se divide el número por el digito introducido.
      long numeroIzquierda = numeroIntroducido / (long)(Math.pow(10,longitud-posicion+1));
      //Añadimos el numero nuevo y se amplia.
      numeroAmpliado = numeroIzquierda*10+ nuevoNum;
      //Se añaden ceros para colocar el resto de los números originales.
      numeroAmpliado = numeroAmpliado* (long)(Math.pow(10,longitud-posicion+1));
      //Se obtienen el resto de los números. 
      long numeroDerecha = numeroIntroducido % (long)(Math.pow(10,longitud-posicion+1));
      //Se añaden los números restantes.
      numeroAmpliado= numeroAmpliado+numeroDerecha;
      
      System.out.println("El número resultante es: "+numeroAmpliado);      
 
	}
}


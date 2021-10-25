//Ejercicio 15 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio15 {
	/*Escribe un programa que dados dos números, uno real (base) y un entero
  positivo (exponente), saque por pantalla todas las potencias con base el
  numero dado y exponentes entre uno y el exponente introducido. No se deben
  utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
  se deberán mostrar 21, 22, 23, 24 y 25.*/
	public static void main (String[] args) {
		int base =2;
    int exp = 1;
    int resultado = 1;
    Scanner txt = new Scanner(System.in);
    System.out.print("Introduzca el valor del exponente: ");
    exp = txt.nextInt();
    
    for (int i = 1; i <= exp ; i++)
    {
      resultado *= base;
      System.out.printf("%d ^ %d = %d\n",base, i, resultado); 
    }
    
    
	}
}


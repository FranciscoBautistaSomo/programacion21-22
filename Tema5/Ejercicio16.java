//Ejercicio 16 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio16 {
	
  /*Escribe un programa que diga si un número introducido por teclado es o no
  primo. Un número primo es aquel que sólo es divisible entre él mismo y la
  unidad.*/
  
	public static void main (String[] args) {
		int numero = 1;
    double divisor = 2;
    boolean primo = false;
    
    Scanner txt = new Scanner(System.in);
    System.out.print(primo);
    
    System.out.print("Introduzca el número que quiere introducir: ");
    numero = txt.nextInt();
    
    do
    {
      if ((numero % divisor) == 0){
          primo = false;
          System.out.print("El número introducido  no es primo.");
          System.out.print(primo);
      }else{
          System.out.print("El número introducido es primo.");
          System.out.print(divisor);
        }        
      divisor++;
    } while (primo = false);
    
	}
}


//Ejercicio 11 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;


public class Ejercicio11 {
  
  /*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
  los 5 primeros números enteros a partir de uno que se introduce por teclado.*/
	
	public static void main (String[] args) {
    int numero=0;
    int cuadrado=1;
    int cubo=1;
    Scanner txt = new Scanner(System.in);
    
		System.out.print("Introduzca el número a calcular: ");
    numero = txt.nextInt();
      System.out.println("┌───────┬────────┬───────┐");
      System.out.println("│Numero │Cuadrado│  Cubo │");
      System.out.println("├───────┼────────┼───────┤");
    for (int i = numero; i <=(numero+5) ; i++)
    {      
      System.out.printf("│ %-5d │ %-6d │ %-5d │ \n",i , i*i, i*i*i);
    }
      System.out.println("└───────┴────────┴───────┘");
    
    
	}
}


//Ejercicio 31 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio31 {
  
  /*Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
  programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
  mitad (división entera entre 2) de la altura más uno.*/
	
	public static void main (String[] args) {
    int altura;
    int horizontal;
    Scanner txt = new Scanner(System.in);
    System.out.print("Introduzca la altura de la L: ");
    
    altura = txt.nextInt();
    horizontal=(altura/2)+1;
    
    System.out.println("");
		for (int i = 0; i <altura-1 ; i++)
    {
      System.out.println("*");
    }
    for (int i = 0; i <horizontal ; i++)
    {
      System.out.print("*");
    }
    
    
	}
}


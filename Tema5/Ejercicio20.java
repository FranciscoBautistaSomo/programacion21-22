//Ejercicio 20 de la relación de ejercicios Tema 4 Sentencias condicionales.
import java.util.Scanner;

public class Ejercicio20{
  
	
	public static void main (String[] args) {
		/*Piramide hueca.*/
    int h, asteriscos;
    String caracter = "*";
    Scanner txt = new Scanner(System.in);
    
    System.out.print ("Introduzca la altura de la piramide: ");
    h = txt.nextInt();
    System.out.print ("Introduzca el caracter con el que dibujar la piramide: ");
    caracter = txt.next();
    
    asteriscos = 1;
    for (int i = h-1; i >= 0; i--)
    {
      for (int j = 0; j < i; j++)
      {
        System.out.print(" ");
      }
      
      for (int k = 0; k < asteriscos; k++)
      {
        if ((k==0) || (k==asteriscos-1) ||(i==0))
        {
          System.out.print(caracter);
          
        }else
        {
          System.out.print(" ");
        }
        
      }
      System.out.println();
      asteriscos = asteriscos+2;     
    }  
     
    
    
    
	}
}


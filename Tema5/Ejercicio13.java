//Ejercicio 13 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio13{
  /*Escribe un programa que lea una lista de diez números y determine cuántos
  son positivos, y cuántos son negativos.*/
	
	public static void main (String[] args) {
   Scanner txt = new Scanner(System.in);
    int contadorPos = 0;
    int contadorNeg = 0;
    int numero = 0; 
    for (int i = 0; i <9 ; i++)
    {
      System.out.print("Introduzca un número: ");
      numero = txt.nextInt();
      if (numero % 2 == 0)
      {
        contadorPos++;
      }else{
        contadorNeg++;        
        }      
    }
    System.out.printf("Ha introducido %d números positivos.\n",contadorPos);
    System.out.printf("Ha introducido %d números negativos.\n",contadorNeg);
		
	}
}


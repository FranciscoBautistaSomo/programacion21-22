//Ejercicio 17 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio17 {
	/*Realiza un programa que sume los 100 números siguientes a un número entero
  y positivo introducido por teclado. Se debe comprobar que el dato introducido
  es correcto (que es un número positivo).*/
	public static void main (String[] args) {
    Scanner txt = new Scanner(System.in);
    int numero = 0;
    int limite = 100;
    int sumatorio =0;
    boolean positivo = false;
    
    System.out.println("Introduzca un número positivo: ");
    numero = txt.nextInt();
    
    //Se comprueba que el número es positivo.
    do{
      if (numero >= 0){
        System.out.println("Número introducido correcto: ");
        positivo = true;
        
        }
      else{
        positivo = false;
        System.out.println("Error, Introduzca un número positivo: ");
        numero = txt.nextInt();
        }      
      }
     while (positivo != true);
    
    limite = limite+numero;
    
    for (int i = numero+1; i <=limite ; i++)
    {
      sumatorio += i;
    }    
    System.out.println("La suma resultante es: "+sumatorio);   
		
	}
}


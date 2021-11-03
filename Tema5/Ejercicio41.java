//Ejercicio 41 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio41 {
  /*Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
  hay dentro de un número. Se recomienda usar long en lugar de int ya que el
  primero admite números más largos.*/
	
	public static void main (String[] args) {
		int numero, numeroIntroducido;
    int digito = 0;    
    int digitoPar = 0;
    int digitoImpar = 0;
    Scanner txt = new Scanner(System.in);
    System.out.print("Introduzca un número positivo: ");
    numero = txt.nextInt();
    numeroIntroducido = numero;
    do
    {
     digito = numero % 10;
     numero /= 10;
     
     if (digito % 2 == 0){
       digitoPar++;
       
       }else{
         digitoImpar++;
         }
      
    } while (numero > 0);
    
    System.out.printf("El %d contiene %d digito/s pares y %d digito/s impares", numeroIntroducido, digitoPar, digitoImpar);
	}
}


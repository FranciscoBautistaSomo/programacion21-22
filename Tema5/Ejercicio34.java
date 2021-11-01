//Ejercicio 34 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio34 {
  /*Escribe un programa que pida dos números por teclado y que luego mezcle en
  dos números diferentes los dígitos pares y los impares. Se van comprobando los
  dígitos de la siguiente manera: primer dígito del primer número, primer dígito
  del segundo número, segundo dígito del primer número, segundo dígito del
  segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
  podemos suponer que el usuario introducirá dos números de la misma longitud
  y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
  int donde sea necesario para admitir números largos.*/  
	
	public static void main (String[] args) {
    long numero1, numero2;
    long invert1=0;
    long invert2=0;
    int digitos1 = 0;
    int digitos2 = 0;
    String pares=" ";
    String impares=" ";
    Scanner txt = new Scanner(System.in);
    
    System.out.print("Introduzca un número: ");
    numero1 =txt.nextLong();    
    
    System.out.print("Introduzca otro número (del mismo tamaño que el primero): ");
    numero2 =txt.nextLong();
    
    //Se realiza la inversion del número para poder sacar los dígitos ordenados.
    while (numero1 > 0)
    {
      invert1 = (invert1 * 10) + ( numero1 % 10);
      numero1 /= 10;
    }
    
    while (numero2 > 0)
    {
      invert2 = (invert2 * 10) + ( numero2 % 10);
      numero2 /= 10;
    }
    
    //Se calcula los digitos positivos y negativos.
    while ( invert1 > 0)
    {
      digitos1 = (int)(invert1 % 10);
      invert1 = (invert1 / 10);
      
      digitos2 = (int)(invert2 % 10);
      invert2 = (invert2 / 10);
      
      if (digitos1 % 2== 0)
      {
        pares += digitos1;        
      }else{
        impares += digitos1;
      }
      if (digitos2 % 2== 0){        
          pares +=digitos2;
      }else{
        impares += digitos2;
      }      
    } 
    
    System.out.printf("El número formado por los dígitos pares es: %s.\n",pares);
    System.out.printf("El número formado por los dígitos impares es: %s.",impares);
		
	}
}


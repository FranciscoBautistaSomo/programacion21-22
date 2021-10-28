//Ejercicio 26 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio26{
  
	/*Realiza un programa que pida primero un número y a continuación un dígito.
  El programa nos debe dar la posición (o posiciones) contando de izquierda a
  derecha que ocupa ese dígito en el número introducido.*/
  
	public static void main (String[] args) {
    
    Scanner txt = new Scanner(System.in);
    int numero, resto;
    int digito=0;
    int posicion=0, posicionTotal=0;
    System.out.print("Introduzca un número: ");
    numero = txt.nextInt();
    System.out.print("Introduzca un digito: ");
    digito = txt.nextInt();
    
    while (numero>0)
    {
      resto = numero%10;
      numero = numero/10;
      if(resto == digito){
          posicion++;
          posicionTotal++;
          System.out.printf("El %d introducido aparece en la posicion %d.\n",digito, posicion);        
      }else{
          posicion++;
      }       
    }
	}
}


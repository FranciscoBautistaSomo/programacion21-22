//Ejercicio 32 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio32{
  /* Escribe un programa que, dado un número entero positivo, diga cuáles son y
  cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
  izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
  números largos.*/

  public static void main(String[]args){
    long numero;
    long inverso = 0;
    int digito=1;
    String digitosPar = " ";
    int sumaPar = 0;
    Scanner txt = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero positivo: ");
    numero = txt.nextLong();
    
    //Se realiza la inversion del número para poder sacar los dígitos ordenados.
    while (numero > 0)
    {
      inverso = (inverso * 10) + ( numero % 10);
      numero /= 10;
    }  
    
    //Se calcula los digitos positivos.
    while ( inverso > 0)
    {
      digito = (int)(inverso % 10);
      inverso = (inverso / 10);
      
      if (digito % 2== 0)
      {
        digitosPar += digito+" ";
        sumaPar += digito;
      }
      
    }
    System.out.printf("Digitos pares: %s\n",digitosPar);
    System.out.print("Suma de los digitos pares: "+sumaPar);
    
    
    /*System.out.println("digito: "+digito);
    System.out.print("numero: "+numero);*/
  
  }


}

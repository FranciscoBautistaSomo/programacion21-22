//Ejercicio 18 de la relación de ejercicios Tema 4 Sentencias condicionales.
import java.util.Scanner;

public class Ejercicio18{
  
  /*Escribe un programa que obtenga los números enteros comprendidos entre dos
  números introducidos por teclado y validados como distintos, el programa debe
  empezar por el menor de los enteros introducidos e ir incrementando de 7 en
  7.*/

  public static void main(String [] agrs){
    int numero1, numero2;
    int aux = 0;
    Scanner txt = new Scanner(System.in);
    boolean correcto = false;
    
    System.out.print("Introduzca el número 1: ");
    numero1 = txt.nextInt();
    
    System.out.print("Introduzca el número 2, (distinto al número2): ");
    numero2 = txt.nextInt();
    
    //Comprobar datos    
    do
    {
      if ((numero1 != numero2) && (numero1 < numero2))
      {
        System.out.print("Correcto, los números introducidos son correctos.");
        correcto = true;
        
      } else if (numero1 == numero2)
      {
        System.out.print("Error, los números tienen que se distintos.");
        System.out.print("Introduzca el número 1: ");
        numero1 = txt.nextInt();
    
        System.out.print("Introduzca el número 2, (distinto al número2): ");
        numero2 = txt.nextInt();
        correcto = false;
      } else if (numero1 > numero2)
      {
        //Ordenar números.
        aux = numero2;
        numero2 = numero1;
        numero1 = aux;
        correcto = true;
        System.out.println("Numero1: "+numero1);
        System.out.print("Numero2: "+numero2); 
      }
            
    } while (correcto != true);
    
    for (int i = numero1; i < numero2 ; i=i+7)
    {
        System.out.println("Numero: "+i);
    } 
  }

}

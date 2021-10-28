//Ejercicio 23 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio23{
  /* Escribe un programa que permita ir introduciendo una serie indeterminada
  de números mientras su suma no supere el valor 10000. Cuando esto último
  ocurra, se debe mostrar el total acumulado, el contador de los números
  introducidos y la media.*/
     
  public static void main(String[]args){
      int numeroIn, suma=0, contaNum=0;
      double media=0.0;
      Scanner txt = new Scanner(System.in);
      
      //calculos
      do
      {
        System.out.print("Introduzca un número: ");
        numeroIn = txt.nextInt();
        
        suma += numeroIn;
        contaNum++;       
        
      } while (contaNum<=10000);
      
        media = (double) suma/contaNum;
        
      //Mostrar datos.
      
      System.out.println("La suma total de datos es: "+suma);
      System.out.println("Ha introducido un total de: "+contaNum);
      System.out.println("La media de los números introducidos es: "+media);  
  
  
  
  }


}

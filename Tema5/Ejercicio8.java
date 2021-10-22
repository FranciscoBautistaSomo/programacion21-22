//Ejercicio 8 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio8{
/*Muestra la tabla de multiplicar de un número introducido por teclado.*/

  public static void main(String[] args){
    int numTabla = 0;
    Scanner text = new Scanner(System.in);
    
    System.out.print("Introduzca la tabla que quiere mostrar(tablas del 1 al 10): ");
    numTabla = text.nextInt();
    
    for (int i = 1; i <=10 ; i++)
    {
      System.out.printf("| %d x %d = %d  | \n",i, numTabla, i*numTabla);
    }
    
    
    
    
  
  
  }


}

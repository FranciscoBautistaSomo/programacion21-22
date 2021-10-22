//Ejercicio 10 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio10{
  /*Escribe un programa que calcule la media de un conjunto de números positivos
  introducidos por teclado. A priori, el programa no sabe cuántos números se
  introducirán. El usuario indicará que ha terminado de introducir los datos
  cuando meta un número negativo.*/  
  
  public static void main(String[]args){
    int numero=0;
    int contador=0;
    int sumatorio=0;
    double media=0.0;
    Scanner txt = new Scanner(System.in);
    
    do {
      System.out.println("Introduzca un número para hacer la media: ");
      numero = txt.nextInt();
      if(numero > 0){
      contador = ++contador;
      sumatorio = sumatorio+numero;      
      }
      
    }while(numero > 0);
    media = (sumatorio/(double)contador);
    System.out.printf("La media de los valores introducidos es: %.2f",media);
  
  }
}

//Ejercicio 21 de la relación de ejercicios Tema 4 Sentencias condicionales.
import java.util.Scanner;

public class Ejercicio21 {
  /*Realiza un programa que vaya pidiendo números hasta que se introduzca un
  numero negativo y nos diga cuantos números se han introducido, la media de
  los impares y el mayor de los pares. El número negativo sólo se utiliza para
  indicar el final de la introducción de datos pero no se incluye en el cómputo.*/
  public static void main(String[] args){
    int numero, total=0, totalImpar=0,numImpar=0;
    double mediaImpar = 0;
    int mayorPar = 0;
    Scanner txt = new Scanner(System.in);
    
    do
    {
      System.out.print("Introduzca un número positivo.");
      numero = txt.nextInt();
      if (numero >= 0)
      {
        total++;
        
        if (numero % 2 != 0){
            numImpar++;
            totalImpar +=numero;                   
        }else if (numero > mayorPar){
          mayorPar=numero;
          }
      } 
        
    } while (numero >=0);
    
    mediaImpar = (double)totalImpar/numImpar;  
    
    System.out.println("Ha introducido en total: "+total+" numeros.");
    System.out.println("La media de los numeros impares sera: "+mediaImpar);
    System.out.println("El número mayor de los pares es: "+mayorPar);
  
  
  }



}

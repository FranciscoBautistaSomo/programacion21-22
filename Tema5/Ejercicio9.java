//Ejercicio 9 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio9{
    /*Realiza un programa que nos diga cuántos dígitos tiene un número introducido
    por teclado. Este ejercicio es equivalente a otro realizado anteriormente, con
    la salvedad de que el anterior estaba limitado a números de 5 dígitos como
    máximo. En esta ocasión, hay que realizar el ejercicio utilizando bucles; de
    esta manera, la única limitación en el número de dígitos la establece el tipo de
    dato que se utilice (int o long).*/
  public static void main(String[]args){
    Scanner txt = new Scanner(System.in);
    int numero = 0;
    int digitos= 0;
    int resto = 0;
    System.out.print("Introduzca un número: ");
    numero = txt.nextInt();
    while(numero!=0){ 
          
          resto = numero /10;
          numero = resto;
          digitos++;
    }
    System.out.print("El número introducido tiene: "+digitos+" digitos");
  
  
  
  }

}

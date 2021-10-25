//Ejercicio 12 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;
public class Ejercicio12{
  /*Escribe un programa que muestre los n primeros términos de la serie de
  Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
  el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
  términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se debe
  introducir por teclado.*/
  public static void main(String[]args){
    int numero1 = 0;
    int numeroVer = 0;
    int limite =0;
    Scanner txt = new Scanner(System.in);
    System.out.print("Introduce el número de números de la serie a mostrar: ");
    limite = txt.nextInt();
    
    for (int i = 1; i <= limite; i++)
    {
      if (i == 1){
        numero1 =0;
            
        }else if (i==2){
          numeroVer = 1;          
          }else {             
            numeroVer = numeroVer+numero1;
            numero1 = numeroVer-numero1;                   
          }
          System.out.printf("%d, ", numeroVer);    
      
    }
  }
  

}

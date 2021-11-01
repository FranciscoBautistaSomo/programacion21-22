//Ejercicio 36 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio36{
  /*Escribe un programa que diga si un número introducido por teclado es o no
  capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
  programa debe aceptar números de cualquier longitud siempre que lo permita
  el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
  long en lugar de int ya que el primero admite números más largos.*/

  public static void main(String[]args){
  
    long numero;
    long numeroIntroducido;
    long inverso = 0;    
    int i = 1;
    Scanner txt = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero positivo: ");
    numero = txt.nextLong();
    numeroIntroducido = numero;
    
    //volteamos número.
    while (numero > 0)
    {
      inverso = (inverso*10)+ numero%10;
      numero /= 10;
      
    }
    
    System.out.println(inverso);
    
    if (inverso == numeroIntroducido )
    {
      System.out.print("El "+numeroIntroducido+" es capicua");
    }else{
      System.out.print("El "+numeroIntroducido+" no es capicua");
      
      }
    
    
  
  
  }

}

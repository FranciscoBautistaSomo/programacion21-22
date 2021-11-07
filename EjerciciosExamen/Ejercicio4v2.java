//Ejercicio 4 control 1 programacion 20/21
import java.util.Scanner;

public class Ejercicio4v2{

  public static void main(String [] args){
  
    Scanner txt = new Scanner(System.in);
    int numero, aux, estiraNum, digito;
    int inverso = 0;
    String numeroEstirado=" ";
    
    //Entrada de datos.
    do
    {
      System.out.print("Introduzca el número a ser estirado: ");
      numero = txt.nextInt();
      if (numero == 0){
        System.out.print("El número cero no vale. ");        
      }else if (numero <0)
      {
        System.out.print("Ha introducido un valor negativo. Se considerará como positivo. ");
        numero = (-1)*numero;
      }   
    } while (numero == 0);
    
    aux = numero;
    do
    {
      System.out.print("Introduzca el estiramiento: ");
      estiraNum = txt.nextInt();
      if (estiraNum <=0)
      {
        System.out.print("No se aceptan estiramientos negativos ni nulos.");
      }
      
    } while (estiraNum<=0);   
    
    
    //volteo.
    while (aux > 0)
    {
      inverso = (inverso*10)+(aux%10);
      aux/= 10;
    }
    
    //Estiramiento
    while (inverso > 0)
    {
      digito = inverso%10;
      inverso /= 10;
      
      for (int i = 0; i <estiraNum ; i++)
      {
        numeroEstirado += digito;
      }      
    }
   
    System.out.printf("El número %d estirado por %d es: %s",numero, estiraNum, numeroEstirado);
  
  }

}

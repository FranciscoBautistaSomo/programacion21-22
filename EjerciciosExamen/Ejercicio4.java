//Ejercicio 4 control 1 programacion 20/21
import java.util.Scanner;

public class Ejercicio4{

  public static void main(String [] args){
  
    Scanner txt = new Scanner(System.in);
    int numero, aux, estiraNum, digito;
    int inverso = 0;
    String numeroEstirado=" ";
    
    System.out.print("Introduzca el número a ser estirado: ");
    numero = txt.nextInt();
    aux = numero;
    System.out.print("Introduzca el estiramiento: ");
    estiraNum = txt.nextInt();
    
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

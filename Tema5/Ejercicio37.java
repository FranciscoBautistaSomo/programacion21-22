//Ejercicio 37 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio37{
  /*Realiza un conversor del sistema decimal al sistema de “palotes”.*/

  public static void main(String[]args){
    int numero;
    int numeroIntroducido=0;
    int inverso=0;
    int digito=0;
    int numDigito = 0;    
    Scanner txt = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero positivo: ");
    numero = txt.nextInt();
    numeroIntroducido = numero;
    
    //Voltear número.
    while (numero > 0)
    {
      inverso = (inverso*10)+(numero%10);
      numero /=10;
      numDigito++;
    }    
    
    
    while (inverso > 0){
        //Extraer digitos.
        digito = inverso % 10;
        inverso /= 10;
        numDigito--;   
        
        //Hacer la conversión a palotes. 
        if (digito == 0)
        {
          System.out.print("-");
          
        }else if (digito > 0){
          for (int i = 0; i < digito; i++)
          {
            System.out.print("|");                
            
            if (numDigito > 0){
              if (i == digito-1){
                System.out.print("-");
              }
            }           
          }         
        }           
    } 
  }  
}

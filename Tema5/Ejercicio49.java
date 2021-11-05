//Ejercicio 49 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio49 {
	
  /*Realiza un programa que calcule el máximo, el mínimo y la media de una serie
  de números enteros positivos introducidos por teclado. El programa terminará
  cuando el usuario introduzca un número primo. Este último número no se
  tendrá en cuenta en los cálculos. El programa debe indicar también cuántos
  números ha introducido el usuario (sin contar el primo que sirve para salir).*/
  
	public static void main (String[] args) {
    
    Scanner txt = new Scanner(System.in);
    int numero;
    boolean primo =false;
    int mayorb=0;
    int menora=0;
    int aux=0;
    int total=0;
    double media=0.0;
    int numeros=0;
    
    //Entrada de datos y calculo del número primo.
    System.out.print("Por favor, vaya introduciendo números enteros positivos. Para terminar, introduzca un número primo: ");
    do
    {
          
      numero = txt.nextInt();
      primo= true;
      for (int j = 2; j <numero ; j++)
      {        
        if (numero % j == 0){
          primo = false;          
        }     
      }
      
      if(!primo){
      //System.out.println(numero);
      numeros += numero;
      total++;
      
        menora = numero;
        if(menora > mayorb){
          aux = menora;
          menora = mayorb;
          mayorb = aux;     
        }
      } 
    }            
    while (!primo);
 
    media = (double)numeros/total;
    System.out.printf("Ha introducido %d números no primos.\n",total);
    System.out.println("Mayor: "+mayorb);
    System.out.println("Menor: "+menora);
    System.out.println("Media: "+media);
 
  }
}


//Ejercicio 24 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio24 {
  /* Escribe un programa que lea un número n e imprima una pirámide de números
con n filas como en la siguiente figura:
    1
   121
  12321
 1234321
  */
	
	public static void main (String[] args) {
    Scanner txt = new Scanner(System.in);
    int nFilas, numPira, dibuja =1;
    
    System.out.print("Introduzca un número: ");
    nFilas = txt.nextInt();
    System.out.println();
    
        
    numPira =1;
    for (int i = nFilas; i > 0 ; i--)
    {
      for (int j = 0; j < i ; j++)
      {
        System.out.print(" ");
      }
      
      //lado izquierdo
      for (int k = 0; k <numPira ; k++)
      {        
        dibuja = k;
        dibuja = k+1;
        
        //Contralamos si el número a dibujar es de dos dígitos.
        if(dibuja >=10){
          dibuja %=10;
          }
        System.out.print(dibuja); 
                   
      }
      //lado derecho piramide
      for (int k = numPira-1; k > 0  ; k--)
      {        
        dibuja = k;
        //dibuja = k-1;
        System.out.print(dibuja); 
                   
      }
      
      
      System.out.println();
      numPira = numPira+1;
      
    }
    
    
		
	}
}


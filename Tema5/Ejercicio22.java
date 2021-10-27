//Ejercicio 22 de la relación de ejercicios Tema 4 Sentencias condicionales.
import java.util.Scanner;

public class Ejercicio22 {
	/* Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos.*/
	public static void main (String[] args) {
    boolean Primo;
		
    for (int i = 2; i <=100 ; i++)
    {
      //comprobar que i es primo.
      Primo = true; 
      for (int j = 2; j < i ; j++)
      {
        if((i % j)== 0){
            Primo = false;            
        }        
      }
      if (Primo){
        System.out.println("Número primo: "+i);
      }     
    }    
	}
}


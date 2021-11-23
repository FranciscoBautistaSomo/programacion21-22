//Ejercicio 20 de la relación de ejercicios Tema 7 Array.
import java.util.Scanner;

public class Ejercicio20 {
	
	public static void main (String[] args) {
    
    Scanner txt = new Scanner(System.in);
    int numReyes=0;
    String[] reyes;    
    int orden=0; 
    
    System.out.print("Introduzca el número total de nombres de reyes: ");
    numReyes = txt.nextInt();
    txt.nextLine();
    reyes = new String[numReyes];
    
    
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");    
    
    for (int i = 0; i < numReyes ; i++){
    
      System.out.print(i+":");
      reyes[i] = txt.nextLine();
    }
    
    for (int i = 0; i < numReyes ; i++){    
      orden=1;      
            
      for (int j = 0; j <i ; j++){              
        if (reyes[i].equals(reyes[j]))
        {
          orden++;
        }
      }
      System.out.println(reyes[i]+" "+orden+"ª");
    }
  }
}


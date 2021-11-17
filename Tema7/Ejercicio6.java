//Ejercicio 6 de la relación de ejercicios Tema 7 Array.

public class Ejercicio6 {
	
	public static void main (String[] args) {
		
    int [] numero = new int [15];
    int [] aux = new int[16];
    
    for (int i = 0; i <15 ; i++)
    {
      numero[i] = 0; 
      aux[i] = 0;     
    }
    
    for (int i = 0; i <15 ; i++)
    {
      System.out.print("Introduzca un número: ");
      numero[i]= Integer.parseInt(System.console().readLine());
      aux[i+1]= numero[i];
    }
    aux[0]=aux[15];
    
    for (int i = 0; i <15 ; i++)
    {
      System.out.print(aux[i]+", ");
    }
    
    
    
    
    
    
    
	}
}


//Ejercicio 4 de la relación de ejercicios Tema 6 Número Aleatorio.

public class Ejercicio4 {
	
	public static void main (String[] args) {
		
    int numero;
    
    for (int i = 0; i <20 ; i++)
    {
      int n = i;
      numero = (int)(Math.random()*10)+1;
      System.out.print("Numero"+(n+1)+": "+numero+" ");
    }
    
	}
}


//Ejercicio 9 de la relación de ejercicios Tema 6 Número Aleatorio.

public class Ejercicio9 {
	
	public static void main (String[] args) {
		int numero = 0;
    int numeroRandom = 0;
    do
    {
      numeroRandom = (int)(Math.random()*100);
      
      if (numeroRandom % 2 == 0)
      {
        numero = numeroRandom;
      }      
      System.out.println ("Numero Random: "+numero);      
      
    } while (numero != 24);
    System.out.println ("fin");
    
	}
}


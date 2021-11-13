//Ejercicio 12 de la relación de ejercicios Tema 6 Número Aleatorio.


public class Ejercicio12 {
	
	public static void main (String[] args) {
		
    char simbolo='%';
    int numSymbol=0;
    System.out.print("\033[32m");
    for (int i = 0; i <=1000 ; i++)
    {
      for (int j = 32; j <=126-32 ; j++)
      {
        numSymbol = (int)(Math.random()*10)+j;
        simbolo = (char)numSymbol;        
        System.out.print(simbolo);
             
      }
      System.out.println("FIN"); 
      //System.out.println("Saltooooo");
    }
    
    
    /*numSymbol = (int)(Math.random()*10)+32;
    simbolo = (char)numSymbol;
    System.out.println(numSymbol);
    System.out.print(simbolo);
    System.out.println();*/
    
	}
}


//Ejercicio 19 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio19 {
	
	public static void main (String[] args) {
		int h; //altura
    int asteriscos; //llevará la cuenta dek número de asteristicos a pintar.
    
    System.out.print("Introduzca el valor de la altura: ");
    h = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    //piramide invertida
    asteriscos = 2*h-1;
    for (int i = 0; i < h; i++)
    {
      for (int j = 0; j < i; j++)
      {
        System.out.print(" ");
      }
      for (int k = 0; k < asteriscos; k++)
      {
        System.out.print("*");
      }
      System.out.println();
      asteriscos = asteriscos-2;     
      
    }
    //piramide normal
    asteriscos = 1;
    for (int i = h-1; i > 0; i--)
    {
      for (int j = 0; j < i; j++)
      {
        System.out.print(" ");
      }
      for (int k = 0; k < asteriscos; k++)
      {
        System.out.print("*");
      }
      System.out.println();
      asteriscos = asteriscos+2;     
    }    
	}
}


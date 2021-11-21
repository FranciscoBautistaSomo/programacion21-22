//Ejercicio 17 de la relación de ejercicios Tema 7 Array.

public class Ejercicio17{
	
	public static void main (String[] args) {
		
    int[] numeros = new int[10];
    int numero;
    boolean encontrado=false;
    int numEncotrado=0;
    
    for (int i = 0; i <10 ; i++)
    {
      numeros[i]= (int)(Math.random()*100);
    }
    
    for (int i = 0; i <10; i++)
    {
      System.out.print(numeros[i]+", ");         
    }
    
    //Pintar array
    System.out.println();
    System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
    System.out.print("│Indice   │");
    for (int j = 0; j <10 ; j++)
    {
      System.out.printf(" %3d│",j+1);
    }
    System.out.println();
    System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
    System.out.print("│Numeros  │");
    for (int j = 0; j <10 ; j++)
    {
      System.out.printf(" %3d│",numeros[j]);
    }
    System.out.println();
    System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    
    
    //int i=0;
    do
    {
      System.out.print("Introduzca un número entre 0 y 100: ");
      numero = Integer.parseInt(System.console().readLine());
      System.out.println();
      
        for (int i = 0; i <10 ; i++)
        {
          if (numeros[i] == numero)
          {
            numEncotrado = numeros[i];
            encontrado = true;
            
          }
          if (!encontrado)
          {
            encontrado = false;            
          }          
        }
        if (!encontrado)
        {
            System.out.print("Error, número no encontrado.");
        }else
        {
          System.out.print("El número ha sido encontrado. "+numEncotrado);
        }
        
        System.out.println();        
    } while (!encontrado);
    
    while (numeros[0]!=numEncotrado)
    {
      int aux = numeros[9];
      for (int i = 9; i >0 ; i--)
      {
        numeros[i]=numeros[i-1];
      }
      numeros[0] = aux;
    }
    
    //Pintar nuevo array
    System.out.println();
    System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
    System.out.print("│Indice   │");
    for (int j = 0; j <10 ; j++)
    {
      System.out.printf(" %3d│",j+1);
    }
    System.out.println();
    System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
    System.out.print("│Numeros  │");
    for (int j = 0; j <10 ; j++)
    {
      System.out.printf(" %3d│",numeros[j]);
    }
    System.out.println();
    System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    
	}
}


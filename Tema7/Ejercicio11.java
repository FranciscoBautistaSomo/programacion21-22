//Ejercicio 11 de la relación de ejercicios Tema 7 Array.

public class Ejercicio11 {
	
	public static void main (String[] args) {
		
    int[] inicial= new int[10];
    int[] noprimos = new int[10];
    int[] primos = new int[10];
    boolean primo = true;
    boolean salir = false;
    //indice para los números primos.
    int k = 0;
    //indice para los números no primos.
    int m = 0;
    
    for (int i = 0; i < 10; i++)
    {
      inicial[i]= 0;
      noprimos[i] = 0;
      primos[i]=0;
    }
    
    
    for (int i = 0; i <10 ; i++)
    {
      System.out.print("Introduzca un número: ");
      inicial[i]= Integer.parseInt(System.console().readLine());
      int verPrimo = inicial[i];
        primo = true;
        //Mirar si es primo
        for (int j = 2; j < verPrimo; j++)
        {
          if (verPrimo % j == 0)
          {
            primo = false;
            break;            
          }              
        }
        System.out.println(primo);
        if (primo){          
          primos[k] = verPrimo;
          k++;           
        }else
        {
          noprimos[m] = verPrimo;
          m++;
        }
 
    }
    
    //Mostrar resultados array inicial
      System.out.println("           Array Inicial          ");
      System.out.print("Indice ");
      for (int i = 0; i < 10; i++)
      {
        System.out.printf("%4d",i);
        
      }
      System.out.println();
      System.out.println("       ┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
      System.out.print("Valor  │");
      for (int i = 0; i <10 ; i++)
      {
        System.out.printf("%3d│",inicial[i]);
      }
      System.out.println();
      System.out.println("       └───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
      System.out.println();
      
      // Los números primos se menten en las primeras
      // posiciones del array original.  
      for (int i = 0; i < k ; i++)
      {
        inicial[i] = primos[i];
      }
      // Los números que no son primos se colocan al final.
      for (int i = k; i <k+m ; i++)
      {
        inicial[i] = noprimos[i-k];
      }
      
      //Dibujar tabla final.  
      System.out.println("           Array final          ");
      System.out.print("Indice ");
      for (int i = 0; i < 10; i++)
      {
        System.out.printf("%4d",i);
        
      }
      System.out.println();
      System.out.println("       ┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
      System.out.print("Valor  │");
      for (int i = 0; i < 10 ; i++)
      {
        System.out.printf("%3d│",inicial[i]);
      }
      System.out.println();
      System.out.println("       └───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
 
	}
}


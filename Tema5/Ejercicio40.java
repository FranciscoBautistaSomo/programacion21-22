//Ejercicio 40 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio40 {
  
  /*Realiza un programa que pinte por pantalla un rombo hueco hecho con
  asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
  sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
  mensaje de error.*/
	
	public static void main (String[] args) {
    int alturaR, asteriscos,alturaRS, alturaRI;
    
    System.out.print("Introduzca la altura del rombo: ");
    alturaR = Integer.parseInt(System.console().readLine());
    
    //Comprobar condiciones altura.
    while ((alturaR < 3) || (alturaR % 2 ==0))
    {
      System.out.println("Error.al introducir la altura. Debe ser impar y mayor o igual a 3");
      
      System.out.print("Introduzca la altura de la X: ");
      alturaR = Integer.parseInt(System.console().readLine());
    }
    
    //Dividimos las altura del rombo para hacerlo en dos partes inferior y superior.
    alturaRS = (alturaR/2);
    alturaRI = alturaR-alturaRS;
    
    //Parte superior del rombo.
    asteriscos = 1;
    for (int i = alturaRS; i >= 0; i--)
    {
      for (int j = 0; j < i; j++)
      {
        System.out.print(" ");
      }
      
      for (int k = 0; k < asteriscos; k++)
      {
        if ((k==0) || (k==asteriscos-1))
        {
          System.out.print("*");
          
        }else
        {
          System.out.print(" ");
        }
        
      }
      System.out.println();
      asteriscos = asteriscos+2;     
    }  
     
    //Parte inferior del rombo.
    asteriscos = alturaR-3;    
    for (int i = 1; i < alturaRI; i++)
    {
      //Espacios.
      for (int j = 0; j < i; j++)
      {
        System.out.print(" ");
      }
      
      //Dibuja asterisco.
      System.out.print("*");
      
      //Dibujar hueco      
      for (int k = 1; k < asteriscos; k++)
      {
        System.out.print(" ");
               
      }
            
      //Dibuja asterisco.
      if (i < alturaRI-1)
      {
        System.out.println("*");
      }
      
      
      asteriscos = asteriscos-2;   
    } 
     
		
	}
}


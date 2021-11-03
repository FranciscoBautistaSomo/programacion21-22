//Ejercicio 38 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio38 {
  
  /*Realizar un programa que pinte un reloj de arena relleno hecho de ateriscos.
   *El programa debe pedir la altura. Se de debe comprobar que la altura sea un 
   *número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje
   *de error.*/
  	
	public static void main (String[] args) {
		int alturaX;
    
    System.out.print("Introduzca la altura del reloj: ");
    alturaX = Integer.parseInt(System.console().readLine());
    
    while ((alturaX < 3) || (alturaX % 2 ==0))
    {
      System.out.println("Error.al introducir la altura. Debe ser impar y mayor o igual a 3");
      
      System.out.print("Introduzca la altura de la X: ");
      alturaX = Integer.parseInt(System.console().readLine());
    }
      int huecoX = alturaX-2;
      int huecoExtX = 1;
      int puntoMed = alturaX/2;
      //Parte superior X.
      for (int i = 0; i <= (puntoMed); i++)
      {
                   
          //pintar huecos externos X
          for (int k = 0; k < huecoExtX ; k++)
          {
            System.out.print(" ");
          }
          
         //punto intermedio X
          if (i != puntoMed)
          {
            System.out.print("*");
          }         
          
          //pintar huecos internos X
          for (int j = 0; j <huecoX ; j++)
          {
            System.out.print("*");
          }
          
          System.out.println("*");
          
          
          
          huecoExtX +=1;                   
          huecoX -=2;          
      }
      
        //Parte inferior X.
        huecoX = 1;
        huecoExtX = alturaX-((alturaX+1)/2);
        
      for (int i = puntoMed; i < alturaX; i++)
      {   
          //pintar huecos externos X
          for (int k = 0; k < huecoExtX ; k++)
          {
            System.out.print(" ");
          }
          
          System.out.print("*");
          
          //pintar huecos internos X
          for (int j = 0; j < huecoX ; j++)
          {
            System.out.print("*");
          }
          
          System.out.println("*");                   
          
          huecoExtX -=1;                   
          huecoX +=2;
      }
      
      
    
    
    
	}
}


//Ejercicio 35 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio35 {
	
	public static void main (String[] args) {
		int alturaX;
    
    System.out.print("Introduzca la altura de la X: ");
    alturaX = Integer.parseInt(System.console().readLine());
    
    while ((alturaX < 3) || (alturaX % 2 ==0))
    {
      System.out.print("Error.al introducir la altura. Debe ser impar y mayor de o igual a 3");
      
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
            System.out.print(" ");
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
            System.out.print(" ");
          }
          
          System.out.println("*");                   
          
          huecoExtX -=1;                   
          huecoX +=2;
      }
      
      
    
    
    
	}
}


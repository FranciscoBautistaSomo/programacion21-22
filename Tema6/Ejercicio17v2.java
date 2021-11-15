//Ejercicio 17 de la relación de ejercicios Tema 6 Número Aleatorio.


public class Ejercicio17v2 {
	
	public static void main (String[] args) {
		
    int ancho, alto;
    
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    alto = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    ancho = Integer.parseInt(System.console().readLine());
    
    int huecosAncho = ancho-2;
    int huecosAlto = alto-2;
    
    int posicion = 0;
    
    int posicionPez = (int)(Math.random()*(huecosAlto)*(huecosAncho));
    
    
    //Dibujar pecera, parte superior.
    for (int j = 0; j <ancho ; j++)
    {
      System.out.print("*");          
    }
      System.out.println();
      
    //Parte central.  
    for (int i = 2; i <alto ; i++){
      System.out.print("*");
      for (int j = 2; j <ancho ; j++)
      {
        if (posicion==posicionPez)
        {
          System.out.print("&");          
        }else
        {
          System.out.print(" ");
        }
        posicion++;
      }
      //parte derecha pecera.
      System.out.println("*");
    }  
    //parte inferior  
    for (int j = 0; j <ancho ; j++)
    {
      System.out.print("*");          
    }  
      
      
      
    
    //System.out.println();
    
    
    
	}
}


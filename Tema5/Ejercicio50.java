//Ejercicio 50 de la relación de ejercicios Tema 5 Bucles.


public class Ejercicio50 {

	public static void main (String[] args) {
		
    /*Una empresa de cartelería nos ha encargado un programa para realizar uno de
    sus diseños. Debido a los acontecimientos que han tenido lugar en Cataluña
    durante el 2018, han recibido muchos pedidos del cartel que muestra el número
    155. Realiza un programa que pinte el número 155 mediante asteriscos. Al
    usuario se le pedirán dos datos, la altura del cartel y el número de espacios
    que habrá entre los números. La altura mínima es 5. La anchura de los números
    siempre es la misma. La parte superior de los cincos también es siempre igual.
    La parte inferior del 5 sí que varía en función de la altura.*/
    
    int altura, espacios;
    
    System.out.print("Introduzca la altura (5 como mínimo): ");
    altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el número de espacios entre los números (1 como mínimo):");
    espacios = Integer.parseInt(System.console().readLine());
    
      //fila 1
      System.out.print("*");
      for (int k = 0; k <espacios ; k++)
      {
        System.out.print(" ");          
      }
        System.out.print("****");
      for (int k = 0; k <espacios ; k++)
      {
        System.out.print(" ");          
      }
      System.out.print("****");
      System.out.println();
      
      //fila 2
      System.out.print("*");
      for (int k = 0; k <espacios ; k++)
      {
        System.out.print(" ");          
      }
      System.out.print("*");
      for (int k = 0; k <espacios+3 ; k++)
      {
        System.out.print(" ");          
      }
      System.out.print("*");
      System.out.println();
      
      //fila 3
      System.out.print("*");
      for (int k = 0; k <espacios ; k++)
      {
        System.out.print(" ");          
      }
      System.out.print("****");
      for (int k = 0; k <espacios ; k++)
      {
        System.out.print(" ");          
      }
      System.out.print("****");
      System.out.println();
      //fila 4
      if (altura > 5){
        for (int i = 0; i <altura-4 ; i++)
        {
        System.out.print("*");
        for (int k = 0; k <espacios+3 ; k++)
        {
          System.out.print(" ");          
        }
        System.out.print("*");
        for (int k = 0; k <espacios+3 ; k++)
        {
          System.out.print(" ");          
        }
        System.out.print("*");
        System.out.println();}
      }else
      {
        System.out.print("*");
        for (int k = 0; k <espacios+3 ; k++)
        {
          System.out.print(" ");          
        }
        System.out.print("*");
        for (int k = 0; k <espacios+3 ; k++)
        {
          System.out.print(" ");          
        }
        System.out.print("*");
        System.out.println();
      }
      
      //Ultima fila
      System.out.print("*");
      for (int k = 0; k <espacios ; k++)
      {
        System.out.print(" ");          
      }
        System.out.print("****");
      for (int k = 0; k <espacios ; k++)
      {
        System.out.print(" ");          
      }
      System.out.print("****");
      System.out.println();
        
      
      
      
	}
}


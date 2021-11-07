//Ejercicio 3 control 1 programacion 18/19
public class Ejercicio3 {
	
	public static void main (String[] args) {
		int altura = 0;
    
    do
    {
      System.out.print("Introduzca la altura de la piramide(entre 3 y 30): ");
      altura = Integer.parseInt(System.console().readLine());
      
      if ((altura<3) || (altura >30))
      {
        System.out.println("Error al introducir la altura. Tiene que estar entre 3 y 30");
      }
      
    } while ((altura<3) || (altura >30));
    
    for (int i = 0; i <altura ; i++)
    {
      for (int j = 0; j <=i ; j++)
      {
        if ((j==0)||(j==i))
        {
          System.out.print("*");
        }else
        {
          System.out.print(" ");
        } 
      }
      System.out.println();            
    }
    
    for (int i = altura-1; i > 0 ; i--)
    {
      for (int j = 0; j <i ; j++)
      {
        if ((j==0)||(j==i-1))
        {
          System.out.print("*");
        }else
        {
          System.out.print(" ");
        }         
      }
      System.out.println(); 
    }
    
    
	}
}


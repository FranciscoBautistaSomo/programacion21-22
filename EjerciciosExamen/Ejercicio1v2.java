//Ejercicio 1 mejorado control 1 programacion 20/21

public class Ejercicio1v2 {

  public static void main (String[] args){
   
  int filas, columnas;
  String negra = "█";
  String blanca ="░"; 
  do
  {
    System.out.print("Introduzca el número de filas: ");
    filas = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el número de columnas: ");
    columnas = Integer.parseInt(System.console().readLine());
  } while ((filas< 0) || (filas >20) || (columnas<0) || (columnas > 20));
  
  
  
    for (int i = 0; i <filas ; i++)
    {
      if (i%2==0)
      {
        //System.out.print(negra);
        for (int j = 0; j <columnas ; j++)
        {
          if (j%2==0)
          {
            System.out.print(negra);
          }else
          {
            System.out.print(blanca);
          }
        }
        System.out.println();
        
      }else
      {
        for (int k = 0; k <columnas ; k++)
        {
          if (k % 2 ==0)
          {
            System.out.print(blanca);
          }else
          {
            System.out.print(negra);
          }
        }
        System.out.println();
       }
 
    }
    
  
  
    
  
  }
}

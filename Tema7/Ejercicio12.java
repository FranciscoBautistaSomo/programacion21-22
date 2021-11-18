//Ejercicio 12 de la relación de ejercicios Tema 7 Array.
public class Ejercicio12{

  public static void main(String[]args)
  {
    int trama = 10;
    int[] vector = new int[trama];
    int inicial, ultimo;
    
    //Entrada de datos.
    for (int i = 0; i <trama ; i++)
    {
      vector[i]= (int)(Math.random()*100);
    }
    
    System.out.print("Introduzca el valor inicial: ");
    inicial = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el valor final: ");
    ultimo = Integer.parseInt(System.console().readLine());
    
    if ((inicial > ultimo) || (inicial < 0) || (inicial > 9)|| (ultimo < 0) || (ultimo > 9)){
      System.out.print("Valores de las posiciones inicial o final no validas.");
    }else{          
          System.out.println();
          
          //Dibujar vector inicial.
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
              System.out.printf("%3d│",vector[i]);
            }
            System.out.println();
            System.out.println("       └───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
            System.out.println();
             
          int salvarB = vector[inicial];//valor del indice inicial.
          
          //Muevo los valores desde inicial.
          for (int i = inicial; i >0 ; i--)
          {
            vector[i]=vector[i-1];            
          }          
          
          int salvarA = vector[trama-1];//valor último del vector inicial.
          for (int i = trama-1; i > ultimo; i--)
          {
            vector[i]=vector[i-1];
          }         
          
          vector[ultimo]= salvarB;
          vector[0]=salvarA;
          
          System.out.print("Indice ");
          //Dibujar vector cambiado.
          for (int i = 0; i < 10; i++)
            {
              System.out.printf("%4d",i);
              
            }
            System.out.println();
            System.out.println("       ┌───┬───┬───┬───┬───┬───┬───┬───┬───┬───┐");
            System.out.print("Valor  │");
            for (int i = 0; i <10 ; i++)
            {
              System.out.printf("%3d│",vector[i]);
            }
            System.out.println();
            System.out.println("       └───┴───┴───┴───┴───┴───┴───┴───┴───┴───┘");
            System.out.println();
          }
    }
  }





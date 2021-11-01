//Ejercicio 33 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio33{
  /*Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
  programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
  dos asteriscos menos en la base para simular la curvatura de las esquinas
  inferiores.*/

  public static void main(String[] args){
    int alturaU;
    int base;    
    
    System.out.print("Introduzca la altura de la U: ");
    alturaU = Integer.parseInt(System.console().readLine());
    base = alturaU-2;    
    
    //OPCION 2 ??
    for (int i = 0; i <alturaU ; i++)
    {
         System.out.print("*");
         
         //pintar huecos U.
         for (int j = 0; j <=base ; j++)
         {
           System.out.print(" ");
         }
                  
         System.out.println("*");
                                     
         //pintar base
         if (i==alturaU-1)
         {
          System.out.print(" ");
          for (int k = 0; k < base  ; k++)
          {
            System.out.print("*");
          }           
         }                
    }  
  }

}

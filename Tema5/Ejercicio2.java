//Ejercicio 2 de la relación de ejercicios Tema 5 Bucles.
public class Ejercicio2{
  /*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle while.*/
  public static void main(String[]args){
    int i = 0;
    System.out.println ("USO DEL BUCLE WHILE");
    while(i<=100){
      if (i%5 == 0){
          System.out.println("Multiplo de 5: "+i);
        }
      i++;
      } 
  }

}

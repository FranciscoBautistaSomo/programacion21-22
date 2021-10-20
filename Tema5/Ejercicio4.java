//Ejercicio 4 de la relación de ejercicios Tema 5 Bucles.
public class Ejercicio4{
  /*Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando
  un bucle for.*/
  public static void main(String[] args){
    int j = 320;
  
    for (int i = 0; i <=160 ; i++)
    {
      i--;      
      System.out.println("Número :"+j);
      i+=20;
      j= j-20;
      //System.out.println("Número i:"+i);
    }
    
  }
    
  
  
  
}

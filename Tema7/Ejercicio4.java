//Ejercicio 4 de la relación de ejercicios Tema 7 Array.
public class Ejercicio4{
  public static void main(String[] args){
    int numRandom;
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    //inicializar arrays
    for (int i = 0; i < 20; i++)
    {
      numero[i] = 0;
      cuadrado[i] = 0;
      cubo[i] = 0;
    }
    
    //Mostrar datos
    for (int i = 0; i < 20; i++)
    {
      numero[i] = (int)(Math.random()*100);
      cuadrado[i] = (int)(Math.pow(numero[i],2));
      cubo[i] = (int)(Math.pow(numero[i],3));
    }
      System.out.println(" ┌────────┬──────────┬─────────┐");
      System.out.println(" │ Numero │ Cuadrado │  Cubo   │");
      System.out.println(" ├────────┼──────────┼─────────┤");
      
    for (int i = 0; i <20 ; i++)
    {
      
      System.out.printf(" │%7d │%9d │%8d │\n",numero[i],cuadrado[i], cubo[i] );
    }
    System.out.println(" └────────┴──────────┴─────────┘");
    
  
  
  
  }
}

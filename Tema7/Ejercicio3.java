//Ejercicio 3 de la relación de ejercicios Tema 7 Array.
public class Ejercicio3{

  public static void main(String[] args){
    int[] numeros = new int[10];
    
    
    for (int i = 0; i <10 ; i++)
    {
      System.out.print("Introduzca un número entero: ");
      numeros[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int i = 9; i >=0 ; i--)
    {
      System.out.print(numeros[i]+", ");
    }
    
  
  
  }
}

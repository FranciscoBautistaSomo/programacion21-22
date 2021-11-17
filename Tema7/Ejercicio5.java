//Ejercicio 5 de la relación de ejercicios Tema 7 Array.
public class Ejercicio5 {

  public static void main(String[] args){
  
    int[] numeros = new int[5];
    int maximo = Integer.MIN_VALUE;
    int minimo = Integer.MAX_VALUE;
    
    for (int i = 0; i <5 ; i++)
    {
      numeros[i] = 0;
    }
    
    for (int i = 0; i <5 ; i++)
    {
      System.out.println("Introduzca un número: ");
      numeros[i]= Integer.parseInt(System.console().readLine());

      if (numeros[i] < minimo)
      { 
        minimo = numeros[i];
        
      }else if (numeros[i] > maximo)
      {
        maximo = numeros[i];
      }
      
    }
      System.out.println ("Maximo: "+maximo);
      System.out.println ("Minimo: "+minimo);
      for (int i = 0; i <5; i++)
      {
        int n = i+1;
        if (numeros[i] == maximo)
        {
          System.out.println ("Numero "+n+":"+numeros[i]+" maximo");
        }else if (numeros[i] == minimo)
        {
          System.out.println ("Numero "+n+":"+numeros[i]+" minimo");
        }else
        {
          System.out.println ("Numero "+n+":"+numeros[i]);
        }
      } 
   }


}

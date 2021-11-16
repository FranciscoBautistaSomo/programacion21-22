//Ejercicio 1 de la relación de ejercicios Tema 7 Array.
public class Ejercicio1{

  public static void main (String[] args){
  
    int[] numero = new int[12];
    //inicializar array;
    for (int i=0; i<12; i++){    
      numero[i]=0;
    }
    //cargar datos
    numero[0] = 39;
    numero[1] = -2;
    numero[4] = 0;
    numero[6] = 14;
    numero[8] = 5;
    numero[9] = 120;
    //Escribir datos.
    for (int i=0; i<12; i++){    
      System.out.println(numero[i]);
    }
  }
}

//Ejercicio 2 de la relación de ejercicios Tema 7 Array.
public class Ejercicio2{

  public static void main (String[] args){
    
    char[] simbolo = new char[10];
    
    for (int i = 0; i <10 ; i++)
    {
      simbolo[i] =' ';
    }
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
    for (int i = 0; i <10 ; i++)
    {
      System.out.println(simbolo[i]);
    }
    
  
  }

}

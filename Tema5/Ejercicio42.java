//Ejercicio 42 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio42 {
	/*Escribe un programa que pida un número entero positivo por teclado y que
  muestre a continuación los 5 números consecutivos a partir del número
  introducido. Al lado de cada número se debe indicar si se trata de un primo
  o no.*/
	public static void main (String[] args) {
    int numero, aux;    
    boolean primo;
    System.out.print("Introduzca un número entero positivo: ");
    numero = Integer.parseInt(System.console().readLine());
    aux = numero;
    aux +=5;
    
    
    
    for (int i = numero; i <aux ; i++)
    {
      primo = true;
      for (int j = 2; j <i ; j++)
      {
        if (i % j == 0){
          primo = false;          
        }
      }
      
      if (primo)
      {
        System.out.println(i+" es primo.");
      }else{
       System.out.println(i+" no es primo."); 
      }
      primo = false;
    }
	}
}


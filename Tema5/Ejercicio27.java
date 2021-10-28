//Ejercicio 27 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio27 {
	
  /*Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
  entre 1 y un número leído por teclado.*/
  
	public static void main (String[] args) {
		int numero;
    int suma=0, contaMulti=0;
    
    do
    {
      System.out.print("Introduzca un número mayor que 3: ");
      numero = Integer.parseInt(System.console().readLine());
      
    }while (numero < 3);
    
    for (int i = 3; i <=numero ; i++)
    {
      if (i % 3 ==0)
      {
        System.out.println("el número "+i+" es multiplo de 3.");
        suma += i;
        contaMulti++;
      }
      
    }
    System.out.println();
    System.out.println("han aparecido "+contaMulti+" multiplos de 3");
    System.out.println("La suma de los múltiplos de 3 es: "+suma);
    
    
    
    
	}
}


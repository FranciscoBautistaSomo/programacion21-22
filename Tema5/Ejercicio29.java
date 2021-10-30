//Ejercicio 29 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio29 {
	
  /*Escribe un programa que muestre por pantalla todos los números enteros
  positivos menores a uno leído por teclado que no sean divisibles entre otro
  también leído de igual forma.*/
  
	public static void main (String[] args) {
		int numero, divisor;
    
    System.out.print("Introduzca un número entero: ");
    numero = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca un numero como divisor: ");
    divisor = Integer.parseInt(System.console().readLine());
    
    for (int i = numero; i >=0 ; i--)
    {
      if((i % divisor != 0)){
        
        System.out.printf("El %d no es divisible por %d\n",i,divisor);
        
        }
    }
    
    System.out.print("FIN");
  
    
	}
}


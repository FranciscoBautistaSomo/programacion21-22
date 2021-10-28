//Ejercicio 25 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio25 {
  
  /*Realiza un programa que pida un número por teclado y que luego muestre ese
  número al revés.*/
	
	public static void main (String[] args) {
    int numero, numeroReves=0, resto=0, resto2=0;
    
    System.out.print("Introduzca un número: ");
    numero= Integer.parseInt(System.console().readLine());
    
    while (numero > 0)
    {
      //Unidades
      resto = numero%10;
      numeroReves = numeroReves*10 + resto;
      
      //Resto digitos.
      numero = numero/10;        
      
    }        
    
    System.out.println("El numero introducido al invertilo es: "+numeroReves); 
    
		
	}
}


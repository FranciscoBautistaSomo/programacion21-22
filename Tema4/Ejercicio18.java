//Ejercicio 18 de la relación de ejercicios Tema 4 Sentencias condicionales.

public class Ejercicio18. {
	/*Programa que diga cuál es la primera cifra de un número entero
introducido por teclado. Se permiten números de hasta 5 cifras.*/

	public static void main (String[] args) {
    int numero =0;
    int numeroDigitos = 0;
    int primerNum =0;
    
    System.out.print("Introduzca un número entero (hasta 5 cifras): ");
    numero=Integer.parseInt(System.console().readLine());
    
    if (numero > 99999){
      System.out.print("Numero no valido mayor de 5 cifras.");
      }else if(numero < 10){        
        System.out.print("El primer número es: "+numero);
        }else if((numero > 10) && (numero < 100)){
          primerNum = numero / 10;
          System.out.print("El primer número es: "+primerNum);
        }else if((numero > 100) && (numero < 1000)){
          primerNum = numero / 100;
          System.out.print("El primer número es: "+primerNum);
        }else if((numero > 1000) && (numero < 10000)){
          primerNum = numero / 1000;
          System.out.print("El primer número es: "+primerNum);
        }else if((numero > 10000) && (numero < 100000)){
          primerNum = numero / 10000;
          System.out.print("El primer número es: "+primerNum);
        }       
		
	}
}


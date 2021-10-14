//Ejercicio 19 de la relación de ejercicios Tema 4 Sentencias condicionales.

public class Ejercicio19 {
	/*programa que nos diga cuántos dígitos tiene un número entero que
puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.*/

	public static void main (String[] args) {
    int numero =0;
    int numeroDigitos = 0;
    int primerNum =0;
    
    System.out.print("Introduzca un número entero (hasta 5 cifras, positivo o negativo): ");
    numero=Integer.parseInt(System.console().readLine());
    
    if ((numero > 99999)||(numero < -100000)){
      System.out.print("Numero no valido, mayor de 5 cifras.");
      }else if(numero > 0){
        //Números positivos.
        if(numero < 10){
          numeroDigitos =1;      
        System.out.printf("El %d tiene: "+numeroDigitos+" digito.", numero);
        }else if((numero >= 10) && (numero < 100)){
          numeroDigitos =2;      
        System.out.printf("El %d tiene: "+numeroDigitos+" digitos.", numero);
        }else if((numero >= 100) && (numero < 1000)){
          numeroDigitos =3;      
        System.out.printf("El %d tiene: "+numeroDigitos+" digitos.", numero);
        }else if((numero >= 1000) && (numero < 10000)){
          numeroDigitos =4;      
        System.out.printf("El %d tiene: "+numeroDigitos+" digitos.", numero);
        }else if((numero >= 10000) && (numero < 100000)){
          numeroDigitos =5;      
        System.out.printf("El %d tiene: "+numeroDigitos+" digitos.", numero);
        }
        }else if(numero < 0){
        //Números negativos
            numero = numero *(-1);          
          if(numero < 10){
            numeroDigitos =1;      
          System.out.printf("El %d tiene: "+numeroDigitos+" digito.", numero*(-1));
          }else if((numero >= 10) && (numero < 100)){
            numeroDigitos =2;      
          System.out.printf("El %d tiene: "+numeroDigitos+" digitos.", numero*(-1));
          }else if((numero >= 100) && (numero < 1000)){
            numeroDigitos =3;      
          System.out.printf("El %d tiene: "+numeroDigitos+" digitos.", numero*(-1));
          }else if((numero >= 1000) && (numero < 10000)){
            numeroDigitos =4;      
          System.out.printf("El %d tiene: "+numeroDigitos+" digitos.", numero*(-1));
          }else if((numero >= 10000) && (numero < 100000)){
            numeroDigitos =5;      
          System.out.printf("El %d tiene: "+numeroDigitos+" digitos.", numero*(-1));
          }       
        }
	}
}


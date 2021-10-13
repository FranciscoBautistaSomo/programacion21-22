//Ejercicio 17 de la relación de ejercicios Tema 4 Sentencias condicionales.

public class Ejercicio17 {
	
	public static void main (String[] args) {
    int numero =0;
    int ultima =0;
    
    System.out.print("Introduzca un número entero: ");
    numero=Integer.parseInt(System.console().readLine());
    
    ultima = numero % 10;
    
    System.out.printf("El último de %d es: "+ultima, numero);  
    
		
	}
}


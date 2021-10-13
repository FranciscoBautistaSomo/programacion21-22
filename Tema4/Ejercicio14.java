//Ejercicio 14 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio14{
	
	public static void main (String[] args) {
		int numero=0;
    
    System.out.print("Introduzca un número entero: ");
    numero = Integer.parseInt(System.console().readLine());
    
    if (((numero) % 2 == 0) && ((numero) % 5 ==0)){
      System.out.printf("El %d es par y divisible por 5.", numero);
      }else if((numero) % 2 == 0){
        System.out.printf("El %d es par.", numero);
        }else if((numero) % 5 ==0){
          System.out.printf("El %d es divisible por 5.", numero);
          }else {
            System.out.printf("El %d no es par y no es divisible por 5.", numero);            
            }
    
	}
}


//Ejercicio 28 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio28 {
	
  /*Escribe un programa que calcule el factorial de un número entero leído por
  teclado.*/
  
	public static void main (String[] args) {
		int numero, numeroIn;
    long factorial=1;
    
    System.out.print("Por favor, introduzca un número entero: ");
    numero = Integer.parseInt(System.console().readLine());
    numeroIn=numero;
    
    if (numero == 0){
      
      System.out.printf("%d! = %d" , numero, factorial);
        
      }else{
          factorial=numero;
          do
          {
            factorial=factorial*(numero-1);
            numero--;
          }while (numero > 1);
             
      System.out.printf("%d! = %d" , numeroIn, factorial);  
        
      }
	}
}


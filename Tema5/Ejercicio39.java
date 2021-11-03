//Ejercicio 39 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio39 {
  
  /*Escribe un programa que pida un número entero positivo por teclado y que
  muestre a continuación los números desde el 1 al número introducido junto
  con su factorial.*/
	
	public static void main (String[] args) {
    int numero;
    long factorial=1;
    
    System.out.print("Introduzca un número entero positivo: ");
    numero = Integer.parseInt(System.console().readLine());    
    
    for (int i = 1; i <= numero ; i++)
    {
      int n = i;
      if (i == 1){
          System.out.println("1! = "+i);                          
          }else{
            factorial=n;                                             
            do
            {
              factorial=factorial*(n-1);
              n--;
            }while (n > 1);
                        
            System.out.println(i+"! = "+factorial);                     
          }         
          
    }  
    
    
    
		
	}
}


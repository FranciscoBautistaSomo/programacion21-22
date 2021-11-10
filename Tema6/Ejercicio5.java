//Ejercicio 5 de la relación de ejercicios Tema 6 Número Aleatorio.

public class Ejercicio5 {
	
	public static void main (String[] args) {
		
    int numero=0;
    int total=0;
    double media=0.0;
    int mayor=100;
    int menor=199;
    int aux=0;
    
    for (int i = 0; i <50 ; i++)
    {
      int n = i;
      numero = (int)(Math.random()*100)+100;
      //System.out.print("Numero"+(n+1)+": "+numero+" ");
      System.out.print(","+numero+", ");
      total +=numero;
      
      if (numero < menor)
      {
        menor = numero;
      }
      
      
      if (numero > mayor){
        mayor = numero;               
      } 
      
    }
    System.out.println();
    media = (double)total/50;
    System.out.println("La media es: "+media);
    System.out.println("El número mayor es: "+mayor);
    System.out.print("El número menor es: "+menor);
	}
}


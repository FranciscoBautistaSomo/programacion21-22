//Ejercicio 19 de la relación de ejercicios Tema 6 Número Aleatorio.
public class Ejercicio19 {
	
	public static void main (String[] args) {
    double media=0.0;
    int total =0;
    int maxPares = 0;
    int minImpares = 0;
    for (int i = 0; i <50 ; i++)
    {
      int numero = (int)(Math.random()*301)-100;
      System.out.print("Numero "+i+" "+numero+", \n");
      total += numero;     
      if ((numero % 2== 0)&&(numero > maxPares))
      {
        maxPares = numero;
      }
      if((numero % 2!= 0) && (numero < minImpares)){
        
        minImpares = numero;
        }
    }
    media = (double)total/50;
    
    System.out.println("Media "+media);
    System.out.println("Maximo pares "+maxPares);
    System.out.print("Mínimo impares "+minImpares);
 
	}
}


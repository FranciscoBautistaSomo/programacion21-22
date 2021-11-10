//Ejercicio 6 de la relación de ejercicios Tema 6 Número Aleatorio.


public class Ejercicio6 {
	
	public static void main (String[] args) {
		
    int oportunidad = 5;
    boolean correcto =false;
    int numeroIN;    
    do
    {
      int numero = (int)(Math.random()*100);
      System.out.print(numero);
      System.out.printf("Adivine el número aleatorio entre 0 y 100, tiene %d oportunidade/s\n",oportunidad);
      numeroIN = Integer.parseInt(System.console().readLine());
      if(numero == numeroIN){
         System.out.print("Enhorabuena, ha acertado.");
         correcto = true;         
      }else if (oportunidad == 0)
      {
        System.out.println("Lo siento, juego terminado, no tiene mas oportunidades.");
      }else{        
        System.out.println("Error, pruebe otra vez.");
        oportunidad--;        
      }
    } while ((!correcto) && (oportunidad > 0));
   
    
	}
}


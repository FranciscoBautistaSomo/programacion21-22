//Ejercicio 14 de la relación de ejercicios Tema 6 Número Aleatorio.

public class Ejercicio14 {
	
	public static void main (String[] args) {
		int oportunidad = 5;
    boolean acertar = false;
    String respuesta = "";
    String mayorMenor = "";
    int variable = 0;
    int numeros = 11;
    do
    {
      int numero = (int)(Math.random()*numeros+variable);
      System.out.println("El número que está pensando es (s/n): "+numero);
      respuesta = System.console().readLine();
      if (respuesta.equals("s"))
      {
        System.out.println("Enhorabuena acertaste");
        acertar = true;        
      }else
      {
        System.out.println("Error, no acertaste");
        acertar = false;
        oportunidad--;
        System.out.print("El número es mayor o menor que el dicho (mayor/menor): ");
        mayorMenor = System.console().readLine();
        if (mayorMenor.equals("mayor"))
        {
          variable = numero+1;
        }else
        {
          numeros -= numero+1;
        } 
      }
      System.out.println(variable);
      System.out.println(numeros);
    } while ((!acertar) && (oportunidad >0));
    System.out.print("Fin del juego");
	}
}


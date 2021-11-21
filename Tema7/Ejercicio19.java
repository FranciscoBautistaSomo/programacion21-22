//Ejercicio 19 de la relación de ejercicios Tema 7 Array.


public class Ejercicio19{
	
	public static void main (String[] args) {
    
    int[] numeros = new int[12];
    int numeroNuevo;
    
    for (int i = 0; i <12 ; i++)
    {
      numeros[i]=(int)(Math.random()*201);
    }
    
    
    //Pintar array
    System.out.println();
    System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
    System.out.print("│Indice   │");
    for (int j = 0; j <12 ; j++)
    {
      System.out.printf(" %3d│",j);
    }
    System.out.println();
    System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
    System.out.print("│Numeros  │");
    for (int j = 0; j <12 ; j++)
    {
      System.out.printf(" %3d│",numeros[j]);
    }
    System.out.println();
    System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    
    //Pedir datos.
    System.out.println();
    System.out.print("Introduzca el número que quiere insertar: ");
    numeroNuevo = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca la posición donde lo quiere insertar (0 – 11): ");
    int indice = Integer.parseInt(System.console().readLine());
    
    //Modifico array original
    for (int i = 11; i >indice ; i--)
    {
      numeros[i] =numeros[i-1];
    }
    
    numeros[indice] = numeroNuevo;
    
    //pinto nuevo array
    System.out.println();
    System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
    System.out.print("│Indice   │");
    for (int j = 0; j <12 ; j++)
    {
      System.out.printf(" %3d│",j);
    }
    System.out.println();
    System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
    System.out.print("│Numeros  │");
    for (int j = 0; j <12 ; j++)
    {
      System.out.printf(" %3d│",numeros[j]);
    }
    System.out.println();
    System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
    
		
	}
}


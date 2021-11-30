//Ejercicio 13 de la relación de ejercicios Tema 7 Array Bidimensionales.


public class Ejercicio13{
	
	public static void main (String[] args) {
		final int FILA = 4;
    final int COLUMNA = 10;
    final int max = 210;
    final int min = 140;
    int estatuMedia = 0;
    int minima = 1000;
    int maxima = 0;
    
    String [] pais = {"España", "Rusia", "Japón", "Australia"};
    int [][] estatura = new int[FILA][COLUMNA];
    
    //Inicialiar array bidimensional
    for (int i = 0; i <FILA; i++)
    {
      for (int j = 0; j<COLUMNA ; j++)
      {
        estatura[i][j]=0;
      }
      
    }
    
    
    //Rellenar array bidimensional
    for (int i = 0; i <FILA; i++)
    {
      for (int j = 0; j<COLUMNA ; j++)
      {
        estatura[i][j]=((int)(Math.random()*(max-min+1))+min);
      }
      
    }
      
    
    //Pintar array
    System.out.println("                                                       MED MIN MAX");
    for (int i = 0; i <FILA; i++)
    {      
      System.out.printf("%10s: ",pais[i]);
      maxima =0;
      minima =1000;
      for (int j = 0; j<COLUMNA ; j++)
      {
        System.out.printf("%-3d ",estatura[i][j]);
        estatuMedia += estatura[i][j];
        if (estatura[i][j]< minima)
        {
          minima = estatura[i][j];
        }else if (estatura[i][j]> maxima){
          
          maxima = estatura[i][j];
        }
        
      }
      estatuMedia = estatuMedia/COLUMNA;
      System.out.print(" | "+estatuMedia);
      System.out.printf(" %3d",minima);
      System.out.printf(" %3d",maxima);
      System.out.println();
    }
    
    
    
	}
}


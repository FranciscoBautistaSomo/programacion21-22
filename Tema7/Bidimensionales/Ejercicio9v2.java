//Ejercicio 9 de la relación de ejercicios Tema 7 Array Bidimensionales.

public class Ejercicio9v2{
	
	public static void main (String[] args) {
      final int fila =12;
      final int columna = 12;
      final int min = 0;
      final int max = 100;
      int[][] tabla = new int[fila][columna];
      int[][] aux = new int[fila][columna];
      
      //Inicializar tablas,
      for (int i = 0; i <fila ; i++)
      {
        for (int j = 0; j < columna ; j++)
        {
          tabla[i][j] = 0;
        }
      }
      
      for (int i = 0; i <fila ; i++)
      {
        for (int j = 0; j < columna ; j++)
        {
          aux[i][j] = 0;
        }
      }

      //Rellenar con random la tabla.
      for (int i = 0; i <fila ; i++)
      {
        for (int j = 0; j <columna ; j++)
        {
          tabla[i][j] = (int)(Math.random()*(max-min+1))+min;
        }
      }
      
      for (int i = 0; i <fila/2 ; i++)
      {
        for (int j = i; j <(columna-1-i) ; j++)
        {
          aux[i][j+1]=tabla[i][j];
        }
        for (int j = i; j <(columna-1-i) ; j++)
        {
          aux[j+1][columna-1-i]=tabla[j][columna-1-i];
        }
        for (int j = i+1; j <(columna-i) ; j++)
        {
          aux[columna-1-i][j-1]=tabla[columna-1-i][j];
        }
        for (int j = i+1; j <(columna-i) ; j++)
        {
          aux[j-1][i]=tabla[j][i];
        }
      }
      //Mostrar tablas
      System.out.println("TABLA ORIGINAL.");
      for (int i = 0; i <fila ; i++)
      {
        for (int j = 0; j < columna ; j++)
        {
          System.out.printf("%3d | ",tabla[i][j]);
        }
        System.out.println();
      }
      System.out.println();
      System.out.println("TABLA RESULTADO.");
      for (int i = 0; i <fila ; i++)
      {
        for (int j = 0; j < columna ; j++)
        {
          System.out.printf("%3d | ",aux[i][j]);
        }
        System.out.println();
      }
      System.out.println();
  }
	
}


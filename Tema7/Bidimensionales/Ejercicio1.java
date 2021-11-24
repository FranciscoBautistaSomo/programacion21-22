//Ejercicio 1 de la relación de ejercicios Tema 7 Array Bidimensionales.


public class Ejercicio1{
	
	public static void main (String[] args) {
    final int FILA = 3;
    final int COLUM = 6;
		
    int [][] num = new int[FILA][COLUM];
    
    //Introducir datos.
    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] =11;
    
    //Mostrar datos;
    System.out.print("Array num");
    System.out.println();
      
    for (int fila = 0; fila <FILA ; fila++)
    {
      System.out.printf("Fila %3d  |",fila);
      for (int columna = 0; columna <COLUM ; columna++)
      {
        //System.out.print("Columna "+columna);
        System.out.printf("%3d |",num[fila][columna]);
      }
      System.out.println();

    }
    
    
	}
}


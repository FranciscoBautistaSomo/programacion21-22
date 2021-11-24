//Ejercicio 2 de la relación de ejercicios Tema 7 Array Bidimensionales.

public class Ejercicio2{
	
	public static void main (String[] args) {
		final int fila = 5;
    final int colum = 6;
    int sumaFila =0;
    int sumaColum=0;
    int[][] tabla = new int[fila][colum];
    
      //Agrego datos
      for (int i = 0; i <fila ; i++)
      {
        sumaFila = 0;
        for (int j = 0; j < colum-1; j++)
        {
          
          //System.out.print(i+","+j+": Introduzca un número por favor: ");
          //tabla[i][j]=Integer.parseInt(System.console().readLine());
          tabla[i][j] = (int)(Math.random()*11);
          sumaFila += tabla[i][j]; 
          
        }
        tabla[i][colum-1] = sumaFila;
        System.out.println();        
      }
      
      //sumar columnas
      for (int j = 0; j <colum ; j++)
      {
        sumaColum = 0;
        for (int i = 0; i <fila-1 ; i++)
        {
          sumaColum += tabla[i][j];
        }
        tabla[fila-1][j] = sumaColum;
        
      }
      
      
      //Pinto tabla
      for (int i = 0; i <fila; i++)
      {
        for (int j = 0; j <colum ; j++)
        {
          System.out.printf("%3d  |",tabla[i][j]);
        }
        System.out.println(); 
      }
      
      
      
    
    
	}
}


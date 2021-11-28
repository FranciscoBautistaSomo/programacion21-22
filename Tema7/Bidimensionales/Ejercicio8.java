//Ejercicio 8 de la relación de ejercicios Tema 7 Array Bidimensionales.

public class Ejercicio8{
	
	public static void main (String[] args) {
    String posicion ="";
    char filaInicial;
    char columnaInicial;
    
    
      System.out.print("Introduzca la posición del alfil: ");
      posicion = System.console().readLine();
      
      //Separamos los caracteres de la posición introducida.
      filaInicial = posicion.charAt(1);
      columnaInicial = posicion.charAt(0);
      //Conversión a firmato estandar [fila,columna]
      int columnaNum = (int)columnaInicial-(int)'a';
      int filaNum = 8 - ((int)filaInicial-(int)'0');
      
      System.out.println("["+filaNum+","+columnaNum+"]");
      System.out.println("El álfil puede moverse a las siguientes posiciones: ");
      for (int fila = 0; fila < 8; fila++)
      {
        for (int columna = 0; columna < 8 ; columna++)
        {
          if (((Math.abs(filaNum-fila) == Math.abs(columnaNum-columna))&& fila != filaNum))
          {
            System.out.printf("%s%d, ",String.valueOf((char)(columna+'a')), (8-fila));
            
          }
        }
      }
	}
}


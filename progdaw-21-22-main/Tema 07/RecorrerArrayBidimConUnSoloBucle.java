public class RecorrerArrayBidimConUnSoloBucle {
  public static void main (String[] args) {
    final int FILAS=5;
    final int COLUMNAS=10;
    
    final int MIN=50;
    final int MAX=100;
    
    int [][] matriz = new int[FILAS][COLUMNAS];
    
    // Relleno con doble bucle
    
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        matriz[i][j] = (int)(Math.random()*(MAX-MIN+1))+MIN;
      }
    }
    
    // Presentacion con doble bucle
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        System.out.printf("%3s ",matriz[i][j]);
      }
      System.out.println();
    }
    
    System.out.println();
    
    // Presentacion con bun solo bucle
    int fila=0;
    int columna=0;
    for (int i=0; i<FILAS*COLUMNAS; i++) {
      System.out.printf("%3s ",matriz[fila][columna]);
      columna++;
      if (columna>=COLUMNAS){
        columna=0;
        fila++;
        System.out.println();
      }
    }
  
    
  }
}

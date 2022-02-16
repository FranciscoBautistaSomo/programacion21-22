public class Ejercicio6 {
  
  /* relleno de un array aleatorio sin que se repitan elementos */
  
  public static void main (String[] args) {
    final int FILAS=6;
    final int COLUMNAS=10;
    
    final int inf=0;
    final int sup=1000;
    
    int matriz [][] = new int[FILAS][COLUMNAS];
    
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        boolean repetido;
        do {
          repetido = false;
          matriz[i][j] = (int)(Math.random()*(sup-inf+1));
          for (int k=0; k<i && repetido==false; k++) {
            for (int l=0; l<COLUMNAS && repetido==false; l++) {
              if (matriz[i][j]==matriz[k][l]) {
                repetido = true;
              }
            }
          }
          if (repetido == false) {
            for(int k=0; k<j; k++) {
              if (matriz[i][j]==matriz[i][k]) {
                repetido = true;
              }
            }
          }          
        } while (repetido==true);
      }
    }
    
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        System.out.printf("%5d",matriz[i][j]);
      }
      System.out.println();
    }
  }
}

public class Ejercicio6b {
  
  /* relleno de un array aleatorio sin que se repitan elementos */
  
  public static void main (String[] args) {
    final int FILAS=6;
    final int COLUMNAS=10;
    
    final int inf=1;
    final int sup=60;
    
    int matriz [][] = new int[FILAS][COLUMNAS];
    
    for (int i=0; i<FILAS; i++) {
      for (int j=0; j<COLUMNAS; j++) {
        boolean repetido;
        do {
          repetido = false;
          matriz[i][j] = (int)(Math.random()*(sup-inf+1)+1); ///nums entre 1 y 60, ambos inc
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

public class Ejercicio9 {
  public static void main (String[] args) {
    final int DIMENSION = 8;
    final int min=0;
    final int max=100;
    int [][] matriz = new int [DIMENSION][DIMENSION];
    int [][] matriz2 = new int [DIMENSION][DIMENSION];
    
    for (int i=0; i<DIMENSION; i++) {
      for (int j=0; j<DIMENSION; j++) {
        matriz[j][i] = (int)(Math.random()*(max-min+1))+min;
      }
    }
    
    for (int i=0; i<DIMENSION; i++) {
      for (int j=0; j<DIMENSION; j++) {
        System.out.printf("%3d ",matriz[i][j]);
      }
      System.out.println();
    }
    
    for (int i=0; i<DIMENSION/2; i++) {
      for (int j=i; j<(DIMENSION-1-i); j++) {
        matriz2[i][j+1] = matriz[i][j];
      }      
      for (int j=i; j<(DIMENSION-1-i); j++) {
        matriz2[j+1][DIMENSION-1-i] = matriz[j][DIMENSION-1-i];
      }      
      for (int j=i+1; j<(DIMENSION-i); j++) {
        matriz2[DIMENSION-1-i][j-1] = matriz[DIMENSION-1-i][j];
      }      
      for (int j=i+1; j<(DIMENSION-i); j++) {
        matriz2[j-1][i] = matriz[j][i];
      }      
    }
    
    System.out.println("--------------------");
    
    for (int i=0; i<DIMENSION; i++) {
      for (int j=0; j<DIMENSION; j++) {
        System.out.printf("%3d ",matriz2[i][j]);
      }
      System.out.println();
    }   
    
  }
}

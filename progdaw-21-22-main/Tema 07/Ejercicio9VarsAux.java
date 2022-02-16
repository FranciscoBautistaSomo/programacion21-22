public class Ejercicio9VarsAux {
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
    
    
    
    int fila1Anillo = 0;
    int fila2Anillo = DIMENSION-1;
    int columna1Anillo = 0;
    int columna2Anillo = DIMENSION-1;
    
    int columnaInfFila1Anillo = 0;
    int columnaSupFila1Anillo = DIMENSION-2;
    
    int columnaInfFila2Anillo = 1;
    int columnaSupFila2Anillo = DIMENSION-1;
    
    int filaInfColumna1Anillo = 1;
    int filaSupColumna1Anillo = DIMENSION-1;
    
    int filaInfColumna2Anillo = 0;
    int filaSupColumna2Anillo = DIMENSION-2;
    
    
    
    for (int i=0; i<DIMENSION/2; i++) {
      for (int j=columnaInfFila1Anillo; j<=columnaSupFila1Anillo; j++) {
        matriz2 [fila1Anillo][j+1] = matriz [fila1Anillo][j];
      }
      fila1Anillo++;
      columnaInfFila1Anillo++;
      columnaSupFila1Anillo--;
      
      for (int j=filaInfColumna2Anillo; j<=filaSupColumna2Anillo; j++) {
        matriz2 [j+1][columna2Anillo] = matriz [j][columna2Anillo];
      }
      columna2Anillo--;
      filaInfColumna2Anillo++;
      filaSupColumna2Anillo--;
      
      for (int j=columnaInfFila2Anillo; j<=columnaSupFila2Anillo; j++) {
        matriz2 [fila2Anillo][j-1] = matriz [fila2Anillo][j];
      }
      fila2Anillo--;
      columnaInfFila2Anillo++;
      columnaSupFila2Anillo--;
      
      for (int j=filaInfColumna1Anillo; j<=filaSupColumna1Anillo; j++) {
        matriz2 [j-1][columna1Anillo] = matriz [j][columna1Anillo];
      }
      columna1Anillo++;
      filaInfColumna1Anillo++;
      filaSupColumna1Anillo--;
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

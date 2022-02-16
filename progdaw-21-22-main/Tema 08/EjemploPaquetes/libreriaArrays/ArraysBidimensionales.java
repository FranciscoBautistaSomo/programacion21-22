package libreriaArrays;

public class ArraysBidimensionales {
  
  public static void presentarPorPantalla (int [][] matriz) {
    for (int i=0; i<matriz.length; i++) {
      for (int j=0; j<matriz[i].length; j++) {
        System.out.printf ("%3s ",matriz[i][j]);
      }
      System.out.println();
    }
  }
  
  public static void rellenoAleatorio (int [][] matriz) {
    for (int i=0; i<matriz.length; i++) {
      for (int j=0; j<matriz[i].length; j++) {
        matriz[i][j] = (int)(Math.random()*200);
      }
    }
  }
}

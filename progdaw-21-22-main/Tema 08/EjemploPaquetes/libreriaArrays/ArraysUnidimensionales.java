package libreriaArrays;

public class ArraysUnidimensionales {
  
  public static void presentarPorPantalla (int [] matriz) {
    for (int i=0; i<matriz.length; i++) {
        System.out.printf ("%3s ",matriz[i]);
    }
    System.out.println();
  }

  public static void rellenoAleatorio (int [] matriz) {
    for (int i=0; i<matriz.length; i++) {
        matriz[i] = (int)(Math.random()*200);
    }
  }
}

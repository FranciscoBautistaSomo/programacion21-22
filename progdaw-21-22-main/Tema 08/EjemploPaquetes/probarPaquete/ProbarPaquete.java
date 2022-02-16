package probarPaquete;

import libreriaArrays.ArraysBidimensionales;
import libreriaArrays.ArraysUnidimensionales;

public class ProbarPaquete {
  public static void main (String [] args) {
    int [] a = new int[10];
    int [][] b = new int[10][8];
    
    //rellenar matrices
    ArraysUnidimensionales.rellenoAleatorio(a);
    ArraysBidimensionales.rellenoAleatorio(b);
    
    //presentar matrices
    ArraysUnidimensionales.presentarPorPantalla(a);
    System.out.println("------");
    ArraysBidimensionales.presentarPorPantalla(b);
    
  }
}

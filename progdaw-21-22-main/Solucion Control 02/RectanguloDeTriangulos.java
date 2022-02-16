public class RectanguloDeTriangulos {
  public static void main (String[] args) {
    int ancho, alto;
    System.out.print("Indique el ancho en triángulos: ");
    ancho = Integer.parseInt(System.console().readLine());
    System.out.print("Indique el alto en triángulos: ");
    alto = Integer.parseInt(System.console().readLine());
    
    for (int i=0; i<alto; i++) {
      for (int j=1; j<=4; j++) {
        for (int k=0; k<ancho; k++) {
          //tramo blancos
          for (int l=1;l<=4-j;l++) {
            System.out.print(" ");
          }
          //tramo asteriscos
          for (int l=1; l<=j; l++) {
            System.out.print("*");
          }
          // espacio en blanco
          System.out.print(" ");
        }        
        System.out.println();
      }
      System.out.println();
    }
  }
}

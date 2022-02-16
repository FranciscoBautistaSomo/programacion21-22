public class CoordenadasAjedrez2 {
  public static void main (String[] args) {
    System.out.println("Conversor de coordenadas ajedrez (externas a internas):");
    System.out.println("      0 1 2 3 4 5 6 7");
    System.out.println("      a b c d e f g h");
    System.out.println("0  8    #   #   #   #  8");
    System.out.println("1  7  #   #   #   #    7");
    System.out.println("2  6    #   #   #   #  6");
    System.out.println("3  5  #   #   #   #    5");
    System.out.println("4  4    #   #   #   #  4");
    System.out.println("5  3  #   #   #   #    3");
    System.out.println("6  2    #   #   #   #  2");
    System.out.println("7  1  #   #   #   #    1");
    System.out.println("      a b c d e f g h");
    System.out.println();
    
    
    char columna;
    int fila;
    
    int columnaEntero;
    int filaEntero;
    
    System.out.print("Indique coordenada fila interna: ");
    filaEntero = Integer.parseInt(System.console().readLine());
    System.out.print("Indique coordenada columna interna: ");
    columnaEntero = Integer.parseInt(System.console().readLine());
    
    
    columna = (char)((int)'a'+columnaEntero);
    fila = 8-filaEntero;
    
    System.out.println("La coordenada correspondiente en el tablero es: "+columna+fila);
    
  }
}

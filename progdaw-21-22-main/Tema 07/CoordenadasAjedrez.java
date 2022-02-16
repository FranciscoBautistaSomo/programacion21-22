public class CoordenadasAjedrez {
  public static void main (String[] args) {
    System.out.println("Conversor de coordenadas ajedrez (internas a externas):");
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
    System.out.print("Indique coordenada (columna,fila internas): ");
    
    String coordenada;
    char columna;
    char fila;
    
    int columnaEntero;
    int filaEntero;
    
    coordenada=System.console().readLine();
    columna = coordenada.charAt(0);
    fila = coordenada.charAt(1);
    
    columnaEntero = (int)columna - (int)'a';
    filaEntero = 8-((int)fila-(int)'0');
    
    System.out.println("La coordenada correspondiente en la matriz es fila: "+filaEntero+", columna: "+columnaEntero);
    
  }
}

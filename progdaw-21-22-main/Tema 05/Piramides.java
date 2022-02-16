public class Piramides {
  public static void main (String[] args) {
    int h; // altura
    int asteriscos; // llevará la cuenta del nº de asteriscos a pintar
    
    System.out.print("Indique la altura de la pirámide: ");
    h = Integer.parseInt(System.console().readLine());
    
    // pirámide invertida
    System.out.println();
    
    asteriscos = 2*h-1;
    for (int i=0; i<h; i++) {
      for (int j=0; j<i; j++) {
        System.out.print(" ");
      }
      for (int j=0; j<asteriscos; j++) {
        System.out.print("*");
      }
      System.out.println();
      asteriscos = asteriscos -2;
    }
    
    
    // pirámide hacia arriba
    System.out.println();
    
    asteriscos = 1;
    for (int i=h-1; i>=0; i--) {
      for (int j=0; j<i; j++) {
        System.out.print(" ");
      }
      for (int j=0; j<asteriscos; j++) {
        System.out.print("*");
      }
      System.out.println();
      asteriscos = asteriscos +2;
    }

    // pirámide hueca hacia arriba
    System.out.println();
    
    asteriscos = 1;
    for (int i=h-1; i>=0; i--) {
      for (int j=0; j<i; j++) {
        System.out.print(" ");
      }
      for (int j=0; j<asteriscos; j++) {
        if ((j==0) ||  (j==asteriscos-1) || (i==0)) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
      asteriscos = asteriscos +2;
    }

  }
}

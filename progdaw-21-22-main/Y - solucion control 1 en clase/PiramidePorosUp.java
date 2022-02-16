public class PiramidePorosUp {
  public static void main (String[] args) {
    String caracter;
    int altura;
    
    System.out.print("Introduzca la altura de la pirámide: ");
    altura= Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el carácter de relleno: ");
    caracter= System.console().readLine();
    
    int huecos=altura-1;
    
    System.out.println();
    for (int i=0; i<altura; i++) {
      for (int j=0; j<huecos; j++) {
        System.out.print(" ");
      }
      System.out.print(caracter);
      for (int j=0; j<i; j++) {
        System.out.print(" "+caracter);
      }
      System.out.println();
      huecos--;
    }    
  }
}

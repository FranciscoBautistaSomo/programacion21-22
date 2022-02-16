public class BucleFor2 {
  public static void main (String[] args) {
    int nVeces;
    
    /* el usuario va a indicar cuántas veces quiere que itere
     */
     
    System.out.print("Indique cuántas veces quiere que repita: ");
    nVeces = Integer.parseInt(System.console().readLine());
    
    for (int i=1; i<=nVeces; i++) {
      System.out.println("Hola "+ i);
    }   
    
  }
}

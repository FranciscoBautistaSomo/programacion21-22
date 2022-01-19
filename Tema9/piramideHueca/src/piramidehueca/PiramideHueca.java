package piramidehueca;
import java.util.Scanner;

public class PiramideHueca {

  
  public static void main(String[] args) {
    //Crear piramide
    String carac ="";
    int altu = 4;
    Scanner txt = new Scanner(System.in);
    
    Piramide miPrimeraPiramide= new Piramide(9,"#");
    
    System.out.print("Ingrese la altura de su piramide: ");
    //altu = Integer.parseInt(System.console().readLine());
    altu = txt.nextInt();
    System.out.print("Ingrese el caracter de su piramide: ");
    //carac = System.console().readLine();
    carac = txt.next();
    Piramide piramideAlGusto = new Piramide(altu, carac);
    
    System.out.println();
    //Pintamos piramide.
    //System.out.print(miPrimeraPiramide.ToString());
    //System.out.println();
    //Piramide de diseño
    System.out.println("Su piramide gracias: ");
    System.out.print(piramideAlGusto.ToString());
    
    //Segunda piramide
    System.out.println();
    System.out.print("Ingrese la altura de su nueva piramide: ");
    altu = txt.nextInt();
    System.out.print("Ingrese el caracter de su nueva piramide: ");
    carac = txt.next();
    System.out.println();
    Piramide suNuevaPiramide = new Piramide(altu, carac);
    System.out.print(suNuevaPiramide.ToString());
    
    
  }
  
}

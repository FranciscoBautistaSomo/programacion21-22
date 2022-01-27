
package pruebaPiramide;
import java.util.Scanner;
//mport piramides.PintaArriba;
import piramides.*;

public class Piramides {

 
  public static void main(String[] args) {
    PiramideD p1;    
    PiramideD p2;
    Scanner txt = new Scanner(System.in);
    String nombre, orientacion, caracterEx, caracterIn;
    int altura;
    
    
    System.out.println("<------------------Dibuje su piramide en comodos pasos:----------->");
    System.out.print("¿Cómo se llama su piramide?");
    nombre = txt.nextLine();
    //p1.dameNombre(nombre);
    System.out.print("¿De que altura quiere su piramide?");
    altura = txt.nextInt();
    //p1.dameAltura(altura);
    
    System.out.println("¿Con qué caracter exterior lo quiere pintar?");
    caracterEx = txt.nextLine();
    
    System.out.println("¿Con qué caracter interior lo quiere pintar o la prefiere hueca?");
    caracterIn = txt.nextLine();
    
    System.out.print("¿Que orientación desea (Arriba, Abajo, Izquierda, Derecha)?");
    orientacion = txt.nextLine();
    System.out.print("Su piramide gracias.");
    //p1 = new PiramideD(nombre, altura);
    p2 = new PiramideD(nombre, altura, orientacion, caracterEx, caracterIn);
    //System.out.println(p1.toString());
    System.out.println();
    System.out.println(p2.toString());
    
    
    //System.out.println(p1.toString("Arriba"));
    
      
    //System.out.println(p2.toString());
  }  
    
  
}

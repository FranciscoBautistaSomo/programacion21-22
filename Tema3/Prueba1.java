import java.util.Scanner;


public class Prueba1{

  public static void main(String[] args){
  
    Scanner s = new Scanner(System.in);
    
    System.out.println("Introduzca su nombre: ");
    String nombre = s.nextLine();
    
    System.out.println("Introduzca su edad: ");
    int edad = Integer.parseInt(s.nextLine());
    
    System.out.print("Tu nombre es "+nombre+" y su edad "+edad);
  
  }



}

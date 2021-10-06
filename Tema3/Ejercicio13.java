import java.util.Scanner;

public class Ejercicio13{
  //Ejercicio mandado por el profesor por email.
  public static void main (String [] args){
  
    String texto =" ";
    Scanner t = new Scanner(System.in);
    
    System.out.println("Introduzca la primera parte: ");
    texto = t.next();
    System.out.println("Introduzca la segunda parte: ");
    texto = texto +" "+ t.next();
    System.out.println("Introduzca la tercera parte: ");
    texto = texto +" "+ t.next();
    System.out.println("Introduzca la cuarta parte: ");
    texto = texto +" "+ t.next();
    System.out.println("Introduzca la quinta parte: ");
    texto = texto +" "+ t.next();
    
    System.out.println("La frase introducida es: ");
    System.out.print(texto);
  
  
  }


}

import java.util.Scanner;

public class Prueba6{

  public static void main(String[] args){
    
    //Tema3 uso de la clase Scanner.
   
    Scanner x = new Scanner(System.in);
    
    String s;
    int a;
    float b;
    
    System.out.print("Veamos cómo captura datos Scanner: entero flotante String; ");
    a = x.nextInt();
    b = x.nextFloat();
    // para texto hasta el primer espacio separador que encuentre.
    //s = x.next();
    // para capturar todo lo que quede en el buffer incluido los espacios en blanco
    s = x.nextLine();
    //Instrucción para borrar el buffer
    //x.nextLine();
    
    System.out.println(a);
    System.out.println(b);
    System.out.println(s);
    
    
    
    System.console().readLine();
  
  }



}

import java.util.Scanner;

public class Ejercicio12{

  public static void main(String[] args){
    float nota1 = 0;
    float nota2 = 0;
    float media = 0;
    Scanner n = new Scanner(System.in);
    
    System.out.print("Introduce la nota del primer examen: ");
    nota1 = n.nextFloat();
    System.out.print("¿Qué nota quieres sacar en el trimestre? ");
    media = n.nextFloat();
    
    nota2 = (media - nota1*0.4f)/0.6f;    
  
    System.out.printf("Para tener un "+ media+ " en el trimestre necesitas sacar un %.3f en el segundo examen ",nota2);
  
  
  }
}

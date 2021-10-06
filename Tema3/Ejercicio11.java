import java.util.Scanner;
public class Ejercicio11{
  
  //Conversor de KB a MB
  
  public static void main(String[] args){
    
    int kiloB=0;
    Scanner memoria = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de KB a convertir: ");
    kiloB = memoria.nextInt();
    
    System.out.printf("%d KB equivalen a :"+kiloB/1024+" MB (en base binaria)", kiloB);
  
  
  }
}

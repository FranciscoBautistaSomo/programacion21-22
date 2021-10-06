import java.util.Scanner;
public class Ejercicio10{
  
  //Conversor de MB a KB
  
  public static void main(String[] args){
    
    int megaB=0;
    
    Scanner memoria = new Scanner(System.in);
    System.out.print("Introduzca la cantidad de MB a convertir: ");
    megaB = memoria.nextInt();
    
    System.out.printf("%d MB equivalen a :"+megaB*1024+" KB (en base binaria)", megaB);
  
  
  
  }
}

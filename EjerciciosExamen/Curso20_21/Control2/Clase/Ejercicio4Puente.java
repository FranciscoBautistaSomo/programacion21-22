import java.util.Scanner;

public class Ejercicio4Puente {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    int longitud;
    int numeroAleatorio;

    System.out.print("Introduce la longitud del puente (número mayor que 6): ");
    longitud = s.nextInt();

    s.close();

    System.out.println();

    System.out.print("  ");

    for (int i = 0; i < longitud; i++) {
      numeroAleatorio = (int) (Math.random() * 3);

      System.out.print(numeroAleatorio == 0 ? "&" : " ");

    }

    System.out.println();

    System.out.print("  ");

    for (int i = 0; i < longitud; i++) System.out.print("*");
    
  }
}
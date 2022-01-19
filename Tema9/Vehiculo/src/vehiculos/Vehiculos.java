package vehiculos;
import java.util.Scanner;

public class Vehiculos {

  public static void main(String[] args) {
    int opcion = 0;
    Scanner txt = new Scanner(System.in);
    
    System.out.println("VEHÍCULOS\n" +
                       "=========\n" +
                       "1. Anda con la bicicleta\n" +
                       "2. Haz el caballito con la bicicleta\n" +
                       "3. Anda con el coche\n" +
                       "4. Quema rueda con el coche\n" +
                       "5. Ver kilometraje de la bicicleta\n" +
                       "6. Ver kilometraje del coche\n" +
                       "7. Ver kilometraje total\n" +
                       "8. Salir\n" +
                       "Elige una opción (1-8):");
    
    opcion = txt.nextInt();
    System.out.println();
    System.out.print("Opcion elegida: "+opcion);
  }
  
}

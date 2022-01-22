package vehiculos;
import java.util.Scanner;

public class Vehiculos {

  public static void main(String[] args) {
    int opcion = 0;
    Scanner txt = new Scanner(System.in);
    
    Vehiculo miVehiculo = new Vehiculo();
    Bicicleta miBici = new Bicicleta(10);
    Coche miCoche = new Coche(120);
    do{
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
    
    switch (opcion){
    
      case 1:
          miBici.desplaza(20);
        break;
      case 2:
          miBici.caballitoBici();
          break;
      case 3:
          miCoche.desplaza(120);
          break;
      case 4:
          miCoche.derrapa();
          break;
      case 5:
          System.out.print(miBici.verKmsRecorridos());
          break;
      case 6:
          System.out.print(miCoche.verKmsRecorridos());
          break;
      case 7:
          System.out.print(miVehiculo.verKmsTotoles());
          break;
      case 8:
          System.out.print("Salir.");
        break;
      default:
          System.out.print("Opción no valida.");
        break;
    }   
    }while (opcion < 8);
  }
  
}

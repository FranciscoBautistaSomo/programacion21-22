package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

  public static void main(String[] args) {
    Zona salaPrincipal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona zonaVIP = new Zona(25);
    //int opcion = 0;
    Scanner txt = new Scanner(System.in);
    int entradas = 0;
    int zona = 0;
    int opcion;

    do {
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas.");
      System.out.println("3. Salir");
      
      opcion = txt.nextInt();

      switch (opcion) {
        case 1:
          System.out.println("Entradas Sala Principal: " + salaPrincipal.getEntradasPorVender());
          System.out.println("Entradas Sala Compra Venta: " + compraVenta.getEntradasPorVender());
          System.out.println("Entradas Sala VIP: " + zonaVIP.getEntradasPorVender());
          break;
        case 2:
          System.out.println("¿Desea entradas? ¿De que zona? (1-Sala Principal, 2-Zona Compra-Venta, 3-Zona VIP)");
          zona = txt.nextInt();
          System.out.println("¿Cuantas entradas quiere?");
          entradas = txt.nextInt();

          switch (zona) {
            case 1:
              salaPrincipal.vender(entradas);
              break;
            case 2:
              compraVenta.vender(entradas);
              break;
            case 3:
              zonaVIP.vender(entradas);
              break;
            default:
              System.out.println("Zona desconocida.");
              break;
          }
          break;

        case 3:
          System.out.println("SALIR.");
          break;
        default:
          throw new AssertionError();
      }

    } while (opcion != 3);
  }

}

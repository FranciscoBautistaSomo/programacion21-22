/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5ao;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercicio5AO {

  //Tamaño del array de objetos
  static int n = 3;

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    int opcion;
    int contador = n;
    int ultimoArti = 0;
    int cod=0;
    int stock;
    double preCompra;
    double preVenta;
    String descrip = "";
    String pregun = "";
    Scanner txt = new Scanner(System.in);

    Articulo[] articulos = new Articulo[n];

    do {
      System.out.println("\n\nG E S T I S I M A L");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Salida de mercancía");
      System.out.println("7. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = txt.nextInt();

      switch (opcion) {
        case 1:
          for (int i = 0; i < n; i++) {
            if (articulos[i] != null) {
              System.out.println(articulos[i]);
            } else {
              System.out.println("Sin articulo.");
            }
          }
          break;
        case 2:
          if (contador > 0) {
            for (int i = 0; i < n; i++) {
              if (articulos[i] == null) {
                System.out.println("***** DAR DE ALTA UN ARTICULO*****");
                System.out.print("introduzca el código:");
                cod = txt.nextInt();
                System.out.print("introduzca la descripción:");
                descrip = txt.next();
                System.out.print("introduzca el precio de compra:");
                preCompra = txt.nextDouble();
                System.out.print("introduzca el precio de venta:");
                preVenta = txt.nextDouble();
                System.out.print("introduzca el stock:");
                stock = txt.nextInt();

                articulos[i] = new Articulo(cod, descrip, preVenta, preCompra, stock);
                ultimoArti++;
                contador--;
                break;
              }
            }

          } else {
            System.out.print("Error, almacen lleno.");
          }

          break;
        case 3:
          if (contador < n) {
            System.out.println("***** DAR DE BAJA UN ARTICULO*****");
            System.out.print("introduzca el código buscado:");
            cod = txt.nextInt();
            for (int i = 0; i < articulos.length; i++) {
              if (articulos[i].verCodigo() == cod) {
                System.out.print("Quiere borrar el articulo con codigo: " + articulos[i].verCodigo() + " (Y/N)?");
                pregun = txt.next();
                if (pregun.equals("Y")) {
                  articulos[i] = null;
                  ultimoArti--;
                  contador++;
                  break;
                } else {
                  break;
                }
              }
            }
          } else {
            System.out.println("Error, almacen vacio.");
          }

          break;
        case 4:
          if (contador < n) {
            System.out.println("***** MODIFICAR UN ARTICULO*****");
            System.out.print("introduzca el código de producto buscado:");
            cod = txt.nextInt();
            for (int i = 0; i < articulos.length; i++) {
              if (articulos[i].verCodigo() == cod) {
                System.out.println("Que desea modificar:");
                System.out.println("Código - 0");
                System.out.println("Descripcion - 1");
                System.out.println("Precio de compra - 2");
                System.out.println("Precio de venta - 3");
                System.out.println("Stock - 4");
                opcion = txt.nextInt();
                switch (opcion) {
                  case 0:
                    System.out.print("Introduzca el nuevo codigo");
                    cod = txt.nextInt();
                    articulos[i].setCodigo(cod);
                    break;
                  case 1:
                    System.out.print("Introduzca la nueva descripcion");
                    descrip = txt.next();
                    articulos[i].setDescripcion(descrip);
                    break;
                  case 2:
                    System.out.print("Introduzca el nuevo precio de compra");
                    preCompra = txt.nextDouble();
                    articulos[i].setPrecioCompra(preCompra);
                    break;
                  case 3:
                    System.out.print("Introduzca el nuevo precio de venta");
                    preVenta = txt.nextDouble();
                    articulos[i].setPrecioCompra(preVenta);
                    break;
                  case 4:
                    System.out.print("Introduzca el nuevo stock");
                    stock = txt.nextInt();
                    articulos[i].setStock(stock);
                    break;
                  default:
                    System.out.println("Error, Opcion no valida.");
                    break;
                }
              } else {
                System.out.println("Código no encontrado.");
              }
            }
          }
          break;
        case 5:
          System.out.println("***** NUEVA MERCANCIA*****");
          System.out.print("introduzca el código de producto buscado:");
          cod = txt.nextInt();
          for (int i = 0; i < articulos.length; i++) {
            if (articulos[i].verCodigo() == cod) {
              System.out.println("Cantidad de mercancia nueva");
              stock = txt.nextInt();
              articulos[i].entradaMerca(stock);
              break;
            } else {
              System.out.println("Código no encontrado.");
            }
          }
          break;
        case 6:
          System.out.println("***** SALIDA MERCANCIA*****");
          System.out.print("introduzca el código de producto buscado:");
          cod = txt.nextInt();
          for (int i = 0; i < articulos.length; i++) {
            if (articulos[i].verCodigo() == cod) {
              System.out.println("Cantidad de mercancia que ha salido");
              stock = txt.nextInt();
              articulos[i].salidaMerca(stock);
              break;
            } else {
              System.out.println("Código no encontrado.");
            }
          }
          break;

        case 7:
          System.out.println("Salir");
          break;
        default:
          System.out.println("Error, Opcion no valida.");
      }
    } while (opcion != 7);
  }
}

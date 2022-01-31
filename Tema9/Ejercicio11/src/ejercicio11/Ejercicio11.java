/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

/**
 *
 * @author usuario
 */
public class Ejercicio11 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    TarjetaRegalo t1 = new TarjetaRegalo(100);
    TarjetaRegalo t2 = new TarjetaRegalo(120);
    System.out.println(t1);
    System.out.println(t2);
    t1.gastar(45.90);
    t2.gastar(5);
    t2.gastar(200);
    t1.gastar(3.55);
    System.out.println(t1);
    System.out.println(t2);
    TarjetaRegalo t3 = t1.fusionarCon(t2);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);

  }

}

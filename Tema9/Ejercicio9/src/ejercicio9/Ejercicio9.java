/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.util.List;

/**
 *
 * @author usuario
 */
public class Ejercicio9 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Terminal m1 = new Movil("678 11 22 33","rata");
    Terminal m2 = new Movil("644 74 44 69", "mono");
    Terminal m3 = new Movil("622 32 89 09", "bisonte");
    Terminal t4 = new Terminal("664 73 98 18");

    System.out.println(m1);
    System.out.println(m2);

    m1.llama(m2, 320);
    m1.llama(m3, 200);
    m2.llama(m3, 550);
    
    t4.llama(m3, 120);

    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
    System.out.println(t4);
  }
}

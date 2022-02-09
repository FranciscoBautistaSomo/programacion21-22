/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamen8ejer1;

import domino.Ficha;
import domino.Monton;

/**
 *
 * @author usuario
 */
public class EjercicioExamen8Ejer1 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Ficha f1;
    Ficha f2;
    Ficha f3;
    
    Monton m;
    
    m = new Monton();
    m.inicializaMonton();
    f1 = new Ficha(0,1);
    f2 = new Ficha(6, 2);
    
    System.out.println(f1.toString());
    f3 = f1.cambiarOrientación();
    System.out.println(f3.toString());
    System.out.println(f2.toString());
    
    /*m.aniadeFicha(f1);
    m.aniadeFicha(f2);
    m.aniadeFicha(f3);*/
    
    System.out.println(m.toString());
    
    
  }
  
}

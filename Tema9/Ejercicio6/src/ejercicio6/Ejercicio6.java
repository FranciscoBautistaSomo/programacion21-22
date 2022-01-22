/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;

/**
 *
 * @author usuario
 */
public class Ejercicio6 {

  
  public static void main(String[] args) {
    Tiempo t = new Tiempo(0,30,40);
    
    System.out.println(t.toString());
    
    Tiempo tsuma = t.suma(0, 5, 1);
    
    Tiempo tresta = t.resta(2, 30, 40);
    
    //System.out.println(tsuma.toString());
    System.out.println(tresta.toString());
  }
  
}

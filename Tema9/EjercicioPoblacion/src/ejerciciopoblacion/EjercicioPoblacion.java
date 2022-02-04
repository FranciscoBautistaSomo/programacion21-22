/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoblacion;

/**
 *
 * @author usuario
 */
public class EjercicioPoblacion {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    Poblacion p1  = new Poblacion("Malaga");
    Poblacion p2 = new Poblacion("Cordoba");
    
    p1.AnadirHabitante(new Persona());
    
    
  }
  
}

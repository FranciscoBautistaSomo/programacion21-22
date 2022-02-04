/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoblacion;

import java.time.chrono.ThaiBuddhistEra;

/**
 *
 * @author usuario
 */
public class Persona {
  
    private String nombre;
    private String DNI;

    public Persona (String nombre, String dni){
      this.nombre = nombre;
      this.DNI = dni;    
    }
    
    public String getDNi(){
    
      return  this.DNI;
    
    }

    public Persona() {
  }
    
    public String toString(){
      return"Nombre: " + this.nombre + " DNI: "+this.DNI;   
    }
    
}

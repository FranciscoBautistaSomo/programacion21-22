/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamen5ejer4;

/**
 *
 * @author usuario
 */
public abstract class Persona {
    
    private String nombre;
    private String email;
    
       
    public Persona(String n, String e){
      this.nombre = n;
      this.email = e;   
    }
    
    public String toString(){      
      return "Nombre: "+this.nombre+", "+this.email;    
    }    
   

}

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
public class Poblacion {

  private String nombrePoblacion;
  private int capacidadMax = 10;
  private int poblacionActual;
  private Persona [] habitantes;
  
  public Poblacion (String n){
    this.nombrePoblacion = n;
    habitantes = new Persona[capacidadMax];
    this.poblacionActual= 0;
  }
  
  public boolean  AnadirHabitante(Persona p){
    if (this.poblacionActual< capacidadMax) {
      this.habitantes[poblacionActual] = p;
      this.poblacionActual++;
      return true;
    }
    return false; 
  }
  
  public int Habitantes(){  
    return this.poblacionActual;  
  }
  
  public int SitiosLibres(){  
    return ( this.capacidadMax - this.poblacionActual);  
  }
  
  public Persona BuscarPersona(String DNI){
    
      for (int i = 0; i < poblacionActual; i++) {
        if (habitantes[i].getDNi().equals(DNI)) {
          return habitantes[i];
        }      
      }
      return null;      
  }
  
  public boolean  Emigrar(String DNI, Poblacion P){
        if (this.SitiosLibres()>0) {
            Persona persoAux;
            persoAux = P.BuscarPersona(DNI);
            if (persoAux!=null) {
              this.AnadirHabitante(persoAux);
              P.borrarHabitante(persoAux);
            }
        }
        return false; 
  } 
  
  public boolean borrarHabitante (Persona P){
    int i = 0;
    boolean encontrado = false;
    
    for (; i < poblacionActual; i++) {
      if (this.habitantes[i]== P) {
         encontrado = true;
         break;
      }
    }
    
    for (; i < poblacionActual-1; i++) {
        this.habitantes[i]=this.habitantes[i+1];      
    }
    
    if (encontrado) {
      this.poblacionActual--;
    }
    return encontrado;  
  }
  
  public String toString(){
    String resultado="";
            
    resultado += this.nombrePoblacion +"\n";
            
     for (int i = 0; i < 10; i++) {
      resultado += habitantes[i].toString();
    }
     return resultado;
  }
  
  
}

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
public class Articulo {
    
  private String nombre;
  private int cantidad;
  
  public Articulo (String n, int c){
    this.nombre = n;
    this.cantidad = c;  
  }
  
  public String getNombre () {
    return this.nombre;
  }
  
  public int getCantidad() {
    return this.cantidad;
  }
  
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }
  
  
  @Override
  public String toString(){
    String resultado="";
    
      resultado += "==========\n";
      resultado += "Nombre: "+this.nombre +", "+this.cantidad +"\n";      
      return resultado;  
  }
  
 
  
  
}

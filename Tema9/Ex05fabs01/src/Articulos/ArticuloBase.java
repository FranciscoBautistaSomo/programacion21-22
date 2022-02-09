/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulos;

/**
 *
 * @author Francisco Alberto Bautista Somosierra 1ºDAW
 */
public abstract class ArticuloBase {
      private String nombre;
      private int cantidad;
      
      public ArticuloBase(String n, int c){
         this.nombre = n;
         this.cantidad = c;     
      }
      
      public String dameNombre(){
        return this.nombre;     
      }
      
      protected int dameCantidad(){
        return  this.cantidad;      
      }
      
      protected void cambiarCantidad(int cantidad){
        this.cantidad = cantidad;     
      }
      
      @Override
      public String toString(){
        return this.nombre+"-> Cantidad: "+this.cantidad;
      }
      
    
}

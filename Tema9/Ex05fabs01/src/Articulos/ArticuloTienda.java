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
public class ArticuloTienda extends ArticuloBase{

    public ArticuloTienda(String nombre, int cantidad){    
      super(nombre, cantidad);    
    }
    
    public int stock(){
      return super.dameCantidad();    
    }
    
    public boolean descuenta(int n){
      
      int verCantidad = this.stock();
      
      if (verCantidad>= n) {          
          verCantidad -=n;
          return true;
      }else{
          return false;
      }
    
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tienda;
import Articulos.ArticuloTienda;
import ListaCompra.ListaCompra;
import com.sun.org.apache.xpath.internal.XPathVisitable;

/**
 *
 * @author usuario
 */
public class Tienda {

    private String nombre;
    private int numArticulos;
    private ArticuloTienda[] articulosDeTienda;
    private ListaCompra [] miListaCompra= new ListaCompra[20];
    
    
    public Tienda(String nombre, int numArticulos){
      this.nombre = nombre;
      this.numArticulos= numArticulos;
      this.articulosDeTienda = new ArticuloTienda[this.numArticulos];
    }
    
    public boolean provisionArticulo(ArticuloTienda at){      
      boolean metido = false;
      for (int i = 0; i < articulosDeTienda.length; i++) {
           if (articulosDeTienda[i] == null) {
                articulosDeTienda[i] = at;
                metido = true;
                break;
            }
           metido = false;           
        }
      return metido;
    }
    
    public boolean vender(ListaCompra miListaCompra){
       
        for (int i = 0; i < this.miListaCompra.length; i++) {            
                this.miListaCompra[i].dameArticulo();
                return true;
          }
        return false;   
        }
         
    
    
    
    public String listadoAlmacen(){
      String resultado = "";
        
        resultado += "Listado de artículos del almacén de la tienda "+this.nombre+"\n";
        for (int i = 0; i < articulosDeTienda.length; i++) {          
            resultado += this.articulosDeTienda[i]+"\n";        
        }
        
         return resultado;
    }
}

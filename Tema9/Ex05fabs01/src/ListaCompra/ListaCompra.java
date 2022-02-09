/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaCompra;

import Articulos.ArticuloLista;

/**
 *
 * @author Francisco Alberto Bautista Somosierra 1ºDAW
 */
public class ListaCompra {
    private String nombre;
    private ArticuloLista[] listaDeArticulos; 
    private int cantidad;
    private String comentario;    
    
    public ListaCompra(String nombre, int cantidad){
      this.nombre = nombre;
      this.cantidad = cantidad; 
      this.listaDeArticulos = new ArticuloLista[this.cantidad];
    }    
   
    
    public boolean aniadirArticulo(ArticuloLista al){      
      boolean metido = false;
      for (int i = 0; i < listaDeArticulos.length; i++) {
           if (listaDeArticulos[i] == null) {
                listaDeArticulos[i] = al;
                metido = true;
                break;
            }
           metido = false;           
        }
      return metido;
    }      
      
     public void escribirComentario(String comentario){
        this.comentario = comentario;        
    }
     
     
     @Override
     public String toString(){
        String resultado ="";
        
        resultado += "Lista: "+this.nombre+"\n";
        resultado += "* Articulos: \n";
          for (int i = 0; i < listaDeArticulos.length; i++) {
              resultado += listaDeArticulos[i].toString()+"\n";
          }
          resultado +="\n";
        resultado +="Comentario: "+  this.comentario;
     
        return resultado;
     
     }
     
     public int dameArticulo(){
       return this.cantidad;     
     }
     
     public ArticuloLista verArticulo(int pos){       
           if ((pos <0) || (pos>this.cantidad) || (listaDeArticulos[pos] == null) ) {
               return null;
         } else {
             return listaDeArticulos[pos];
         }    
     }
}

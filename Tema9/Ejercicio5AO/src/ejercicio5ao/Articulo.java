/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5ao;

/**
 *
 * @author usuario
 */
public class Articulo {

    private  int codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    
    public Articulo(){
      
    }
    
    public Articulo(int cod, String d, double pC, double pV, int st){
      this.codigo = cod;
      this.descripcion = d;
      this.precioCompra = pC;
      this.precioVenta = pV;
      this.stock = st;    
    }
    
    /*public void bajaArticulo(){
      this.codigo = 0;
      this.descripcion ="";
      this.precioCompra = 0;
      this.precioVenta = 0;
      this.stock= 0;      
    }*/
    
    public int verCodigo (){
      return this.codigo;
    }
    public void setCodigo (int c){
      this.codigo = c;
    }
    
    public void setDescripcion (String d){
      this.descripcion = d;
    }
    
    public void setPrecioCompra (double pC){
      this.precioCompra = pC;      
    }
    
    public void setPrecioVenta (double pV){
      this.precioVenta = pV;      
    }
    
    public void setStock (int s){
      this.stock = s;
    }
    
    public void entradaMerca(int n){    
      this.stock += n;    
    }
    
    public void salidaMerca (int n){
      if (n<= this.stock) {
        this.stock -=n;
      }      
    }
    
    public String toString(){
     String resultado ="";
      resultado += "------------------------------------------\n";
      resultado += "Articulo. \n";
      resultado += "Código: "+this.codigo+"\n";
      resultado += "Descripción: "+this.descripcion+"\n";
      resultado += "Precio de Compra: "+this.precioCompra+"\n";
      resultado += "Precio de Venta: "+this.precioVenta+"\n";
      resultado += "Stock: "+this.stock+"\n";
      resultado += "-------------------------------------------\n";
      return resultado;
    }
    
    
}

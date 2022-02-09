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
public class Empresa implements Cliente{
  
  private String CIF;
  private String nombre;
  private String telefono;
  
  public Empresa(String C, String n, String t){
    this.CIF = C;
    this.nombre = n;
    this.telefono = t; 
  }
  
  @Override
  public void compra (Vendedor v, Articulo a) {
    v.anotarVenta(a);
  }
  
  @Override
  public String toString(){
      String resultado = "";
      
      resultado += "Empresa: \n";
      resultado += "CIF: "+this.CIF+"\n";
      resultado += "nombre: "+this.nombre+"\n";
      resultado += "Telefono: "+this.telefono+"\n";
      
      return resultado;
    
    }


}

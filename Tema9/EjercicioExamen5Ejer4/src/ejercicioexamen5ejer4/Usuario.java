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
public class Usuario  extends Persona implements Cliente{
   
    private String telefono;
    
    public Usuario(String n, String e, String t){
        super(n,e);        
        this.telefono = t;   
    }
    
    @Override
    public void compra (Vendedor v, Articulo a) {
    v.anotarVenta(a);
  }
    
    /*@Override
    public String toString(){
      String resultado = "";
      
      resultado += "Usuario: \n";
      resultado += "Nombre: "+super.verNombre()+"\n";
      resultado += "Correo electronico: "+super.verEmail()+"\n";
      resultado += "Telefono: "+this.telefono+"\n";
      
      return resultado;
    
    }*/
    
}

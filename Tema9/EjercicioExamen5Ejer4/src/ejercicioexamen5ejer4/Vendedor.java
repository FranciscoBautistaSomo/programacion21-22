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
public class Vendedor extends Persona{
  
    
    private String cargo;
    private Articulo[] articulos;
    private int pos=0;
   
    
    public Vendedor(String n, String email, String carg){
        super(n,email);
        this.cargo = carg;
        this.articulos = new Articulo[100];
    }
    
    public void anotarVenta (Articulo a) {
         boolean encontrado = false;         
         for (int i = pos; i < this.articulos.length && !encontrado; i++) {
           articulos[i]=a;
           encontrado = true;
           pos++;
      }   
    }
    
    @Override
    public String toString(){
      String resultado ="";
      
      resultado += "Vendedor: \n";
      resultado += super.toString();      
      resultado += "Cargo: "+this.cargo+"\n";
      resultado += "Ventas relizadas.\n";
      for (int i = 0; i < pos; i++) {
          resultado += articulos[i].toString()+"\n";        
      }
        
      return resultado;
    }

  
}

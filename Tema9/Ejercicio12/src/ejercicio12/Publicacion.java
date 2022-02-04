/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12;

/**
 *
 * @author usuario
 */
public abstract class Publicacion {
    
    private String ISBN;
    private String titulo;
    private int anoPubli;
    
    public Publicacion(String ISBN, String titulo, int anoPubli){
      this.ISBN = ISBN;
      this.titulo = titulo;
      this.anoPubli = anoPubli;      
    }
    
    @Override
    public String toString(){
          
      return "ISBN: "+this.ISBN+" , título: "+this.titulo+", año de publicación: "+this.anoPubli;
    
    }
  
  
}

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
public class Libro extends Publicacion implements Prestable{
    
    private boolean  prestado;
    
    public Libro (String ISBN, String titulo, int anoPubli){
      super(ISBN, titulo, anoPubli);
      this.prestado = false;    
    }
    
    public void presta (Libro b){
      if (b.prestado == false) {
          b.prestado = true;
      } else {
        System.out.println("El libro está prestado.");
      }
      
    }
    
    
  
}

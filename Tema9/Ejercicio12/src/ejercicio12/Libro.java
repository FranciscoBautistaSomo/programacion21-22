
package ejercicio12;


public class Libro extends Publicacion implements Prestable{
    
    private boolean  prestado;
    
    public Libro (String ISBN, String titulo, int anoPubli, boolean prestado){
      super(ISBN, titulo, anoPubli);
      this.prestado = false;    
    }
    @Override
    public void presta (){
      if (this.prestado == false) {
          this.prestado = true;
      }     
    }
    @Override
    public void devuelve (){
      if ( this.prestado== true) {
        this.prestado = false;
      }   
    }
    @Override
    public boolean  estarPrestado(){
      if (this.prestado == true) {
         return true;
      }else{
         return false;       
      }   
    }
      
      
  
}

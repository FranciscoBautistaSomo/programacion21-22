package domino;


public class Ficha {

    private int valorIzq;
    private int valorDrch;
    
    public Ficha(int valorIzquierda, int valorDerecho){
      this.valorIzq = valorIzquierda;
      this.valorDrch = valorDerecho;    
    }
    
    public int valorIzquierda(){
      return this.valorIzq;    
    }
    
    public int valorDerecha(){
      return this.valorDrch;    
    }
    
    public Ficha cambiarOrientación(){
      Ficha f = new Ficha(this.valorDrch, this.valorIzq);
      return f;   
    }
    
    @Override
    public String toString(){
      
      return "["+(this.valorIzq==0?" ":this.valorIzq)+"|"+(this.valorDrch==0?" ":this.valorDrch)+"]";
    
    }

}

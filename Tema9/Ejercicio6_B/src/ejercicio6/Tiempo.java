
package ejercicio6;

public class Tiempo {
  
  private int segundos = 0;
  
  public Tiempo(int h, int mi, int seg){
    this.segundos = (h*3600)+(mi*60)+seg;
  }
  
  public Tiempo(int s){
    this.segundos = s;
  }
  
  public String toString(){
    
    int segundos =this.segundos;
    int  hora= segundos/3600;
    segundos -= hora*3600;
    int minutos= segundos/60;
    segundos -=minutos*60;
    if(this.segundos<0){
      return "-("+(-hora)+"h "+(-minutos)+"m "+(-segundos)+"s)";
    }else{
      return hora +"h "+minutos+"m "+segundos+"s";
    }      
  }
  
  public int getSegundos(){
    return this.segundos;    
  }
  
  public Tiempo suma (Tiempo t){
    return new Tiempo(this.segundos+ t.getSegundos());
   
  }
  
 public Tiempo resta(Tiempo t){
    return new Tiempo(this.segundos- t.getSegundos());
 }
  
}


package ejercicio6;

public class Tiempo {
  private int hora = 0;
  private int minutos = 0;
  private int segundos = 0;
  
  public Tiempo(int h, int mi, int seg){
    this.hora = h;
    this.minutos = mi;
    this.segundos = seg;
  }
  
  public String toString(){
    String hora = "";    
    return hora= this.hora+"h "+this.minutos+"m "+this.segundos+"s \n";
       
  }
  
  public Tiempo suma (int h, int mi, int seg){
    int sumaH = 0;
    int sumaMi = 0;
    int sumaSeg = 0;
    
    if(this.hora < 23){
      sumaH = this.hora +h;
    }else if(this.hora ==23){
      sumaH = 0;
    } 
    if (this.minutos+mi>=60 && this.hora==23){
      sumaH = 0;
    }
    if (this.minutos+mi>=60){
      sumaH = this.hora+1;
      sumaMi = (this.minutos+mi)-60;
    }else{
      sumaMi = (this.minutos+mi);
    }
    
    if (this.segundos+seg>=60){
      sumaMi = this.minutos+1;
      sumaSeg = (this.segundos+seg)-60;
    }else{
      sumaSeg = (this.segundos+seg);
    }
    Tiempo horaSuma = new Tiempo(sumaH,sumaMi,sumaSeg);
    return horaSuma;
  }
  
 public Tiempo resta(int h, int mi, int seg){
    int restaH =0;
    int restaMi = 0;
    int restaSeg =0;
    
    if(this.hora - h < 0){
        restaH = 24-h+1;                
    }else{
        restaH = Math.abs(this.hora-h);
    }       
    if(this.minutos-mi < 0){
      restaH = Math.abs(restaH-1);
      restaMi = 60+(this.minutos - mi);
    }else{
      restaMi = Math.abs(this.minutos - mi);
    }   
     if(this.segundos - seg < 0){
       restaMi = Math.abs(restaMi- 1);
       restaSeg = 60+(this.segundos - seg);
     }else{
       restaSeg = Math.abs(this.segundos - seg);
     }
    
    Tiempo horaResta = new Tiempo(restaH,restaMi,restaSeg);
    return horaResta;
 }
  
}

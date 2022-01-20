
package mobiliario;


public class Armario extends Mueble {  
    private int numPuertas;
  
     public Armario(String m, int p, String c, int numPuer){
       super(m,p,c);
       this.numPuertas = numPuer;
     }
     
     public String toString(){
      String resultado = "Armario\n";
      resultado += super.toString();
      resultado += "Numero de puertas "+this.numPuertas+"\n";
      return resultado;
    }
  
  
} 


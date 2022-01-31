/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio10;

/**
 *
 * @author usuario
 */
public class Ameba {
    private int peso;
    
    public Ameba(){
      this.peso = 3;      
    }
    
//    public void setPeso(int peso){
//      this.peso = peso;
//    }
    
    public void come(int comida){
      this.peso +=comida-1;   
    }
    
    
    public void come(Ameba a){
      this.peso +=a.peso-1;
      a.peso = 0;
      //a.setPeso(0);
    }
    
    @Override
    public String toString(){      
      return "Soy un ameba y peso "+this.peso+" microgramos";      
    }
}

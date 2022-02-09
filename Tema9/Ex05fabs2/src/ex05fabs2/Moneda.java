/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05fabs2;

/**
 *
 * @author Francisco Alberto Bautista Somosierra 1ºDAW
 */
public class Moneda {
  
    private String lado = "";
    private Moneda [] monedas;
  
    public Moneda(){
        int random = (int) (Math.random() * 2);
        if (random == 0) {          
          this.lado = "C";        
      }else{
          this.lado ="X";
        }     
    }    
       
    public Moneda tirar(){
      Moneda m = new Moneda();
      return m;
    }
    
    public String verLado(){
      
        return this.lado;
    }
    
    @Override
    public String toString(){
      return "["+this.lado+"]";      
    }
    
    
}

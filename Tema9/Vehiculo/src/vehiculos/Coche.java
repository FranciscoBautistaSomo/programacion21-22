/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;


public class Coche extends Vehiculo{
    private int potencia=0;
    public Coche(int pot){
      super();
      this.potencia = pot;
    }
    
    public int verPotencia(){
      return this.potencia;    
    }
       
    
    public void derrapa(){    
      System.out.println("chiiiiiciciiciii");      
    }

}

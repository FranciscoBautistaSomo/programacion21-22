/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiculos;


public class Bicicleta extends Vehiculo{
  private int peso = 0;
  public Bicicleta(int pes){
    super();
    this.peso = pes;
  }
  
  public int verPeso(){
    return this.peso;    
  }
  
  public void caballitoBici(){
   System.out.println("yijaaaaa");  
  }

}

  

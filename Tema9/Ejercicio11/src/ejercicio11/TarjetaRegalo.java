/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio11;

import java.text.DecimalFormat;

/**
 *
 * @author usuario
 */
public class TarjetaRegalo {
  private double saldo;
  private int codigo;
  //private String prueba;
  
  public TarjetaRegalo(double saldo){
    this.saldo = saldo;
    this.codigo = (int)(Math.random()*99999)+1;
    
    //Forma del libro para obtener el número aleatorio de 5 cifras.
    /*prueba ="";
    for (int i = 0; i < 5; i++) {
      prueba += (int)(Math.random()*10);
    }*/
    
  }
  
  public void gastar (double cantidad){
    if (cantidad > this.saldo) {
      System.out.println("Error, no tiene suficiente saldo.");
    }else{
      this.saldo -= cantidad;
    }  
  }
  
  public TarjetaRegalo fusionarCon (TarjetaRegalo tr){
    TarjetaRegalo tf;
    double sald = this.saldo+tr.saldo;
    this.saldo=0;
    tr.saldo=0;
    return tf = new TarjetaRegalo(sald);    
  }
  
  @Override
  public String toString(){
    DecimalFormat formatoEuros = new DecimalFormat("0.00");
    return "Tarjeta nº "+this.codigo+ " -  Saldo "+formatoEuros.format(this.saldo); 
  }
  
  
}

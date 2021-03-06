/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

import java.text.DecimalFormat;

/**
 *
 * @author usuario
 */
public class Movil extends Terminal{
  private String tarifa = "rata";
  private double consumo;
  
  /*public Movil(String nume){
    super(nume);  
  }*/
  
  
  public Movil (String nume, String tarifa){
    super(nume);
    this.tarifa = tarifa;
    this.consumo =0.0;
  }
  
  @Override
  public void llama(Terminal t, int tiempo){
    super.llama(t,tiempo);
    double minutos = (double)tiempo / 60;
    switch (this.tarifa) {
      case "rata":
        this.consumo += (0.06*minutos);        
        break;
      case "mono":
        this.consumo  += (0.12*minutos);        
        break;
      case "bisonte":
        this.consumo  += (0.3*minutos);        
        break;   
      default:
        throw new AssertionError();
    }  
  }
  
   @Override
  public String toString(){
     DecimalFormat formatoEuros = new DecimalFormat("0.00");
    String salida ="";
    salida += super.toString() +" - tarificados "+formatoEuros.format(this.consumo)+" euros";
    return salida;  
  }
}

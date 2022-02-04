/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamencartascontrol5;

/**
 *
 * @author usuario
 */
public class Carta {

  private char palo =' ';
  private char valor = ' ';
  
  /*public enum Palo {
    P, D, C,T
  }*/ 
  
  public Carta(char palo, char valor){
    this.palo = palo;
    this.valor = valor; 
  }
  
  @Override
  public String toString(){
      return "["+this.palo+","+this.valor+"]";  
  }
  
  public char dameValor(){  
    return this.valor;  
  }
  
  public char damePalo(){  
    return this.palo;  
  }  
}

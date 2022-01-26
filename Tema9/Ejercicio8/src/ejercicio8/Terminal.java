/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8;

/**
 *
 * @author usuario
 */
public class Terminal {
  private String numero ="";
  private int tiempo=0;
  
  public Terminal(String nume) {
    this.numero = nume;
  }
  
  public void llama(Terminal t, int tiempo){
    this.tiempo +=tiempo;
    t.tiempo +=tiempo;
  }
  

  @Override
  public String toString(){
    String salida ="";
    salida = "Nº "+this.numero+" - "+this.tiempo+"s de conversación";
    return salida;  
  }

}
  
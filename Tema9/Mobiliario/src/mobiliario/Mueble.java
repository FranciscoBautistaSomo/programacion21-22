/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobiliario;

/**
 *
 * @author usuario
 */
public abstract class Mueble {
  private String material;
  private int peso;
  private String color;
  
  public Mueble (String m, int p, String c){
    this.material = m;
    this.color = c;
    this.peso = p;  
  }
  
  public void pintar (String c){
    this.color = c;
  }
  
  @Override
  public String toString(){
    String resultado ="Material: "+this.material+"\n";
    resultado += "Peso: "+this.peso+"\n";
    resultado += "Color: "+this.color+"\n";
  
    return resultado;
  }

  
}

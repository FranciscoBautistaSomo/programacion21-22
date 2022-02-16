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
  private Materiales material;
  private int peso;
  private String color;
  
  public Mueble (Materiales m, int p, String c) {
    this.material = m;
    this.peso = p;
    this.color = c;
  }
  
  public void pintar (String c) {
    this.color = c;
  }
  
  public String toString() {
    String resultado = "Material: "+this.material+"\n";
    resultado += "Peso: "+this.peso+" Kg\n";
    resultado += "Color: "+this.color+"\n";
    return resultado;
  }
}

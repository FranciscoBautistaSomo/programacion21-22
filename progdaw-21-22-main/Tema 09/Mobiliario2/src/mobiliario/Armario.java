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
public class Armario extends Mueble implements Modificable{
  private int numPuertas;
  
  public Armario(String m, int p, String c, int numPue) {
    super(m,p,c);
    this.numPuertas = numPue;
  }
  
  @Override
  public String toString() {
    String resultado="ARMARIO\n";
    resultado = resultado + super.toString();
    resultado = resultado + "Número de puertas: "+this.numPuertas+"\n";
    return resultado;
  }
  
  @Override
  public void duplicar() {
    this.numPuertas *=2;
  }
}

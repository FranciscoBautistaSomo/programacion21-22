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
public class Mesa extends Mueble implements Modificable{
  private int superficie;
  private int nPatas;
  
  public Mesa (Materiales m, int p, String c, int sup) {
    super(m,p,c);
    this.superficie =sup;
    this.nPatas = 4;
  }
  
  public Mesa (Materiales m, int p, String c, int sup, int np) {
    this(m,p,c,sup);
    this.nPatas = np;
  }
  
  @Override
  public String toString() {
    String resultado="MESA\n";
    resultado = resultado + super.toString();
    resultado = resultado + "Superficie: "+this.superficie+"\n";
    resultado = resultado + "Número de patas: "+this.nPatas+"\n";
    return resultado;
  }
  @Override
  public void duplicar() {
    this.superficie *=2;
    this.nPatas *=2;
  }
  
}

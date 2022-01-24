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
public class Mesa extends Mueble {

  private int superficie;
  private int nPatas;

  public Mesa(String m, int p, String c, int sup) {
    super(m, p, c);
    this.superficie = sup;
    this.nPatas = 4;
  }

  public Mesa(String m, int p, String c, int sup, int np) {
    this(m, p, c, sup);
    this.nPatas = np;
  }

  @Override
  public String toString() {
    String resultado = "Mesa\n";
    resultado += super.toString();
    resultado += "Numero de patas " + this.nPatas + "\n";
    return resultado;
  }

}

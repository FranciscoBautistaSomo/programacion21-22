
package ejercicio6;

public class Ejercicio6 {

  
  public static void main(String[] args) {
    Tiempo t = new Tiempo(0,30,40);
    Tiempo t2 = new Tiempo(2, 30, 40);
    
    System.out.println(t.toString());
    
    //Tiempo tsuma = t.suma(0, 5, 1);
    
    Tiempo tresta = t.resta(t2);
    
    //System.out.println(tsuma.toString());
    System.out.println(tresta.toString());
  }
  
}

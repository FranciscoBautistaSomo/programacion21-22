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
public class Mobiliario {

  public static void main(String[] args) {
    //Mueble miMueble = new Mueble("madera", 10, "gris"); //Se cambia la superclase a abstract no se puede instanciar
    Mesa miMesa = new Mesa("plastico", 5, "verde", 12);
    Armario miArmario = new Armario("pvc", 100, "blanco", 3);
    Armario miArmario2 = new Armario("pvc", 100, "negro", 4);
    
    //System.out.println(miMueble);
    System.out.println(miMesa);
    System.out.println(miArmario);
    
    //System.out.println((Mueble)miArmario2);
  }
  
}

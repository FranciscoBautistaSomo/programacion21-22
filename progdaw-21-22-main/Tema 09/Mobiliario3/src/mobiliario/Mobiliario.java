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

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //Mueble miMueble = new Mueble ("madera",12,"marron");
    Mesa miMesa = new Mesa ("plastico",5,"verde",12);
    Armario miArmario = new Armario ("PVC",100,"blanco",3);
    
    Mesa [] conjunto = new Mesa[10];
    
    //System.out.println(miMueble);
    System.out.println(miMesa);
    System.out.println(miArmario);
    miArmario.pintar("verde");
    System.out.println(miArmario);
    
    for (int i=0; i<10; i++) {
      conjunto[i] = new Mesa("m",1+i,"amarillo"+i,13+i);
      //conjunto[i] = miMesa;
    }
    
    for (int i=0; i<10; i++) {
      System.out.println(conjunto[i]);
    }
    
    
    Armario objetoModificable = new Armario("PVC",100,"blanco",3);
    Mesa objetoModificable2 = new Mesa("cristal",23,"transparente", 33);
    
    objetoModificable.duplicar();
    objetoModificable2.duplicar();
    
    objetoModificable.pintar("rosa");
    
    System.out.println(objetoModificable);
    System.out.println(objetoModificable2);
      
  
  }
  
}

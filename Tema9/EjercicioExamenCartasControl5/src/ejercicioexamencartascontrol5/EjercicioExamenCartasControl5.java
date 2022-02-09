/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioexamencartascontrol5;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class EjercicioExamenCartasControl5 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      
      char palo;
      char valor;
      Scanner txt = new Scanner(System.in);
      
      //Carta [] c = new Carta[52];
      
      Baraja  b = new Baraja();
      
      Baraja mb = new Baraja();
      mb.Barajar();
      
      //mb = b.Barajar(c);
      
     
      System.out.println("Baraja nueva");
      System.out.println(b.toString());
      System.out.println("Baraja mezclada");
      System.out.println(mb.toString());
      Carta c = b.dameCarta();
      System.out.println(c.toString());
      Carta c2 = b.dameCarta();
      System.out.println(c2.toString());
      System.out.println("A la baraja le quedan "+b.tamnio()+" cartas.");
      
      System.out.println("Que carta quiere sacar?");
      int pos = txt.nextInt();
      
      Carta c3 = b.miraCarta(pos);
      System.out.println("Su carta es "+c3.toString());
      
      
  }
  
}

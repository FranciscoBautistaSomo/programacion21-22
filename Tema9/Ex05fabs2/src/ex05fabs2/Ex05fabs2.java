/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05fabs2;
import java.util.Scanner;

/**
 *
 * @author Francisco Alberto Bautista Somosierra 1ºDAW
 */
public class Ex05fabs2 {

  
  public static void main(String[] args) {
    
    int numTiradas = 0;
    Moneda [] monedas;
    Moneda []  aux;
    Scanner txt = new Scanner(System.in);    
    Moneda m = new Moneda();
    boolean iguales;
    
    System.out.print("Indique el número de monedas: ");
    numTiradas = txt.nextInt();
    System.err.println("");
    
    monedas = new Moneda[numTiradas];
    iguales = false;    
    do {
          for (int i = 0; i < numTiradas; i++) {
              monedas[i]=m.tirar();
              System.out.print(monedas[i].toString( )+" ");
          }
          aux = monedas.clone();
          System.out.println();         
         
         for (int i = 0; i < monedas.length; i++) {
            for (int j = 0; j < aux.length; j++) {
              if (monedas[i].verLado().equals(aux[j].verLado())) {
                iguales = true;                
              }else{
                iguales=false;
                break;
              }
            }
         }         
    } while (iguales==false);
    
  }
  
}

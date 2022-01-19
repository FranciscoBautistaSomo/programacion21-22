/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramidehueca;


public class Piramide {
  
  private int altura = 5;
  private String caracter= "*";
  
  
  public Piramide(int altura, String caracter){
  this.altura = altura;
  this.caracter= caracter;
  }
  
  public void cambiaCaracter(String caracter){
    this.caracter = caracter;  
  }
  
  public void cambiarAltura(int altura){
    if(altura<0){
      this.altura = 0;
    }else{
      this.altura = altura;
    }   
  }
  
  public String ToString(){
    String resultado ="";
    int  asteriscos;
    asteriscos = 1;
    for (int i = this.altura-1; i >= 0; i--)
    {
      for (int j = 0; j < i; j++)
      {
        resultado=resultado+" ";
      }
      
      for (int k = 0; k < asteriscos; k++)
      {
        if ((k==0) || (k==asteriscos-1))
        {
          resultado=resultado+this.caracter;
          
        }else if(i==0){
          resultado=resultado+this.caracter;        
        }else
        {
          resultado=resultado+" ";
        }
        
      }
      resultado=resultado+"\n";
      asteriscos = asteriscos+2;     
    }       
    
    return resultado;
    } 
  }
  






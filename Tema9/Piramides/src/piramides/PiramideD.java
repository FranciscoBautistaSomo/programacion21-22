/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramides;
        
import piramides.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class PiramideD {

  private String nombre = "";
  private int altura = 5;
  private String caracterBorde = "€";
  private String caracterInto = " ";
  private String orientacion = "Arriba";
  int asteriscos, huecosDel, huecoInt, base;

  //Constructor 1
  public PiramideD(String nombre, int altura) {
    this.nombre = nombre;
    if (altura <= 0) {
      System.out.print("Error al introducir altura, valor de altura por defecto.");
    } else {
      this.altura = altura;
    }
  }

  //Constructor 2
  public PiramideD(String nombre, int altura, String orienta) {
    this (nombre, altura);
    this.orientacion = orienta;
  }

  //Constructor 3
  public PiramideD(String nombre, int altura, String orienta, String caracter) {

    this(nombre, altura,orienta);

    this.caracterBorde = caracter;
  }

  //Constructor 4
  public PiramideD(String nombre, int altura, String orienta, String caracter, String caracterIn) {

    this(nombre, altura,orienta,caracter);

    this.caracterInto = caracterIn;
  }

  //Metodos Set
  /*public void dameNombre(String nombre){
      this.nombre = nombre;
  }*/
  
  public void dameAltura(int altura){
    this.altura = altura; 
  }
  
  public void quePinto(String caracterEx){
    this.caracterBorde =   caracterEx;  
  }
  
  public void quePintoDentro(String caracterIn){
    this.caracterInto =   caracterIn;  
  }
  
  /*public void haciaDonde(String orienta){
    this.orientacion =   orienta;  
  }*/
  
  
  @Override
  public String toString() {
    String orienta = this.orientacion;
    String resultado = "";
    //resultado = this.nombre + "\n";
    switch (orienta) {
      case "Arriba":
        System.out.println(PintaArriba.PintaArriba(resultado,this.altura,this.caracterInto,this.caracterBorde));
        System.out.println(this.nombre);
       /* asteriscos = 1;
        for (int i = this.altura - 1; i >= 0; i--) {
          for (int j = 0; j < i; j++) {
            resultado = resultado + " ";
          }

          for (int k = 0; k < asteriscos; k++) {
            if ((k == 0) || (k == asteriscos - 1)) {
              resultado = resultado + this.caracterBorde;

            } else if (i == 0) {
              resultado = resultado + this.caracterBorde;
            } else {
              resultado = resultado + caracterInto;
            }
          }
          resultado = resultado + "\n";
          asteriscos = asteriscos + 2;
        }*/
        break;
      case "Abajo":
        huecosDel = 0;
        asteriscos = this.altura;
        for (int i = 0; i < this.altura; i++) {
          for (int j = 0; j < huecosDel; j++) {
            resultado = resultado + " ";
          }

          for (int k = 0; k < asteriscos; k++) {
            if (i == 0) {
              resultado = resultado + this.caracterBorde;
            } else if ((k == 0)) {
              resultado = resultado + this.caracterBorde;

            } else {
              resultado = resultado + caracterInto;
            }
          }
          for (int k = 0; k < asteriscos - 1; k++) {
            if (i == 0) {
              resultado = resultado + this.caracterBorde;
            } else if (k == asteriscos - 2) {
              resultado = resultado + this.caracterBorde;
            } else {
              resultado = resultado + caracterInto;
            }
          }
          resultado = resultado + "\n";
          huecosDel++;
          asteriscos--;
        }
        break;
      case ("Derecha"):
        asteriscos = 0;
        base = 2 * this.altura + 1;
        for (int i = 0; i <= base; i++) {
          if (i < (base / 2)) {
            for (int j = 0; j < asteriscos; j++) {
              if ((j == 0) || (j == asteriscos - 1)) {
                resultado = resultado + this.caracterBorde;
              } else {
                resultado = resultado + this.caracterInto;
              }
            }
            asteriscos++;
          } else {
            for (int j = 0; j < asteriscos; j++) {
              if ((j == 0) || (j == asteriscos - 1)) {
                resultado = resultado + this.caracterBorde;
              } else {
                resultado = resultado + this.caracterInto;
              }
            }
            asteriscos--;
          }
          resultado = resultado + "\n";
        }
        break;
      case ("Izquierda"):        
        base = 2 * this.altura + 1;
        huecosDel = this.altura;       

        for (int i = 0; i < base; i++) {
          for (int j = 0; j < huecosDel; j++) {
                resultado = resultado + " ";
          }          

          if (i < (base / 2)) {
            for (int j = huecosDel; j < this.altura; j++) {
              if ((j == huecosDel) || (j == this.altura - 1)) {
                resultado = resultado + this.caracterBorde;
              } else {
                resultado = resultado + this.caracterInto;
              }
  
            }
            huecosDel--;
            
          } else {
            for (int j = huecosDel; j < this.altura; j++) {
                if ((j == huecosDel) || (j == this.altura - 1)) {
                resultado = resultado + this.caracterBorde;
              } else {
                resultado = resultado + this.caracterInto;
              }           
          
               //resultado = resultado + this.caracterBorde;
            }
            huecosDel++;
            
          }
          resultado = resultado + "\n";
        }
        break;
      default:
        System.err.println("Error, orientación erronea.");
    }

    return resultado;
  }

}

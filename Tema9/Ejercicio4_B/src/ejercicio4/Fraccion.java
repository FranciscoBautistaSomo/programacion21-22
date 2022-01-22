package ejercicio4;

import ejercicio4.libreriaMatematica.*;


/**
 *
 * @author usuario
 */
public class Fraccion {
  private int numerador = 1;
  private int denominador = 1;
  
  public Fraccion(){}
  
  public Fraccion(int nume, int deno){
    this.numerador = nume;
    this.denominador = deno;  
  }
  
  //INVERTIR FRACCIONES
  public void invierte(){
    int aux;
    aux=this.denominador;
    this.denominador = this.numerador;
    this.numerador = aux;
  }
  
  //Reducir fracción
  public Fraccion simplifica(){
    int nume = this.numerador;
    int deno = this.denominador;
    
    for (int i=2; i<Math.max(nume, deno); i++){
      while((nume%i==0)&&(deno%i==0)){
        nume /= i;
        deno /= i;
      }    
    }
    Fraccion simpli = new Fraccion(nume, deno);
    return  simpli;
  }
  
  
  
  //MULTIPLICAR FRACCIONES
  public Fraccion multiplica(Fraccion f1, Fraccion f2){
      int resulDeno = 1;
      int resulNume = 1;
      resulDeno = f1.denominador*f2.denominador;
      resulNume = f1.numerador*f2.numerador;
    Fraccion multi = new Fraccion(resulNume,resulDeno); 
  return multi;
  }
  
  //DIVIDIR FRACCIONES
  public Fraccion divide(Fraccion f1, Fraccion f2){
      int resulDeno = 1;
      int resulNume = 1;
      resulDeno = f1.denominador*f2.numerador;
      resulNume = f1.numerador*f2.denominador;
    Fraccion div = new Fraccion(resulNume,resulDeno); 
  return div;
  }
  
  //MOSTRAR POR CONSOLA
  public String toString(){
    String resultado= "";
      resultado += "Fraccion: \n";
      resultado += this.numerador+"/"+this.denominador+"\n";      
    return resultado;
  }
  
}

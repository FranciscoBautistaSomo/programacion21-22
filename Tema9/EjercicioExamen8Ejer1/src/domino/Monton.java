/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domino;

/**
 *
 * @author usuario
 */
public class Monton implements ConjuntoDeFichas{
  
    private int pos = 0;
    private Ficha[] fichas;
    
    public Monton(){    
      this.fichas = new Ficha[100];
    }
    
    @Override
    public boolean aniadeFicha (Ficha f){      
              
          if (pos >=0 && pos<=27) {
          fichas[pos] = f;          
          }
          pos++;
      return true;        
    }
    
    public void inicializaMonton(){
        //fichas[0]=new Ficha(0,0);
        //pos=1;
        do {        
          for (int j = 0; j <= 6; j++) {
              for (int k = j; k <= 6; k++) {
                  fichas[pos] =new Ficha(j, k);
                  pos++;
              }
          }  
        } while (pos <28);       
    }
       
    
    
    public String toString(){
      String resultado="";
      int contador = 0;
      if (contador == 10) {
        resultado = "\n";
        contador = 0;
      }
      for (int i = 0; i < pos; i++) {
        resultado += fichas[i].toString()+"  ";
        contador++;
      }
      return resultado;     
    }
}
    
  


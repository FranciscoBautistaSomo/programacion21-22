/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piramides;

/**
 *
 * @author usuario
 */
 class PintaArriba {

  public static String PintaArriba(String pintado, int altura, String caracterInto, String caracterBorde){
        
    int asteriscos = 1;
        for (int i = altura; i > 0; i--) {
          for (int j = 0; j < i; j++) {
            pintado = pintado + " ";
          }

          for (int k = 0; k < asteriscos; k++) {
            if ((k == 0) || (k == asteriscos - 1)) {
              pintado = pintado + caracterBorde;

            } else if (i == 1) {
              pintado = pintado + caracterBorde;
            } else {
              pintado = pintado + caracterInto;
            }
          }
          pintado = pintado + "\n";
          asteriscos = asteriscos + 2;
        } 
    return pintado;
  }
  
}

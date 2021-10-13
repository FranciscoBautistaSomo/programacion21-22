//Ejercicio 9 de la relación de ejercicios del Tema 4 Sentencias condicionales.
//SOLUCION DE CLASE
import java.util.*;

public class Ejercicio9_v2{
  public static void main(String[] args){
    //Ejercicio para calcular ecuaciones de segundo grado ax²+b+c =0 
      float paramA = 0.0f;
      float paramB = 0.0f;
      float paramC = 0.0f;
      float salidaXP = 0.0f;
      float salidaXN = 0.0f;
      
      System.out.println("Ejercicio para resolver ecuaciones de segundo grado: ax²+bx+c=0 ");
      System.out.print("Introduce el valor del primer parametro a: ");
      paramA = Float.parseFloat(System.console().readLine());
      System.out.print("Introduce el valor del primer parametro b: ");
      paramB = Float.parseFloat(System.console().readLine());
      System.out.print("Introduce el valor del primer parametro c: ");
      paramC = Float.parseFloat(System.console().readLine());
      
            
      if(paramA==0) {
        if (paramB==0){
          System.out.println("El problema no es una ecauación.");
        }else {
          salidaXP = -paramC/paramB;
          System.out.println("La solución es:");
          System.out.println("x1 = "+salidaXP);          
          }
        
      }else {
        /*OPCION PARA EVITAR HACER LA RAIZ CUADRADA DE UN NUMERO NEGATIVO*/
        float radicando;
        radicando = paramB * paramB-4*paramA*paramC;
        if (radicando >= 0){
          
          salidaXP=(float)(-paramB + Math.sqrt(radicando))/(2*paramA);
          salidaXN=(float)(-paramB - Math.sqrt(radicando))/(2*paramA);
          
          System.out.println("Las soluciones son: ");
          System.out.println(" x1: "+salidaXP);
          System.out.println(" x1: "+salidaXN);
          }else{
            System.out.println("Tiene soluciones imaginarias.");
          }
        
        
        
        
        
        
      }
      
      
    }

}

//Ejercicio 9 de la relación de ejercicios del Tema 4 Sentencias condicionales.
import java.util.*;

public class Ejercicio9{
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
      
      if ((paramA == 0.0f)&&(paramB == 0.0f)){
          
          System.out.println("El problema no es una ecuación");
      }   
        else if(paramA == 0.0f){
          salidaXN = -paramC/paramB;
          salidaXP = salidaXN;
                  
          System.out.println("El valor de de x positivo es :"+salidaXP);      
          System.out.println("El valor de de x negativo es :"+salidaXN);    
          
          }
      if ((paramA != 0.0f)&&(paramB != 0.0f)){
        salidaXP = (float)(paramB*(-1)+Math.sqrt(Math.pow(paramB,2)-(4*paramA*paramC)))/(2*paramA);
        salidaXN = (float)(paramB*(-1)-Math.sqrt(Math.pow(paramB,2)-(4*paramA*paramC)))/(2*paramA);
      
        System.out.println("El valor de de x positivo es :"+salidaXP);
      
        System.out.println("El valor de de x negativo es :"+salidaXN);    
      }  
      
      
    }

}

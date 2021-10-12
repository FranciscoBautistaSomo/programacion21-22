//Ejercicio 6 de la relación de ejercicios del Tema 4 Sentencias condicionales.
import java.util.*;


public class Ejercicio6{
  public static void main(String[] agrs){
    double g=9.81;
    double altura = 0.0;
    double tiempo=0.0;
    
    System.out.println("Programa para calcular el tiempo que tarda en caer un objeto desde una altura dada.");
    System.out.print("Introduzca el valor de la altura: ");
    altura = Double.parseDouble(System.console().readLine());
    
      if (altura<0.0){
          System.out.print("Valor de altura no valido.");
        }else{
          tiempo=Math.sqrt(2*altura/g);
          System.out.printf("El tiempo resultante sera %.2f.",tiempo);
          }    
  }
}

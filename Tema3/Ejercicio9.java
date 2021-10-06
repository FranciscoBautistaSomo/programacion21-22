import java.util.Scanner;

public class Ejercicio9{
  public static void main (String[] args){
    
    //Ejercicio para calcular el volumen de un cono.
    
    Scanner datos = new Scanner(System.in);
    float radio = 0.0f;
    float altura = 0.0f;
    float volumen = 0.0f;
    
    System.out.print("Introduce el radio del cono: ");
    radio = datos.nextFloat();
    
    System.out.print("Introduce la altura del cono: ");
    altura = datos.nextFloat();
    
    volumen = (3.1416f*radio*radio*altura)/3;
    
    System.out.printf("El volumen de un cono de altura %.2f y radio %.2f es: %.2f", altura, radio,volumen);
    
  
  
  }



}

public class Ejercicio5{

  public static void main(String[] args){
    
    float peseta;
      
    System.out.println("Introduzca la cantidad de pesetas a convertir:");
    peseta = Float.parseFloat(System.console().readLine());
     
    
    System.out.printf("La cantidad en euros es: %.4f euros.",(peseta*(1/166.3860)));     
  
  }

}

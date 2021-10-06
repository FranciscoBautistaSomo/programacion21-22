public class Ejercicio4{

  public static void main(String[] args){
    
    float euro;
      
    System.out.println("Introduzca la cantidad de euros a convertir:");
    euro = Float.parseFloat(System.console().readLine());
     
    
    System.out.print("La cantidad en pesetas es: "+(euro*166.3860)+" pesetas.");
    
  
  }

}

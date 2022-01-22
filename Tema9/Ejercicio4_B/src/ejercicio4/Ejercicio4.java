
package ejercicio4;

public class Ejercicio4 {
  
  public static void main(String[] args) {
    Fraccion fra1 = new Fraccion(60,99);
    Fraccion fra2 = new Fraccion(1,2);
    
    Fraccion multiF = new Fraccion();
    multiF = multiF.multiplica(fra1,fra2);
    
    Fraccion diviF = new Fraccion();
    diviF = diviF.divide(fra1, fra2);
    
    Fraccion fra3 = fra1.simplifica();
    
    System.out.println("Simplificada \n"+fra3.toString());
    
    
    //fra1.invierte();
    System.out.println("MULTIPLICACION \n"+multiF.toString());
    
    System.out.println("---DIVICION--- \n"+diviF.toString());
    
           
  }
  
}

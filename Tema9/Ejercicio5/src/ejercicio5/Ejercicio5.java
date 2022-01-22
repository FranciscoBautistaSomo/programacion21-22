
package ejercicio5;

public class Ejercicio5 {

  
  public static void main(String[] args) {
    Pizza pizza1 = new Pizza("familiar","cuatro quesos");    
    Pizza pizza2 = new Pizza("familiar","margarita");   
    pizza1.sirve();
    System.out.println(pizza1.toString());
    pizza2.sirve();
    System.out.println(pizza2.toString()); 
    Pizza pizza3 = new Pizza("mediana","funghi");
    pizza3.sirve();    
    System.out.println(pizza3.toString()); 
    System.out.println("Pedidas :"+ Pizza.getTotalPedidas());
    System.out.println("Servidas :"+ Pizza.getTotalServidas());
  }
  
}

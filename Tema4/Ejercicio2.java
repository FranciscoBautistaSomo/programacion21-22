//Ejercicio 2 de la relación del tema 4 Sentencia condicional.

public class Ejercicio2{
  public static void main(String[] args){
    
    int hora = 0;
    System.out.print("Introduzca la hora actual (sin minutos): ");
    hora = Integer.parseInt(System.console().readLine());
    
    if (hora >=6 & hora <=12) {
        System.out.print("Buenos días tenga usted."); 
           
    }else if (hora>=13 & hora<=20){
        System.out.print("Buenas tardes tenga usted.");
        }
    else{
        System.out.print("Buenas noches tenga usted.");
      }
  
  
  }
}

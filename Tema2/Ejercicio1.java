public class Ejercicio1{

  public static void main(String[] args){
    //Programa para realizar operaciones matemáticas.
    int numero1=0;
    int numero2=0;
    
    System.out.print("Introduzca el valor del operando 1: ");
    numero1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el valor del operando 2: ");
    numero2 = Integer.parseInt(System.console().readLine());
    
    System.out.println("El resultado de la suma de operando 1 más operando 2 es : "+(numero1+numero2));
    System.out.println("El resultado de la resta de operando 1 más operando 2 es : "+(numero1-numero2));
    System.out.println("El resultado de la division de operando 1 más operando 2 es : "+(numero1/(float)numero2));
    System.out.println("El resultado de la multiplicación de operando 1 más operando 2 es : "+(numero1*numero2));
  }






}

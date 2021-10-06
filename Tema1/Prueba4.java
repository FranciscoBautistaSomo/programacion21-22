public class Prueba4{
  public static void main(String[] args){
  
    int a;
    int b;
    float resultado;
    
    System.out.println("Demostración de que JAVA no saber dividir \"bien\"");
    System.out.print("Introduzca dividendo: ");
    a = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca divisor: ");
    b = Integer.parseInt(System.console().readLine());
    // Se hace casting para no perder la parte decimal de la división.
    /*resultado = (float)a/b;
    System.out.println("El resultado de la división es: "+resultado);*/
    //Otra manera de resolverlo ahorrandose la varible resultado.
    System.out.println("El resultado de la división es: "+(a/(float)b));
  }




}

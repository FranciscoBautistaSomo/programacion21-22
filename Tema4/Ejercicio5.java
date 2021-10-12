//Ejercicio 5 de la relación de ejercicios del tema 4 Sentencia condicional.
public class Ejercicio5{
  public static void main(String[] args){
    int paramA = 0;
    int paramB = 0;
    float incogX = 0;
    
    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo \"ax+b=0\".");
    System.out.print("Por favor, introduzca el valor de a: ");
    paramA = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el valor de b: ");
    paramB = Integer.parseInt(System.console().readLine());
    
      if( paramA == 0){
          System.out.printf("Esta ecuacion no tiene solución real");
        }
      else{
          incogX=((float)(paramB * (-1))/paramA);
          System.out.printf("El valor de la incognita es: %.2f",incogX);
        }
      
    
  }
}

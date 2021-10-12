//Ejercicio 7 de la relación de ejercicios del Tema4 Sentencias condicionales.
public class Ejercicio7{
  public static void main(String[]args){
   float nota1=0.0f;
   float nota2=0.0f;
   float nota3=0.0f;
   float media=0.0f;
    System.out.println("Programa para calcular la media de tres notas.");
    System.out.print("Introduce la primera nota: ");
    nota1 = Float.parseFloat(System.console().readLine());
    System.out.print("Introduce la segunda nota: ");
    nota2 = Float.parseFloat(System.console().readLine());
    System.out.print("Introduce la tercera nota: ");
    nota3 = Float.parseFloat(System.console().readLine());
    media =(nota1+nota2+nota3)/3;
    System.out.printf("La media de la nota 1 = %.2f, nota 2 = %.2f, nota 3 = %.2f es: "+ media,nota1, nota2, nota3);  
  
  }
}

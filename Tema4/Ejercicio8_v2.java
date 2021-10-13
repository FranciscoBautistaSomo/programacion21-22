//Ejercicio 8 de la relación de ejercicios del Tema 4 Sentencias condicionales
public class Ejercicio8_v2{
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
    System.out.println(" ");
    System.out.println("<------ RESULTADOS -------->");
    if ( media < 5.0){
        System.out.print("Lo siento su media es insuficiente.");
      }else if(media<6.0){
         System.out.print("Su media es de suficiente.");
        }else if(media<7.0){
            System.out.print("Su media es de bien.");
          }else if(media<=9.0){
            System.out.print("Su media es de notable.");
            } else {
                System.out.print("Enhorabuena, Su media es de sobresaliente.");
              }
  
  }
}

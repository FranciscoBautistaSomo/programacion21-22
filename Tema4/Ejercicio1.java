//Ejercicio 1 relacion tema 4 Sentencia condicional.

public class Ejercicio1{

  public static void main (String[] args){
    
    String diaSemana ="Lunes";
    
    System.out.print("Introduzca el día de la semana: ");
    diaSemana = System.console().readLine();
    
    switch (diaSemana){
      
      case "Lunes":
        System.out.printf("La asignatura a primera hora del %s es: Lenguaje de Marcas.",diaSemana);
        break;
      
      case "Martes":
        System.out.printf("La asignatura a primera hora del %s es: Entorno de Desarrollo.",diaSemana);
        break;
      
      case "Miercoles":
        System.out.printf("La asignatura a primera hora del %s es: Lenguaje de Marcas.",diaSemana);
        break;
      
      case "Jueves":
        System.out.printf("La asignatura a primera hora del %s es: Entrono de Desarrollo.", diaSemana);
        break;
        
      case "Viernes":
        System.out.printf("La asignatura a primera hora del %s es: Formación y Orientación Labora.",diaSemana);
        break;
        
      default:
        System.out.print("El día introducido no se reconoce.");
      
    }
  
  
  
  }



}

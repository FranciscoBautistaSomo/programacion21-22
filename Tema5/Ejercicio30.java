//Ejercicio 30 de la relación de ejercicios Tema 5 Bucles.

public class Ejercicio30{
  /* Realiza una programa que calcule las horas transcurridas entre dos horas de
  dos días de la semana. No se tendrán en cuenta los minutos ni los segundos.
  El día de la semana se puede pedir como un número (del 1 al 7) o como una
  cadena (de “lunes” a “domingo”). Se debe comprobar que el usuario introduce
  los datos correctamente y que el segundo día es posterior al primero.*/

  public static void main(String[] args){
    int dia1, dia2, hora1, hora2;
    int horasDif=0;
    String dia1Txt = " ", dia2Txt = " ";    
    //Entrada de datos hora 1.
    System.out.println("Introduzca la primera hora.");
    System.out.print("Dia. (1-7)");
    dia1 = Integer.parseInt(System.console().readLine());
    System.out.print("Hora. (0-24)");
    hora1 = Integer.parseInt(System.console().readLine());
    //Entrada de datos hora 2.
    System.out.println("Introduzca la segunda hora.");
    System.out.print("Dia. (1-7)");
    dia2 = Integer.parseInt(System.console().readLine());
    System.out.print("Hora. (0-24)");
    hora2 = Integer.parseInt(System.console().readLine());
    
    //Codificar dia 1.
    switch (dia1){
      case 1: dia1Txt="lunes"; break;
      case 2: dia1Txt="martes"; break;
      case 3: dia1Txt="miercoles";break;
      case 4: dia1Txt="jueves";break;
      case 5: dia1Txt="viernes";break;
      case 6: dia1Txt="sabado";break;
      case 7: dia1Txt="domingo";break;
      default: System.out.printf ("El día %d introducido no existe.",dia1);
    }
    
    //Codificar dia 2.
    switch (dia2){
      case 1: dia2Txt="lunes"; break;
      case 2: dia2Txt="martes"; break;
      case 3: dia2Txt="miercoles";break;
      case 4: dia2Txt="jueves";break;
      case 5: dia2Txt="viernes";break;
      case 6: dia2Txt="sabado";break;
      case 7: dia2Txt="domingo";break;
      default: System.out.printf ("El día %d introducido no existe.",dia2);
    }
    
    //Comprobamos que los días son sucesivos.
    while (dia1 > dia2){
      System.out.println("Error, el día de la segunda hora debe ser posterior al de la primera hora");
      System.out.print("Dia. (1-7)");
      dia2 = Integer.parseInt(System.console().readLine());      
    }
    
    //Calculo horas de diferencia      
    horasDif = ((24 - hora1)+hora2); 
    
    System.out.printf("Entre las %d:00 del %s y las %d:00 del %s hay %d hora/s",hora1,dia1Txt,hora2,dia2Txt,horasDif); 
  }
}

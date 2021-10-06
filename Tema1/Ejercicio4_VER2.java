public class Ejercicio4_VER2{

  public static void main (String[] agrs){
    System.out.println("┌───────┬────────┬───────────┬────────┬─────────┐");
    System.out.println("│ LUNES │ MARTES │ MIERCOLES │ JUEVES │ VIERNES │" );
    System.out.println("├───────┼────────┼───────────┼────────┼─────────┤");
    System.out.printf ("│%-7s│%-8s│%-11s│%-8s│%-9s│\n","LM","ED", "LM", "ED", "FOL");
    System.out.println("├───────┼────────┼───────────┼────────┼─────────┤");
    System.out.printf ("│%-7s│%-8s│%-11s│%-8s│%-9s│\n","LM","BBDD", "LM", "ED", "FOL");
    System.out.println("├───────┼────────┼───────────┼────────┼─────────┤");
    System.out.printf ("│%-7s│%-8s│%-11s│%-8s│%-9s│\n","PROG","BBDD", "PROG", "PROG", "FOL");
    System.out.println("├───────┼────────┼───────────┼────────┼─────────┤");
    System.out.printf ("│%-7s│%-8s│%-11s│%-8s│%-9s│\n","PROG","PROG", "PROG", "PROG", "SINF");
    System.out.println("├───────┼────────┼───────────┼────────┼─────────┤");
    System.out.printf ("│%-7s│%-8s│%-11s│%-8s│%-9s│\n","BBDD","PROG", "BBDD", "SINF", "SINF");
    System.out.println("├───────┼────────┼───────────┼────────┼─────────┤");
    System.out.printf ("│%-7s│%-8s│%-11s│%-8s│%-9s│\n","BBDD","SINF", "BBDD", "SINF", "SINF");
    System.out.println("└───────┴────────┴───────────┴────────┴─────────┘");
  }




}

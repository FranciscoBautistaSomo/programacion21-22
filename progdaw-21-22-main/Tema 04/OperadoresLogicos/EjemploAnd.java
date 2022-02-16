public class EjemploAnd {
  /* Este programa localiza números pares entre 10 y 20, ambos incluidos.
   * Las condiciones de búsqueda son que sea par (resto de la división entre 2 igual a 0) y que esté
   * 10 y 20
   * 
   * Utilizamos anidamiento de ifs para utilizar condiciones simples
   */
   
  public static void main (String[] args) {
    int x;
    
    System.out.print("Introduzca un entero: ");
    x = Integer.parseInt(System.console().readLine());
    
    if ((x % 2 == 0) && (x >= 10) && (x <= 20)) {
      System.out.println("Este es un número de los que buscamos, par entre 10 y 20");
    } else {
      System.out.println("Este número no me interesa");
    }
  }
}

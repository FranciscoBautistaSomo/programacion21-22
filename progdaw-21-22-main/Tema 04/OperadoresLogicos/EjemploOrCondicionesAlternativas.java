public class EjemploOrCondicionesAlternativas {
  /* Este programa localiza números pares o números mayores que 10.
   * Las condiciones de búsqueda son que sea par (resto de la división entre 2 igual a 0) o que sea
   * mayor que 10
   * 
   * Utilizamos anidamiento de ifs para utilizar condiciones simples
   */
   
  public static void main (String[] args) {
    int x;
    
    System.out.print("Introduzca un entero: ");
    x = Integer.parseInt(System.console().readLine());
    
    if (x % 2 == 0) {
      System.out.println("Este es un número de los que buscamos, par o situado entre 10 y 20");
    }
     
    if (x > 10) {
      System.out.println("Este es un número de los que buscamos, par o situado entre 10 y 20");
    }
    
  }
}

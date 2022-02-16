public class EjemploIfVariante {
  public static void main (String[] args) {
    int n;
    int resto;
    
    System.out.print("Introduzca un entero: ");
    n = Integer.parseInt(System.console().readLine());
   
    resto = n % 2;
    
    String salida = "El número introducido es";
    if (resto == 0) {
      salida = salida + " par.";
    } else {
      salida = salida + " impar.";
    }
    System.out.println(salida);
    
  }
  
}

public class EjemploIf_ver3 {
  public static void main(String[] args) {
    
    //Ejemplo if anidados.
    
    System.out.print("¿Cuál es la capital de Kiribati? ");
    String respuesta = System.console().readLine();
    
    if (respuesta.equals("Tarawa")) {
        System.out.println("¡La respuesta es correcta!");
    } else {
      if (respuesta.equals("Tarawa")) {
        System.out.println("¡La respuesta es correcta!");
      }
      else {
        System.out.println("Lo siento, la respuesta es incorrecta.");
      }
    }
  }
}


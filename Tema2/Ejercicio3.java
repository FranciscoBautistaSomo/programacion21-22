public class Ejercicio3{

  public static void main(String[] args){
    String nombre="";
    String direccion="";
    String telefono ="";
    
    System.out.println("Introduzca su nombre: ");
    nombre= System.console().readLine();
    
    System.out.println("Introduzca su dirección: ");
    direccion= System.console().readLine();
    
    System.out.println("Introduzca su telefono: ");
    telefono = System.console().readLine();
    
    System.out.printf("Usted se llama %s. \n", nombre);
    System.out.printf("Usted vive en %s. \n", direccion);
    System.out.printf("%s este es su telefono.", telefono);
    
  
  
  
  }
}

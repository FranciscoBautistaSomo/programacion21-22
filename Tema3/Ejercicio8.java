public class Ejercicio8 {
  public static void main (String[] args){
    
    int horasTrabajadas=0;
    
    
    System.out.println("Introduzca la cantidad de horas trabajadas: ");
    
    horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    System.out.println("El salario ganada esta semana es: "+horasTrabajadas*12+" €");
  }

}

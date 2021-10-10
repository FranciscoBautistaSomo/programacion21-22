//Ejercicio 4 de la relación del Tema 4 Sentencias condicionales.

public class Ejercicio4{
  public static void main(String[] args){
    
    int horasTrabajadas = 0;
    int horasExtras = 0;
    int sueldoSemanal = 0;
    
    System.out.print("Por favor, introduzca el número de horas trabajadas durante la semana: ");
    horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    if( horasTrabajadas > 40 ){
      horasExtras = horasTrabajadas - 40;
      sueldoSemanal = ((horasTrabajadas - horasExtras)*12 + (horasExtras*16));
      System.out.print("El sueldo semanal que le corresponde es de: "+sueldoSemanal);      
    } else {
      sueldoSemanal = horasTrabajadas * 12;
      System.out.print("El sueldo semanal que le corresponde es de: "+sueldoSemanal+" euros.");
      }  
  }
}

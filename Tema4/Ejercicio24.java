//Ejercicio 24 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio24 {
  /*Escribe un programa que genere la nómina (bien desglosada) de un empleado
  según las siguientes condiciones:
	* Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
  de proyecto), los días que ha estado de viaje visitando clientes durante el
  mes y su estado civil (1 - Soltero, 2 - Casado).
  * El sueldo base según el cargo es de 950, 1200 y 1600 euros según
  si se trata de un prog. junior, un prog. senior o un jefe de proyecto
  respectivamente.
  * Por cada día de viaje visitando clientes se pagan 30 euros extra en
  concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
  un 25% en caso de estar soltero y un 20% en caso de estar casado.*/
 
	public static void main (String[] args) {
    int idEmpleado=0;
    int diasViajes=0;
    int estadoCivil=0;
    double sueldoBase1= 950.0;
    double sueldoBase2= 1200.0;
    double sueldoBase3= 1600.0;
    double dietas = 0.0;
    double sueldoBruto = 0.0;
    double retIRPF= 0.25;
    double calRetIRPF = 0.0;
    double sueldoNeto = 0.0;
    String IRPF= " ";
    System.out.println("1 - Programador Junior.");
    System.out.println("2 - Programador Senior.");
    System.out.println("3 - Jefe de Proyecto.");
    System.out.println("Introduzca el cargo del empleado (1-3): ");
    idEmpleado = Integer.parseInt(System.console().readLine());
    System.out.println("¿Cuántos días ha estado de viaje visitando clientes? ");
    diasViajes = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca su estado civil (1-Soltero, 2-Casado): \n");
    estadoCivil = Integer.parseInt(System.console().readLine());
    System.out.println("-------------------------------------");
    
    switch(idEmpleado) {
      case 1:
        System.out.printf("| Sueldo base: %20.2f |\n",sueldoBase1);
        dietas = diasViajes* 30.0;
        System.out.printf("| Dietas (%d viajes) %15.2f |\n", diasViajes , dietas);
        System.out.println("-------------------------------------");
        
        sueldoBruto = sueldoBase1+dietas;
        
        if(estadoCivil == 1){
            calRetIRPF = sueldoBruto*retIRPF;
            sueldoNeto = sueldoBruto-calRetIRPF;
            retIRPF = retIRPF*100;
            IRPF = retIRPF +"%";
          }else if(estadoCivil == 2){
            retIRPF = 0.20;
            calRetIRPF = sueldoBruto*retIRPF;
            sueldoNeto = sueldoBruto-calRetIRPF;
            retIRPF = retIRPF*100;
            IRPF = retIRPF +"%";                        
            }else{
              System.out.print("Error al introducir el estado civil.");
              break;
              }   
      break;
      case 2:
        System.out.printf("| Sueldo base: %20.2f |\n",sueldoBase2);
        dietas = diasViajes* 30.0;
        System.out.printf("| Dietas (%d viajes) %15.2f |\n", diasViajes , dietas);
        System.out.println("-------------------------------------");
        
        sueldoBruto = sueldoBase2+dietas;
        
        if(estadoCivil == 1){
            calRetIRPF = sueldoBruto*retIRPF;
            sueldoNeto = sueldoBruto-calRetIRPF;
            retIRPF = retIRPF*100;
            IRPF = retIRPF +"%";
          }else if(estadoCivil == 2){
            retIRPF = 0.20;
            calRetIRPF = sueldoBruto*retIRPF;
            sueldoNeto = sueldoBruto-calRetIRPF;
            retIRPF = retIRPF*100;
            IRPF = retIRPF +"%";                        
            }else{
              System.out.print("Error al introducir el estado civil.");
              break;
              }   
      break;
      case 3:
        System.out.printf("| Sueldo base: %20.2f |\n",sueldoBase3);
        dietas = diasViajes* 30.0;
        System.out.printf("| Dietas (%d viajes) %15.2f |\n", diasViajes , dietas);
        System.out.println("-------------------------------------");
        
        sueldoBruto = sueldoBase3+dietas;
        
        if(estadoCivil == 1){
            calRetIRPF = sueldoBruto*retIRPF;
            sueldoNeto = sueldoBruto-calRetIRPF;
            retIRPF = retIRPF*100;
            IRPF = retIRPF +"%";
          }else if(estadoCivil == 2){
            retIRPF = 0.20;
            calRetIRPF = sueldoBruto*retIRPF;
            sueldoNeto = sueldoBruto-calRetIRPF;
            retIRPF = retIRPF*100;
            IRPF = retIRPF +"%";                        
            }else{
              System.out.print("Error al introducir el estado civil.");
              break;
              }   
      break;
      
      default:
        System.out.print("Error, personaje no encontrdo");
      
      }
      System.out.printf("| Sueldo bruto: %19.2f |\n",sueldoBruto);
      System.out.printf("| Retención IRPF (%s) %10.2f |\n",IRPF, calRetIRPF);
      System.out.println("-------------------------------------");
      System.out.printf("| Sueldo neto: %20.2f |\n",sueldoNeto);
      System.out.println("-------------------------------------");
      
      
    
    
    
		
	}
}


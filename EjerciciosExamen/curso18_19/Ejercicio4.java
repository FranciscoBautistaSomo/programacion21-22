//Ejercicio 4  control 1 programacion 18/19
import java.util.Scanner;


public class Ejercicio4 {
	
	public static void main (String[] args) {
		
    double dineroInicio, rentaMen, deposito;
    int meses =0;
    Scanner txt = new Scanner(System.in);
    
    
    System.out.print("Introduzca la cantidad de dinero que aporta: ");
    dineroInicio = txt.nextDouble();
    System.out.print("Introduzca la rentabilidad mensual a obtener (%): ");
    rentaMen = txt.nextDouble();
    System.out.print("Introduzca la cantida final a obtener: ");
    deposito = txt.nextDouble();
    double aux = deposito;
    
    
    while (dineroInicio < deposito)
    {      
       
        dineroInicio *= 1+(rentaMen/100);
        System.out.printf("Ahorros: %.2f\n",dineroInicio);
        meses++; 
    }
    
    System.out.printf("El %.2f deseado lo obtendra en %d meses. ",deposito, meses);
	}
}


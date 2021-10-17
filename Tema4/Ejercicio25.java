//Ejercicio 25 de la relación de ejercicios Tema 4 Sentencias condicionales.


public class Ejercicio25{
  /*La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
  máxima calidad y nos ha pedido hacer un configurador que calcule el precio
  según el alto y el ancho. El precio base de una bandera es de un céntimo de
  euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
  se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
  son 3.25 €. El IVA ya está incluido en todas las tarifas.*/
	
	public static void main (String[] args) {
    int alto=0;
    int ancho=0;
    int superficie = 0;
    double precioBaseBandera=0.0;
    String bordado = "n";
    double gastosEnvios = 3.25;
    double total = 0.00;
    
    //ENTRADA DE DATOS
    System.out.print("Introduzca la altura de la bandera en cm: ");
    alto = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca la anchura de la bandera en cm: ");
    ancho = Integer.parseInt(System.console().readLine());
    System.out.print("¿Quiere escudo bordado?(s/n)");
    bordado = System.console().readLine();
    //CALCULOS
    superficie = ancho*alto;
    precioBaseBandera = superficie * 0.01;
    
    if (bordado.equals("s")){
        total=precioBaseBandera+2.50+3.25;        
      
      }else{
        total=precioBaseBandera+3.25;
      }
        
    //PRESENTACION  
    System.out.println("Gracias. Aquí tiene el desgloce de su compra. ");
    System.out.printf("Bandera de   %d cm²: %.2f €\n",superficie,precioBaseBandera);
    if (bordado.equals("s")){
        System.out.println("Con escudo            2.50 €");        
      
      }else{
        System.out.println("Sin escudo            0.00 €"); 
        }
    System.out.println("Gastos de envios:     3.25 €");
    System.out.printf("Total:  %18.2f €\n",total);
    
    
    
		
	}
}


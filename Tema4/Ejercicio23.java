//Ejercicio 23 de la relación de ejercicios Tema 4 Sentencias condicionales.

public class Ejercicio23 {
	/*programa que calcule el precio final de un producto según su
    base imponible (precio antes de impuestos), el tipo de IVA aplicado (general,
    reducido o superreducido) y el código promocional. Los tipos de IVA general,
    reducido y superreducido son del 21%, 10% y 4% respectivamente. Los códigos
    promocionales pueden ser nopro, mitad, meno5 o 5porc que significan
    respectivamente que no se aplica promoción, el precio se reduce a la mitad,
    se descuentan 5 euros o se descuenta el 5%. El ejercicio se da por bueno si se
    muestran los valores correctos, aunque los números no estén tabulados.*/
	public static void main (String[] args) {
    
      float baseImponible = 0.0f;
      String ivaTipo = " ";
      float ivaCalc = 0.0f;
      float precioIva = 0.0f;
      String codPromo = " ";
      float total = 0.0f;
      
      System.out.print("Introduzca la Base Imponible: ");
      baseImponible = Float.parseFloat(System.console().readLine());
      
      System.out.print("Introduzca el IVA a aplicar(general - reducido - superreducido): ");
      ivaTipo = System.console().readLine();
      
      System.out.print("Introduzca el código promocional a aplicar(nopro - mitad - meno5 - 5porc): ");
      codPromo = System.console().readLine();
      
      switch (ivaTipo){
        case "general":
          ivaCalc = (float)baseImponible * 0.21f;
          precioIva = (float)baseImponible * 1.21f;
          System.out.printf("Base imponible:  %6.2f\n", baseImponible);
          System.out.println("IVA (21%):          "+ivaCalc);
          System.out.printf("Precio con IVA   %6.2f\n",precioIva);
          
          break;
        case "reducido":
          ivaCalc = (float)baseImponible * 0.10f;
          precioIva = (float)baseImponible * 1.10f;
          System.out.printf("Base imponible:  %6.2f\n", baseImponible);
          System.out.println("IVA (10%):          "+ivaCalc);
          System.out.printf("Precio con IVA   %6.2f\n",precioIva);
          break;
        case "superreducido":
          ivaCalc = (float)baseImponible * 0.04f;
          precioIva = (float)baseImponible * 1.04f;
          System.out.printf("Base imponible:  %6.2f\n", baseImponible);
          System.out.println("IVA (4%):          "+ivaCalc);
          System.out.printf("Precio con IVA   %6.2f\n",precioIva);
          break;    
        default:
          System.out.print("Error al introducir el IVA a aplicar introduzca (general - reducido - superreducido)");        
        }
        
        switch(codPromo){
          case "nopro":
            System.out.println("Cod. promo. ("+codPromo+"):"+precioIva);
            System.out.printf("TOTAL:                %6.2f",precioIva);
            break;
          case "mitad":
            precioIva = precioIva*0.50f;
            System.out.println("Cod. promo. ("+codPromo+"):"+precioIva);
            System.out.printf("TOTAL:                %6.2f",precioIva);
            break;
          case "meno5":
            precioIva = precioIva-5.0f;
            System.out.println("Cod. promo. ("+codPromo+"):"+precioIva);
            System.out.printf("TOTAL:                  %6.2f",precioIva);
            break;
          case "5porc":
            precioIva = precioIva-precioIva*0.05f;
            System.out.printf("Cod. promo. ("+codPromo+"): %6.2f \n",precioIva);
            System.out.printf("TOTAL:                       %6.2f",precioIva);
            break;    
          
          
          } 
            
    
    
		
	}
}


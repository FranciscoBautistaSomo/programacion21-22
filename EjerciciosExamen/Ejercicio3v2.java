public class Ejercicio3v2 {
  public static void main (String[] args) {
    float total=0;
    
    float importeUnidad;
    int cantidad;
    int tipoIVA;
    float subtotal4=0;
    float subtotal10=0;
    float subtotal21=0;
    String articulo;
    
    System.out.println("FACTURA TIENDA");
    System.out.println("==============");
    
    do {
      System.out.print("Introduzca nombre del artículo ('fin' para salir): ");
      articulo=System.console().readLine();
      
      if (!articulo.equals("fin")) {
        System.out.print("Precio por unidad para "+articulo+" (IVA incluido): ");
        importeUnidad = Float.parseFloat(System.console().readLine());
        System.out.print("Cantidad de unidades de "+articulo+": ");
        cantidad = Integer.parseInt(System.console().readLine());
        System.out.print("Tipo de IVA aplicado a "+articulo+" (4,10,21): ");
        tipoIVA = Integer.parseInt(System.console().readLine());
        switch(tipoIVA) {
          case 4:
            subtotal4 = subtotal4 + cantidad*importeUnidad;
            break;
          case 10:
            subtotal10 = subtotal10 + cantidad*importeUnidad;
            break;
          case 21:
            subtotal21 = subtotal21 + cantidad*importeUnidad;
            break;
          default:
        }
      }
    } while (!articulo.equals("fin"));
    total = subtotal4 + subtotal10 + subtotal21;
    
    System.out.println();
    System.out.printf("TOTAL: %35.2f\n",total);
    System.out.printf("------------------------------------------\n");
    System.out.printf("Base imponible  4%%: %10.2f IVA: %6.2f\n",subtotal4/1.04, subtotal4-subtotal4/1.04);
    System.out.printf("Base imponible 10%%: %10.2f IVA: %6.2f\n",subtotal10/1.10, subtotal10-subtotal10/1.10);
    System.out.printf("Base imponible 21%%: %10.2f IVA: %6.2f\n",subtotal21/1.21, subtotal21-subtotal21/1.21);
    
  }
}

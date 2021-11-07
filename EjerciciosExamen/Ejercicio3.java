//Ejercicio 3 control 1 programacion 20/21

public class Ejercicio3 {
	
	public static void main (String[] args) {
    String nombreArticulo;
    int cantidad;
    double precioUni;
    int tipoIva;
    int color=31;
    double total=0.0;
    double total4 = 0.0;
    double total10 = 0.0;
    double total21 = 0.0;
    
    do
    {
      System.out.print("Introduzca nombre del Articulo ('fin' para salir): \033["+color+"m");
      nombreArticulo = System.console().readLine();
      
      if (nombreArticulo.equals("fin"))
      {
        System.out.print("Salir");
      }else{
          System.out.print("\033[36m Precio por unidad para \033["+color+"m "+nombreArticulo+"\033[36m (IVA incluido): ");
          precioUni = Double.parseDouble(System.console().readLine());
        
        }
      
      
      
      
    } while (!nombreArticulo.equals("fin"));
    
    
    
		
	}
}


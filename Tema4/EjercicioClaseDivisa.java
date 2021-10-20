//EJERCICIO DE CLASE DIVISAS
public class EjercicioClaseDivisa {
	
	public static void main (String[] args) {
    
    String divisa=" ";
    double cantidad=0.0;
    double euro =0.0;
    final double converDolarEuro=1.165;
    final double converLibraEuro=0.843;
    final double converYenEuro=133.001;
    final double converYuanEuro=7.453;  
    
    
    //Entrada de datos.
    System.out.print("¿Qué divisa quiere cambiar?(euro, dolar, libra, yen, yuan)");
    divisa = System.console().readLine();
    
    System.out.printf("¿Qué cantidad de %s quiere convertir? \n",divisa);
    cantidad = Double.parseDouble(System.console().readLine());
    //Se reutiliza la variable euro.
    euro = cantidad;    
    //Se hace la conversión a euro.    
    switch (divisa){
      case("euro"):
        euro = euro;               
        break;      
      case("dolar"):
        euro /= converDolarEuro;               
        break;
      case("libra"):
        euro /= converLibraEuro;               
        break;
      case("yen"):
        euro /= converYenEuro;               
        break;
      case("yuan"):
        euro /= converYuanEuro;               
        break;      
      
      default:
        System.out.println("Divisa no reconocida");       
      
      }
      //MOSTRAR RESULTADOS  
      System.out.printf("La cantidad de %.3f %s introducida son: %.3f euros\n",cantidad, divisa, euro);
      System.out.printf("La cantidad de %.3f %s introducida son: %.3f dolares\n",cantidad, divisa, euro*converDolarEuro);
      System.out.printf("La cantidad de %.3f %s introducida son: %.3f libras\n",cantidad,divisa, euro*converLibraEuro); 
      System.out.printf("La cantidad de %.3f %s introducida son: %.3f yenes\n",cantidad,divisa, euro*converYenEuro); 
      System.out.printf("La cantidad de %.3f %s introducida son: %.3f yuanes\n",cantidad,divisa, euro*converYuanEuro);
		
	}
}


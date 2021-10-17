//Ejercicio 26 de la relación de ejercicios Tema 4 Sentencias condicionales.

public class Ejercicio26 {
  /*Realiza un programa que calcule el precio de unas entradas de cine en función
  del número de personas y del día de la semana. El precio base de una entrada
  son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
  jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
  Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
  grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
  que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
  1 individual que son 41 euros (33 + 8).*/
	
	public static void main (String[] args) {
    int numeroEntradas = 0;
    int numParejas = 0;
    double precioEntrada = 0.0;
    double precioEntradaParejas = 0.0;
    String diaSemana = " ";
    int codDia = 0;
    boolean parejas = false;
    boolean impares = false;
    String cineCampa = "n";
    double total=0.00;
    double descuento = 0.00;
    double aPagar = 0.00;
    
    System.out.println("Venta de entradas CineCampa");
    System.out.print("¿Cuantas entradas quiere?");
    numeroEntradas=Integer.parseInt(System.console().readLine());
    
    //Cálculo parejas.     
      if ((numeroEntradas % 2) == 0){
              parejas = true;
              numParejas = numeroEntradas/2;
      }else{
              impares = true;
              parejas = false;
              numParejas = (numeroEntradas-1)/2;
              numeroEntradas = 1;
           }              
      
    System.out.print("¿Que día de la semana es?");
    diaSemana=System.console().readLine();
    
     //Codificación día de la semana. 
     if (diaSemana.equals("miercoles")){
          codDia = 3;
          }else if(diaSemana.equals("jueves")){
              codDia =4;
            }else{
              codDia =1;
              }
      //System.out.println(codDia);
              
    System.out.print("¿Tiene tarjeta CineCampa? (s/n)");
    cineCampa=System.console().readLine();
    //Aplicar descuento.
    if (cineCampa.equals("s")){descuento = 0.10;}
    
    System.out.println("Aqui tiene sus entradas. Gracias por su compra.");
        
    //Resto de días.
    if(codDia == 1){
      precioEntrada = 8.00;
      total = precioEntrada * numeroEntradas;
      System.out.printf("Entradas individuales %17d\n",numeroEntradas);
      System.out.printf("Precio por entrada individual: %11.2f €\n",precioEntrada);
      System.out.printf("Total: %35.2f €\n",total);
      descuento = total*descuento;
      System.out.printf("Descuento: %31.2f €\n",descuento);
      aPagar = total-descuento;
      System.out.printf("A pagar: %33.2f €\n",aPagar);
      //Miercoles día del espectador.          
      }else if (codDia == 3) {
        precioEntrada = 5.00;
        total = precioEntrada * numeroEntradas;
        System.out.printf("Entradas individuales %17d\n",numeroEntradas);        
        System.out.printf("Precio por entrada individual: %11.2f €\n",precioEntrada);
        System.out.printf("Total: %35.2f €\n",total);
        descuento = total*descuento;
        System.out.printf("Descuento: %31.2f €\n",descuento);
        aPagar = total-descuento;
        System.out.printf("A pagar: %33.2f €\n",aPagar);
        //Jueves día de las parejas.         
        }else if (codDia == 4) {
            if(parejas){
                precioEntradaParejas = 11.00;
                total = precioEntradaParejas*numParejas;
                System.out.printf("Entrada de parejas %20d \n",numParejas);
                System.out.printf("Precio por entrada de pareja %13.2f €\n",precioEntradaParejas);
                System.out.printf("Total: %35.2f €\n",total);
                descuento = total*descuento;
                System.out.printf("Descuento: %31.2f €\n",descuento);
                aPagar = total-descuento;
                System.out.printf("A pagar: %33.2f €\n",aPagar);              
              }else if (impares==true){
                precioEntrada = 8.00;
                precioEntradaParejas = 11.00;
                total = precioEntradaParejas*numParejas+precioEntrada;
                System.out.printf("Entrada de parejas %20d \n",numParejas);
                System.out.printf("Precio por entrada de pareja %13.2f €\n",precioEntradaParejas);
                System.out.printf("Entradas individuales %17d\n",numeroEntradas);
                System.out.printf("Precio por entrada individual: %11.2f €\n",precioEntrada);
                System.out.printf("Total: %35.2f €\n",total);
                descuento = total*descuento;
                System.out.printf("Descuento: %31.2f €\n",descuento);
                aPagar = total-descuento;
                System.out.printf("A pagar: %33.2f €\n",aPagar); 
                
                }          
          }
	}
}


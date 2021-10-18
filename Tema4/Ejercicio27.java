//Ejercicio 27 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio27 {
  /*Una pastelería nos ha pedido realizar un programa que haga presupuestos de
  tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
  manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
  16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
  además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
  segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
  nombre; la nata suma 2.50 y la escritura del nombre 2.75.*/
  
  public static void main(String[] args){
    int saborTarta;
    String opNata = " ";
    String opNombre = " ";
    String tipoChocolate = " ";
    double precioTarta =0.0;
    double nata = 2.50;
    double nombre =2.75;
    double total = 0.00;
    
    System.out.print("¿De qué sabor quiere la tarta? (1=manzana, 2=fresa, 3=chocolate):" );
    saborTarta = Integer.parseInt(System.console().readLine());
    
    switch(saborTarta){
      case 1:
        //Tarta de manzana.
        System.out.println("Ha elegido usted una tarta de manzana.");
        precioTarta = 18.00;
        
        System.out.print("¿Quiere nata? (si/no)");
        opNata = System.console().readLine();
        if (opNata.equals("si")){
          System.out.printf("Tarta de manzana: %.2f\n",precioTarta);
          System.out.printf("Con nata: %.2f €\n",nata);
          total = precioTarta+nata;
          }else{
            System.out.println("Sin nata");
            total=precioTarta;
            }
            
        System.out.print("¿Quiere ponerle un nombre? (si/no)\n");
        opNombre = System.console().readLine();
        if (opNombre.equals("si")){
          System.out.printf("Con nombre: %.2f €\n",nombre);
          total = total+nombre;
          }else{
            System.out.println("Sin nombre.");
            total = total;
            }
             
        System.out.printf("Total: %.2f €\n",total);
       break;
      case 2:
        //Tarta de fresa.
        System.out.println("Ha elegido usted una tarta de fresa.");
        precioTarta = 16.00;
        System.out.printf("Tarta de fresa: %.2f \n",precioTarta);
        System.out.print("¿Quiere nata? (si/no)\n");
        opNata = System.console().readLine();
        if (opNata.equals("si")){
          System.out.printf("Con nata: %.2f €\n",nata);
          total = precioTarta+nata;
          }else{
            System.out.println("Sin nata");
            total=precioTarta;
            }
            
        System.out.print("¿Quiere ponerle un nombre? (si/no)");
        opNombre = System.console().readLine();
        if (opNombre.equals("si")){
          System.out.printf("Con nombre: %.2f € \n",nombre);
          total = total+nombre;
          }else{
            System.out.println("Sin nombre.");
            total = total;
            }
             
        System.out.printf("Total: %.2f € \n",total);
        break;
      case 3:
        //Tarta de chocolate.
        System.out.println("Ha elegido usted una tarta de chocolate.");
        System.out.print("¿Que tipo de chocolate quiere?(negro/blanco)");
        tipoChocolate = System.console().readLine();
        
        if(tipoChocolate.equals("negro")){
          precioTarta = 14.00;
          
          }else if(tipoChocolate.equals("blanco")){
            precioTarta = 15.00;
            }else {
              System.out.print("Opción no valida");
              }
        
        System.out.printf("Tarta de chocolate %s: %.2f \n",tipoChocolate,precioTarta);
        System.out.print("¿Quiere nata? (si/no)\n");
        opNata = System.console().readLine();
        if (opNata.equals("si")){
          System.out.printf("Con nata: %.2f €\n",nata);
          total = precioTarta+nata;
          }else{
            System.out.println("Sin nata");
            total=precioTarta;
            }
            
        System.out.print("¿Quiere ponerle un nombre? (si/no)");
        opNombre = System.console().readLine();
        if (opNombre.equals("si")){
          System.out.printf("Con nombre: %.2f € \n",nombre);
          total = total+nombre;
          }else{
            System.out.println("Sin nombre.");
            total = total;
            }
             
        System.out.printf("Total: %.2f € \n",total);
        break;
      default:
          System.out.print("La opción que ha elegido no existe.");
      }    
    
  
  
  
  }
}

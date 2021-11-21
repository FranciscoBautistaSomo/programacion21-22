//Ejercicio 15 de la relación de ejercicios Tema 7 Array.

public class Ejercicio15 {
	
	public static void main (String[] args) {
		
    int mesas = 10;
    int mesa [] = new int[mesas];
    int comer;
    int total =0;
    boolean acomodado;
    
    //Relleno mesas.
    for (int i = 0; i <10 ; i++)
    {
      mesa[i] = (int)(Math.random() * 5);
    }
        
    //pinto mesas    
    System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
    System.out.print("│Mesa nº  │");
    for (int i = 0; i <10 ; i++)
    {
      System.out.printf(" %3d│",i+1);
    }
    System.out.println();
    System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
    System.out.print("│Ocupacion│");
    for (int i = 0; i <10 ; i++)
    {
      System.out.printf(" %3d│",mesa[i]);
    }
    System.out.println();
    System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
       
        
    do
    {
      System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
      comer= Integer.parseInt(System.console().readLine());
      
      while (comer>4)
      {
        System.out.print("Lo siento, no admitimos grupos mayore de 4, haga grupos de 4 personas como máximo e intente de nuevo");
        System.out.print("¿Cuántos son? (Introduzca -1 para salir del programa): ");
        comer= Integer.parseInt(System.console().readLine());
      }   
        
    
      if(comer <0){
        System.out.print("Gracias. Hasta pronto. ");
        break;
      }else
      { 
        acomodado = false;       
        int posible = 4-comer;
        for (int i = 0; i <10 ; i++)
        {
          if (!acomodado)
          {
            if ((posible > 0))
            {
              if (mesa[i] == posible)
              {
                mesa[i] += comer;
                System.out.printf("Tendrán que compartir mesa. Por favor, siéntense en la mesa número %d.",i+1);
                acomodado = true;
              }
            }else if ((mesa[i] == posible))
            {
              mesa[i] = comer;
              System.out.printf("Por favor, siéntense en la mesa número %d.",i+1);
              acomodado = true;             
            }
          }         
        }
        //pinto mesas actualizadas
          System.out.println();
          System.out.println("┌─────────┬────┬────┬────┬────┬────┬────┬────┬────┬────┬────┐");
          System.out.print("│Mesa nº  │");
          for (int j = 0; j <10 ; j++)
          {
            System.out.printf(" %3d│",j+1);
          }
          System.out.println();
          System.out.println("├─────────┼────┼────┼────┼────┼────┼────┼────┼────┼────┼────┤");
          System.out.print("│Ocupacion│");
          for (int j = 0; j <10 ; j++)
          {
            System.out.printf(" %3d│",mesa[j]);
          }
          System.out.println();
          System.out.println("└─────────┴────┴────┴────┴────┴────┴────┴────┴────┴────┴────┘");
                    
          //Comprobar restaurante completo
          for (int i = 0; i <10 ; i++)
          {
            if (mesa[i] == 4)
            {
              total++;              
            }            
          }
          //System.out.print("Total: "+total);
          if (total==10)
          {
            System.out.print("Lo siento, restaurante completo.");
            break;            
          }
          
          //System.out.print("Total: "+total);
          total=0; 
      }
    } while (total<10);    
 	}
}


//Ejercicio 18 de la relación de ejercicios Tema 6 Número Aleatorio.


public class Ejercicio18 {
	
	public static void main (String[] args) {
		
    int d1, d2, d3 = 0;
    int c1, c2, c3;
    
      do
      {
        d1 = (int)(Math.random()*3);
        d2 = (int)(Math.random()*3);
        d3 = (int)(Math.random()*3);
      } while ((d1==d2)||(d1==d3)||(d2==d3));
      
      do
      {
        c1 = (int)(Math.random()*6);
        c2 = (int)(Math.random()*6);
        c3 = (int)(Math.random()*6);
      } while ((c1==c2)||(c1==c3)||(c2==c3));
      
      
      switch (d1)
      {
        case 0:
          System.out.print("Dormitorio 1: ");
          break;
        case 1:
          System.out.print("Dormitorio 2: ");
          break;
        case 2:
          System.out.print("Dormitorio 3: ");
          break;    
        default:          
      }
      
      switch (c1)
      {
        case 0:
          System.out.print(" rojo.");
          System.out.println();
          break;
        case 1:
          System.out.print(" azul.");
          System.out.println();
          break;
        case 2:
          System.out.print(" verde.");
          System.out.println();
          break;
        case 3:
          System.out.print(" amarillo.");
          System.out.println();
          break;
        case 4:
          System.out.print(" violeta.");
          System.out.println();
          break;
        case 5:
          System.out.print(" naranja.");
          System.out.println();
          break;          
        default:
      }
      
      switch (d2)
      {
        case 0:
          System.out.print("Dormitorio 1: ");
          break;
        case 1:
          System.out.print("Dormitorio 2: ");
          break;
        case 2:
          System.out.print("Dormitorio 3: ");
          break;    
        default:          
      }
      
      switch (c2)
      {
        case 0:
          System.out.print(" rojo.");
          System.out.println();
          break;
        case 1:
          System.out.print(" azul.");
          System.out.println();
          break;
        case 2:
          System.out.print(" verde.");
          System.out.println();
          break;
        case 3:
          System.out.print(" amarillo.");
          System.out.println();
          break;
        case 4:
          System.out.print(" violeta.");
          System.out.println();
          break;
        case 5:
          System.out.print(" naranja.");
          System.out.println();
          break;          
        default:
      }
      
      switch (d3)
      {
        case 0:
          System.out.print("Dormitorio 1: ");
          break;
        case 1:
          System.out.print("Dormitorio 2: ");
          break;
        case 2:
          System.out.print("Dormitorio 3: ");
          break;    
        default:          
      }
      
      switch (c3)
      {
        case 0:
          System.out.print(" rojo.");
          System.out.println();
          break;
        case 1:
          System.out.print(" azul.");
          System.out.println();
          break;
        case 2:
          System.out.print(" verde.");
          System.out.println();
          break;
        case 3:
          System.out.print(" amarillo.");
          System.out.println();
          break;
        case 4:
          System.out.print(" violeta.");
          System.out.println();
          break;
        case 5:
          System.out.print(" naranja.");
          System.out.println();
          break;          
        default:
      }
    
 	}
}


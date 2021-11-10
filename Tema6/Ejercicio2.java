//Ejercicio 2 de la relación de ejercicios Tema 6 Número Aleatorio.


public class Ejercicio2 {
	
	public static void main (String[] args) {
    
    String palo = "";
    String cartaTxt="";
    //Sacar el palo.
    int paloNum = (int)(Math.random()*4)+1;
    
    switch (paloNum)
    {
      case 1:
      palo="picas";
      break;
      case 2:
      palo="corazones";
      break;
      case 3:
      palo="diamantes";
      break;
      case 4:
      palo="tréboles";
      break;
      default:        
    }    
    
    int cartasNum = (int)(Math.random()*13)+1;
    
    switch (cartasNum)
    {
      case 1:
        cartaTxt="As";
        break;
      case 2:
        cartaTxt=String.valueOf(cartasNum);
        break;
      case 3:
        cartaTxt=String.valueOf(cartasNum);
        break;
      case 4:
        cartaTxt=String.valueOf(cartasNum);
        break;
      case 5:
        cartaTxt=String.valueOf(cartasNum);
        break;
      case 6:
        cartaTxt=String.valueOf(cartasNum);
        break;
      case 7:
        cartaTxt=String.valueOf(cartasNum);
        break;
      case 8:
        cartaTxt=String.valueOf(cartasNum);
        break;
      case 9:
        cartaTxt=String.valueOf(cartasNum);
        break;
      case 10:
        cartaTxt=String.valueOf(cartasNum);
        break;
      case 11:
        cartaTxt="J";
        break;
      case 12:
        cartaTxt="Q";
        break;
      case 13:
        cartaTxt="K";
        break;                  
      default:
        
    } 
    
    System.out.print(cartaTxt+" de "+palo);
		
	}
}


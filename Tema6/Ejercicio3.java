//Ejercicio 3 de la relación de ejercicios Tema 6 Número Aleatorio.


public class Ejercicio3 {
	
	public static void main (String[] args) {
    
    String palo = "";
    String cartaTxt="";
    //Sacar el palo.
    int paloNum = (int)(Math.random()*4)+1;
    
    switch (paloNum)
    {
      case 1:
      palo="oros";
      break;
      case 2:
      palo="espadas";
      break;
      case 3:
      palo="copas";
      break;
      case 4:
      palo="bastos";
      break;
      default:        
    }    
    
    int cartasNum = (int)(Math.random()*10)+1;
    
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
        cartaTxt="Sota";
        break;
      case 9:
        cartaTxt="Caballo";
        break;
      case 10:
        cartaTxt="Rey";
        break;                       
      default:
        
    } 
    
    System.out.print(cartaTxt+" de "+palo);
		
	}
}


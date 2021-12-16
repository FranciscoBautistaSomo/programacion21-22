//Francisco Alberto Bautista Somosierra
public class Ex05fabs3{
	
	public static void main (String[] args) {
		
    int[] numeros = {12398,12345,4569,7854,4569,15668};
    int intentos = 5;
    int aleNum =0;
    int numeroJugador;
    String numeroAleTxt="";   
    
    //Sacar numero. 
      aleNum =(int)(Math.random()*(numeros.length));
     
     int numeroAleatorio = numeros[aleNum];
     int numeroAleatorioAux = numeroAleatorio;
     int resto = 0;
     
     do
     {
       resto =numeroAleatorio%10;
       numeroAleatorio/= 10;
       
       numeroAleTxt = numeroAleTxt+resto;
       
     } while (numeroAleatorio>0);
     
       String numeroReAleTxt =" ";    
       //Mezclar cifras.
       numeroReAleTxt=numeroReAleTxt+numeroAleTxt.charAt(numeroAleTxt.length()-1);
       for (int i = 0; i < numeroAleTxt.length(); i++)
       {
         
         if (i>0 && i<numeroAleTxt.length()-1){
           
           numeroReAleTxt=numeroReAleTxt+numeroAleTxt.charAt(i);
         }
         
       }
       
       numeroReAleTxt=numeroReAleTxt+numeroAleTxt.charAt(0);
       //System.out.print(numeroReAleTxt);

    //Comprobar numero. 
    do
    {     
     System.out.print("Tiene "+intentos+" intentos. Diga número con los dígitos '"+numeroReAleTxt+"':");
     numeroJugador = Integer.parseInt(System.console().readLine());
     
     if (numeroJugador != numeroAleatorioAux){
       
       intentos--;
       
     }else if(numeroJugador == numeroAleatorioAux){
       System.out.print("Felicidades. Ha acertado el número.");
       break;
     }
     if (intentos==0){
         System.out.print("Tiene "+intentos+" intentos. Lo siento. No tiene más intentos.");
        break;
     }
    } while (intentos>=0);

	}
}


//Ejercicio 10 de la relación de ejercicios Tema 6 Número Aleatorio.

public class Ejercicio10v2 {
	
	public static void main (String[] args) {
		
    
    String frase="";
    String caracterTxt = "";
    //Pintar 10 frases.
    for (int i = 0; i <10 ; i++)
    {
      int caracterNum= (int)(Math.random()*6);
      int longitud = (int)(Math.random()*40)+1;
      
      //Caracter random
      switch (caracterNum)
      {
        case 0:
          caracterTxt ="*";
          break;
        case 1:
          caracterTxt ="-";
          break;
        case 2:
          caracterTxt ="=";
          break;
        case 3:
          caracterTxt =".";
          break;
        case 4:
          caracterTxt ="|";
          break;
        case 5:
          caracterTxt ="@";
          break;          
        default:          
      }
      //Escribir frase longitud maxima 40  
      System.out.print("Frase: "+i);
      for (int longi = 0; longi <longitud ; longi++)
      {        
        System.out.print(caracterTxt);        
      }
      System.out.println();
        
           
    }
    
	}
}


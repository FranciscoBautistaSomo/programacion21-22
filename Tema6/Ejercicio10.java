//Ejercicio 10 de la relación de ejercicios Tema 6 Número Aleatorio.

public class Ejercicio10 {
	
	public static void main (String[] args) {
		
    //int longitud = (int)(Math.random()*40)+1;
    String frase="";
    String caracterTxt = "";
    
    
    
    for (int i = 0; i <10 ; i++)
    {
      int caracterNum= (int)(Math.random()*6);
      int longitud = (int)(Math.random()*40)+1;
      
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
      for (int longi = 0; longi <longitud ; longi++)
      {
        frase +=caracterTxt;        
      }
        System.out.print("Frase: "+i);
        System.out.println(frase);   
    }
    
	}
}


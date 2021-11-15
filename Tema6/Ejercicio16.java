//Ejercicio 16 de la relación de ejercicios Tema 6 Número Aleatorio.
public class Ejercicio16 {
	
	public static void main (String[] args) {
    
    String figuraTxt1="";
    String figuraTxt2="";
    String figuraTxt3="";
    
    
    for (int i = 0; i <3 ; i++)
    {
      int figura = (int)(Math.random()*5);
      
      switch (figura)
      {
        case 0:
          if (i==0)
          {
            figuraTxt1 ="corazon";
          }else if (i==1){
            figuraTxt2 ="corazon";
            }else
            {
              figuraTxt3 ="corazon";
            }       
          break;
        case 1:
          if (i==0)
          {
            figuraTxt1 ="diamante";
          }else if (i==1){
            figuraTxt2 ="diamante";
            }else
            {
              figuraTxt3 ="diamante";
            }       
          break;
        case 2:
          if (i==0)
          {
            figuraTxt1 ="herradura";
          }else if (i==1){
            figuraTxt2 ="herradura";
            }else
            {
              figuraTxt3 ="herradura";
            }       
          break;
        case 3:
          if (i==0)
          {
            figuraTxt1 ="campana";
          }else if (i==1){
            figuraTxt2 ="campana";
            }else
            {
              figuraTxt3 ="campana";
            }       
          break;
        case 4:
          if (i==0)
          {
            figuraTxt1 ="limón";
          }else if (i==1){
            figuraTxt2 ="limón";
            }else
            {
              figuraTxt3 ="limón";
            }       
          break;      
        default:          
      }        
    }
    System.out.println(figuraTxt1);
    System.out.println(figuraTxt2);
    System.out.println(figuraTxt3);
    if ((!figuraTxt1.equals(figuraTxt2))&&(!figuraTxt2.equals(figuraTxt3))&&(!figuraTxt1.equals(figuraTxt3)))
    {
      System.out.println("Lo siento, ha perdido.");
    }else if ((figuraTxt1.equals(figuraTxt2))&&(figuraTxt2.equals(figuraTxt3))){
      System.out.println("Enhorabuena, ha ganado 10 monedas.");     
      }else
      {
        System.out.println("Bien,ha recuperado su moneda."); 
      }
    
    
		
	}
}


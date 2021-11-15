//Ejercicio 15 de la relación de ejercicios Tema 6 Número Aleatorio.

public class Ejercicio15 {
	
	public static void main (String[] args) {
		int nota = 0;
    String notaTxt = "";
    String partitura ="";
    
    for (int i = 0; i <4 ; i++)
    {
      partitura ="";
      for (int j = 1; j <=7 ; j++)      
      {
        nota = (int)(Math.random()*7)+1;
        switch (nota)
        {
          case 1:
            notaTxt=" do ";
            break;
          case 2:
            notaTxt=" re ";
            break;
          case 3:
            notaTxt=" mi ";
            break;
          case 4:
            notaTxt=" fa ";
            break;
          case 5:
            notaTxt=" sol ";
            break;
          case 6:
            notaTxt=" la ";
            break;
          case 7:
            notaTxt=" si ";
            break;            
          default:          
        }
        partitura += notaTxt;       
        
        if ((j==7) && (i<3)) 
        {
          partitura += "| ";
          System.out.println();
        }
        if((i==3) && (j==7)){
          partitura += "|| ";
          System.out.println();
        }
      }
      System.out.print(partitura);      
    }
    
    
	}
}


//Ejercicio 7 de la relación de ejercicios Tema 6 Número Aleatorio.

public class Ejercicio7 {
	
	public static void main (String[] args) {
    int numeroPartido=1;
    String resultadoTxt="";
    do
    {
    //Calculo de numeros random.
    int resultado = (int)(Math.random()*3)+1;
    
    //Random de equipos.
    int equipo1 = (int)(Math.random()*30)+1;
    int equipo2 = (int)(Math.random()*30)+1;
    
    //Optener resuldo
    switch (resultado)
    {
      case 1:
      resultadoTxt ="1";
      break;
      case 2:
      resultadoTxt ="X";
      break;
      case 3:
      resultadoTxt ="2";
      break;      
      default:
        
    }
    
      System.out.printf("Partido %d: equipo %d - equipo %d : %s \n", numeroPartido, equipo1, equipo2, resultadoTxt);
      numeroPartido++;
    } while (numeroPartido<=3);
    
    
    
    
		
	}
}


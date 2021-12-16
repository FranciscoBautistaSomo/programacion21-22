//Ejercicio 10 de la relación de ejercicios Tema 7 Array Bidimensionales.

public class Ejercicio10{
	
	public static void main (String[] args) {
    final int fil = 3;
    final int colum = 3; 
		String [][] tablero = new String[fil][colum];
    boolean ocupadoJ1 = false;
    boolean ocupadoJ2 = false;
    boolean ganar = false;
    int casillas =fil*colum;
    int jugadasJ1=0;
    int jugadasJ2=0;
    
    for (int i = 0; i < fil; i++)
    {
      for (int j = 0; j < colum; j++)
      {
        tablero[i][j]= " ";
      }      
    }
    do{   
      do{
          ocupadoJ1=false;
          System.out.print("Jugador1, introduzca la fila (1-6)");
          int filJ1 = Integer.parseInt(System.console().readLine());
          System.out.print("Jugador1, introduzca la columna (1-6)");
          int columJ1 = Integer.parseInt(System.console().readLine());
          filJ1=filJ1-1;
          columJ1 =columJ1-1;     
          if (tablero[filJ1][columJ1]==" "){
            tablero[filJ1][columJ1]="X";
            jugadasJ1++;
            casillas--;
          }else{
          System.out.println("Casilla ocupada");
          ocupadoJ1 = true;
          }        
      }while (ocupadoJ1);
      
      if (jugadasJ1 >=3){        
        for (int i = 0; i < fil; i++){
          for (int j = 0; j < colum; j++){
            for (int k = i-2; k <i+2 ; k++){
              for (int l = j-2; i <j+2 ; l++){
                if (k>=0 && k<=fil-2 && l>=0 && l<colum-2 ){
                  if (tablero[k][l].equals("X")){
                    System.out.println("Jugador 1 gana");
                    ganar=true;
                    break;
                  }                  
                }  
              }                
            }
          }
        }
      }
      
      do{
          ocupadoJ2 =false;
          System.out.print("Jugador2, introduzca la fila (1-6)");
          int filJ2 = Integer.parseInt(System.console().readLine());
          System.out.print("Jugador2, introduzca la columna (1-6)");
          int columJ2 = Integer.parseInt(System.console().readLine());
          filJ2=filJ2-1;
          columJ2 =columJ2-1;     
          if (tablero[filJ2][columJ2]==" "){
            tablero[filJ2][columJ2]="O";
            jugadasJ2++;
            casillas--;
          }else{
          System.out.println("Casilla ocupada");
          ocupadoJ2 = true;
          }        
      }while (ocupadoJ2);

      if (jugadasJ2 >=3){
        
        for (int i = 0; i < fil; i++)
        {
          for (int j = 0; j < colum; j++)
          {
            for (int k = i-2; k <i+2 ; k++){
              for (int l = j-2; i <j+2 ; l++){
                if (k>=0 && k<=fil-2 && l>=0 && l<colum-2 ){
                  if (tablero[k][l].equals("O"))
                  {
                    System.out.println("Jugador 2 gana");
                    ganar=true;
                    break;
                  }                   
                }  
              }                
            }
          }
        }
      }
      System.out.println("Casillas "+casillas);
      System.out.println("Jugadas J1 "+jugadasJ1);
      System.out.println("Jugadas J2 "+jugadasJ2);
      System.out.println("Ganar "+ganar);
      System.out.println("Estado juego");
      
      for (int i = 0; i < fil; i++)
      {
        for (int j = 0; j < colum; j++)
        {
          System.out.printf("%2s |",tablero[i][j]);
        }
        System.out.println();      
      }
    } while (ganar || casillas!=0);
	}
}


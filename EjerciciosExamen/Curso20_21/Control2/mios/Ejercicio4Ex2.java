//Ejercicio 4 examen 2 curso 2020/21

public class Ejercicio4Ex2{
	
	public static void main (String[] args){
		final int fil=4;
    int colum;
    char puente [][];
     
    
    do{
      System.out.print("Introduzca la longitud total del puente (un número mayor que 6): ");
    
      colum = Integer.parseInt(System.console().readLine());
    } while (colum<6);
    
    puente = new char[fil][colum];
    int persona=0;
    
    //Rellenar matriz
    for (int i = 0; i < fil; i++){
      for (int j = 0; j < colum ; j++){
        puente[i][j]=' ';
      }      
    }
    
    //Rellenar con simbolos.    
    for (int i = 0; i <fil ; i++){
      int max = 0;
      int min = 0;
      for (int j = 0; j < colum; j++){
        if (i==0 && j>=3 && j<=colum-3){
          min = 3;
          max = colum-3;
          persona =(int)(Math.random()*((max-min+1)+min));
          if (persona>=3){
            puente[0][persona]='&';
          }else{
            puente[0][persona]=' ';
            }
        }
        if (i==1 && j>=2 && j<=colum-3){
          puente[1][j]='*';
        }
        if ((i==2 && j==1) ||(i==2 && j==colum-2)){
          puente[2][j]='*';
          
        }        
        if ((i==3 && j==0) ||(i==0 && j==colum-1)){
          puente[3][j]='*';
        }
      }
    }
    
    //Pintar puente
    for (int i = 0; i < fil; i++){
      for (int j = 0; j < colum; j++){
        System.out.printf("%s",puente[i][j]);
      }
      System.out.println();
    }
	}
}


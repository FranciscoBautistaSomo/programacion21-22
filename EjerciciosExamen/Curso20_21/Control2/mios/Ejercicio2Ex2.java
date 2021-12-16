//Ejercicio 2 examen 2 curso 2020/21

public class Ejercicio2Ex2{
	
	public static void main (String[] args)throws InterruptedException {
		final int fil = 23;
    final int colum = 60;
    char[][] nieve = new char[fil][colum];
    char [][] arrayFinal = new char[23][60];
    
    for (int i = 0; i < fil; i++){
      for (int j = 0; j <colum ; j++){
        nieve[i][j]= '%';
      }
    }
    
    for (int i = 0; i < fil; i++){
      for (int j = 22; j > 0 ; j++){
        for (int k = 0; k <colum ; i++){
          nieve[j][k]= nieve[j-1][k];
        }       
      }
      
      for (int l = 0; l <colum ; l++)
      {
        int nieveAleatoria = (int)(Math.random()*15);
        nieve[0][l] = nieveAleatoria == 0 ? '*' : ' ';
      }
      
      arrayFinal [10][20] = 'F';
      arrayFinal [10][21] = 'E';
      arrayFinal [10][22] = 'L';
      arrayFinal [10][23] = 'I';
      arrayFinal [10][24] = 'C';
      arrayFinal [10][25] = 'E';
      arrayFinal [10][26] = 'S';
      arrayFinal [10][27] = ' ';
      arrayFinal [10][28] = 'F';
      arrayFinal [10][29] = 'I';
      arrayFinal [10][30] = 'E';
      arrayFinal [10][31] = 'S';
      arrayFinal [10][32] = 'T';
      arrayFinal [10][33] = 'A';
      arrayFinal [10][34] = 'S';
      
      for (int m = 0; m < fil; m++)
      {
        for (int n = 0; n < colum ; n++)
        {
          System.out.printf("%s",nieve[m][n]);
        }
        System.out.println();
      }
      System.out.println("----------------------------------");
      Thread.sleep(600);           
    }
    
    
    
    
    
    
    
	}
}


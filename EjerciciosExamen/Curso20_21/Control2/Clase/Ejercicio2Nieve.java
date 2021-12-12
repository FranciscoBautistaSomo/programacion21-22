public class Ejercicio2Nieve {
  public static void main(String[] args) throws InterruptedException {
    
    char [][] nieve = new char[23][60];
    char [][] arrayFinal = new char[23][60];

    for (int i = 0; i < 23; i++) {
      for (int j = 0; j < 60; j++) nieve[i][j] = ' ';
    }

    for (int k = 0; k < 23; k++){
      for (int i = 22; i > 0; i--) {
        for (int j = 0; j < 60; j++) nieve[i][j] = nieve[i - 1][j];
      }

      for (int j = 0; j < 60; j++){
        int nieveAleatoria = (int) (Math.random() * 15);
        nieve[0][j] = nieveAleatoria == 0 ? '*' : ' ';
      }

      for (int i = 0; i < 23; i++) {
        for (int j = 0; j < 60; j++) arrayFinal[i][j] = nieve[i][j];
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
      
      for (int i = 0; i < 23; i++) {
        for (int j = 0; j < 60; j++) System.out.print(arrayFinal[i][j]);
        System.out.println();
      }

      System.out.println("---------------------------------");
      Thread.sleep(600);
    }
  }
}
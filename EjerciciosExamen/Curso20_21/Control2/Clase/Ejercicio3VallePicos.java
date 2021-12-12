public class Ejercicio3VallePicosV2 {
  public static void main(String[] args) {
    
    int filas = 10;
    int columnas = 10;
    int minimo;
    int maximo;

    int [][] arrayInicial = new int[filas][columnas];
    String [][] arrayFinal = new String[filas][columnas];
    
    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++){
        arrayInicial[i][j] = (int) (Math.random() * 1000);
        System.out.printf("%4d", arrayInicial[i][j]);
      }
      System.out.println();
    }


    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++) {
        maximo = -1;
        minimo = 1001;
        for (int k = i - 1; k <= i + 1; k++) {
          for (int z = j - 1; z <= j + 1; z++) {
            if (k >= 0 && k < filas && z >= 0 && z < columnas && !(z == j && k == i)) {
              if (arrayInicial [k][z] > maximo) maximo = arrayInicial [k][z];
              if (arrayInicial [k][z] < minimo) minimo = arrayInicial [k][z];
            }
          }
        }
        if (minimo >= arrayInicial [i][j]) arrayFinal [i][j] = "v";
        else if (maximo <= arrayInicial[i][j]) arrayFinal [i][j] = "^";
        else arrayFinal [i][j] = " ";

      }
    }

    for (int i = 0; i < filas; i++){
      for (int j = 0; j < columnas; j++) System.out.printf("%4s", arrayFinal[i][j]);
      System.out.println();
    }

  }
}
public class MatrizBidimensional {
  public static void main (String[] args) {
    int [][] matriz;
    int filas, columnas;
    int inferior, superior;
    
    int longitudDato=0;
    
    do {
      System.out.print("Introduzca el nº de filas [1-20]: ");
      filas = Integer.parseInt(System.console().readLine());
    } while (!(filas>=1 && filas <=20));
    
    do {
      System.out.print("Introduzca el nº de columnas [1-20]: ");
      columnas = Integer.parseInt(System.console().readLine());
    } while (!(columnas>=1 && columnas <=20));
    
    matriz = new int[filas][columnas];
    
    do {
      System.out.print("Introduzca el extremo inferior del intervalo aleatorio: ");
      inferior = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el extremo superior del intervalo aleatorio: ");
      superior = Integer.parseInt(System.console().readLine());
      if ((superior-inferior+1)<(filas*columnas)) {
        System.out.println("Cantidad de datos insuficiente.");
      }
    } while ((superior-inferior+1)<(filas*columnas));
    
    for (int i=0; i<filas; i++) {
      for (int j=0; j<columnas; j++) {
        boolean repetido;
        do {
          matriz[i][j] = (int)(Math.random()*(superior-inferior+1))+inferior;
          repetido = false;
          for (int k=0; k<i && !repetido; k++) {
            for (int l=0; l<columnas && !repetido; l++) {
              if (matriz[i][j]==matriz[k][l]) {
                repetido = true;
              }
            }
          }
          if (!repetido) {
            for (int k=0; k<j && !repetido; k++) {
              if (matriz[i][j]==matriz[i][k]) {
                repetido = true;
              }
            }
          } 
        } while (repetido);
      }
    }
    
       
    int temp=superior;
    
    while (temp>0) {
      longitudDato++;
      temp = temp/10;
    }

    String barra="";
    for (int i=0; i<longitudDato; i++)
      barra += "─";
   
    System.out.print("┌");
    for (int i=0; i<columnas-1; i++) {
      System.out.print(barra+"┬");
    }
    System.out.println(barra+"┐");
    
    for (int i=0; i<filas; i++) {
      System.out.print("│");
      for (int j=0; j<columnas; j++) {
        String formato="%"+longitudDato+"d";
        System.out.printf(formato,matriz[i][j]);
        System.out.print("│");
      }
      System.out.println();
      if (i<filas-1) {      
        System.out.print("├");
        for (int j=0; j<columnas-1; j++) {
          System.out.print(barra+"┼");
        }
        System.out.print(barra+"┤");
        System.out.println();
      } else {
        System.out.print("└");
        for (int j=0; j<columnas-1; j++) {
          System.out.print(barra+"┴");
        }
        System.out.print(barra+"┘");
        System.out.println();
      }
      
    }
    
    
/*    
┌───┬───┬───┬───┬───┬───┬───┐
│ L │ M │ X │ J │ V │ S │ D │
├───┼───┼───┼───┼───┼───┼───┤
│   │   │ 1 │ 2 │ 3 │ 4 │ 5 │
├───┼───┼───┼───┼───┼───┼───┤
│ 6 │ 7 │ 8 │ 9 │10 │11 │12 │
├───┼───┼───┼───┼───┼───┼───┤
│13 │14 │15 │16 │17 │18 │19 │
├───┼───┼───┼───┼───┼───┼───┤
│20 │21 │22 │23 │24 │25 │26 │
├───┼───┼───┼───┼───┼───┼───┤
│27 │28 │29 │   │   │   │   │
└───┴───┴───┴───┴───┴───┴───┘
*/ 
  }
}

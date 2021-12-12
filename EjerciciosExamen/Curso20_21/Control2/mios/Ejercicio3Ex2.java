//Ejercicio 2 examen 2 curso 2020/21
public class Ejercicio3Ex2{
  public static void main(String[] args){
    final int FILA;
    final int COLUMNA;
    int max;
    int min;
    boolean correpto = true;
    int matriz[][];
    char matrizPiVa[][];
    int mayor = Integer.MIN_VALUE;
    int menor = Integer.MAX_VALUE;   
    
    System.out.print("Indique el nº de filas de la matriz (1-10): ");
    FILA = Integer.parseInt(System.console().readLine());
            
    System.out.print("Indique el nº de columnas de la matriz (1-15): ");
    COLUMNA = Integer.parseInt(System.console().readLine());
    
    matriz = new int[FILA][COLUMNA];
    matrizPiVa = new char[FILA][COLUMNA];
        
    System.out.print("Indique el valor mínimo del rango aleatorio (1-999): ");
    min = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique el valor máximo del rango aleatorio (1-999): ");
    max = Integer.parseInt(System.console().readLine());
    
    if ((FILA > 10)||(COLUMNA > 15)||(min >1000)||(max >1000)){
       correpto = false;
       System.out.print("Error al ingresar los datos");
    }else{
      for (int i = 0; i < FILA; i++){
        for (int j = 0; j < COLUMNA ; j++){
          matriz[i][j]= (int)(Math.random()*(max-min+1)+min);
        }
      }      
      //Comprobar picos y valles
        for (int i = 0; i < FILA; i++){
          for (int j = 0; j <COLUMNA ; j++)
          {
            for (int k = i-1; k <=i+1 ; k++){
              for (int l = j-1; l <= j+1; l++){
                if (k>=0 && k<=FILA-1 && l>=0 && l<COLUMNA-1 ){
                  if (matriz[k][l]>mayor)mayor = matriz[k][l];
                  if (matriz[k][l]<menor)menor = matriz[k][l];
                }
              }            
            }
            if (menor >= matriz[i][j]){ matrizPiVa[i][j] = 'V';}
            else if (mayor<=matriz[i][j]){ matrizPiVa[i][j] = '^';}
            else{ matrizPiVa[i][j] = ' ';}
          }          
        }     
      //Mostrar matriz
      System.out.println("Matriz de datos generada:");
      
      for (int i = 0; i < FILA; i++){
        for (int j = 0; j < COLUMNA; j++){
          if (j<COLUMNA-1){
            System.out.printf("%4d│",matriz[i][j]);
          }else{
            System.out.printf("%4d",matriz[i][j]);
          }
        }
        System.out.println();
        for (int k = 0; k < COLUMNA; k++){
          if (k==COLUMNA-1)
          {
            System.out.print("─────");
          }else
          {
            System.out.print("────┼");
          }
        }
        System.out.println();
      }
      System.out.println("A continuación, se señalan los picos (^) y los valles (V):");
      for (int i = 0; i < FILA; i++){
        for (int j = 0; j < COLUMNA; j++){
          if (j<COLUMNA-1){
            System.out.printf("%4s│",matrizPiVa[i][j]);
          }else{
            System.out.printf("%4s",matrizPiVa[i][j]);
          }
        }
        System.out.println();
        for (int k = 0; k < COLUMNA; k++){
          if (k==COLUMNA-1)
          {
            System.out.print("─────");
          }else
          {
            System.out.print("────┼");
          }
        }
        System.out.println();
      }       
    } 
  }
}  

public class ArrayDeArrays {
  public static void main (String[] args) {
    int [][] matriz = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    int [] x = {100,200,300,400};
    
    for (int i=0; i<3; i++) {
      for (int j=0; j<4; j++) {
        System.out.printf("%3s ",matriz[i][j]);
      }
      System.out.println();
    }
    
    System.out.println();
    
    matriz[1] = x;
    
    for (int i=0; i<3; i++) {
      for (int j=0; j<4; j++) {
        System.out.printf("%3s ",matriz[i][j]);
      }
      System.out.println();
    }
  }
}

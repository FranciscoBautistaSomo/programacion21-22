public class ForEachNoEsParaTanto {
  public static void main (String[] args) {
    int[] x = new int[5];
    
    //este programa demuestra que el bucle for-each es de solo lectura
    
    for (int a: x) {
      a = (int)(Math.random()*20);
      System.out.println(a);
    }
    
    for (int a: x) {
      System.out.println(a);
    }
    
  }
}

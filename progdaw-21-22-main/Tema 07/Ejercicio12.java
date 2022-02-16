
public class Ejercicio12 {
  public static void main (String[] args) {
    final int TAMA=10;
    
    int [] vector = new int[TAMA];
    int a,b;
    
    for (int i=0; i<TAMA; i++) {
      vector[i]= (int)(Math.random()*100);
    }
    
    for (int i=0; i<TAMA; i++) {
      System.out.printf ("%3d ",i);
    }
    System.out.println();
    
    for (int i=0; i<TAMA; i++) {
      System.out.printf ("%3d ",vector[i]);
    }
    System.out.println();
    System.out.println();
    
    System.out.print("Indique posición inferior: ");
    a = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique posición superior: ");
    b = Integer.parseInt(System.console().readLine());
    
    int salvar, salvar2;
    
    salvar = vector[a];
    for (int i = a; i>0; i--) {
      vector[i] = vector[i-1];
    }
    
    salvar2 = vector[TAMA-1];
    
    for (int i=TAMA-1; i>b; i--) {
      vector[i] = vector[i-1];
    }
    
    vector[b] = salvar;
    vector[0] = salvar2;
    
    
    for (int i=0; i<TAMA; i++) {
      System.out.printf ("%3d ",i);
    }
    System.out.println();
    
    for (int i=0; i<TAMA; i++) {
      System.out.printf ("%3d ",vector[i]);
    }
    System.out.println();
    
  }
}

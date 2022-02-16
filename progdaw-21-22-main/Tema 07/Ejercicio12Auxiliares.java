
public class Ejercicio12Auxiliares {
  public static void main (String[] args) {
    final int TAMA=10;
    
    int [] vector = new int[TAMA];
    int [] auxiliarRotar = new int[TAMA];
    int [] auxiliarNoRotar = new int[TAMA];
    
    int a,b;
    
    int tamaAuxiliarRotar=0;
    int tamaAuxiliarNoRotar=0;
    
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
    
    //elementos a rotar
    for (int i=0; i<=a; i++) {
      auxiliarRotar[tamaAuxiliarRotar]=vector[i];
      tamaAuxiliarRotar++;
    }
    
    for (int i=b; i<TAMA; i++) {
      auxiliarRotar[tamaAuxiliarRotar]=vector[i];
      tamaAuxiliarRotar++;
    }
    
    //elementos a no rotar
    
    for (int i=a+1; i<=b-1; i++) {
      auxiliarNoRotar[tamaAuxiliarNoRotar]=vector[i];
      tamaAuxiliarNoRotar++;
    }
    
    // rotar elementos;
    int aux = auxiliarRotar[tamaAuxiliarRotar-1];
    for (int i=tamaAuxiliarRotar-1; i>0; i--) {
      auxiliarRotar[i] = auxiliarRotar[i-1];
    }
    auxiliarRotar[0]=aux;
    
    //regeneramos vector
    //elementos rotados primer sector
    int contador=0;
    int contador2=0;
    for (int i=0; i<=a; i++) {
      vector[contador]=auxiliarRotar[contador2];
      contador++;
      contador2++;
    }
    
    //elementos no rotados
    
    for (int i=0; i<tamaAuxiliarNoRotar; i++) {
      vector[contador]=auxiliarNoRotar[i];
      contador++;
    }
    
    //elementos rotados segundo sector
    
    for (int i=b; i<TAMA; i++) {
      vector[contador]=auxiliarRotar[contador2];
      contador++;
      contador2++;
    }
    
       
    
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

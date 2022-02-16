public class EjemploFuncion1 {
   
  public static void main (String[] arg) {
    int [] x = new int [10];
    int b = 65;
    
    verMatriz(x);
    rellenaMatriz(x);
    verMatriz(x);
    
    System.out.println("La media de los datos es: "+media(x));
    
    System.out.println(b);
    cambiaEntero(b); // en realidad no se puede cambiar porque el dato va por copia
    System.out.println(b);
    media(x); // el dato devuelto no se guarda en ningún sitio; de manera efectiva
              // no sirve para "nada"
    
  }
  
  public static void verMatriz (int [] pepita) {
    for (int i=0; i<pepita.length; i++) {
      System.out.printf("%3d ",pepita[i]);
    }
    System.out.println();
  }
  
  public static void rellenaMatriz (int [] jaimita) {
    for (int i=0; i<jaimita.length; i++) {
      jaimita[i] = (int)(Math.random()*156);   //cambia los datos del array x 
    }  
    jaimita = new int[10]; // no tiene efecto en el array x del programa ppal
  }
  
  public static void cambiaEntero (int a) {
    a = 89; // tipos básicos y strings van por copia, el resto por referencia
  }
  
  public static float media (int [] v) {
    float resultado = 0.0f;
    for(int i=0; i<v.length; i++) {
      resultado = resultado + v[i];
    }
    resultado = resultado/v.length;
    return resultado;
  }  
  
}



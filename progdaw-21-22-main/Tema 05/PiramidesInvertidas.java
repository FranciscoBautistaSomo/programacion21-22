public class PiramidesInvertidas {
  public static void main (String[] args) {
    int altura1, altura2;
    int hmax;
    String espacio = "·";
    String relleno = "o";
    
    System.out.print("Indique la altura de la primera pirámide: ");
    altura1 = Integer.parseInt (System.console().readLine());
    System.out.print("Indique la altura de la segunda pirámide: ");
    altura2 = Integer.parseInt (System.console().readLine());
    
    if (altura1>altura2) {
      hmax = altura1;
    } else {
      hmax = altura2;
    }
    
    int espaciosPir1=0;
    int espaciosPir2=0;
    int rellenoPir1=altura1;
    int rellenoPir2=altura2;
    
    for (int i=0; i<hmax; i++) {
      for (int j=0; j<espaciosPir1; j++) {
        System.out.print(espacio);
      }
      for (int j=0; j<rellenoPir1; j++) {
        System.out.print(relleno);
      }
      for (int j=0; j<rellenoPir1-1; j++) {
        System.out.print(relleno);
      }
      if (espaciosPir1>=altura1) {
        espaciosPir1--;
      }
      for (int j=0; j<espaciosPir1; j++) {
        System.out.print(espacio);
      }
      System.out.print(espacio);
      for (int j=0; j<espaciosPir2; j++) {
        System.out.print(espacio);
      }
      for (int j=0; j<rellenoPir2; j++) {
        System.out.print(relleno);
      }
      for (int j=0; j<rellenoPir2-1; j++) {
        System.out.print(relleno);
      }
      espaciosPir1++;
      if (espaciosPir1 > altura1) {
        espaciosPir1=altura1;
      }
      rellenoPir1--;
      espaciosPir2++;
      rellenoPir2--;
      
      
      System.out.println();
    }
  }
}

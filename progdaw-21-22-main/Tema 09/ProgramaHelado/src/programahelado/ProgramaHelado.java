package programahelado;

public class ProgramaHelado {
  public static void main (String [] args) {
    Helado miPrimerHelado;
    Helado otroHelado;
    
    miPrimerHelado = new Helado();
    miPrimerHelado = new Helado ("vainilla", 10);
    otroHelado = miPrimerHelado;
    miPrimerHelado = new Helado ("fresa", 8,"azucar","singluten","vegano");
    
    otroHelado.chupar();
    otroHelado.chupar();
    otroHelado.chupar(4);
    otroHelado.chupar();
    
    System.out.print ("Al otro helado le queda: "+otroHelado.cuantoQueda());
    
    System.out.println();
    
    System.out.print(miPrimerHelado.toString());
    System.out.print(otroHelado);
    
    //miPrimerHelado.ponerSabor("vainilla");
    System.out.println();
    if (miPrimerHelado.compara(otroHelado)<0) {
      System.out.print("El primer helado es el más pequeño");
    } else if (miPrimerHelado.compara(otroHelado)==0) {
      System.out.print("Los dos helados son igual de grandes");
    } else {
      System.out.print("El primer helado es el más grande");
    }
    
    System.out.println();
    System.out.println("Hasta el momento se han creado "+ Helado.heladosCreados() +" helados.");
    
    
  }
}

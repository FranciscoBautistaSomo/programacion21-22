public class AdivinaPalabra {
  public static void main (String[] args) {
    String[] listaPalabras = {"hola","prueba","patata","programacion","desarrollo"};
    String elegida,desordenada;
    int intentos;
    String juego;
    
    elegida = listaPalabras[(int)(Math.random()*listaPalabras.length)];
    
    desordenada = "";
    
    for (int i=0; i<elegida.length(); i++) {
      if (Math.random()*2>=1) 
        desordenada = desordenada + elegida.charAt(i);
      else
        desordenada = "" + elegida.charAt(i) + desordenada;
    } 
    
    intentos=0;
    boolean encontrada = false;
    
    do { 
      System.out.print("Tiene "+(5-intentos)+" intentos. Diga palabra con las letras '"+desordenada+"': ");
      juego = System.console().readLine();
      if (juego.equals(elegida))
        encontrada = true;
      intentos++;
    } while (intentos<5 && !encontrada);
    
    if (encontrada)
      System.out.println("Felicidades. Ha acertado la palabra.");
    else
      System.out.println("La palabra que tenía que acertar es: "+elegida);
    
  }
}

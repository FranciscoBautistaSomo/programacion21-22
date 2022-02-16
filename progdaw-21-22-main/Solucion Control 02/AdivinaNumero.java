public class AdivinaNumero {
  public static void main (String[] args) {
    int[] listaNumeros = {11223344,12345,998877,3456,987};
    int elegido,elegido2;
    int intentos;
    int juego;
    String desordenada;
    
    elegido = listaNumeros[(int)(Math.random()*listaNumeros.length)];
    elegido2 = elegido;
    
    desordenada = "";
    
    do {
      int digito = elegido2 % 10;
      elegido2 = elegido2/10;
      if (Math.random()*2>=1) 
        desordenada = desordenada + digito;
      else
        desordenada = "" + digito + desordenada;
    } while (elegido2>0);
    
    intentos=0;
    boolean encontrado = false;
    
    do { 
      System.out.print("Tiene "+(5-intentos)+" intentos. Diga número con los dígitos '"+desordenada+"': ");
      juego = Integer.parseInt(System.console().readLine());
      if (juego == elegido)
        encontrado = true;
      intentos++;
    } while (intentos<5 && !encontrado);
    
    if (encontrado)
      System.out.println("Felicidades. Ha acertado el número.");
    else
      System.out.println("El número que tenía que acertar es: "+elegido);
    
  }
}

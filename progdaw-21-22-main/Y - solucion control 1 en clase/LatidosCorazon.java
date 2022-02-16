public class LatidosCorazon {
  public static void main (String[] args) {
    int latidosPorMinuto;
    int anios;
    
    long latidosTotales;
    
    System.out.print("Introduzca su ritmo cardíaco medio en pulsaciones por minuto: ");
    latidosPorMinuto = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el tiempo en años: ");
    anios = Integer.parseInt(System.console().readLine());
    
    latidosTotales = (long)anios * 365 * 24 *60*latidosPorMinuto;
    
    System.out.printf("En ese tiempo, su corazón habrá latido %d veces.\n",latidosTotales);
    
    
  }
}

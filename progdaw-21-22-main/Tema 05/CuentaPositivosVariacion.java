public class CuentaPositivosVariacion {
  public static void main(String[] args) {
    System.out.println("Por favor, vaya introduciendo números y pulsando INTRO.");
    System.out.println("Para terminar, introduzca un número negativo.");

    int numeroIntroducido = 0;
    int cuentaNumeros = 0;

    int suma = 0;

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Integer.parseInt(System.console().readLine());
      if (numeroIntroducido >=0) {
        cuentaNumeros++; // Incrementa en uno la variable
        suma += numeroIntroducido; // Equivale a suma = suma + NumeroIntroducido
      }
    }
    
    System.out.println("Has introducido " + cuentaNumeros + " números positivos.");
    System.out.println("La suma total de ellos es " + suma);
  }
}

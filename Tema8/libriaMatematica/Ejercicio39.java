package libriaMatematica;

public class Ejercicio39 {
    public static void main(String[] args) {
        int numero = 0;
        System.out.print("Introduzca un número a convertir en letras: ");
        numero = Integer.parseInt(System.console().readLine());
        System.out.println("El "+numero+" en letras es: "+funcMates2.convierteEnPalabras(numero));
    }
}

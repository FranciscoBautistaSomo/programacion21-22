import libriaMatematica.funcMates2;
public class Ejercicio37 {
    public static void main(String[] args) {
        int numero = 0;
        System.out.print("Introduzca un número a convertir en morse: ");
        numero = Integer.parseInt(System.console().readLine());
        System.out.println("El "+numero+" en morse es: "+funcMates2.convierteEnMorse(numero));
    }
}

import libriaMatematica.funcMates;
public class Ejercicio14_2 {
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;

        System.out.print("Introduzca el primer número a juntar: ");
        numero1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el segundo número a juntar: ");
        numero2 = Integer.parseInt(System.console().readLine());
        System.out.print("El número junto es :"+funcMates.juntaNumeros2(numero1, numero2));
    }
}

import libriaMatematica.*;
public class Ejercicio53 {
    public static void main(String[] args) {
        int [][] n = funcArrayBi.generaArrayBiInt(6, 6, 1, 50);
        funcArrayBi.muestraArrayIntBi(n);
        int i=100;
        System.out.println("nEsimo(n, "+i+") devuelve "+funcArrayBi.nEsimo(n, i));

        /*for (int i = 50; i < 52; i++) {
            System.out.println("nEsimo(n, "+i+") devuelve "+funcArrayBi.nEsimo(n, i));
        }*/
    }
}

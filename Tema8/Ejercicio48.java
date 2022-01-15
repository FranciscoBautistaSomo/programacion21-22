import libriaMatematica.funcArrayUni;
public class Ejercicio48 {
    public static void main(String[] args) {
        int []a = funcArrayUni.generaArrayInt(5, 1, 20);
        int []b = funcArrayUni.generaArrayInt(6, 1, 10);
        int []c;
        funcArrayUni.muestraArrayInt(a);
        funcArrayUni.muestraArrayInt(b);

        c = funcArrayUni.concatena(a, b);

        funcArrayUni.muestraArrayInt(c);
    }
}

import libriaMatematica.funcArrayUni;

public class Ejercicio50 {
    public static void main(String[] args) {
        int []a = funcArrayUni.generaArrayInt(3, 1, 20);
        int []b = funcArrayUni.generaArrayInt(2, 1, 10);
        int []m;
        funcArrayUni.muestraArrayInt(a);
        funcArrayUni.muestraArrayInt(b);

        m = funcArrayUni.mezcla(a, b);

        funcArrayUni.muestraArrayInt(m);
    }
}

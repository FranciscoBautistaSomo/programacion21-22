import libriaMatematica.funcArrayUni;
public class prueba {
    public static void main(String[] args) {
        // int [] b = new int[10];
        int [] b=funcArrayUni.generaArrayInt(10, 1, 20);
        funcArrayUni.muestraArrayInt(b);

        int[] r = funcArrayUni.quitarPosArray(b,2);
        funcArrayUni.muestraArrayInt(r);
    }
}

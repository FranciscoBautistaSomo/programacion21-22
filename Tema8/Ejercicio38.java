import libriaMatematica.funcArrayUni;
public class Ejercicio38 {
    public static void main(String[] args) {
        int [] array = funcArrayUni.generaArrayInt(20, 2, 100);
        //int [] array = {20,30,10,12,14,15};

        funcArrayUni.muestraArrayInt(array);

        int [] primos = funcArrayUni.filtraCapicuas(array);

        funcArrayUni.muestraArrayInt(primos);

    }
}

import libriaMatematica.funcArrayUni;

public class Ejercicio36 {
    public static void main(String[] args) {
        int [] array = funcArrayUni.generaArrayInt(10, 2, 30);
        //int [] array = {6,8,10,12,14,15};

        funcArrayUni.muestraArrayInt(array);

        int [] primos = funcArrayUni.filtrarPrimos(array);

        funcArrayUni.muestraArrayInt(primos);

    }
    
}

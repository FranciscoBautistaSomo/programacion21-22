import libriaMatematica.funcArrayUni;
public class Ejercicio40 {
    public static void main(String[] args) {
        //int [] array = funcArrayUni.generaArrayInt(20, 2, 100);
        int [] array = {20,30,10,12,14,15};

        funcArrayUni.muestraArrayInt(array);

        int [] con7 = funcArrayUni.filtraCon7(array);

        funcArrayUni.muestraArrayInt(con7);

    }
}

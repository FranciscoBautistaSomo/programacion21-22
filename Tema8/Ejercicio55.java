import libriaMatematica.*;
public class Ejercicio55 {
    public static void main(String[] args) {
        String[] a = {"casa", "coche", "sol", "mesa", "mesa", "coche", "ordenador",
            "sol", "CASA"}; 
        String [] sinR = funcArrayUni.sinRepetir(a);
        //funcArrayUni.muestraArrayInt(sinR);
        for (int i = 0; i < sinR.length; i++) {
            System.out.print(sinR[i]+", ");
        }
    }
}

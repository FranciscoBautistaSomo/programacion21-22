import libriaMatematica.*;
public class Ejercicio52 {
    public static void main(String[] args) {
        //int [] aleatorios = funcArrayUni.generaArrayInt(4, 10, 20);
        int [] aleatorios = {111, 222, 333, 444};
        funcArrayUni.muestraArrayInt(aleatorios);
        System.out.println("Numero aleatorio del array: "+funcArrayUni.aleatorioDeArray(aleatorios));
    }
}

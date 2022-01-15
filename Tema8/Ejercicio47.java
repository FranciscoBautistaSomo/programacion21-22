import libriaMatematica.funcArrayUni;
public class Ejercicio47 {
    public static void main(String[] args) {
        int[] a = { };
        int[] b = {1,9,7,7};

        String arrayTxt = funcArrayUni.convierteArrayEnString(a);
        System.out.println("Array a: "+arrayTxt);
        arrayTxt = funcArrayUni.convierteArrayEnString(b);
        System.out.println("Array b: "+arrayTxt);
    }
}

import libriaMatematica.funcArrayBi;
import libriaMatematica.funcArrayUni;
public class Ejercicio56 {
    public static void main(String[] args) {
        int [][] m = funcArrayBi.generaArrayBiInt(4, 4, 1, 50);
        int [] ce = new int[m.length*m[0].length];
        int [] aux = ce.clone();
        int [] aux1 = ce.clone();
        funcArrayBi.muestraArrayIntBi(m);

        ce = funcArrayUni.concatena(funcArrayBi.filaDeArrayBiInt(m, 0), funcArrayBi.columnaDeArrayBiInt(m, m[0].length-1));
        aux = funcArrayUni.volteaArrayInt(funcArrayBi.filaDeArrayBiInt(m, m.length-1));
        ce = funcArrayUni.concatena(ce, aux);
        aux1 = funcArrayUni.volteaArrayInt(funcArrayBi.columnaDeArrayBiInt(m, 0));
        ce  = funcArrayUni.concatena(ce, aux1);

        ce = funcArrayUni.quitaRepetido(ce);
        
        funcArrayUni.muestraArrayInt(ce);
    }
}

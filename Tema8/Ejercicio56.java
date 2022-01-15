import libriaMatematica.funcArrayBi;
import libriaMatematica.funcArrayUni;
public class Ejercicio56 {
    public static void main(String[] args) {
        int [][] m = funcArrayBi.generaArrayBiInt(4, 4, 1, 50);
        int [] ce = new int[m.length*m[0].length];
        int [] aux = ce.clone();
        int [] aux1 = ce.clone();
        funcArrayBi.muestraArrayIntBi(m);
        //primera fila
        ce = funcArrayBi.filaDeArrayBiInt(m, 0);
        ce = funcArrayUni.quitarPosArray(ce, ce.length-1);
        //ultima columna
        ce = funcArrayUni.concatena(ce, funcArrayBi.columnaDeArrayBiInt(m, m[0].length-1));
        ce = funcArrayUni.quitarPosArray(ce, ce.length-1);
        //ultima fila
        aux = funcArrayUni.volteaArrayInt(funcArrayBi.filaDeArrayBiInt(m, m.length-1));
        ce = funcArrayUni.concatena(ce, aux);
        ce = funcArrayUni.quitarPosArray(ce, ce.length-1);
        //primera columna
        aux1 = funcArrayUni.volteaArrayInt(funcArrayBi.columnaDeArrayBiInt(m, 0));
        //aux1 = funcArrayUni.quitarPosArray(aux1, 0);
        ce  = funcArrayUni.concatena(ce, aux1);
        ce = funcArrayUni.quitarPosArray(ce, ce.length-1);
        //ce = funcArrayUni.quitaRepetido(ce);
        //Resultado final
        funcArrayUni.muestraArrayInt(ce);
    }
}

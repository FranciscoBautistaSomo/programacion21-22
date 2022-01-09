package libriaMatematica;

//Ejercicio 41 para triangulo normal.
public class funcDibuja {
    public static String linea(char caracter, int repeticiones) {
        String linea ="";
        for (int i = 0; i < repeticiones; i++) {
            linea +=caracter;
        }
        return linea;
    }
    //Ejercicio 42 para triangulo hueco.
    public static String lineaConHuecos(char caract, int repet) {
        String lineaH ="";
        char hueco =' ';
        for (int i = 0; i < repet; i++) {
            if (i==0) {
                lineaH+=caract;
            } else {
                lineaH+=hueco;
            }
            if (i==repet-2) {
                lineaH+=caract;
            }
        }
        return lineaH;
    }

    public static String lineaHueco( int rep) {
        String lineaHueco ="";
        char hueco =' ';

        //int aux = rep-3;
        for (int j = 0; j < rep; j++) {
            lineaHueco +=hueco;
        }               
        return lineaHueco;
    }
}

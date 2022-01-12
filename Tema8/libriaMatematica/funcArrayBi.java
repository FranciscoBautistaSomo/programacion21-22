package libriaMatematica;

public class funcArrayBi {
    //Ejercicio 29 generar array
    public static int[][] generaArrayBiInt(int fila, int columna, int min, int max) {
        int arrayBi[][] = new int[fila][columna];
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                arrayBi[i][j]=(int)(Math.random()*(max-min+1)+min);
            }
        }
        return arrayBi;
    }

    public static void muestraArrayIntBi(int matriz[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%3d |",matriz[i][j]);    
            }
            System.out.println();
        }
    }
    //Ejercicio 30 ver fila i.
    public static int[] filaDeArrayBiInt(int matriz[][], int fila) {
        int[] matFila = new int[matriz[0].length];
        for (int j = 0; j < matriz[0].length; j++) {
            matFila[j]=matriz[fila][j];
        }
        return matFila;
    }
    //Ejercicio 31 ver fila i.
    public static int[] columnaDeArrayBiInt(int matriz[][], int columna) {
        int[] matColum = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            matColum[i]=matriz[i][columna];
        }
        return matColum;
    }
    //Ejercicio 32 sacar coordenadas de un valor encontrado en un array.
    public static int[] coordenadasEnArrayBiInt(int x[][], int numBus) {
        int[] coord= new int[2];
        /*int fb=-1;
        int cb=-1;*/
        boolean encotrado= false;
        for (int i = 0; i < x.length && !encotrado; i++) {
            for (int j = 0; j < x[0].length && !encotrado; j++) {
                if (x[i][j]==numBus) {
                    coord[0]=i;
                    coord[1]=j;
                    encotrado = true;
                }
            }
        }
        if (!encotrado) {
            coord[0]=-1;
            coord[1]=-1;
        }
        return coord;
    }
    //Ejercicio 33 sacar si un numero es puntodesilla => mínimo en su fila y máximo en su columna.
    public static boolean esPuntoDeSilla(int x[][], int f, int c) {
        int[]fila = filaDeArrayBiInt(x, f);
        int[]colum = columnaDeArrayBiInt(x, c);
        boolean ptoSilla = false;
        if (funcArrayUni.minimoArrayInt(fila)==x[f][c]&&funcArrayUni.maximoArrayInt(colum)==x[f][c]) {
            ptoSilla = true;
        }
        return ptoSilla;
    }

    //Ejercicio 34 sacar diagonal de array bi en array uni.
    public static int[] diagonal(int x[][], int f, int c, String direc) {        
        int[] diagonalAux = new int[1000];        
        int aux = 0;        
            for (int i = 0; i < x.length; i++) {
                for (int j = 0; j < x[0].length; j++) {
                    if ( (((c-j)==(f-i)) && (direc.equals("nose"))) || (((c-j)==(i-f)) && (direc.equals("neso"))) ) {
                        diagonalAux[aux]=x[i][j];
                        aux++;
                    }
                }
            }
            int[] diagonal = new int[aux];
                for (int j = 0; j < aux; j++) {
                    diagonal[j]=diagonalAux[j];
            }        
        return diagonal;
        
    }

    public static int[] diagonal_2(int x[][], int f, int c, String direc) {
        int[] diagonalAux = new int[1000];
        int aux =0;
        if ((f-c>0) && (direc.equals("nose"))) {
            for (int i = f-c; i < x.length; i++) {
                for (int j = 0; j < x[0].length; j++) {
                    if (f-c>0) {  
                        diagonalAux[aux]=x[i][j];
                        aux++;
                    }                   
                }
            }       
        }
        int[] diagonal = new int[aux];
                for (int j = 0; j < aux; j++) {
                    diagonal[j]=diagonalAux[j];
            }        
        return diagonal;
    }
}

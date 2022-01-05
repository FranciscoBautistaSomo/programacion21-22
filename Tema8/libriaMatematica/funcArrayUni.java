package libriaMatematica;


public class funcArrayUni {
    //Ejercicio 20 generar array
    public static int[] generaArrayInt( int n, int min, int max) {
        int matriz[] = new int[n];
        for (int i = 0; i < matriz.length; i++) {
            matriz[i]=(int)(Math.random()*(max-min+1)+min);
        }
        return matriz;
    }

    //Mostrar array
    public static void muestraArrayInt(int z[]) {
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]+", ");
        }
        System.out.println();
    }

    //Ejercicio 21 Valor mínimo del array
    public static int minimoArrayInt(int x[]) {
        int minimo = Integer.MAX_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < minimo){
                minimo = x[i];
            }
        }
        return minimo;
    }

    //Ejercicio 22 Valor máximo del array
    public static int maximoArrayInt(int x[]) {
        int maximo = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > maximo){
                maximo = x[i];
            }
        }
        return maximo;
    }

    //Ejercicio 23 Media del array
    public static double mediaArrayInt(int x[]) {
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            total +=x[i];
        }
        return ((double)total/x.length);
    }

    //Ejercicio 24 Confirma que un número esta en el array.
    public static boolean estaEnArrayInt(int y[], int num) {
        boolean esta = false;
        for (int i : y) {
            if(i == num){
                esta = true;
            }
        }
        /*for (int i = 0; i < y.length; i++) {
            if(y[i] == num){
                esta = true;
            }
        }*/
        return esta;
    }

    //Ejercicio 25 Nos da la posicion en el array si un número esta en el array.
    public static int posicionEnArray(int y[], int num) {
        int posicion = 0;
        boolean esta = false;
        for (int j = 0; j < y.length; j++){                   
            if(y[j] == num && !esta){
                posicion = j;
                esta = true;
            }
        }
        return posicion;
    }

    //Ejercicio 26 Voltear array.
    public static int[] volteaArrayInt(int y[]) {
        int b[] = new int[y.length];
        for (int i = 0; i < y.length; i++) {
            b[i]=y[y.length-i-1];
        }
        return b;
    }

    //Ejercicio 27 Rotar array derecha.
    public static int[] rotaDerechaArrayInt(int x[], int pos) {
        int aux;
        int[] a = x.clone();
        while (pos-- > 0) {
            aux =a[a.length-1];
            for (int i = a.length-1; i > 0; i--) {
                a[i] = a[i-1]; 
            }
            a[0]=aux;
        }        
        return a;
    }
    
    //Ejercicio 28 Rotar array derecha.
    public static int[] rotaIzquierdaArrayInt(int x[], int pos) {
        int aux;
        int[] a = x.clone();
        while (pos-- > 0) {
            aux =a[0];
            for (int i = 0; i < a.length-1; i++) {
                a[i] = a[i+1]; 
            }
            a[a.length-1]=aux;
        }        
        return a;
    }
}


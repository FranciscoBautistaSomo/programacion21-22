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

    //Ejercicio36.
    // Devuelve un array con todos los
    // números primos que se encuentren
    // en otro array que se pasa como
    // parámetro.
    // Obviamente el tamaño del array
    // que se devuelve será menor o
    // igual al que se pasa como
    // parámetro.
    public static int[] filtrarPrimos(int x[]) {
        int aux = 0;        
        int [] arrayPrimosAux = new int[x.length];
        
        for (int i = 0; i < x.length; i++) {
            if (funcMates.esPrimo(x[i])) {
                arrayPrimosAux[aux]=x[i];
                aux++;
            } else {
                arrayPrimosAux[aux]=-1;
            }
        }
        int [] arrayPrimos = new int[aux];
        if (aux == 0) {
            aux = 1;
            arrayPrimos = new int[aux];
            arrayPrimos[0]=-1;
            return arrayPrimos;
        } else {
            for (int i = 0; i < arrayPrimos.length; i++) {
            arrayPrimos[i] = arrayPrimosAux[i];
            }       
            return arrayPrimos;
        }
    }
    //Ejercicio38.
    // Devuelve un array con todos los números
    // capicúa que se encuentren en otro array
    // que se pasa como parámetro.
    // Obviamente el tamaño del array que se
    // devuelve será menor o igual al que se
    // pasa como parámetro.
    public static int[] filtraCapicuas(int x[]) {
        int aux = 0;        
        int [] arrayCapicuaAux = new int[x.length];
        
        for (int i = 0; i < x.length; i++) {
            if (funcMates.esCapicua(x[i])) {
                arrayCapicuaAux[aux]=x[i];
                aux++;
            } else {
                arrayCapicuaAux[aux]=-1;
            }
        }
        int [] arrayCapicua = new int[aux];
        if (aux == 0) {
            aux = 1;
            arrayCapicua = new int[aux];
            arrayCapicua[0]=-1;
            return arrayCapicua;
        } else {
            for (int i = 0; i < arrayCapicua.length; i++) {
                arrayCapicua[i] = arrayCapicuaAux[i];
            }       
            return arrayCapicua;
        }
    }
    //Ejercicio40.
    // Devuelve un array con todos los números
    // que contienen el 7 (por ej. 7, 27, 782)
    // que se encuentren en otro array que se
    // pasa como parámetro. El tamaño del array
    // que se devuelve será menor o igual al
    // que se pasa como parámetro.
    public static int[] filtraCon7(int x[]) {
        int aux = 0;        
        int [] arrayCon7Aux = new int[x.length];
        
        for (int i = 0; i < x.length; i++) {
            if (funcMates.posicionDeDigito(x[i], 7)!= -1) {
                arrayCon7Aux[aux]=x[i];
                aux++;
            } else {
                arrayCon7Aux[aux]=-1;
            }
        }
        int [] arrayCon7 = new int[aux];
        if (aux == 0) {
            aux = 1;
            arrayCon7 = new int[aux];
            arrayCon7[0]=-1;
            return arrayCon7;
        } else {
            for (int i = 0; i < arrayCon7.length; i++) {
                arrayCon7[i] = arrayCon7Aux[i];
            }       
            return arrayCon7;
        }
    }

}


import libriaMatematica.funcArrayBi;
import libriaMatematica.funcArrayUni;
public class Ejercicio29_34 {
    public static void main(String[] args) {
        
        System.out.print("Ingrese el numero de filas de la matriz:");
        int fila = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese el numero de columnas de la matriz:");
        int columna = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese el valor menor de la matriz:");
        int min = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese el valor mayor de la matriz:");
        int max = Integer.parseInt(System.console().readLine());
        System.out.println("<----------------------------------------------------->");
        //Generar Array
        int a[][] = funcArrayBi.generaArrayBiInt(fila,columna,min,max);

        //Mostrar Array
        funcArrayBi.muestraArrayIntBi(a);

        //Sacar fila dada.
        /*System.out.print("Introduzca la fila que quiere sacar: ");
        int f = Integer.parseInt(System.console().readLine());
        int mf[] = funcArrayBi.filaDeArrayBiInt(a, f);

        funcArrayUni.muestraArrayInt(mf);

        //Sacar columna dada.
        System.out.print("Introduzca la columna que quiere sacar: ");
        int c = Integer.parseInt(System.console().readLine());
        int mc[] = funcArrayBi.columnaDeArrayBiInt(a, c);

        funcArrayUni.muestraArrayInt(mc);
        
        //Sacar coordenadas de un numero buscado en el array.
        System.out.print("Introduzca el número que quiere buscar: ");
        int numero = Integer.parseInt(System.console().readLine());
        int[] coordenadas = funcArrayBi.coordenadasEnArrayBiInt(a, numero);

        funcArrayUni.muestraArrayInt(coordenadas);
        
        int[][] b = {{11, 10, 9}, {4, 5, 7}, {2, 6, 1}};
        //Sacar los valores que sean punto silla
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (funcArrayBi.esPuntoDeSilla(b, i, j)) {
                    System.out.printf("El valor %d en la fila %d y la columna %d es punto silla",b[i][j], i, j);
                }
            }
        }*/

        //Ejercicio sacar diagonal.
        System.out.print("Introduzca la fila para iniciar la diagonal:");
        int filaDia = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la columna para iniciar la diagonal:");
        int columDia = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la dirección de la diagonal(nose o neso):");
        String dierccion = System.console().readLine();
        int[] diagonal = funcArrayBi.diagonal(a, filaDia, columDia, dierccion);

        funcArrayUni.muestraArrayInt(diagonal);
    
    }
}

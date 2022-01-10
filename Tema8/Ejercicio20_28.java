import libriaMatematica.funcArrayUni;
public class Ejercicio20_28 {
    public static void main(String[] args) {
        int numeroBuscado = 0;
        System.out.print("Ingrese el tamaño de la matriz:");
        int dimMatriz = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese el valor menor de la matriz:");
        int min = Integer.parseInt(System.console().readLine());
        System.out.print("Ingrese el valor mayor de la matriz:");
        int max = Integer.parseInt(System.console().readLine());
        System.out.println("<----------------------------------------------------->");
        //Generar Array
        int a[] = funcArrayUni.generaArrayInt(dimMatriz, min, max);

        //Mostrar por consola Array
        funcArrayUni.muestraArrayInt(a);
        
        //Valor mínimo array
        System.out.println("El valor mínimo del array es: "+funcArrayUni.minimoArrayInt(a));
        //Valor máximo array
        System.out.println("El valor máximo del array es: "+funcArrayUni.maximoArrayInt(a));
        
        //La media del array
        System.out.println("El valor medio del array es: "+funcArrayUni.mediaArrayInt(a));

        //Buscar un numero en un array.
        System.out.print("Introduzca el número buscado en el array: ");
        numeroBuscado = Integer.parseInt(System.console().readLine());

        if (funcArrayUni.estaEnArrayInt(a,numeroBuscado)) {
            System.out.println("El "+numeroBuscado+" se ecuentra en el array.");
            System.out.println("Y esta en la posición: "+funcArrayUni.posicionEnArray(a, numeroBuscado));
        }else{
            System.out.println("El "+numeroBuscado+" no se ecuentra en el array.");
        }

        //Voltear array
        int b[] = funcArrayUni.volteaArrayInt(a);

        funcArrayUni.muestraArrayInt(b);

        //Rotar a la derecha n posiciones.
        System.out.print("¿Cuantas posiciones quiere rotar el array a la derecha?");
        int posiciones = Integer.parseInt(System.console().readLine());
        int c[] = funcArrayUni.rotaDerechaArrayInt(a, posiciones);

        funcArrayUni.muestraArrayInt(c);

        //Rotar a la izquierda n posiciones.
        System.out.print("¿Cuantas posiciones quiere rotar el array a la izquierda?");
        posiciones = Integer.parseInt(System.console().readLine());
        int d[] = funcArrayUni.rotaIzquierdaArrayInt(a, posiciones);

        funcArrayUni.muestraArrayInt(d);

    }
}

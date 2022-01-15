import libriaMatematica.funcMates2;
public class Ejercicio35 {

    public static void main(String[] args) {
        int numero = 0;        
        System.out.print("Introduzca el número a transformar a polotes: ");
        numero = Integer.parseInt(System.console().readLine());
        System.out.println("El "+numero+" en palotes es: "+funcMates2.convierteEnPalotes(numero)); 
    }
     
}

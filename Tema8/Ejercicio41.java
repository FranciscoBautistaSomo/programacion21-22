import java.io.IOException;

import libriaMatematica.funcDibuja;

public class Ejercicio41 {
    public static void main(String[] args) throws IOException{
        char caracter;
        int repeticiones = 0;
        System.out.print("Introduzca el caracter a dibujar: ");
        caracter = (char)System.in.read();
        System.out.print("Introduzca la altura del triangulo: ");
        repeticiones = Integer.parseInt(System.console().readLine());

        for (int i = repeticiones; i > 0; i--) {
            System.out.println(funcDibuja.linea(caracter, i));  
            
        }
    }
}

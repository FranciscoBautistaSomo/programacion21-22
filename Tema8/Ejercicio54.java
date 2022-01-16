import libriaMatematica.*;
public class Ejercicio54 {
    public static void main(String[] args) {
        int numero, digito, ocurr=0;        
        int []n = funcArrayUni.generaArrayInt(10, 1, 10);
        funcArrayUni.muestraArrayInt(n);
        /*System.out.print("Introduzca un número: ");
        numero = Integer.parseInt(System.console().readLine());*/
        System.out.print("Introduzca un dígito buscado: ");
        digito = Integer.parseInt(System.console().readLine());
        /*System.out.println("Hay "+funcMates.ocurrencias(digito, numero)+" ocurrencia/s encontradas.");*/        
        ocurr = funcArrayUni.ocurrencias(digito, n);
        System.out.println("Hay "+ocurr+" ocurrencia/s encontradas en el array.");
    }
}

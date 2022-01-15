import libriaMatematica.*;
public class Ejercicio51 {
    public static void main(String[] args) {
        int [] numeros = funcArrayUni.generaArrayInt(10, 2, 100);
        funcArrayUni.muestraArrayInt(numeros);
        for (int i = 0; i < numeros.length; i++) {
            if (funcMates.esPrimo(numeros[i])==true && funcMates.esCapicua(numeros[i])==true) {
                System.out.println("El "+numeros[i]+" es primo y es capicua");
            }
            if (funcMates.esPrimo(numeros[i])==false && funcMates.esCapicua(numeros[i])==true) {
                System.out.println("El "+numeros[i]+" no es primo y es capicua");
            }
            if (funcMates.esPrimo(numeros[i])==true && funcMates.esCapicua(numeros[i])==false) {
                System.out.println("El "+numeros[i]+" es primo y no es capicua");
            }  
            if (funcMates.esPrimo(numeros[i])==false && funcMates.esCapicua(numeros[i])==false) {
                System.out.println("El "+numeros[i]+" no es primo y no es capicua");
            }              
        }

    }
}

import libriaMatematica.*;
//import libriaMatematica.esCapicua;

public class Ejercicio1_14{
    public static void main(String[] args) {
        int numero = 0;
        int sgNumePrimo = 0;
        long potenciado = 1;
        boolean verPrimo = false;
        boolean capicuo = false;
        System.out.print("Introduzca un número entero: ");
        numero = Integer.parseInt(System.console().readLine());
        
        //Calculo si un número es capicuo.
        capicuo = funcMates.esCapicua(numero);
        
        if (capicuo==true)
        {
          System.out.println("El número "+numero+" es capicuo.");
        }else{
          System.out.println("El número "+numero+" no es capicuo.");
        }
        
        //Calcular si un numero es primo.
        verPrimo = funcMates.esPrimo(numero);

        if(verPrimo == true){
            System.out.println("El número "+numero+" es primo.");
        }else{
            System.out.println("El número "+numero+" no es primo.");
        }

        //Cálculo del numero menor siguiente.
        sgNumePrimo = funcMates.siguientePrimo(numero);
        System.out.println("El siguiente numero primo es "+sgNumePrimo);

        //Calculo de la potencia
        System.out.println("Introduzca el exponente a calcular.");
        long numeroLong = (long)numero;
        long exp = Long.parseLong(System.console().readLine());
        potenciado = funcMates.potencia(numeroLong, exp);
        System.out.println("La potencia calculada es: "+potenciado);

        //Cálculo del número de digitos
        int numdigitos = funcMates.numDigit(numero);
        System.out.println("El "+numero+" tiene "+numdigitos+" digito/s,");

        //Voltear número.
        System.out.println("El "+numero+" volteado queda "+funcMates.volteado(numero));
    }
}

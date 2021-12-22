import libriaMatematica.*;
//import libriaMatematica.esCapicua;

public class Ejercicio1_14{
    public static void main(String[] args) {
        int numero = 0;
        int sgNumePrimo = 0;
        long potenciado = 1;
        boolean verPrimo = false;
        boolean capicuo = false;
        int opcion = 0;
        int digito = 0;

        System.out.print("Introduzca un número entero ahora: ");
        numero = Integer.parseInt(System.console().readLine());       
        System.out.println("<-----------------Menú------------>");
        System.out.println("1- Averiguar capicuo.");
        System.out.println("2- Calcular si es primo.");
        System.out.println("3- Calcular el número primo siguiente.");
        System.out.println("4- Calcular la potencia.");
        System.out.println("5- Calcular el número de digitos.");
        System.out.println("6- Voltear número.");
        System.out.println("7- Sacar el digito N del numero.");
        System.out.println("8- Averiguar la posicion de un digito dado dentro del número.");
        System.out.println("9- Quitar al número n dígitos por detrás (por la derecha).");
        System.out.println("10- Quitar al número n dígitos por delante (por la izquierda).");
        System.out.println("11- Añadir al número un digito por detrás (por la izquierda).");
        System.out.print("¿Qué desea hacer con el número.(1-10)?");
        opcion =Integer.parseInt(System.console().readLine());

        switch (opcion) {
          case 1:
            //Calculo si un número es capicuo.
            capicuo = funcMates.esCapicua(numero);        
            if (capicuo==true)
            {
              System.out.println("El número "+numero+" es capicuo.");
            }else{
              System.out.println("El número "+numero+" no es capicuo.");
            }            
            break;
          case 2:
            //Cálculo del numero primo siguiente.
            sgNumePrimo = funcMates.siguientePrimo(numero);
            System.out.println("El siguiente numero primo es "+sgNumePrimo);
            break;
          case 3:
            //Calculo de la potencia
            System.out.println("Introduzca el exponente a calcular.");
            long numeroLong = (long)numero;
            long exp = Long.parseLong(System.console().readLine());
            potenciado = funcMates.potencia(numeroLong, exp);
            System.out.println("La potencia calculada es: "+potenciado);
            break;
          case 4:
            //Cálculo del número de digitos
            int numdigitos = funcMates.numDigit(numero);
            System.out.println("El "+numero+" tiene "+numdigitos+" digito/s,");        
            break;
          case 5:
            //Voltear número.
            System.out.println("El "+numero+" volteado queda "+funcMates.volteado(numero));
            break;
          case 6:
            //Sacar el digito N de un numero
            System.out.println("Introduzca la posición del "+numero+" que desea extraer: ");
            int posicion = Integer.parseInt(System.console().readLine());
            if (posicion > 0) {
              posicion--; 
            }               
            System.out.println("El digito extraido es: "+funcMates.digitoN(numero, posicion));
            break;
          case 7:
            //Sacar la posicion de un digito dado
            System.out.println("Introduzca el digito buscado en el "+numero+" dado.");
            digito = Integer.parseInt(System.console().readLine());
            break;
          case 8:
            //averiguar la posicion de un digito dado dentro de un número.
            if (funcMates.posicionDeDigito(numero, digito)==-1) {
              System.out.println("Número no encontrado");
            }else {
              System.out.println("El número buscado se  encuentra en la posicion "+funcMates.posicionDeDigito(numero, digito)); 
            }
            break;
          case 9:
            //Le quita a un número n dígitos por detrás (por la derecha).
            int digitcorta = 0;
            do {
              System.out.println("Introduzca el numero de digitos que quiere cortar del "+numero+" detrás.");
              digitcorta = Integer.parseInt(System.console().readLine());          
            } while (digitcorta >funcMates.numDigit(numero));
            System.out.println("El numero cortado queda "+funcMates.quitarPorDetras(numero, digitcorta));
            break;
          case 10:
            //Le quita a un número n dígitos por delante (por la izquierda).
            int digitcortaDel = 0;
            do {
              System.out.println("Introduzca el numero de digitos que quiere cortar del "+numero+" delante.");
              digitcortaDel = Integer.parseInt(System.console().readLine());          
            } while (digitcortaDel >funcMates.numDigit(numero));
            System.out.println("El numero cortado queda "+funcMates.quitarPorDelante(numero, digitcortaDel));
            break;
          case 11:
              System.out.println("Introduzca el digito que quiere pegar al "+numero+" detras.");
              digito = Integer.parseInt(System.console().readLine());
              System.out.println("El nuevo número es "+funcMates.pegarPorDetras(numero, digito));
          default:
            System.out.println("Error, opción no encotrada.");
            break;
        }  
    }
}

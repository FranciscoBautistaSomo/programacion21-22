import libriaMatematica.funcMates2;
public class Ejercicio19 {
    public static void main(String[] args) {
        long convertido =0L;
        String covertTxt = "";
        long numeroIn = 0L;

        System.out.println("<------MENU CONVERSIONES-------->");
        System.out.println(" 1) Pasar de Binario a Octal");
        System.out.println(" 2) Pasar de Binario a Decimal");
        System.out.println(" 3) Pasar de Binario a Hexadecimal");
        System.out.println(" 4) Pasar de Octal a Binario");
        System.out.println(" 5) Pasar de Octal a Decimal");
        System.out.println(" 6) Pasar de Octal a Hexadecimal");
        //System.out.println(" 7) Pasar de Decimal a Binario");<-
        //System.out.println(" 8) Pasar de Decimal a Octal");<-
        //System.out.println(" 9) Pasar de Decimal a Hexadecimal");<-
        System.out.println("10) Pasar de Hexadecimal a Binario");
        System.out.println("11) Pasar de Hexadecimal a Octal");
        //System.out.println("12) Pasar de Hexadecimal a Decimal");<-
        System.out.print("Elija una opcion: ");
        int opcion = Integer.parseInt(System.console().readLine());

        if (opcion>=10) {
            System.out.print("Introduzca el número que quiere convertir: ");
            String numeroInTxt = System.console().readLine();
        }else{
            System.out.print("Introduzca el número que quiere convertir: ");
            numeroIn = Long.parseLong(System.console().readLine());
        }

        

        switch (opcion) {
            case 1:
                convertido = funcMates2.decimalOctal(funcMates2.binarioDecimal(numeroIn));
                System.out.println("El numero en octal es "+convertido);
                break;
            case 2:
                convertido = funcMates2.binarioDecimal(numeroIn);
                System.out.println("El numero en decimal es "+convertido);                
                break;                
            case 3:
                covertTxt = funcMates2.decimalHexa(funcMates2.binarioDecimal(numeroIn));
                System.out.println("El numero en hexadecimal es "+covertTxt);                
                break;
            case 4:
                convertido = funcMates2.decimalBinario(funcMates2.octalDecimal(numeroIn));
                System.out.println("El numero en binario es "+convertido);
                break;
            case 5:
                convertido = funcMates2.octalDecimal(numeroIn);
                System.out.println("El numero en decimal es "+convertido);
                break;    
            default:
                System.out.println("Error, opción no encontrada.");
                break;
        }
       
        //System.out.println();
        //System.out.print("El número "+numDecimal+" en octal equivale a :"+funcMates2.decimalOctal(numDecimal));
        //System.out.println();
        //System.out.print("El número "+numDecimal+" en binario equivale a :"+funcMates2.decimalHexa(numDecimal));*/

        //Transformar octal a decimal
        //System.out.println("El "+octalNum+" en decimal es igual a: "+funcMates2.octalDecimal(octalNum));
        //Transformar hexa a decimal
        //System.out.println("El "+hexaNum+" en decimal es igual a: "+funcMates2.hexaDecimal(hexaNum));

       }    



}

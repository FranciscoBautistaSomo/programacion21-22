package libriaMatematica;

public class funcMates2{
     

    //Potencia Ejercicio 4
    public static long potencia(long numero, int exp){
      long poten=1;
      if (exp == 0) {
        poten=1;
      }else{
        for (int i = 1; i <= exp; i++) {
          poten *= numero;
        }
      }
           
      return poten;
    }

    //Número de digitos Ejercicio 5
    public static int digitos(long numero) {
      int numeroDigitos =0;
      do {
        numero /=10;
        numeroDigitos++;
      } while (numero > 0);
      return numeroDigitos;
    }

    
    // Ejercicio 7
    public static int digitoN(long numero, int pos) {
      int numeroArray[];
      numeroArray = new int[digitos(numero)];
      int arrayPos[] = new int[digitos(numero)];      
      int i = 0;
      do {        
        long resto = numero%10;
        numero /= 10;        
        numeroArray[i]=(int)resto;
        i++;      
        
      } while (numero >0);
     
      for (int k = 0; k < numeroArray.length; k++) {
        arrayPos[numeroArray.length-1-k]=numeroArray[k];
      }      
      return arrayPos[pos];
    }     

    //Ejercicio 17 Pasar de binario a Decimal.
    public static long binarioDecimal(long binario) {
      long decimal = 0;
      int dig = digitos(binario);
      int aux = dig-1;
      for (int i = 0; i < dig; i++) {
        
        int multi = digitoN(binario, i);
        decimal +=(long)multi*(int)potencia(2, aux);
        aux--;       
      }
      return decimal;
    }

    //Ejercicio 18 Pasar de Decimal a binario.
    public static long decimalBinario(int decimal) {
      String binarioTxt = "";
      //int dig = digitos(decimal);
      int resto = 0;
      int cociente;
      do {
        resto = decimal%2;
        decimal= decimal/2;
        cociente = decimal;
        binarioTxt=resto+binarioTxt;
      } while (cociente >0);

      return Long.parseLong(binarioTxt);
    }
    //Ejercicio 19 Conversiones varias.
    // De decimal a Octal.
    public static long decimalOctal(int decimal) {
      String octalTxt = "";
      //int dig = digitos(decimal);
      int resto = 0;
      int cociente;
      do {
        resto = decimal%8;
        decimal= decimal/8;
        cociente = decimal;
        octalTxt=resto+octalTxt;
      } while (cociente >0);

      return Long.parseLong(octalTxt);
    }
    // De octal a decimal
    public static long octalDecimal(long octal) {
      long decimal =0;
      int dig = digitos(octal);
      int aux = dig-1;
      for (int i = 0; i < dig; i++) {
        
        int multi = digitoN(octal, i);
        decimal +=(long)multi*potencia(8, aux);
        aux--;       
      }
      return decimal;
    }
}

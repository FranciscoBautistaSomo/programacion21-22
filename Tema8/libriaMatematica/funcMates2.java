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
    public static long decimalBinario(long decimal) {
      String binarioTxt = "";
      //int dig = digitos(decimal);
      int resto = 0;
      long cociente;
      do {
        resto = (int)decimal%2;
        decimal= decimal/2;
        cociente = decimal;
        binarioTxt=resto+binarioTxt;
      } while (cociente >0);

      return Long.parseLong(binarioTxt);
    }
    //Ejercicio 19 Conversiones varias.
    // De decimal a Octal.
    public static long decimalOctal(long decimal) {
      String octalTxt = "";
      //int dig = digitos(decimal);
      int resto = 0;
      long cociente;
      do {
        resto = (int)decimal%8;
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

     // De decimal a Hexa.
     public static String decimalHexa(long decimal) {
      String hexaTxt = "";
      //int dig = digitos(decimal);
      String arrayHexa []={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
      int resto = 0;
      long cociente;
      do {
        resto = (int)decimal%16;
        decimal= decimal/16;
        cociente = decimal;
        hexaTxt=arrayHexa[resto]+hexaTxt;
      } while (cociente >0);

      return hexaTxt;
    }

    // De hexa a decimal
    public static long hexaDecimal(String hexa) {
      long decimal =0;
      String digitosHexa = "0123456789ABCDEF";
      int dig = hexa.length();
      int aux = dig-1;
      for (int i = 0; i < dig; i++) {
        
        //int multi = hexa.charAt(i)-'0';
        int multi = digitosHexa.indexOf(hexa.charAt(i));
        decimal +=(long)multi*potencia(16, aux);
        aux--;       
      }
      return decimal;
    }
    //Ejercicio 35 convertir a palotes.
    public static String convierteEnPalotes(int n) {
      String palotes="";
      int resto = 0;
      String unidad ="";
      int digito = 0;
      do {
        resto = n%10;
        n /=10;
        unidad ="";
        digito++;
        if (resto>0) {          
          for (int i = 0; i < resto; i++) {
            unidad +=  "|";
            if ((i==resto-1) && (digito>1)) {
              unidad += "-";
            } 
          }
        }else if(resto==0){
            unidad +="-";
        }
        palotes = unidad+palotes;        
      } while (n>0);

      return palotes;
      
    }
}

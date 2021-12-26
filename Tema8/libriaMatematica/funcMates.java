package libriaMatematica;

public class funcMates{
  
    //Capicuo. Ejercicio 1
    public static boolean esCapicua(int numero){
        boolean capicua=false;
        int numeroAux = numero;
        //int resto = 0;        
        int volteado = 0;
        while (numero>0){
          volteado = (volteado*10)+(numero %10);
          numero/= 10;        
        }        
        if (volteado==numeroAux){
          capicua = true;
        }      
        return capicua;
    } 

    //Averiguar primo. Ejercicio 2
    public static boolean esPrimo(int numero){
        boolean primo=true;
        if (numero < 2) {
          primo = false;
        }else{
          for (long i =numero/2; i >= 2; i--) {
            if (numero % i == 0){
                primo = false;
            }
           }
        }                
        return primo;
    }
    //Siguiente Primo. Ejercicio 3
    public static int siguientePrimo(int numero) {
      do {         
        numero++;
      } while (esPrimo(numero)== false);
      return numero;
    }

    //Potencia Ejercicio 4
    public static long potencia(long numero, long exp){
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
    public static int digitos(int numero) {
      int numeroDigitos =0;
      do {
        numero /=10;
        numeroDigitos++;
      } while (numero > 0);
      return numeroDigitos;
    }

    //Voltear numero Ejercicio 6
    public static int volteado(int numero) {
      int auxNumero = numero;
      int volteado = 0;
      while (numero>0){
        volteado = (volteado*10)+ (numero %10);
        numero/= 10;        
      }
      
      if (digitos(auxNumero) > digitos(volteado)) {
        int aux = digitos(auxNumero)-digitos(volteado);
        volteado *=potencia(10, aux);
      }
      return volteado;
    }
    // Ejercicio 7
    public static int digitoN(int numero, int pos) {
      int numeroArray[];
      numeroArray = new int[digitos(numero)];
      int arrayPos[] = new int[digitos(numero)];      
      int i = 0;
      do {        
        int resto = numero%10;
        numero /= 10;        
        numeroArray[i]=resto;
        i++;      
        
      } while (numero >0);
     
      for (int k = 0; k < numeroArray.length; k++) {
        arrayPos[numeroArray.length-1-k]=numeroArray[k];
      }      
      return arrayPos[pos];
    }
    
    //Ejercicio 8
    public static int posicionDeDigito(int numero, int digito) {
      int numeroArray[];
      numeroArray = new int[digitos(numero)];

      numero = volteado(numero);
      int i = 0;
      do {        
        int resto = numero%10;
        numero /= 10;        
        numeroArray[i]=resto;
        i++;       
      } while (numero >0);

      for (int j = 0; j < numeroArray.length; j++) {
        if (numeroArray[j]==digito) {
          return j;
        }
      }
      return -1;

    }    
    
    // Ejercicio 9
    public static int quitarPorDetras(int numero, int digit) {
      for (int i = 0; i < digit; i++) {
        numero /= 10;
      }
      return numero;      
    }

    // Ejercicio 10
    public static int quitarPorDelante(int numero, int digit) {
      int aux = 0;
      int digitos = digitos(numero);
      if (digit < digitos) {
        aux = digitos - digit;
      }else if(digit>=digitos){
        return -1;
      }
      //int resto = 1;
      int divisor = (int)potencia(10, aux);
      return numero%divisor;          
    }

    // Ejercicio 11
    public static int pegarPorDetras(int numero, int numPega) {
      return numero=numero*10+numPega; 
    }

    //Ejercicio 12
    public static int pegarPorDelante(int numero, int numPegaDel) {
      int potencia = (int)potencia(10, digitos(numero));      
      return numero = (numPegaDel*potencia)+numero;
    }

    //Ejercicio 13
    public static int trozoDeNumero(int numero, int posIni, int posFin) {
      int numeroArray[];
      numeroArray = new int[digitos(numero)];
      int arrayPos [] = new int[digitos(numero)];
      int trozo =0;      
      int i = 0;

      do {        
        int resto = numero%10;
        numero /= 10;        
        numeroArray[i]=resto;
        i++;        
      } while (numero >0);

      for (int k = 0; k < numeroArray.length; k++) {
        arrayPos[numeroArray.length-1-k]=numeroArray[k];
      } 
      int aux =(posFin-posIni);
      for (int j = posIni; j <= posFin; j++) {        
          trozo+=arrayPos[j]*(int)potencia(10, (aux));
          aux--;
      }
      return trozo;
    }

    //Ejercicio 14
    public static int juntaNumeros(int numero, int numero2) {
      int auxNumero2 = digitos(numero2);
      int numeroJunto = numero*(int)potencia(10, auxNumero2)+numero2;
      return numeroJunto;
    }

    //Ejercicio 17 Pasar de binario a Decimal.
    public static int binarioDecimal(int binario) {
      int decimal =0;
      int dig = digitos(binario);
      int aux = dig-1;
      for (int i = 0; i < dig; i++) {
        
        /*if (aux>0) {
          aux--;
        }*/
        int multi = funcMates.digitoN(binario, i);
        decimal +=multi*(int)potencia(2, aux);
        aux--;       
      }
      return decimal;
    }

    //Ejercicio 18 Pasar de Decimal a binario.
    public static long decimalBinario(int decimal) {
      String binarioTxt = "";
      long binario = 0L;
      //int dig = digitos(decimal);
      int resto = 0;
      int cociente;
      do {
        resto = decimal%2;
        decimal= decimal/2;
        cociente = decimal;
        binarioTxt=resto+binarioTxt;
      } while (cociente >0);

      return binario = Long.parseLong(binarioTxt);

      
    }
}

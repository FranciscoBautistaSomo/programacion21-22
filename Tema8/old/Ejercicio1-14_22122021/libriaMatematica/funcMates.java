package libriaMatematica;

public class funcMates{
  
    //Capicuo. Ejercicio 1
    public static boolean esCapicua(int numero){
        boolean capicua=false;
        int numeroAux = numero;
        int resto = 0;        
        int volteado = 0;
        while (numero>0){
          volteado = (volteado*10)+ (numero %10);
          numero/= 10;        
        }
        
        if (volteado==numeroAux)
        {
          capicua = true;
        }      
        return capicua;
    } 

    //Averiguar primo. Ejercicio 2
    public static boolean esPrimo(int numero){
        boolean primo=true;
        for (int i = 2; i < numero; i++) {
         if ((numero % i) == 0){
             primo = false;
         }
        }        
        return primo;
    }

    //Siguiente Primo. Ejercicio 3
    public static int siguientePrimo(int numero) {
      int sgPrimo = numero+1;
      do {         
        sgPrimo++;
      } while (esPrimo(sgPrimo)== false);

      return sgPrimo;
    }

    //Potencia Ejercicio 4
    public static long potencia(long numero, long exp){
      long poten=1;
      for (int i = 1; i <= exp; i++) {
        poten *= numero;
      }      
      return poten;
    }

    //Número de digitos Ejercicio 5
    public static int numDigit(int numero) {
      int numeroDigitos =0;

      do {
        numero /=10;
        numeroDigitos++;
      } while (numero > 0);
      return numeroDigitos;
    }

    //Voltear numero Ejercicio 6
    public static int volteado(int numero) {
      int volteado = 0;
      while (numero>0){
        volteado = (volteado*10)+ (numero %10);
        numero/= 10;        
      }
      return volteado;
    }
    // Ejercicio 7
    public static int digitoN(int numero, int pos) {
      int numeroArray[];
      numeroArray = new int[numDigit(numero)];
      
      numero = volteado(numero);
      int i = 0;
      do {        
        int resto = numero%10;
        numero /= 10;        
        numeroArray[i]=resto;
        i++;      
        
      } while (numero >0);

      return numeroArray[pos];
    }
    // Ejercicio 8
    public static int posicionDeDigito(int numero, int digito) {
      int numeroArray[];
      numeroArray = new int[numDigit(numero)];

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
      numero = funcMates.volteado(numero);
      for (int i = 0; i < digit; i++) {
        numero /= 10;
      }
      numero = funcMates.volteado(numero);
      return numero;      
    }

    // Ejercicio 11
    public static int pegarPorDetras(int numero, int numPega) {
      return numero=numero*10+numPega; 
    }
}

package libriaMatematica;

public class funcMates{
  
    //Capicuo.
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

    //Averiguar primo.
    public static boolean esPrimo(int numero){
        boolean primo=true;
        for (int i = 2; i < numero; i++) {
         if ((numero % i) == 0){
             primo = false;
         }
        }        
        return primo;
    }

    //Siguiente Primo.
    public static int siguientePrimo(int numero) {
      int sgPrimo = numero+1;
      do {         
        sgPrimo++;
      } while (esPrimo(sgPrimo)== false);

      return sgPrimo;
    }

    //Potencia
    public static long potencia(long numero, long exp){
      long poten=1;
      for (int i = 1; i <= exp; i++) {
        poten *= numero;
      }      
      return poten;
    }

    //Número de digitos
    public static int numDigit(int numero) {
      int numeroDigitos =0;

      do {
        numero /=10;
        numeroDigitos++;
      } while (numero > 0);
      return numeroDigitos;
    }

    public static int volteado(int numero) {
      int volteado = 0;
      while (numero>0){
        volteado = (volteado*10)+ (numero %10);
        numero/= 10;        
      }
      return volteado;
    }
}

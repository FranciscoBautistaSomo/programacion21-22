import libriaMatematica.*;
public class Ejercicio15 {
    
    public static void main(String[] args) {
        boolean primo = true;        
        for (int i = 1; i <= 1000; i++) {
            primo = funcMates.esPrimo(i);
            if (primo) {
                System.out.println(i);
            }
        }
    }
}

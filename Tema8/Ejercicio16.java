import libriaMatematica.funcMates;

public class Ejercicio16 {
    public static void main(String[] args) {
        boolean capicua = false;        
        for (int i = 1; i <= 99999; i++) {
            capicua = funcMates.esCapicua(i);
            if (capicua) {
                System.out.println(i);
            }
        }
    }
}

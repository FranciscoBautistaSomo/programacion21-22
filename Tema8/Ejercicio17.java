import libriaMatematica.funcMates;

public class Ejercicio17 {
    public static void main(String[] args) {
        int binarioNum = 0;
        boolean esbinario = true;
        System.out.print("Introduzca un número binario a transformar a decimal: ");
        binarioNum = Integer.parseInt(System.console().readLine());
        int dig = funcMates.digitos(binarioNum);
        //Comprobar si es binario.
        do {
            esbinario = true;
            for (int i = 0; i < dig; i++) {
                if (funcMates.digitoN(binarioNum, i)>1  ){
                    esbinario = false;
                }
            }
            if (!esbinario) {
                System.out.print("Error, "+ binarioNum+" no es binario. Introduzca un número binario: ");
                binarioNum = Integer.parseInt(System.console().readLine());
            }    

        } while (!esbinario);
        
        //Transformar a decimal
        System.out.println("El "+binarioNum+" en decimal es igual a:"+funcMates.binarioDecimal(binarioNum));
        
    }
}
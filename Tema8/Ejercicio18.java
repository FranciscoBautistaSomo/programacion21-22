import libriaMatematica.funcMates;
import libriaMatematica.funcMates2;
public class Ejercicio18 {
    public static void main(String[] args) {
     int numDecimal=0;
     //int numBinario=0;
     boolean correcto = true;
     do {
        System.out.print("Introduzca un número decimal mayor de 0: ");
        numDecimal=Integer.parseInt(System.console().readLine());
        if (numDecimal<0) {
            correcto = false;
            System.out.print("Error,El número decimal tiene qu ser mayor que 0.");            
        }else{
            correcto = true;
        }
     } while (!correcto);

     System.out.print("El número "+numDecimal+" en binario equivale a :"+funcMates2.decimalBinario(numDecimal));
     

    }
}

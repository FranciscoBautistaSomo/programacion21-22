import libriaMatematica.funcMates2;
public class Ejercicio19 {
    public static void main(String[] args) {
        int numDecimal=0;
        long octalNum = 0L;
        //int numBinario=0;
        boolean correcto = true;
        System.out.print("Introduzca un número octal a transformar a decimal: ");
        octalNum = Long.parseLong(System.console().readLine());
        /*do {
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
        System.out.println();
        System.out.print("El número "+numDecimal+" en octal equivale a :"+funcMates2.decimalOctal(numDecimal));*/
        
        //Transformar octal a decimal
        System.out.println("El "+octalNum+" en octal es igual a: "+funcMates2.octalDecimal(octalNum));
   
       }    



}

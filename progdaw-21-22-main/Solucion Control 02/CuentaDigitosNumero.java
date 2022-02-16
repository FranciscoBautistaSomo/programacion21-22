public class CuentaDigitosNumero {
  public static void main (String[] args) {
    long numero;
    
    int[] digitos = new int[10];
    
    System.out.print("Introduzca un número entero: ");
    numero = Long.parseLong(System.console().readLine());
    
    for (int i=0; i<10; i++) {
      digitos[i] = 0;
    }
    
    do {
      int digito = (int)(numero % 10);
      digitos[digito]++;
      numero = numero / 10;
    } while (numero>0);
   
    
    for (int i=0; i<10; i++) {
      if (digitos[i]>0)
        System.out.println("El dígito '"+i+"' aparece "+digitos[i]+" veces.");
    }
    
    
  }
}

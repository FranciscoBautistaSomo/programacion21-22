//Ejercicio 1 control 1 programacion 18/19

public class Ejercicio1{
  public static void main(String[]args){
    int numero,aux, cociente;
    int binarioInt=0;
    int inverso=0;
    int digitos=0;
    String binario="";
    
    do
    {
      
      System.out.print("Introduzca un número a convertir a binario: ");
      numero = Integer.parseInt(System.console().readLine());
      if ((numero <=0)||(numero>9999)){
          System.out.println("Error, número no valido. Introduzca un valor mayor que 0 y menor que 9999");
      }      
    } while ((numero <=0)||(numero>9999));
    
    cociente = numero;
    int resto;
    
    do
    {
      resto = cociente%2;      
      cociente /= 2;
      binario +=resto;
      digitos++;      
      
    }while (cociente!=0);
    
    System.out.println(digitos);
    System.out.println(binario);
    
    binarioInt = Integer.parseInt(binario);
    
    //invertimos numero binario
    for (int i = 0; i <digitos ; i++)
    {
      inverso=(inverso*10)+(binarioInt%10);
      binarioInt /=10;
    } 
    
    System.out.printf("El número %d en binario es igual a: %d",numero, inverso);
  
  }

}

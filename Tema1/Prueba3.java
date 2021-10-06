public class Prueba3 {


  public static void main (String[] args){

  //Declaración de variables
    int nota1=0,nota2=0, nota3=0;
    float notaDecimal = 6.7256f;
        
   //Solicitud de valores
    System.out.print("Introduzca un valor entero: ");
    
           
    nota1 = Integer.parseInt(System.console().readLine());
    
    /*System.out.print("La número introducido es: ");
    System.out.println(nota1);*/
    
    //En esta cadena se pasa a string nota1
    System.out.printf("La número %d es el introducido  ",nota1);
    System.out.printf("Ejemplo de nota %10.20f con decimales.",notaDecimal);
  }

}

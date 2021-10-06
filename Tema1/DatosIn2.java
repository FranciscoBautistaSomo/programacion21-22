public class DatosIn2 {


  public static void main (String[] args){

  //Declaración de variables
    int nota1=0,nota2=0, nota3=0;
        
   //Solicitud de valores
    System.out.print("Introduzca un valor entero: ");
    
           
    nota1 = Integer.parseInt(System.console().readLine());
    
    /*System.out.print("La número introducido es: ");
    System.out.println(nota1);*/
    
    //En esta cadena se pasa a string nota1
    System.out.print("La número introducido es: "+nota1);
  }

}

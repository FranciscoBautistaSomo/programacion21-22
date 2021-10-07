public class EjemploIf_ver2 {

  public static void main(String[] args){
    
    //Ejemplo de uso de estructuras condicionales.
    
    int n;
    int resto;
    String salida ="El número introducido es ";
    
    System.out.print("Introduzca un entero: ");
    
    n = Integer.parseInt(System.console().readLine());
    
    resto = n % 2;
    
    if ( resto == 0){          
        salida =salida + "par.";
      }
      else
      {          
        salida =salida+"impar.";        
      }
    
      System.out.println(salida);
  }



}

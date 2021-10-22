//Ejercicio 7 de la relación de ejercicios Tema 5 Bucles.
public class Ejercicio7{
  /*Realiza el control de acceso a una caja fuerte. La combinación será un
  número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
  acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
  y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
  Tendremos cuatro oportunidades para abrir la caja fuerte.*/
  public static void main(String[]args){
    int convinacionIn=0;
    final int convinacion = 1234;
    
    
      do{
        System.out.println("Introduzca la convinación para abrir la caja (4 digitos): ");
        convinacionIn = Integer.parseInt(System.console().readLine());
        
        if (convinacionIn == convinacion){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");            
          }else{
            System.out.println("Lo siento, esa no es la combinación");            
          } 
      
      }while(convinacionIn != convinacion);
  
  
  }

}

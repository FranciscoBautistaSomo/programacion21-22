//Ejercicio 3 de la relación del Tema 4 Sentencias condicionales.

public class Ejercicio3{
  public static void main(String[] args){
  
    int numDia=1;    
    
    System.out.print("Introduzca el número del día de la semana que quiere saber (1-7): ");
    
    numDia = Integer.parseInt(System.console().readLine()); 
    
    
    switch(numDia){
      
      case 1:
        System.out.printf("El número %d que ha introducido equivale al Lunes.",numDia);
        break;
        
      case 2:
        System.out.printf("El número %d que ha introducido equivale al Martes.",numDia);
        break;
        
      case 3:
        System.out.printf("El número %d que ha introducido equivale al Miercoles.",numDia);
        break;
        
      case 4:
        System.out.printf("El número %d que ha introducido equivale al Jueves.", numDia);
        break;
        
      case 5:
        System.out.printf("El número %d que ha introducido equivale al Viernes.", numDia);
        break;
      
      case 6:
        System.out.printf("El número %d que ha introducido equivale al Sábado.", numDia);
        break;
      
      case 7:
        System.out.printf("El número %d que ha introducido equivale al Domingo.", numDia);
        break;
        
      default:
        System.out.printf("El número %d que ha introducio no se reconoce como un día de semana.",numDia);
    }
  
  
  
  }




}

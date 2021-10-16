//Ejercicio 22 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio22{
  /*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
    hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
    Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
    por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
    a las 15:00h.*/
  public static void main(String[] args){
    String diaSemana = " ";
    int hora = 0;
    int minutos = 0;
    int minFinde = 0;
    int horaEnMinutos=0;
    
    System.out.print("Introduzca el día de la semana: ");
    diaSemana = System.console().readLine();
    System.out.print("Introduzca la hora: ");
    hora = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca los minutos: ");
    minutos = Integer.parseInt(System.console().readLine());
    
    horaEnMinutos= (hora*60)+minutos;
    
    switch (diaSemana){
      case "Lunes":
        minFinde = 6660-horaEnMinutos;
        System.out.printf("Quendan %d minutos para el fin de semana.",minFinde);
        break;
      case "Martes":
        minFinde = 5220-horaEnMinutos;
        System.out.printf("Quendan %d minutos para el fin de semana.",minFinde);
        break;
      case "Miercoles":
        minFinde = 3780-horaEnMinutos;
        System.out.printf("Quendan %d minutos para el fin de semana.",minFinde);
        break;
      case "Jueves":
        minFinde = 2340-horaEnMinutos;
        System.out.printf("Quendan %d minutos para el fin de semana.",minFinde);
        break;
      case "Viernes":
        if(horaEnMinutos >= 900){
          System.out.print("Felicidades ya es fin de semana.");
          }else {
                minFinde = 900-horaEnMinutos;        
                System.out.printf("Quendan %d minutos para el fin de semana.",minFinde);
                }          
          break;
        
      default:
        System.out.print("El día introducido no se reconoce");       
      
      }  
  
  
  }
}

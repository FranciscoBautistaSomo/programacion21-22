public class HorarioISP {
  public static void main (String[] args) {
    
    String diaSemana;
    int diaSemanaNum=0;
    
    int horaInicio;
    int numHoras;
    

    System.out.print("Indique el día de la semana (en minúscula): ");
    diaSemana = System.console().readLine();
    
    System.out.print("Indique la hora de inicio (0-23): ");
    horaInicio = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique el n.o de horas: ");
    numHoras= Integer.parseInt(System.console().readLine());

    
    switch (diaSemana) {
      case "lunes":
        diaSemanaNum=0;
        break;
      case "martes":
        diaSemanaNum=1;
        break;
      case "miércoles":
        diaSemanaNum=2;
        break;
      case "jueves":
        diaSemanaNum=3;
        break;
      case "viernes":
        diaSemanaNum=4;
        break;
      case "sábado":
        diaSemanaNum=5;
        break;
      case "domingo":
        diaSemanaNum=6;
        break;
      default:
    }
    
    System.out.println();
        
    System.out.print("┌───");
    for (int i=0; i<24; i++) {
      System.out.print("┬──");
    }
    System.out.println("┐");
    
    System.out.print("│   ");
    for (int i=0; i<24; i++) {
      System.out.printf("│%2d",i);
    }
    System.out.println("│");
    
    for (int i=0; i<7; i++) {
      System.out.print("├───");
      for (int j=0; j<24; j++) {
        System.out.print("┼──");
      }
      System.out.println("┤");
      
      String diaCorto="";
      switch (i) {
        case 0:
          diaCorto = "L";
          break;
        case 1:
          diaCorto = "M";
          break;
        case 2:
          diaCorto = "X";
          break;
        case 3:
          diaCorto = "J";
          break;
        case 4:
          diaCorto = "V";
          break;
        case 5:
          diaCorto = "S";
          break;
        case 6:
          diaCorto = "D";
          break;
        default:
      }
    
      
      System.out.printf("│%2s ",diaCorto);
      for (int j=0; j<24; j++) {
        String marca="";
        if (numHoras>0) {
          if ((i==diaSemanaNum) && (j>=horaInicio)) {
            marca = "X";
            numHoras--;
          } else if (i>diaSemanaNum) {
            marca = "X";
            numHoras--;
          }
        }
        System.out.printf("│%2s",marca);
      }
      System.out.println("│");
    }
    
    System.out.print("└───");
    for (int i=0; i<24; i++) {
      System.out.print("┴──");
    }
    System.out.println("┘");    
    
    
  }
}

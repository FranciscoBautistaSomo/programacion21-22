public class CalendarioMes {
  public static void main (String[] args) {
    String mes;
    String diaSemana;
    boolean bisiesto = false;
    
    int numDias = 31;
    int diaSemanaNum=0;
    
    System.out.print("Indique el mes (en minúscula): ");
    mes = System.console().readLine();
    if (mes.equals("febrero")) {
      System.out.print("¿Es un año bisiteso? (s/n) ");
      bisiesto = System.console().readLine().equals("s")?true:false;
    }
    
    System.out.print("Indique el día de la semana en el que empieza el mes (en minúscula): ");
    diaSemana = System.console().readLine();
    
    switch (mes) {
      case "abril":
      case "junio":
      case "septiembre":
      case "noviembre":
        numDias=30;
        break;
      case "febrero":
        if (bisiesto) {
          numDias=29;
        } else {
          numDias=28;
        }
      default:      
    }
    
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
    
    System.out.println("┌───┬───┬───┬───┬───┬───┬───┐");
    System.out.println("│ L │ M │ X │ J │ V │ S │ D │");
    
    int diaAPintar=-diaSemanaNum;
    
    while (diaAPintar<numDias) {
      System.out.println("├───┼───┼───┼───┼───┼───┼───┤");
      System.out.print("│");
      for (int i=0; i<7; i++) {
        diaAPintar++;
        if ((diaAPintar<=0 || diaAPintar>numDias)) {
          System.out.print("   │");
        } else {
          System.out.printf("%2d │",diaAPintar);
        }
        
      }
      System.out.println();
    }
    System.out.println("└───┴───┴───┴───┴───┴───┴───┘");
    
    
  }
}

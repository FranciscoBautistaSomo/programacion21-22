//Ejercicio 10 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio10{
  public static void main(String[]args){
    
    int diaNac = 0;
    int mesNac = 0;
    System.out.println("Programa para averiguar el signo zodiacal a partir del día y mes de nacimiento.");
    System.out.print("Introduzca el día de nacimiento ");
    diaNac = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca el mes de nacimiento ");
    mesNac = Integer.parseInt(System.console().readLine());
    
    switch(mesNac){
      case 1:
        if(diaNac <=19){
            System.out.print("Su signo zodiacal es: Capricornio");
          }else {
            System.out.print("Su signo zodiacal es: Acuario");
          }
          break;
      case 2:
        if(diaNac <=18){
            System.out.print("Su signo zodiacal es: Acuario");
          }else {
            System.out.print("Su signo zodiacal es: Piscis");
          }
          break;
      case 3:
        if(diaNac <=20){
            System.out.print("Su signo zodiacal es: Piscis");
          }else {
            System.out.print("Su signo zodiacal es: Aries");
          }
          break;
      case 4:
        if(diaNac <=20){
            System.out.print("Su signo zodiacal es: Aries");
          }else {
            System.out.print("Su signo zodiacal es: Tauro");
          }
          break;
      case 5:
        if(diaNac <=20){
            System.out.print("Su signo zodiacal es: Tauro");
          }else {
            System.out.print("Su signo zodiacal es: Géminis");
          }
          break;
      case 6:
        if(diaNac <=20){
            System.out.print("Su signo zodiacal es: Géminis");
          }else {
            System.out.print("Su signo zodiacal es: Cáncer");
          }
          break;
      case 7:
        if(diaNac <=20){
            System.out.print("Su signo zodiacal es: Cáncer");
          }else {
            System.out.print("Su signo zodiacal es: Leo");
          }
          break;
      case 8:
        if(diaNac <=21){
            System.out.print("Su signo zodiacal es: Leo");
          }else {
            System.out.print("Su signo zodiacal es: Virgo");
          }
          break;
      case 9:
        if(diaNac <=22){
            System.out.print("Su signo zodiacal es: Virgo");
          }else {
            System.out.print("Su signo zodiacal es: Libra");
          }
          break;
      case 10:
        if(diaNac <=22){
            System.out.print("Su signo zodiacal es: Libra");
          }else {
            System.out.print("Su signo zodiacal es: Escorpio");
          }
          break;                          
      case 11:
        if(diaNac <=22){
            System.out.print("Su signo zodiacal es: Escorpio");
          }else {
            System.out.print("Su signo zodiacal es: Sagitario");
          }
          break;
      case 12:
        if(diaNac <=20){
            System.out.print("Su signo zodiacal es: Sagitario");
          }else {
            System.out.print("Su signo zodiacal es: Capricornio");
          }
          break;
      default: 
            System.out.print("Mes no reconocido. Introduzca un mes valido (1-12)");                                        
      }
      
     
  }




}

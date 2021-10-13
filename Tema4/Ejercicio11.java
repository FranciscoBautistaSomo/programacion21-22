//Ejercicio 11 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio11{
  public static void main(String[] args){
    int hora=0;
    int minutos=0;
    int segDia = 86400;
    int horaSeg = 0;
    System.out.println("Programa para calcular los segundos que quedan para llegar a la medianoche, dada una (hora y minutos)");
    System.out.print("Introduzca la hora (0-23): ");
    hora = Integer.parseInt(System.console().readLine());
    System.out.print("Introduzca los minutos (0-59): ");
    minutos = Integer.parseInt(System.console().readLine());
    
    horaSeg = (hora * 3600) + (minutos * 60);
    
    if((hora ==0)&&(minutos==0)){
        
        System.out.print("Ya es medianoche.");
      }else{
            System.out.print("Los segundos que quedan hasta la medianoche son: "+(segDia-horaSeg)+" segundos");        
        }  
  }



}

//Ejercicio 28 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio28{
  /*Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
  su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
  incorrecta, el programa deberá mostrar un mensaje de error.*/
  public static void main(String[]args){
    String jugador1;
    String jugador2;
    int jugadaJugador1=0;
    int jugadaJugador2=0;
    
    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera):");
    jugador1 = System.console().readLine();
    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera):");
    jugador2 = System.console().readLine();
    //Codificación jugadas.
    switch (jugador1){
      case "piedra": jugadaJugador1=1;break;
      case "papel":  jugadaJugador1=2;break;
      case "tijera": jugadaJugador1=3;break;
      default:
      System.out.printf("Error jugador 1, opción %s no valida\n",jugador1);
      }
    switch (jugador2){
      case "piedra": jugadaJugador2=1;break;
      case "papel":  jugadaJugador2=2;break;
      case "tijera": jugadaJugador2=3;break;
      default:
      System.out.printf("Error jugador 2, opción %s no valida\n",jugador2);
      }
      
      //Jugada empate.
      if(jugadaJugador1 == jugadaJugador2){
          System.out.println("EMPATE");
        }
      //Jugadas ganadoras jugador 1  
        else if((jugadaJugador1==1) && (jugadaJugador2==3)){
          System.out.println("JUGADOR 1 GANA");
          }else if((jugadaJugador1==2) && (jugadaJugador2==1)){
          System.out.println("JUGADOR 1 GANA");
          }else if((jugadaJugador1==3) && (jugadaJugador2==2)){
          System.out.println("JUGADOR 1 GANA");
          }
        //Jugadas ganadoras jugador 2 
        else if((jugadaJugador2==1) && (jugadaJugador1==3)){
          System.out.println("JUGADOR 2 GANA");
          }else if((jugadaJugador2==2) && (jugadaJugador1==1)){
          System.out.println("JUGADOR 2 GANA");
          }else if((jugadaJugador2==3) && (jugadaJugador1==2)){
          System.out.println("JUGADOR 2 GANA");
          }
        else {
          System.out.print("Jugada no reconocida.");
          }
  }


}

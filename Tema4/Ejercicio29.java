//Ejercicio 2 de la relación de ejercicios Tema 4 Sentencias condicionales.

public class Ejercicio29 {
	/* Realiza un programa que calcule el precio de un desayuno. El programa
  preguntará primero qué ha tomado el usuario de comer: palmera, donut o
  pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
  programa debe preguntar además si era con aceite o con tortilla; el primero
  vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
  café a 1’50 y 1’20 respectivamente.*/
  
	public static void main (String[] args) {
		String comer = " ";
    String comerPitufo=" ";    
    String beber = " ";
    double precioComer = 0.00;
    double precioBeber = 0.00;
    
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    comer = System.console().readLine();
    
      if(comer.equals("pitufo")){
        System.out.print("¿Con qué quiere el pitufo? (aceite o tortilla):");
        comerPitufo = System.console().readLine();}        
        
    System.out.print("¿Qué ha tomado de beber? (zumo o cafe):");
    beber = System.console().readLine();
    
    switch (comer){
      case "palmera":
        precioComer =1.40;
        System.out.println(comer+": "+precioComer+" €");
        break;
      case "donut":
        precioComer =1.00;
        System.out.println(comer+": "+precioComer+" €");
        break;
      case "pitufo":
        
        if (comerPitufo.equals("aceite")){precioComer =1.20;}
        else if(comerPitufo.equals("tortilla")){precioComer =1.60;}
        else {System.out.println("Error la opción no existe." );};        
        System.out.println(comer+" "+comerPitufo+": "+precioComer+" €");
        break;
       default:
        System.out.println("Error la opción no existe." );
      }
      
      switch(beber){
        case("zumo"):
          precioBeber=1.50;
          System.out.println(beber+": "+precioBeber+" €");
          break;
        case("cafe"):
          precioBeber=1.20;
          System.out.println(beber+": "+precioBeber+" €");
          break;
        default :
          System.out.println("Error la opción no existe." );
        }
      
      System.out.println("total desayuno: "+(precioComer+precioBeber)+" €");
      
    
	}
}


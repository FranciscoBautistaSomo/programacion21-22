//Ejercicio 20 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio20{
	/*programa que diga si un número entero positivo introducido por
  teclado es capicúa. Se permiten números de hasta 5 cifras.*/
	public static void main (String[] args) {
    
    //boolean capicua = false;
    int numero = 0;
    int numUltimo = 0;
    int numPrimero = 0;
    int numSegundo = 0;
    int numTercero = 0;
    int numCuarto=0;
    
    System.out.print("Introduce el numero que desea evaluar: ");
    numero=Integer.parseInt(System.console().readLine());
    
    if ((numero <= 10) ||(numero >= 100000)){
      System.out.print("Error, numero no valido.Introduzca un número mayor de 10 \n y menor de 100000.");
      }else if((numero>10) && (numero<=99)){
          
          numPrimero = numero /10;
          numUltimo = numero % 10;
          if (numPrimero == numUltimo){
              System.out.printf("El %d es capicuo.",numero);
            }else{
                System.out.printf("El %d no es capicuo.",numero);
              }        
        }else if((numero>99) && (numero<=999)){
          numPrimero = numero /100;
          numUltimo = numero % 10;
          if (numPrimero == numUltimo){
              System.out.printf("El %d es capicuo.",numero);
            }else{
                System.out.printf("El %d no es capicuo.",numero);
              } 
          }else if((numero>999) && (numero<=9999)){
          numPrimero = numero /1000;
          numSegundo = (numero /100) - (numPrimero*10);
          numTercero = (numero /10) - (numPrimero*100)-(numSegundo*10);
          numUltimo = numero % 10;
          /*System.out.println("Numero segundo: "+numSegundo);
          System.out.println("Numero tercero: "+numTercero);*/
          if ((numPrimero == numUltimo) && (numSegundo == numTercero)){
              System.out.printf("El %d es capicuo.",numero);
            }else{
                System.out.printf("El %d no es capicuo.",numero);
              } 
          }else if((numero>9999) && (numero<=99999)){
          numPrimero = numero /10000;
          numSegundo = (numero /1000) - (numPrimero*10);
          numCuarto = (numero /10) - ((numero/100)*10);
          numUltimo = numero % 10;
          /*System.out.println("Numero primero: "+numPrimero);
          System.out.println("Numero segundo: "+numSegundo);
          System.out.println("Numero cuarto: "+numCuarto);*/
          if ((numPrimero == numUltimo) && (numSegundo ==numCuarto)){
              System.out.printf("El %d es capicuo.",numero);
            }else{
                System.out.printf("El %d no es capicuo.",numero);
              } 
          }
    
		
	}
}


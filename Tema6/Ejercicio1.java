//Ejercicio 1 de la relación de ejercicios Tema 6 Número Aleatorio.


public class Ejercicio1 {
	
	public static void main (String[] args) {
    
    int dado1 = (int)(Math.random()*6)+1;
    System.out.println("Dado1: "+dado1);
    int dado2 = (int)(Math.random()*6)+1;
    System.out.println("Dado2: "+dado2);
    int dado3 = (int)(Math.random()*6)+1;
    System.out.println("Dado3: "+dado3);
    
    int total = dado1+dado2+dado3;
    
    System.out.print("La suma total de de la tirada es: "+total);
		
	}
}


//Ejercicio 13 de la relación de ejercicios Tema 6 Número Aleatorio.


public class Ejercicio13 {
	
	public static void main (String[] args) {
		int dado1=0;
    int dado2=1;
    
    while (dado1 != dado2)
    {
       dado1 = (int)(Math.random()*6);
       dado2 = (int)(Math.random()*6);
    }
    System.out.print("Dados iguales: "+dado1+"="+dado2);
    
	}
}


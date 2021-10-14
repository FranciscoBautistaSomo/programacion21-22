//Ejercicio 13 de la relación de ejercicios Tema 4 Sentencias condicionales.

public class Ejercicio13 {
	//Ordenar tres numeros de mayor a menor.
	public static void main (String[] args) {
    int numero1=0;
    int numero2=0;
    int numero3=0;
    int aux=0;
    System.out.println("Introduzca un número 1: ");
    numero1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca un número 2: ");
    numero2 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduzca un número 3: ");
    numero3 = Integer.parseInt(System.console().readLine());
		
    if (numero1 > numero3){
        aux = numero1;
        numero1 = numero3;
        numero3 = aux;
      }
    if (numero1 > numero2){
        aux = numero1;
        numero1 = numero2;
        numero2 = aux;
      }
    if (numero2 > numero3){
        aux = numero2;
        numero2 = numero3;
        numero3 = aux;
      }
      System.out.println("Los numeros ordenados son: ");
      System.out.println(numero3);
      System.out.println(numero2);
      System.out.println(numero1);
	}
}


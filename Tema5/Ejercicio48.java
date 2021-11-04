//Ejercicio 48 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;
public class Ejercicio48 {
  
  /*Realiza un programa que diga los dígitos que aparecen y los que no aparecen
  en un número entero introducido por teclado. El orden es el que se muestra en
  los ejemplos. Utiliza el tipo long para que el usuario pueda introducir números
  largos.*/
	
	public static void main (String[] args) {
    int numeroIntroducido;
    int aux;
    int digito = 0;
    String numerosAparecen = " ";
    String numerosNoAparecen = " ";
    boolean esta=false;
    Scanner txt = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    numeroIntroducido = txt.nextInt();
    aux = numeroIntroducido;
    
    //Comprobar los números que están.
    while ((aux >0) || (esta))
    {       
      digito = aux % 10;
      aux /=10;
      
      for (int i = 0; i <= 9; i++)
      {
        esta = false;
        if (i == digito)
        {
          numerosAparecen += " "+i;
          esta = true;
        } 
      }
    }
    
    ////Comprobar los números que no están.
    aux = numeroIntroducido;
    for (int j = 0; j <= 9; j++)
    {
      esta = false;
      aux = numeroIntroducido;
            
      do
      { 
        digito = aux % 10;
        aux /=10;              
        if (j == digito)
        { 
          esta = true;
        } 
      } while (aux>0);
      if (!esta)
      {
        numerosNoAparecen += " "+j;
      }      
    }
       
    
    System.out.println("Dígitos que aparecen en el número: "+numerosAparecen);
    System.out.print("Dígitos que no aparecen: "+numerosNoAparecen);
    
    
	}
}


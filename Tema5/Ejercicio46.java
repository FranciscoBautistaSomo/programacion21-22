//Ejercicio 46 de la relación de ejercicios Tema 5 Bucles.
import java.util.Scanner;

public class Ejercicio46 {
	
  /*Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
  asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
  que tanto la anchura como la altura sean mayores o iguales que 2, en caso
  contrario se debe mostrar un mensaje de error.*/
  
	public static void main (String[] args) {
		
    int altura, anchura;
    Scanner txt = new Scanner(System.in);
    
    //Introducimos datos y comprobamos que son correctos.
    do
    {
      System.out.print("Introduzca la anchura del rectángulo (como mínimo 2): ");
      anchura = txt.nextInt();
      
      System.out.print("Ahora introduzca la altura (como mínimo 2): ");
      altura = txt.nextInt();
      
      if ((anchura<2) || (altura<2))
      {
        System.out.print("Error, los datos introducidos no son correctos, altura y anchura deben ser mayores de 2.");
      }else
      {
        System.out.print("OK, los datos son correctos.");
      }     
    } while ((anchura<2) || (altura<2));
    
    /*System.out.println("Altura: "+altura);
    System.out.println("Anchura: "+anchura);*/
    
    System.out.println();
    //Dibujamos el rectangulo
    int huecos=anchura-2; 
    for (int i = 0; i < altura-2 ; i++)
    {
      //Dibujar tapa sup.
      if( i == 0){
        for (int j = 0; j <anchura ; j++)
        {
        //System.out.print("*");          
          System.out.print("*");
        }
        System.out.println();
      }       
        System.out.print("*");
      //Dibujar huecos.
      for (int k = 0; k <huecos ; k++)
      {
        System.out.print(" ");
      }
      System.out.println("*");
      
      //Dibujar tapa inf
      if(i == altura-3){
        for (int j = 0; j <anchura ; j++)
        {
        //System.out.print("*");
        
          System.out.print("*");
        }
      }
    } 
	}
}


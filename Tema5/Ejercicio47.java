//Ejercicio 47 de la relación de ejercicios Tema 5 Bucles.


public class Ejercicio47 {
	/*Con motivo de la celebración del día de la mujer, el 8 de marzo, nos han
  encargado realizar un programa que pinte un 8 por pantalla usando la letra
  M. Se pide al usuario la altura, que debe ser un número entero impar mayor
  o igual que 5. Si el número introducido no es correcto, el programa deberá
  mostrar un mensaje de error. A continuación se muestran algunos ejemplos.
  La anchura de la figura siempre será de 6 caracteres.*/     
   
	public static void main (String[] args) {
    int altura;
    String simbolo = "M";
    String hueco = " ";
    //Introducir la altura.   
    do
    {
      System.out.print("Por favor, introduzca la altura (número impar mayor o igual a 5): ");
      altura = Integer.parseInt(System.console().readLine());
    } while ((altura<5) || (altura%2 == 0));
    
    for (int i = 0; i <altura ; i++)
    {      
      if ((i==0)||(i==altura/2)||(i==altura-1))
      {
        //Ancho
        for (int j = 0; j <6 ; j++)
        {           
            System.out.print(simbolo);          
        }
      }else{
          System.out.println();
          System.out.print(simbolo);
          //huecos.
          for (int k = 1; k <5 ; k++)
          {
            System.out.print(hueco);
          }
          System.out.println(simbolo);
        }
     }
 	}
}


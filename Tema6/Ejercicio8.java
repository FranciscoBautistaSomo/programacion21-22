//Ejercicio 8 de la relación de ejercicios Tema 6 Número Aleatorio.


public class Ejercicio8 {
	
	public static void main (String[] args) {
		int resultadoPartido=0;
    int columnas =3;
    for (int fila = 1; fila <=15 ; fila++)
    {
      System.out.printf(" %2d |",fila);
      /*if (fila == 15) {
          columnas = 1;
        }*/
      for (int apuesta = 1; apuesta <=columnas ; apuesta++)
      {
      resultadoPartido = (int)(Math.random()*6);
      
      switch (resultadoPartido)
        {
        case 0:
        System.out.print(" 1 |");
        break;
        case 1:
        System.out.print(" 1 |");
        break;
        case 2:
        System.out.print(" 1 |");
        break;
        case 3:
        System.out.print(" X |");
        break;
        case 4:
        System.out.print(" X |");
        break;
        case 5 :
        System.out.print(" 2 |");
        break;          
        default:
          
        }
      }
    System.out.println();
    }
	}
}


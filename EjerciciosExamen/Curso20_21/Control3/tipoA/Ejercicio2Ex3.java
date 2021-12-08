//Ejercicio 2 examen 3 curso 2020/21
import java.util.Scanner;

public class Ejercicio2Ex3{
	
	public static void main (String[] args) {
		final int numUsuario;
    final int FILA;
    final int COLUMNA;
    int numeroIn;
    boolean igual=false;
    Scanner txt = new Scanner(System.in);
    int indiceAle = 0;
    
    int usuarioNum[];
    int matriz[][];
    
    System.out.print("Introduzca la cantidad de elementos del conjunto aleatorio base: ");
    numUsuario = txt.nextInt();
    
    usuarioNum = new int[numUsuario];
    
    for (int i = 0; i < numUsuario; i++)
    {
      usuarioNum[i] = 0;
    }
    
    
    for (int i = 0; i < numUsuario; i++)
    {
      System.out.print("Introduzca un valor aleatorio base: ");
      numeroIn = txt.nextInt();
        if(i>0){         
          do
          {
            for (int j = 0; j < i; j++)
            {
              if (numeroIn != usuarioNum[j])
              {
                usuarioNum[i]=numeroIn;
                igual = false;
              }else{
                System.out.print("Dato repetido. Introduzca un valor aleatorio base: ");
                numeroIn = txt.nextInt();
                igual = true;
              }             
            }           
          } while (igual == true);
        }    
      usuarioNum[i]=numeroIn;     
    }
    
    System.out.println("Los valores que podrán ser elegidos aleatoriamente son los siguientes: ");
    for (int i = 0; i < numUsuario; i++)
    {
      System.out.printf("%3d ",usuarioNum[i]);
    }
    System.out.println();
    
    System.out.print("Indique el tamaño de la matriz bidimensional a ser rellenada - filas: ");
    FILA = txt.nextInt();
    System.out.print("Indique el tamaño de la matriz bidimensional a ser rellenada - columnas: ");
    COLUMNA = txt.nextInt();
    
    matriz = new int[FILA][COLUMNA];
    
    for (int i = 0; i <FILA ; i++)
    {
      for (int j = 0; j < COLUMNA; j++)
      {
        indiceAle = (int)(Math.random()*numUsuario);
        matriz[i][j]= usuarioNum[indiceAle];
      }
      
    }
    
    //Mostrar matriz
    
    for (int i = 0; i < FILA; i++)
    {
        for (int j = 0; j < COLUMNA; j++)
        {
          System.out.printf("%3d ",matriz[i][j]);
        }
        System.out.println();
    }
    
    
    
    
	}
}


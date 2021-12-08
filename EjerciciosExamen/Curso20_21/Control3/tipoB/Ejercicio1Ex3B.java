//Ejercicio 1 examen 3B curso 2020/21

public class Ejercicio1Ex3B {
	
	public static void main (String[] args) {
		int udimen;
    int undimen[]; 
    int FILAS;
    int COLUMNAS;
    int matriz[][];
    
    
    System.out.print("Introduzca el tamaño de la matriz unidimensional: ");
    udimen = Integer.parseInt(System.console().readLine());
    
      undimen = new int[udimen];     
    
      for (int i = 0; i <udimen ; i++)
      {
        System.out.print("Introduzca elemento "+(i+1)+"º:");
        undimen[i] = Integer.parseInt(System.console().readLine());        
        //System.out.println();
      }
      
    System.out.print("Introduzca el tamaño de la matriz bidimensional - filas: ");
    FILAS = Integer.parseInt(System.console().readLine());  
    
    System.out.print("Introduzca el tamaño de la matriz bidimensional - columnas: ");
    COLUMNAS = Integer.parseInt(System.console().readLine());
    
    System.out.println();
    
    System.out.print("La matriz unidimensional de origen es: \n");
    
    for (int i = 0; i < udimen; i++)
    {
      System.out.print(undimen[i]+" ");
    }
    
    System.out.println();
    
    matriz = new int[FILAS][COLUMNAS];
    int aux =0;
    for (int i = 0; i < FILAS; i++)
    {
      for (int j = 0; j <COLUMNAS ; j++)
      {
        if (aux<udimen)
        {
          matriz[i][j] = undimen[aux];
          aux++;
        }else
        {
          matriz[i][j] = -1;
        }
        /*if ((i+j+(i*2))<udimen)
        {
          matriz[i][j] = undimen[i+j+(i*2)];
        }else
        {
          matriz[i][j] = -1;
        }*/
      }
            
    }
    
    System.out.print("La matriz bidimensional de destino queda así: \n");
    
    for (int i = 0; i < FILAS; i++)
    {
      for (int j = 0; j <COLUMNAS ; j++)
      {
        System.out.printf("%3d ",matriz[i][j]);
      }
      System.out.println();      
    }
    
    
	}
}


//Ejercicio 1 examen 3 curso 2020/21

public class Ejercicio1Ex3{
	
	public static void main (String[] args) {
		int FILAS;
    int COLUMNAS;
    int max;
    int min;
    int maxNum=Integer.MIN_VALUE;
    int minNum=Integer.MAX_VALUE;
    double media =0.0;
    int suma =0;
    
    //Entrada de datos
    do
    {
      System.out.print("Introduzca el número de filas: ");
      FILAS = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el número de columnas: ");
      COLUMNAS = Integer.parseInt(System.console().readLine());
      if (FILAS>COLUMNAS)
      {
        System.out.println("Error, el numero de columnas debe ser mayor al número de filas");
      }
      
    } while (COLUMNAS<FILAS);
         
    int matriz[][] = new int [FILAS][COLUMNAS];
    
    do
    {
      System.out.print("Introduzca un extremo del rango aleatorio:");
      max = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el otro extremo del rango aleatorio: ");
      min = Integer.parseInt(System.console().readLine());
      if (min>max)
      {
        System.out.println("Error, el valor del primer extremo tiene que ser mayor que del segundo extremo");
      }
    } while (max<min);
    
    //Rellenar matriz
    for (int i = 0; i <FILAS ; i++)
    {
      for (int j = 0; j <COLUMNAS ; j++)
      {
        matriz[i][j]=(int)(Math.random()*(max-min+1))+min;
      }
    }
    
    System.out.println();
    //Muestro matriz
    for (int i = 0; i < FILAS; i++)
    {
      for (int j = 0; j < COLUMNAS; j++)
      {
        System.out.printf("%5d",matriz[i][j]);
      }
      System.out.println();
    }
    //Mediodiagonal 1
    
    int medioDiag1[] = new int[FILAS];
    for (int i = 0; i <FILAS ; i++)
    {      
      for (int j = 0; j < COLUMNAS ; j++)
      {
        if (i==j){
          medioDiag1[i]=matriz[i][j];
          suma += medioDiag1[i];          
        }                          
      }      
    }
    media = (double)suma/FILAS;
    
    for (int i = 0; i < FILAS; i++)
    {
      if (medioDiag1[i]>maxNum)
        {
          maxNum = medioDiag1[i];
        }
      if (medioDiag1[i]<minNum)
      {
          minNum = medioDiag1[i];
      }    
    }

    //Muestro Mediodiagonal 1
    System.out.print("Valores Mediadiagonal: ");
    for (int i = 0; i <FILAS ; i++)
    {
      System.out.printf("%5d",medioDiag1[i]);
    }
    System.out.println();
    System.out.printf("Mínimo: %5d, ",minNum);
    System.out.printf("Máximo: %5d, ",maxNum);
    System.out.printf("Media: %5.2f \n",media);
    
    maxNum=Integer.MIN_VALUE;
    minNum=Integer.MAX_VALUE;
    media = 0;
    suma = 0;
    
    //Mediodiagonal 2
    int medioDiag2[] = new int[FILAS];
    for (int i = 0; i <FILAS ; i++)
    {      
      for (int j = 0; j < COLUMNAS ; j++)
      {
        if (j==(COLUMNAS-i-2)){
          medioDiag2[i]=matriz[i][j];
          suma += medioDiag2[i];          
        }                          
      }      
    }
    media = (double)suma/FILAS;
    
    for (int i = 0; i < FILAS; i++)
    {
      if (medioDiag2[i]>maxNum)
        {
          maxNum = medioDiag2[i];
        }
      if (medioDiag2[i]<minNum)
      {
          minNum = medioDiag2[i];
      }    
    }
    
    
    //Muestro Mediodiagonal 2
    System.out.print("Valores Mediadiagonal: ");
    for (int i = 0; i <FILAS ; i++)
    {
      System.out.printf("%5d",medioDiag2[i]);
    }
    System.out.println();
    System.out.printf("Mínimo: %5d, ",minNum);
    System.out.printf("Máximo: %5d, ",maxNum);
    System.out.printf("Media: %5.2f \n",media);
    
    maxNum=Integer.MIN_VALUE;
    minNum=Integer.MAX_VALUE;
    media = 0;
    suma = 0;
    
    //Mediodiagonal 3
    int medioDiag3[] = new int[FILAS];
    for (int i = 0; i <FILAS ; i++)
    {      
      for (int j = 0; j < COLUMNAS ; j++)
      {
        if (j==(COLUMNAS-i-1)){
          medioDiag3[i]=matriz[i][j];
          suma += medioDiag3[i];          
        }                          
      }      
    }
    media = (double)suma/FILAS;
    
    for (int i = 0; i < FILAS; i++)
    {
      if (medioDiag3[i]>maxNum)
        {
          maxNum = medioDiag3[i];
        }
      if (medioDiag3[i]<minNum)
      {
          minNum = medioDiag3[i];
      }    
    }
    
    
    //Muestro Mediodiagonal 3
    System.out.print("Valores Mediadiagonal: ");
    for (int i = 0; i <FILAS ; i++)
    {
      System.out.printf("%5d",medioDiag3[i]);
    }
    System.out.println();
    System.out.printf("Mínimo: %5d, ",minNum);
    System.out.printf("Máximo: %5d, ",maxNum);
    System.out.printf("Media: %5.2f \n",media);
    
    maxNum=Integer.MIN_VALUE;
    minNum=Integer.MAX_VALUE;
    media = 0;
    suma = 0;
    
    //Mediodiagonal 4
    int medioDiag4[] = new int[FILAS];
    for (int i = 0; i <FILAS ; i++)
    {      
      for (int j = 0; j < COLUMNAS ; j++)
      {
        if (j==(i+1)){
          medioDiag4[i]=matriz[i][j];
          suma += medioDiag4[i];          
        }                          
      }      
    }
    media = (double)suma/FILAS;
    
    for (int i = 0; i < FILAS; i++)
    {
      if (medioDiag4[i]>maxNum)
        {
          maxNum = medioDiag4[i];
        }
      if (medioDiag4[i]<minNum)
      {
          minNum = medioDiag4[i];
      }    
    }
    
    
    //Muestro Mediodiagonal 4
    System.out.print("Valores Mediadiagonal: ");
    for (int i = 0; i <FILAS ; i++)
    {
      System.out.printf("%5d",medioDiag4[i]);
    }
    System.out.println();
    System.out.printf("Mínimo: %5d, ",minNum);
    System.out.printf("Máximo: %5d, ",maxNum);
    System.out.printf("Media: %5.2f \n",media);
    
    
    
    
	}
}


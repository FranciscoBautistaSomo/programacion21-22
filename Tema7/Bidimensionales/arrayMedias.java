//Ejercicio clase  Array Bidimensionales media alrededador.


public class arrayMedias{
	
	public static void main (String[] args) {
		final int FILA = 10;
    final int COLUMNA = 10;
    final int max = 100;
    final int min = 1;
    boolean suavizar=false;
    String pregunta ="";
    ;    
    int [][] numeros = new int[FILA][COLUMNA];
    int [][] resultado = new int[FILA][COLUMNA];
       
    
    //inicializar a 0.
    for (int i = 0; i < FILA; i++)
    {
      for (int j = 0; j < COLUMNA; j++)
      {
        numeros[i][j] = 0;
        resultado[i][j] = 0;
      }      
    }
    //Llenar numeros con random
    for (int i = 0; i < FILA; i++)
    {
      for (int j = 0; j < COLUMNA; j++)
      {
        numeros[i][j] = (int)(Math.random()*(max-min+1))+min;
        
      }      
    }
    
    System.out.println("TABLA ORIGINAL");   
    for (int i = 0; i < FILA; i++)
    {
      for (int j = 0; j < COLUMNA; j++)
      {
        System.out.printf(" %3d ",numeros[i][j]);
       
      }
      System.out.println();      
    }
    
    do
    {
      System.out.println("¿Desea suavizar la matriz? (s/n)");
      pregunta = System.console().readLine();
      
    if (pregunta.equals("s"))
    {
      suavizar = true;
    }else{
      suavizar = false;
      }
    for (int i = 0; i < FILA; i++)
    {
      for (int j = 0; j < COLUMNA; j++)
      {
        //Esq sup izq
        if ((i==0) && (j==0))
        {
          resultado[i][j]=(numeros[i][j]+numeros[i][j+1]+numeros[i+1][j+1]+numeros[i+1][j])/4;
        }//fila superior
        else if ((i==0) && (j<COLUMNA-1))
        {
          resultado[i][j]=(numeros[i][j]+numeros[i][j-1]+numeros[i+1][j-1]+numeros[i+1][j]+numeros[i+1][j+1]+numeros[i][j+1])/6;
        }//Numeros interiores
        else if ((i>0)&&(i<FILA-1))
        {
          if ((j>0)&&(j<COLUMNA-1)){
            resultado[i][j] = (numeros[i][j]+numeros[i-1][j]+numeros[i][j-1]+numeros[i-1][j-1]+numeros[i-1][j+1]+numeros[i+1][j+1]+numeros[i+1][j-1]+numeros[i+1][j]+numeros[i][j+1])/9;
          }
        }
        //Columna izq
        if ((j==0) && (i>0)&&(i<FILA-1)){          
          resultado[i][j] = (numeros[i][j]+numeros[i-1][j]+numeros[i-1][j+1]+numeros[i][j+1]+numeros[i+1][j+1]+numeros[i+1][j])/6;
        }
        //Esq inf izq
        if((i==FILA-1)&& (j==0)){          
            resultado[i][j] = (numeros[i][j]+numeros[i-1][j]+numeros[i-1][j+1]+numeros[i][j+1])/4;
        }
        //FILA inf
        if ((i==FILA-1)&&(j>0)&&(j<COLUMNA-1)){
            resultado[i][j] = (numeros[i][j]+numeros[i][j-1]+numeros[i-1][j-1]+numeros[i-1][j]+numeros[i-1][j+1]+numeros[i][j+1])/6;
        }   
        //Esq sup drcha.
        if ((j==COLUMNA-1) && (i==0))
        {
          resultado[i][j]=(numeros[i][j]+numeros[i][j-1]+numeros[i+1][j-1]+numeros[i+1][j])/4;
        }
        //Columna drcha.
        else if ((j==COLUMNA-1) && (i>0) && (i<FILA-1)){
          resultado[i][j] = (numeros[i][j]+numeros[i-1][j]+numeros[i-1][j-1]+numeros[i][j-1]+numeros[i+1][j-1]+numeros[i+1][j])/6;
        }else if((j==COLUMNA-1) && (i==FILA-1)){
          resultado[i][j] = (numeros[i][j]+numeros[i][j-1]+numeros[i-1][j-1]+numeros[i][j-1])/4;
        }
      }      
    }
    
    //Volcar datos
    for (int i = 0; i < FILA; i++)
    {
      for (int j = 0; j < COLUMNA; j++)
      {
        numeros[i][j] = resultado[i][j];
       
      }
    } 
    //Mostrar datos suavizados
    System.out.println("<--------------------------------------->");
    System.out.println("TABLA RESULTADO");  
      for (int fila = 0; fila < FILA; fila++)
      {
        for (int columna = 0; columna < COLUMNA; columna++)
        {
          System.out.printf(" %3d ",numeros[fila][columna]);
         
        }
        System.out.println();      
      }
    }while (suavizar);
  }
}


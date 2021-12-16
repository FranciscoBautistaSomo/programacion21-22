//Francisco Alberto Bautista Somosierra
public  class Ex05fabs1{
  
  public static void main(String []args){
    int matriz[][];
    int fil;
    int colum;
    int max;
    int min;
    boolean noCorrecto = true;
    boolean repetido = false;
    
    //Entrada de datos
    do
    {
      System.out.print("Introduzca el nº de filas [1-20]: ");
      fil = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el nº de columnas [1-20]: ");
      colum = Integer.parseInt(System.console().readLine());
      if ((fil<1 || fil>20)||(colum<1 || colum>20))
      {
        noCorrecto = true;
        System.out.println("Error al introducir los datos. Vuelva a intentarlo.");
      }else noCorrecto = false;
    } while (noCorrecto==true);
    
    matriz = new int[fil][colum];
    
    do
    {
      System.out.print("Introduzca el extremo inferior del intervalo aleatorio: ");
      min = Integer.parseInt(System.console().readLine());
      System.out.print("Introduzca el extremo superior del intervalo aleatorio: ");
      max = Integer.parseInt(System.console().readLine());
      if ((max-min)<(fil*colum)){
        System.out.println("Error, cantidad de datos insuficiente.");
      }
    } while ((max-min)<(fil*colum));  
    
    int nFila, nColum;
    //Rellenar matriz
    for (int i = 0; i < fil; i++)
    {
      for (int j = 0; j < colum; j++)
      {
        
        do
        {
          matriz[i][j] = (int)(Math.random()*((max-min+1)+min));
        
          nFila= i;
          nColum= j;
          
          repetido =false;       
          
          //Buscar repetidos
          if(nColum>0){  
              
              if (nFila >= 0)
              {
                for (int columna = 0; columna <nColum ; columna++)
                {
                  if (matriz[i][j-1]==matriz[nFila][nColum])
                  {
                    repetido = true;
                    System.out.println("Hay repetidos");
                  }
                }
              }              
            }  
        } while (repetido);
      }      
    }
    
    //Mostrar datos
    
    for (int i = 0; i < fil; i++)
    {
      for (int k = 0; k < colum; k++)
      {
        if (i==0)
        {
          if (k==0){
            System.out.print("┌───────┬");
          }else if(k>0 && k<colum-1){
              System.out.print("───────┬");
          }else{
              System.out.print("───────┐");
          }        
        }else if(i>0 && i<=fil-1){
          if (k==0){
            System.out.print("├───────┼");
          }else if(k>0 && k<colum-1){
              System.out.print("───────┼");
          }else{
              System.out.print("───────┤");
          }   
        }
        
      }
      System.out.println();
      
      for (int j = 0; j <colum ; j++)
      {
        if (j==0)
        {
          System.out.printf("│%7d│",matriz[i][j]);
        }else{
          System.out.printf("%7d│",matriz[i][j]);          
        }             
      }
      System.out.println();
      
      for (int l = 0; l < colum; l++)
      {
        if (i==fil-1){
          if (l==0){
            System.out.print("└───────┴");
          }else if(l>0 && l<colum-1){
              System.out.print("───────┴");
          }else{
              System.out.print("───────┘");
          }         
        }   
      }
      
      
    }  
  
  }    
}

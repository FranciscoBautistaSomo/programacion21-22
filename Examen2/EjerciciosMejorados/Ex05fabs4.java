//Francisco Alberto Bautista Somosierra
public  class Ex05fabs4{
	
	public static void main (String[] args) {
		
        
    int fila;
    int columna;
    int baseTriangulo = 4;
    int altoTriangulo = 4;
    
    System.out.print("Indique el ancho en triángulos: ");
    columna = Integer.parseInt(System.console().readLine());
    
    System.out.print("Indique el alto en triángulos: ");
    fila = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < fila; i++)
    {
      for (int j = 0; j < altoTriangulo; j++)
      {
        
        for (int k = 0; k <columna ; k++)
        {
          int filaTri =altoTriangulo-1;
          for (int l = 0; l < baseTriangulo+1; l++){
            if(filaTri>=j){
              System.out.print(" ");              
            }else{
              System.out.print("*");              
            }
            filaTri=filaTri-1;            
          }          
        }
        System.out.println();
       }   
      System.out.println();
    }
  }
}

//Ejercicio 6 de la relación de ejercicios Tema 7 Array Bidimensionales.
public  class Ejercicio6v3{
	public static void main(String []args) {
		int fila = 6;
		int colum = 10;
		int[][] num = new int[fila][colum];
		int mayor = 0;
		int menor = 1000;
		int filaMenor = 0;
		int columMenor = 0;
		int filaMayor = 0;
		int columMayor = 0;
    boolean repetido=false;
		
		//Rellenar con 0.
		for(int i = 0; i<fila; i++) {
			for (int j=0; j<colum; j++) {
				
				num[i][j] = 0;
				
			}
		}
		
      //Rellenar con random
      for(int i = 0; i<fila; i++) {
          for (int j=0; j<colum; j++) {
            int contador=0;
            //Buscar repetidos
            do {
            repetido = false;

            num [i][j] = (int) (Math.random() * 1001);
            
            for (contador = 0; contador < 10 * i + j; contador++) {
              if (num [i][j] == num [contador / 10][contador % 10]){
               System.out.println("Repetido: "+num[i][j]);
               repetido = true;
              }               
            }            
          } while (repetido);
        } 
      }		
		//Mostrar datos.
		System.out.print(" F/C");
		
		for	(int c=0;c<colum; c++) {
			
			System.out.printf("    %d ",(c+1));
		}
		System.out.println();
		for(int i = 0; i<fila; i++) {
			System.out.printf("   %d |",(i+1));
			//System.out.println();
			//System.out.print("_");
				for (int j=0; j<colum; j++) {
					//System.out.printf("%3d ",(j+1));
					System.out.printf("%4d |",num[i][j]);
				  if(num[i][j]< menor) {
				  	menor = num[i][j];
				  	filaMenor = i+1;
				  	columMenor= j+1;
				  	
				  }else if(num[i][j] > mayor){
				  	
				  	mayor = num[i][j];
				  	filaMayor = i+1;
				  	columMayor= j+1;
				  }
					
				}
				System.out.println();
		}	
		System.out.println("El mayor es: "+mayor+" y esta en la fila: "+filaMayor+" y en la columna:  "+columMayor);
		System.out.println("El menor es: "+menor+" y esta en la fila: "+filaMenor+" y en la columna:  "+columMenor);
		    
  }	
}

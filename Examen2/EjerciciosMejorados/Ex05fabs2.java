//Francisco Alberto Bautista Somosierra
import java.util.Scanner;
public  class Ex05fabs2{
	
	public static void main (String[] args) {
		
    long numero;
    long numeros[];
    int numerosIn[] = new int[10];
    
    Scanner txt = new Scanner(System.in);
    
    System.out.print("Introduzca un número entero: ");
    numero = txt.nextLong();
    long aux = numero;    
            
    //Averiguar longitud
    int longitud=0;
    do{
      aux /= 10;
      longitud++;
    } while (aux > 0);
    
        
    numeros = new long[longitud];
    
    //Extraer digitos
    for (int i = 0; i < longitud; i++){
      numeros[i]= numero % 10;
      numero /=10;
    }
    
    //Buscamos los números.
    for (int i = 0; i < longitud; i++){
      for (int j = 0; j <=9 ; j++){
        if (numeros[i] == j){          
            numerosIn[j]++;            
        }
      }
    }
    
    for (int i = 0; i <= 9; i++){
      if (numerosIn[i]>0){
        if (numerosIn[i]==1){        
        System.out.println("El digito "+i+" aparece "+numerosIn[i]+" vez.");
        }else{
          System.out.println("El digito "+i+" aparece "+numerosIn[i]+" veces.");
          }
      }
    }
	}
}


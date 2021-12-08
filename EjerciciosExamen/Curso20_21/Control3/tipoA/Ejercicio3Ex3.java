//Ejercicio 3 examen 3 curso 2020/21
import java.util.Scanner;

public class Ejercicio3Ex3{
	
	public static void main (String[] args) {
		
    String fraseOriginal = "";
    String fraseModificada = "";
    
    char letraElegida;
    char letraSustituir;
    
    String salir ="s";
    Scanner txt = new Scanner(System.in);
    int longitudFrase;
    
    System.out.print("Introduzca una frase: ");
    fraseOriginal = System.console().readLine();
    
    do
    {
      System.out.print("Frase inicial: "+fraseOriginal);
      System.out.println();
      System.out.print("Indique la letra que desea sustituir: ");
      letraElegida = txt.next().charAt(0);
      System.out.print("Indique la letra sustituta: ");
      letraSustituir = txt.next().charAt(0);
     
      System.out.print("Frase original: "+fraseOriginal);
      System.out.println();
      
      fraseModificada = fraseOriginal.replace(letraElegida, letraSustituir);
      
      System.out.print("Frase alterada: "+fraseModificada);
      System.out.println();
      
      /*for (int i = 0; i < fraseOriginal.length() ; i++)
      {
        //System.out.print(fraseOriginal.charAt(i)+", ");
        if (fraseOriginal.charAt(i) == letraElegida)
        {
         fraseOriginal.charAt(i) = letraSustituir;
        }
        
      }*/
      
      fraseOriginal = fraseModificada;
      
      System.out.print("¿Desea salir? (s/n): ");
      salir = txt.next();
      
    } while (salir.equals("n"));
    
    //Syste.out.print("Introduzca una frase: ");
    //fraseOriginal
        
    
	}
}


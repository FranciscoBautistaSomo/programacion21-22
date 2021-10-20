//Ejercicio 3 de la relación de ejercicios Tema 5 Bucles.
public class Ejercicio3{
  /*Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while.*/
  public static void main(String[] args){
    ystem.out.println ("USO DEL BUCLE DO WHILE");
    int i = 0;    
    do{
        if(i%5==0){
           System.out.println("Multiplo de 5: "+i);          
          }      
        i++;
      }while(i <=100); 
  
  }
}

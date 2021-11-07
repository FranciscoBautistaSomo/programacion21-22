//Ejercicio 2 control 1 programacion 20/21

public class Ejercicio2 {

  public static void main (String[] args){
   
  long numeroIntroducido;
  long aux;
  int posicion = 0;
  int digito = 0;
  int par = 0;
  int impar = 0;
  long numerosPares=0;
  long numeroImpares=0;
  long volteado = 0;
   

    System.out.print("Introduzca un número largo positivo: ");
    numeroIntroducido = Long.parseLong(System.console().readLine());
    
    aux = numeroIntroducido;
    
    while (aux > 0)
    {
      digito = (int) aux % 10;      
      aux /= 10;
      
      
      if (digito%2 == 0){
          par += 1;          
          numerosPares = numerosPares + (long)(digito*Math.pow(10,par-1));          
      }else
      {
        impar += 1;
        numeroImpares = numeroImpares +(long)(digito*Math.pow(10,impar-1));
      }
         
    }
    //voltear numeros impares.
    while (numeroImpares>0)
    {
      volteado = (volteado*10)+(numeroImpares%10);
      numeroImpares /=10;
    }
    
    System.out.println("Numeros pares: "+numerosPares);
    System.out.print("Numeros impares: "+volteado);
    
  }
}

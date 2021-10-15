//Ejercicio 21 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio21{
  public static void main(String [] args){
    /*Calcula la nota de un trimestre de la asignatura Programación.El programa
      pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
      Si la media de los dos controles da un número mayor o igual a 5, el alumno
      está aprobado y se mostrará la media. En caso de que la media sea un número
      enor que 5, el alumno habrá tenido que hacer el examen de recuperación que
      se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
      ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
      de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
      la nota media anterior.*/
      
      float nota1 = 0.0f;
      float nota2 = 0.0f;
      float media = 0.0f;
      String recupera = " ";
      
      System.out.print("Introduzca la nota del primer examen: (0-10)");
      nota1 = Float.parseFloat(System.console().readLine());
      
      System.out.print("Introduzca la nota del segundo examen: (0-10)");
      nota2 = Float.parseFloat(System.console().readLine());
      
      media = (float)(nota1 + nota2)/2;
      if (media >= 5){
        System.out.print("Tu nota de Programación es: "+media);        
        }else{
          System.out.print("¿Cual ha sido el resultado de la recuperación? (apto /no apto): ");
          recupera = System.console().readLine();
          
            if(recupera.equals("apto")){
              System.out.println("¿Cual ha sido el resultado de la recuperación? (apto /no apto): apto");
              media = 5.0f;
              System.out.print("Tu nota de Programación es: "+media);              
              }else{
                //System.out.println("¿Cual ha sido el resultado de la recuperación? (apto /no apto): no apto");
                System.out.print("Tu nota de Programación es: "+media); 
              }
          
          }
      
      
      
  }
}

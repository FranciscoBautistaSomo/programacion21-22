//Ejercicio 11 de la relación de ejercicios Tema 6 Número Aleatorio.


public class Ejercicio11 {
	
	public static void main (String[] args) {
		 String notaTxt = "";
     int suspensos = 0;
     int suficiente=0;
     int bien = 0;
     int notable= 0;
     int sobresaliente=0;
     for (int i = 0; i <20 ; i++)
     {
        double nota = (Math.random()*10);
        
        if (nota < 5)
        {
          suspensos++;
          
        }else if ((nota>= 5)||(nota<7))
        {
          suficiente++;
          
        }else if ((nota>= 7)||(nota<9))
        {
          notable++;
          
        }else if (nota>9)
        {
          sobresaliente++;
        }                 
     }
     System.out.printf("Hay %d suspensos\n",suspensos);
     System.out.printf("Hay %d suficiente\n",suficiente);
     System.out.printf("Hay %d notables\n",notable);
     System.out.printf("Hay %d sobresalientes\n",sobresaliente);
	}
}


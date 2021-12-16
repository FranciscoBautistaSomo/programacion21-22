//Ejercicio propuesto examen

public class EjercicioPlatos {
	
	public static void main (String[] args) {
		String almuerzo[] = {"sopa de marisco", "entrecot","pez espada", "macarrones con tomate", "pollo asado"}; 
    //String cena[] = {"fruta", "ensalada","sopa de verduras", "tortilla de patatas", "arroz blanco"};
    String dias[] ={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    String diasPlato[][] = new String[7][1];
    String almuerzoAleatorio;
    boolean repetido = false;
        
    for (int i = 0; i <7 ; i++){
      
      do{
        almuerzoAleatorio = almuerzo[(int)(Math.random()*5)+1];
        
        if (i>0){
          if (almuerzoAleatorio.equals(diasPlato[i-1][0])
          {
            repetido = true;
          }
          
          
          
        }
        
        
        
        
      } while (repetido);
      
        
    }
    
    
    
    
    
    
    for (int i = 0; i < 7; i++)
    {
      System.out.printf("%4s ,",diasPlato[i]);
    }
    
    
    
	}
}


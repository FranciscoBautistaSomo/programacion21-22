//Ejercicio 16 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio16 {
	
	public static void main (String[] args) {
		String respuesta =" ";
    int puntos = 0;
    System.out.println("ENCUESTA DE FIDELIDAD");
    System.out.println("1.¿Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente? (V/F)");
    respuesta = System.console().readLine();
    
      if (respuesta.equals("V") || respuesta.equals("v")){
        puntos=3;        
        }
      
      System.out.println("2.¿Ha aumentado sus gastos de vestuario? (V/F)");
      respuesta = System.console().readLine();
    
      if (respuesta.equals("V") || respuesta.equals("v")){
        puntos=puntos+3;        
        }        
          
      System.out.println("3.¿Ha perdido el interés que mostraba anteriormente por ti? (V/F)");
      respuesta = System.console().readLine();
    
      if (respuesta.equals("V") || respuesta.equals("v")){
        puntos=puntos+3;        
        }        
            
      System.out.println("4.¿Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se \narregla el pelo y se asea con más frecuencia (si es mujer)? (V/F)");
      respuesta = System.console().readLine();
    
      if (respuesta.equals("V") || respuesta.equals("v")){
        puntos=puntos+3;        
        }        
            
      System.out.println("5.¿No te deja que mires la agenda de su teléfono móvil? (V/F)");
      respuesta = System.console().readLine();
    
      if (respuesta.equals("V") || respuesta.equals("v")){
        puntos=puntos+3;        
        }        
      
    
      System.out.println("6.¿A veces tiene llamadas que dice no querer contestar cuando estás tú \n delante? (V/F)");
      respuesta = System.console().readLine();
    
      if (respuesta.equals("V") || respuesta.equals("v")){
        puntos=puntos+3;        
        }        
            
      System.out.println("7.¿Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a? (V/F)");
      respuesta = System.console().readLine();
    
      if (respuesta.equals("V") || respuesta.equals("v")){
        puntos=puntos+3;        
        }    
            
      System.out.println("8.¿Muchos días viene tarde después de trabajar porque dice tener mucho \n más trabajo? (V/F)");
      respuesta = System.console().readLine();
    
      if (respuesta.equals("V") || respuesta.equals("v")){
        puntos=puntos+3;        
        }        
            
      System.out.println("9.¿Has notado que últimamente se perfuma más? (V/F)");
      respuesta = System.console().readLine();
    
      if (respuesta.equals("V") || respuesta.equals("v")){
        puntos=puntos+3;        
        }        
            
      System.out.println("10.¿Se confunde y te dice que ha estado en sitios donde no ha ido contigo? (V/F)");
      respuesta = System.console().readLine();
    
      if (respuesta.equals("V") || respuesta.equals("v")){
        puntos=puntos+3;        
        }
               
      System.out.println("RESULTADOS: ");
      System.out.println(puntos); 
      if( (puntos >= 0) && (puntos <= 10)){
          System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel.");        
        }else if( (puntos >= 11) && (puntos < 22)){
           System.out.println("Quizás exista el peligro de otra persona en su\n vida o en su mente, aunque seguramente será algo sin importancia.\n No bajes la guardia.");  
          }else if( (puntos >= 22) && (puntos <= 30)){
           System.out.print("Tu pareja tiene todos los ingredientes para estar\n viviendo un romance con otra persona. Te aconsejamos que indagues un\n poco más y averigües que es lo que está pasando por su cabeza");  
          }
          
      
	}
}


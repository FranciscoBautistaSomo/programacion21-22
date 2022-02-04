package ejercicioexamencartascontrol5;
import ejercicioexamencartascontrol5.Carta;

/**
 *
 * @author usuario
 */
public class Baraja {
  
    Carta[] baraja = new Carta[52];
    
  public String palo ="CPTD";
  public String valor = "A2345678910JQK";
    
    public Baraja(){
      int i=0;
      for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 13; k++) {
              baraja[i]= new Carta(palo.charAt(j),valor.charAt(k));
              i++;
          }  
        }   
    }
    
@Override
    public String toString(){
      String resultado="";       
       for (int i = 0; i < 52; i++) { 
           
           resultado+= baraja[i].toString();
         if (i==12) {
           resultado +="\n";    
         }else if(i==25){
           resultado +="\n";            
         }else if(i==38){
           resultado +="\n";
         }
       }
              resultado +="\n";
      return resultado;
      }
       
}

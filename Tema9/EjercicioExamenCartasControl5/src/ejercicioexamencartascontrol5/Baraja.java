package ejercicioexamencartascontrol5;
import ejercicioexamencartascontrol5.Carta;



/**
 *
 * @author usuario
 */
public class Baraja {
  
    private static int numCartas = 52;
    
    Carta[] baraja = new Carta[numCartas];       
    
    public String palo ="CPTD";
    public String valor = "A2345678910JQK";
    
    //Constructor
    public Baraja(){
      int i=0;
      for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 13; k++) {
              this.baraja[i]= new Carta(palo.charAt(j),valor.charAt(k));
              i++;
          }  
        }   
    }
    
    public void Barajar(){      
      //Baraja mb = new Baraja();
      //boolean[] aux = new boolean[52];
      Carta temp;
    
      /*for (int i = 0; i < aux.length; i++) {
          aux[i]=false;        
      }*/
      
      for (int i = 0; i < baraja.length; i++) {
        int pos = (int) (Math.random() * 51);
        /*if (aux[pos]==false) {
            this.barajaBarajada[i]=this.baraja[pos];
            aux[pos]=true;
        }*/
        temp = baraja[i];
        baraja[i] = baraja[pos];
        baraja[pos]=temp;        
      }
      //this.baraja = this.barajaBarajada.clone();
      //return this.baraja;
    
    }
    
    public Carta dameCarta(){
      Carta sacada = baraja[this.numCartas-1]; 
      this.numCartas--;
      return sacada;
    }
    
    public int tamnio(){
      return numCartas;
    }
    
    public Carta miraCarta(int pos){
      return baraja[pos];   
    }
    
@Override
    public String toString(){
      String resultado="";       
       for (int i = 0; i < 52; i++) {           
           resultado+= this.baraja[i].toString();
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

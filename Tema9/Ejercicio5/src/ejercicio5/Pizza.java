package ejercicio5;


public class Pizza {
  
  private String dimen = "mediana";
  private String tipo = "margarita";
  private String estado = "Pedida";
  private static int totalPedidas = 0;
  private static int totalServidas = 0;
  
  //Constructor
  public Pizza(String tama, String tipo){
    this.dimen = tama;
    this.tipo = tipo;
    Pizza.totalPedidas++;
  }
  
  public void sirve(){
    if(this.estado.equals("Servida")){
      System.out.println("La pizza ya se ha servido.");
    }else{
      this.estado = "Servida";
      Pizza.totalServidas++;
    }       
    
  }
  
  
  public String toString(){
   String pedido = "";
   pedido += this.dimen+", "+this.tipo+", "+this.estado+"\n";
   return pedido;  
  }
  
  public static int getTotalPedidas(){
    return Pizza.totalPedidas;  
  }
  
  public static int getTotalServidas(){
    return Pizza.totalServidas;  
  }
        
  
}

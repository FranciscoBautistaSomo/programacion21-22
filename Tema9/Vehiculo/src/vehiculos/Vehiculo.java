
package vehiculos;

public class Vehiculo {
    private static int vehiculosCreados = 0;
    private static int kilometrosTotales = 0;
    private int kilometrosRecorridos;
    
    public Vehiculo (){
      this.kilometrosRecorridos = 0;        
    }
    
    public int verKmsRecorridos(){
      return this.kilometrosRecorridos;
    }
    
    public int verKmsTotoles(){
      return Vehiculo.kilometrosTotales;
    }
    
    public void desplaza (int dist){
      this.kilometrosRecorridos += dist;
      Vehiculo.kilometrosTotales += dist;    
    }
    
}

public class PINaLetras {
  public static void main (String[] args) {
    int pin;
    String resultado = "";
    
    System.out.print("Introduzca el PIN: ");
    pin = Integer.parseInt(System.console().readLine());
    
    if (pin == 0) {
      resultado = "cero";
    } else {
      while (pin>0) {
        int ultimaCifra = pin % 10;
        pin = pin /10;
        String ultimaCifraLetra= "";
        switch (ultimaCifra) {
          case 0:
            ultimaCifraLetra = "cero";
            break;
          case 1:
            ultimaCifraLetra = "uno";
            break;
          case 2:
            ultimaCifraLetra = "dos";
            break;
          case 3:
            ultimaCifraLetra = "tres";
            break;
          case 4:
            ultimaCifraLetra = "cuatro";
            break;
          case 5:
            ultimaCifraLetra = "cinco";
            break;
          case 6:
            ultimaCifraLetra = "seis";
            break;
          case 7:
            ultimaCifraLetra = "siete";
            break;
          case 8:
            ultimaCifraLetra = "ocho";
            break;
          case 9:
            ultimaCifraLetra = "nueve";
            break;
          default:
        }
        resultado = ultimaCifraLetra + " " + resultado;
      }
    }
    System.out.println(resultado);
    
  }
}

import libriaMatematica.funcMates;

public class Ejercicio1_14{
    public static void main(String[] args) {
        int numero = 0;
        int sgNumePrimo = 0;
        long potenciado = 1;
        boolean verPrimo = false;
        boolean capicuo = false;
        int opcion = 0;
        int digito = 0;
        boolean continuar = false;

        do {              
        System.out.println("<-----------------MENÚ------------>");
        System.out.println("1- Averiguar capicuo.");
        System.out.println("2- Calcular si es primo.");
        System.out.println("3- Calcular el número primo siguiente.");
        System.out.println("4- Calcular la potencia.");
        System.out.println("5- Calcular el número de digitos.");
        System.out.println("6- Voltear número.");
        System.out.println("7- Sacar el digito N del numero.");
        System.out.println("8- Averiguar la posicion de un digito dado dentro del número.");
        System.out.println("9- Quitar al número n dígitos por detrás (por la derecha).");
        System.out.println("10- Quitar al número n dígitos por delante (por la izquierda).");
        System.out.println("11- Añadir al número un digito por detrás (por la derecha).");
        System.out.println("12- Añadir al número un digito por delante (por la izquierda).");
        System.out.println("13- Sacar trozo de un número según una posición inicial y final dada.");
        System.out.println("14- Juntar dos números.");
        System.out.println("15- SALIR");
        System.out.print("¿Qué operación desea hacer.(1-15)?");
        opcion =Integer.parseInt(System.console().readLine());

        if (opcion == 15) {
          System.out.println("Opción elegida "+opcion);
        }else if (opcion==14) {
          System.out.println("Opción elegida "+opcion);
        }else if(opcion <14){
          System.out.println("Opción elegida "+opcion);
          System.out.print("Introduzca un número entero: ");
          numero = Integer.parseInt(System.console().readLine());
        }  
        switch (opcion) {
          case 1:
            //Calculo si un número es capicuo.
            capicuo = funcMates.esCapicua(numero);        
            if (capicuo==true)
            {
              System.out.println("El número "+numero+" es capicuo.");
            }else{
              System.out.println("El número "+numero+" no es capicuo.");
            }            
            break;
          case 2:
            //Cálculo si el numero es primo.
            verPrimo = funcMates.esPrimo(numero);

            if(verPrimo == true){
                System.out.println("El número "+numero+" es primo.");
            }else{
                System.out.println("El número "+numero+" no es primo.");
            }
            break;
          case 3:
            //Cálculo del numero primo siguiente.
            sgNumePrimo = funcMates.siguientePrimo(numero);
            System.out.println("El siguiente numero primo es "+sgNumePrimo);
            break;
          case 4:
            //Calculo de la potencia
            System.out.println("Introduzca el exponente a calcular.");
            long numeroLong = (long)numero;
            long exp = Long.parseLong(System.console().readLine());
            potenciado = funcMates.potencia(numeroLong, exp);
            System.out.println("La potencia calculada es: "+potenciado);
            break;
          case 5:
            //Cálculo del número de digitos
            int numdigitos = funcMates.digitos(numero);
            System.out.println("El "+numero+" tiene "+numdigitos+" digito/s,");        
            break;
          case 6:
            //Voltear número.
            System.out.println("El "+numero+" volteado queda "+funcMates.volteado(numero));
            break;
          case 7:
            //Sacar el digito N de un numero
            System.out.println("Introduzca la posición del "+numero+" que desea extraer: ");
            int posicion = Integer.parseInt(System.console().readLine());
            if (posicion > 0) {
              posicion--; 
            }               
            System.out.println("El digito extraido es: "+funcMates.digitoN(numero, posicion));
            break;
          case 8:
            //averiguar la posicion de un digito dado dentro de un número.
            System.out.println("Introduzca el digito buscado en el "+numero+" dado.");
            digito = Integer.parseInt(System.console().readLine());            
            
            if (funcMates.posicionDeDigito(numero, digito)==-1) {
              System.out.println("Número no encontrado");
            }else {
              System.out.println("El número buscado se  encuentra en la/s posicion/es "+funcMates.posicionDeDigito(numero, digito)); 
            }
            break;
          case 9:
            //Le quita a un número n dígitos por detrás (por la derecha).
            int digitcorta = 0;
            do {
              System.out.println("Introduzca el numero de digitos que quiere cortar del "+numero+" detrás.");
              digitcorta = Integer.parseInt(System.console().readLine());          
            } while (digitcorta >funcMates.digitos(numero));
            System.out.println("El numero cortado queda "+funcMates.quitarPorDetras(numero, digitcorta));
            break;
          case 10:
            //Le quita a un número n dígitos por delante (por la izquierda).
            int digitcortaDel = 0;
            do {
              System.out.println("Introduzca el numero de digitos que quiere cortar del "+numero+" delante.");
              digitcortaDel = Integer.parseInt(System.console().readLine());          
            } while (digitcortaDel >funcMates.digitos(numero));
            System.out.println("El numero cortado queda "+funcMates.quitarPorDelante(numero, digitcortaDel));
            break;
          case 11:
              //Le pega a un número un dígito por detras (por la derecha).
              do {
                System.out.println("Introduzca el digito que quiere pegar a "+numero+" detras.");
                digito = Integer.parseInt(System.console().readLine());
                if (digito>=10 || digito<0) {
                  System.out.println("Error, El digito tiene que ser menor que 10 y mayor o igual a 0");
                  //digito = Integer.parseInt(System.console().readLine());
                }
              
              } while (digito>=10 || digito<0);
              
              System.out.println("El nuevo número es "+funcMates.pegarPorDetras(numero, digito));
              break;
          case 12:
              //Le pega a un número un dígito por delante (por la izquierda).
              System.out.println("Introduzca el digito que quiere pegar a "+numero+" delante.");
              int digitoDel=Integer.parseInt(System.console().readLine());
              System.out.println("El nuevo número es "+funcMates.pegarPorDelante(numero, digitoDel));
          break;
          case 13:
              //Saca un trozo de número entre dos posiciones.
              System.out.println("Introduzca la posición inicial del trozo de "+numero+" a sacar.");
              int posInicial = (Integer.parseInt(System.console().readLine()))-1;
              System.out.println("Introduzca la posición final del trozo de "+numero+" a sacar.");
              int posFinal = (Integer.parseInt(System.console().readLine()))-1;
              System.out.println("El trozo del "+numero+" es :"+funcMates.trozoDeNumero(numero, posInicial, posFinal));
          break;
          case 14:
              //Junta dos números.
              System.out.println("Introduzca el primer numero a unir.");
              int numUno = Integer.parseInt(System.console().readLine());
              System.out.println("Introduzca el segundo numero a unir.");
              int numDos = Integer.parseInt(System.console().readLine());
              System.out.println("El numero resultante es "+funcMates.juntaNumeros(numUno, numDos));
              break;
          case 15:
              System.out.println("¿Desea salir (S/N)?");
              String salir = System.console().readLine();
              if (salir.equals("S")) {
                System.out.println("Adios.");
                continuar = false;
              } else {
                continuar = true;
              }
              break;
          default:
            System.out.println("Error, opción no encotrada.");
            break;
        }

        if (opcion !=15) {
          System.out.println("¿Desea hacer más operaciones (S/N)?");
          String seguir = System.console().readLine();
          if (seguir.equals("S")) {
            continuar = true;
          }else{
            System.out.println("Adios.");
            continuar = false;
          }
        }
          
        } while (continuar);
          
    }
}

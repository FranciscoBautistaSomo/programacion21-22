//Ejercicio 12 de la relación de ejercicios Tema 4 Sentencias condicionales.
public class Ejercicio12 {
  public static void main(String[] args){
   int puntos =0;
   String opcion;
   
   System.out.println("Cuestionario tipo test 1ºDAW");
   
   System.out.println ("1. ¿Cuál es la descripción que crees que define mejor el concepto 'clase' en la programación orientada a objetos?");
   System.out.println ("Elige: \n a)Es un concepto similar al de 'array'\n b)Es un tipo particular de variable.\n c)Es un modelo o plantilla a partir de la cual creamos objetos.\n d)Es una categoria de datos ordenada secuencialmente\n");
   System.out.println("Elige la respuesta correcta (a,b,c,d)");
   opcion = System.console().readLine();
   if (opcion.equals("c")){
      puntos++;
      //System.out.println("Puntos: "+puntos);
     }
   
   System.out.println ("2.¿Qué elementos crees que definen a un objeto?");
   System.out.println ("Elige: \n a)Sus cardinalidad y su tipo\n b)Sus atributos y sus métodos.\n c)La forma en que establece comunicación e intercambia mensajes.\n d)Su interfaz y los eventos asociados\n");
   System.out.println("Elige la respuesta correcta (a,b,c,d)");
   opcion = System.console().readLine();
   if (opcion.equals("b")){
      puntos++;
      //System.out.println("Puntos: "+puntos);
     }
     
   System.out.println ("3.¿Qué código de los siguientes tiene que ver con la herencia?");
   System.out.println ("Elige: \n a)public class Componente extends Producto\n b)public class Componente inherit Producto.\n c)public class Componente implements Producto.\n d)public class Componente belong to Producto\n");
   System.out.println("Elige la respuesta correcta (a,b,c,d)");
   opcion = System.console().readLine();
   if (opcion.equals("a")){
      puntos++;
      //System.out.println("Puntos: "+puntos);
     }
    
   System.out.println ("4.¿Qué significa instanciar una clase?");
   System.out.println ("Elige: \n a)Duplicar una clase\n b)Eliminar una clase\n c)Crear un objeto a partir de la clase.\n d)Conectar dos clases entre sí\n");
   System.out.println("Elige la respuesta correcta (a,b,c,d)");
   opcion = System.console().readLine();
   if (opcion.equals("c")){
      puntos++;
      //System.out.println("Puntos: "+puntos);
     }
     
   System.out.println ("5.En Java, ¿a qué nos estamos refiriendo si hablamos de 'Swing'?");
   System.out.println ("Elige: \n a)Una función utilizada para intercambiar valores\n b)Es el sobrenombre de la versión 1.3 del JDK\n c)Un framework específico para Android.\n d)Una librería para construir interfaces gráficas\n");
   System.out.println("Elige la respuesta correcta (a,b,c,d)");
   opcion = System.console().readLine();
   if (opcion.equals("d")){
      puntos++;      
     }
    System.out.println("Fin del test. Puntos: "+puntos);          
  }

}

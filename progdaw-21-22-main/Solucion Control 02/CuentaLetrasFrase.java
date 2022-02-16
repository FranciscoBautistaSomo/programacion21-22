public class CuentaLetrasFrase {
  public static void main (String[] args) {
    String frase;
    int[] letras;
    int tama = (int)'z'-(int)'a'+1;
    
    letras = new int[tama];
    
    System.out.print("Introduzca una frase: ");
    frase = System.console().readLine();
    
    for (int i=0; i<tama; i++) {
      letras[i] = 0;
    }
    
    
    for (int i=0; i<frase.length(); i++) {
      if (frase.charAt(i)>='a' && frase.charAt(i)<='z')
        letras[(int)frase.charAt(i)-'a']++;
      else if (frase.charAt(i)>='A' && frase.charAt(i)<='Z')
        letras[(int)frase.charAt(i)-'A']++;
    }
    
    for (int i=0; i<tama; i++) {
      if (letras[i]>0)
        System.out.println("La letra '"+(char)((int)'a'+i)+"' aparece "+letras[i]+" veces.");
    }
    
    
  }
}

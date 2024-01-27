public class Main {
  public static void main(String[] args) {
    String sentence = "La frase tiene a b c";
    String busco = "abcdefghijklmnñopqrstuvwxyz";
    
    
    //Le quitamos al String todo lo que nos molestara (caracteres mayusculas, numero o espacios)
    sentence = sentence.replaceAll(" ", "");
    String charsToRemove = "<>^ª!·$%&/()=?¿@#~€¬`+^`´{},.-;:_0123456789*º[]\\";
 
    for (char c : charsToRemove.toCharArray()) {
      sentence = sentence.replace(String.valueOf(c), "");
    }
    sentence = sentence.toLowerCase();
    
    //Motor de busqueda y comprobador de letras
    int con = 0;
   	for (int i = 0; i < busco.length(); i++){
    	
    	for (int j = 0; j < sentence.length(); j++){
          if(busco.charAt(i) == sentence.charAt(j)){
          	con++;
            break;
          }  
        }
    }
   if (con == busco.length()){
   		System.out.println("Tiene todo el abecedario!");
   }
   else{
   		System.out.println("NO TIENE todo el abecedario!");
   }
  }
}

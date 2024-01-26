public class Main {
  public static void main(String[] args) {
    
    String sentence =  "a b c d e f g h i j k l m n ñ o p q r s t u v w x y z";
    String sen = sentence.toLowerCase();
    sen = sen.replaceAll(" ", "");
    
    
    String charsToRemove = "<>^ª!·$%&/()=?¿@#~€¬`+^`´{},.-;:_0123456789*º[]\\";
 
        for (char c : charsToRemove.toCharArray()) {
            sen = sen.replace(String.valueOf(c), "");
        }
    int con = 0;
    String lista = "a b c d e f g h i j k l m n ñ o p q r s t u v w x y z";
    lista = lista.replaceAll(" ", "");
    for (int i =0; i < sen.length(); i++){
    
    	for (int j = 0; j < lista.length(); j++){
        	if (sen.charAt(i) == lista.charAt(j)){
            	con++;
            }
            else{
            	con--;
            }
        }
    }
    
    if (con != sen.length()){
    	System.out.println("es igual");
    }
    else{
    	System.out.println("es diferente");
    
    }
    
  }
}

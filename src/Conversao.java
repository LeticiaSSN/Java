import java.util.Scanner;

public class Conversao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        String palavra = "";
        System.out.println( somenteDigitos(palavra));
     }   
   
static int somenteDigitos(String palavra) {
    String digitos = palavra;
    palavra= "hdjhdjhddd24322";
    char[] letras  = palavra.toCharArray();
    for (char letra : letras) {
        if(Character.isDigit(letra)) {
            digitos += letra;
        }
    }
    return Integer.parseInt(digitos);
} 
}

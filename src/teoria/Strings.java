package teoria;

public class Strings {
	// Strings são imutáveis: toda alteração cria uma nova String
	public static void main(String[] args) {
		String msg = "mario"; //declaração de string
		msg = "super" + msg; //concatenação
		System.out.println(msg);
		System.out.println("Tamanho: " + msg.length()); //lenght dá o total de caracteres
        System.out.println("Maiúsculo: " + msg.toUpperCase()); //letras ficam maiúsculas
     // toLowerCase(): minúsculas
     // equals(): comparação correta
        
        System.out.println(msg.charAt(0)); //Pega um caractere pelo índice
        System.out.println(msg.substring(0, 3)); //pega o caractere  até o caractere 3
        
        String a = "Java";
        String b = new String("Java");
        System.out.println(a == b);      // false
        System.out.println(a.equals(b)); // true
        //== compara endereços e equals compara conteúdo
        
        String frase = "Java é muito bom";
        String[] partes = frase.split(" "); //o separador aqui é um espaço
        //partes[0]: "Java", partes[1]: "é", partes[2]: "muito"
        System.out.println(partes[0]); // Java
	}

}

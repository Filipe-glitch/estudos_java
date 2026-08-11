package fundamentos;
public class Strings {
	public static void main(String[] args) {
		String msg = "mario"; 
		msg = "super" + msg;
		System.out.println(msg);
		
        System.out.println("Tamanho: " + msg.length()); 
        System.out.println("Maiúsculo: " + msg.toUpperCase());
        
        System.out.println(msg.charAt(0)); 
        System.out.println(msg.substring(0, 3));
        
        String a = "Java";
        String b = new String("Java");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        
        String frase = "Java é muito bom";
        String[] partes = frase.split(" "); 
        System.out.println(partes[0]);
	}
}


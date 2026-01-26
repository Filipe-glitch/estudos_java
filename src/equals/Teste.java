package equals;

public class Teste {

	public static void main(String[] args) {
		String s1 = new String("Ola");  
        String s2 = new String("Ola"); 
        String s3 = s1; 
        System.out.println(s1 == s2); //falso 
        System.out.println(s1.equals(s2)); //verdadeiro 
        System.out.println(s1 == s3); //verdadeiro 
        
        Usuario m1 = new Usuario(1,"Mario","111.222.333-44"); 
        Usuario m2 = new Usuario(1,"Mario","111.222.333-44");
        Usuario m3 = new Usuario(2,"Luigi","555.666.777-88"); 
        //verdadeiro 
        System.out.println(  m1.equals(m2)  ); 
        //falso 
        System.out.println(  m1 == m2  ); 
        //falso 
        System.out.println(  m1.equals(m3)  );
        
        Usuario m4 = new Usuario(1, "Mario", "111.222.333-44");
        System.out.println(m4); 

	}

}

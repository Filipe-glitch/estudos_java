package poo.heranca_c4.exercicio_tres;

public class MainEquals {
    public static void main(String[] args) {
        // Teste de comparação com String (referência vs conteúdo)
        String s1 = new String("Ola");
        String s2 = new String("Ola");
        String s3 = s1;

        System.out.println("s1 == s2: " + (s1 == s2));           // false (instâncias diferentes)
        System.out.println("s1.equals(s2): " + s1.equals(s2));   // true (conteúdo igual)
        System.out.println("s1 == s3: " + (s1 == s3));           // true (mesma referência)

        System.out.println("\n--- Teste de Objetos Personalizados ---");
        Usuario m1 = new Usuario(1, "Mario", "111.222.333-44");
        Usuario m2 = new Usuario(1, "Mario", "111.222.333-44");
        Usuario m3 = new Usuario(2, "Luigi", "555.666.777-88");

        System.out.println("m1.equals(m2): " + m1.equals(m2));   // true (mesmos dados)
        System.out.println("m1 == m2: " + (m1 == m2));           // false (endereços de memória distintos)
        System.out.println("m1.equals(m3): " + m1.equals(m3));   // false (dados diferentes)

        System.out.println("\n--- Teste do Método toString ---");
        System.out.println(m1);
    }
}

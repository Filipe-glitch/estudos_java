package poo.records_c9.teoria;

public class MainPessoaRecord {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", 54);
        Pessoa pessoa2 = new Pessoa("Maria");

        System.out.println("Nome do Record: " + pessoa1.name());
        System.out.println("Idade do Record: " + pessoa1.age());
        System.out.println("Informações formatadas: " + pessoa1.getInfo());

        System.out.println("\nRepresentação toString():");
        System.out.println(pessoa1);
        System.out.println(pessoa2);
    }
}

package poo.classes_atributos_c1.teoria;

public class MainClasses {
    public static void main(String[] args) {
        PessoaSimples homem = new PessoaSimples();
        homem.nome = "João";
        homem.idade = 12;

        PessoaSimples mulher = new PessoaSimples();
        mulher.nome = "Maria";
        mulher.idade = 10;

        System.out.println("Pessoa 1: " + homem.nome + " | Idade: " + homem.idade);
        System.out.println("Pessoa 2: " + mulher.nome + " | Idade: " + mulher.idade);
    }
}
package poo.records_c9.teoria;

public record Pessoa(String name, int age) {

    public Pessoa {
        if (age < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
    }

    public Pessoa(String name) {
        this(name, 0);
    }

    public String getInfo() {
        return "Nome: " + name + " | Idade: " + age;
    }
}

package poo.classes_atributos_c1.exercicio_dois;

public class MainMembrosEstaticos {

    public static void main(String[] args) {
        // Uso de métodos estáticos diretos da classe utilitária
        double metros = ConversorUnidades.milhasParaMetros(10);
        System.out.println("10 milhas em metros: " + metros);

        int soma = ConversorUnidades.somar(15, 25);
        System.out.println("Soma estática: " + soma);

        System.out.println("\n--- Testando Variáveis de Instância vs Estáticas ---");
        ContadorEstatico obj1 = new ContadorEstatico();
        ContadorEstatico obj2 = new ContadorEstatico();

        obj1.incrementarComum();
        obj1.incrementarComum();
        
        obj2.incrementarComum();

        System.out.println("obj1 contador comum: " + obj1.getContadorComum()); // 2
        System.out.println("obj2 contador comum: " + obj2.getContadorComum()); // 1
        System.out.println("Total de instâncias criadas (static): " + ContadorEstatico.getTotalInstancias()); // 2
    }
}

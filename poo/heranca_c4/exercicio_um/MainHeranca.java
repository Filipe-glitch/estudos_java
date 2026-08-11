package poo.heranca_c4.exercicio_um;

import poo.heranca_c4.exercicio_dois.ModeloCarro;
import poo.heranca_c4.teoria.CalculadoraTempo;
import poo.heranca_c4.teoria.Filme;
import poo.heranca_c4.teoria.Serie;

public class MainHeranca {
    public static void main(String[] args) {
        // 1. Teste do Sistema de Títulos e Maratona
        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setDuracaoEmMinutos(135);

        Filme outro = new Filme();
        outro.setNome("John Wick");
        outro.setDuracaoEmMinutos(101);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);

        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("--- Sistema de Streaming ---");
        System.out.println("Tempo total para maratonar: " + calculadora.getTempoTotal() + " minutos\n");

        // 2. Teste do Exercício ModeloCarro
        System.out.println("--- Exercício Carro ---");
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Sedan Executivo");
        meuCarro.definirPrecos(30000, 32000, 35000);
        meuCarro.exibirInfo();
        System.out.println();

        // 3. Teste do Exercício ContaCorrente
        System.out.println("--- Exercício Conta Bancária ---");
        ContaCorrente cc = new ContaCorrente();
        cc.setTarifaMensal(25.0);
        cc.depositar(200);
        cc.cobrarTarifaMensal();
        cc.sacar(150);
    }
}
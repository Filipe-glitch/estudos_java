package poo.polimorfismo_interfaces_c5.desafio;

public class Recomendador {

    public void avalia(Audio audio) {
        if (audio.getClassificacao() >= 9.0) {
            System.out.println("★ '" + audio.getTitulo() + "' é sucesso absoluto e preferido do público!");
        } 
        else {
            System.out.println("☆ '" + audio.getTitulo() + "' está no radar da galera!");
        }
    }
}

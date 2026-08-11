package fundamentos;

// 1. Enumeração: Tipo especial para constante de grupo
enum Estacao {
    VERAO, OUTONO, INVERNO, PRIMAVERA
}

public class MetodosEEstacoes {

    // Método sem retorno (void) e com parâmetro
    public static void saudarPorHorario(int horario) {
        System.out.println("--- Executando Método saudarPorHorario ---");
        if (horario >= 6 && horario <= 12) {
            System.out.println("Bom dia!");
        } 
        else if (horario > 12 && horario <= 18) {
            System.out.println("Boa tarde!");
        } 
        else {
            System.out.println("Boa noite!");
        }
    }

    // Método com retorno do tipo float (calcula e devolve o valor)
    public static float calcularMedia(float a, float b, float c) {
        return (a + b + c) / 3;
    }

    // Método sem parâmetros
    public static void exibirMensagemPadrao() {
        System.out.println("Mensagem padrão do sistema.");
    }

    public static void main(String[] args) {
        // Chamadas aos métodos estáticos
        saudarPorHorario(22);

        float media = calcularMedia(4.0f, 5.0f, 9.0f);
        System.out.printf("Média calculada: %.2f\n\n", media);

        exibirMensagemPadrao();

        // Manipulação de Enum com Switch Expression
        Estacao estacaoAtual = Estacao.INVERNO;
        String recomendacao = switch (estacaoAtual) {
            case VERAO -> "Arrase na praia!";
            case OUTONO -> "Passe o outono com elegância.";
            case INVERNO -> "Se agasalhe bem e com estilo.";
            case PRIMAVERA -> "Aproveite a estação das flores.";
        };
        System.out.println("\nEstação atual: " + estacaoAtual + " -> " + recomendacao);
    }
}


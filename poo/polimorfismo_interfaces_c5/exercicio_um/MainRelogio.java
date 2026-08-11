package poo.polimorfismo_interfaces_c5.exercicio_um;

public class MainRelogio {
    public static void main(String[] args) {
        RelogioBrasileiro relogioBR = new RelogioBrasileiro(14, 30, 45);
        RelogioAmericano relogioUS = new RelogioAmericano(14, 30, 45);

        System.out.println("Horário BR: " + relogioBR.retornarHora());
        System.out.println("Horário US: " + relogioUS.retornarHora());

        RelogioBrasileiro novoHorario = new RelogioBrasileiro(9, 15, 0);
        relogioUS.definirHorario(novoHorario);

        System.out.println("Horário US sincronizado: " + relogioUS.retornarHora());
    }
}

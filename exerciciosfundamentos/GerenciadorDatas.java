package exerciciosfundamentos;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GerenciadorDatas {
    public static void main(String[] args) {
        DateTimeFormatter fmtData = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter fmtHora = DateTimeFormatter.ofPattern("HH:mm");

        // Criação, Adição e Comparação de Datas
        LocalDate hoje = LocalDate.now();
        LocalDate entrega = hoje.plusDays(15);
        System.out.println("Data atual: " + hoje.format(fmtData));
        System.out.println("Previsão de entrega (+15 dias): " + entrega.format(fmtData));

        LocalDate dataEvento = LocalDate.of(2025, 3, 10);
        if (dataEvento.isBefore(hoje)) {
            System.out.println("Status do evento (10/03/2025): Já ocorreu.");
        }

        // Fusos Horários (ZonedDateTime)
        ZonedDateTime tokyo = ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
        ZonedDateTime sydney = ZonedDateTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("\nHorário em Tóquio: " + tokyo.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        System.out.println("Horário em Sydney: " + sydney.format(fmtHora));

        // Cálculo de Ponto e Horas Extras (Duration)
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n--- Controle de Ponto ---");
        System.out.print("\nHorário de entrada (HH:mm): ");
        LocalTime entrada = LocalTime.parse(scanner.next(), fmtHora);

        System.out.print("Carga horária diária (em horas): ");
        int cargaHoraria = scanner.nextInt();

        System.out.print("Horário real de saída (HH:mm): ");
        LocalTime saidaReal = LocalTime.parse(scanner.next(), fmtHora);

        LocalTime saidaPrevista = entrada.plusHours(cargaHoraria);
        Duration saldo = Duration.between(saidaPrevista, saidaReal);

        long horas = saldo.toHours();
        long minutos = saldo.toMinutesPart();

        System.out.println("Saída prevista: " + saidaPrevista.format(fmtHora));
        System.out.printf("Saldo de horas: %s%dh %dmin\n", (saldo.isNegative() ? "" : "+"), horas, Math.abs(minutos));

        scanner.close();
    }
}
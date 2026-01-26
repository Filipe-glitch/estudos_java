package collections;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class Localdate {

	public static void main(String[] args) {
		LocalDate dataHoje = LocalDate.now(); //Captura a data de hoje 
		System.out.println("Original: " + dataHoje); 
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy - EEEE"); 
		System.out.println(dataHoje.format(formatador));
		
		//Obtém LocalDateTime trazendo o horário atual 
		LocalDateTime horario = LocalDateTime.now(); 
		System.out.println("LocalDateTime antes: " + 
		horario); 
		
		DateTimeFormatter formatadorHora = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horarioFormatado = horario.format(formatadorHora); 
		System.out.println("LocalDateTime depois: " + horarioFormatado);
	}

}

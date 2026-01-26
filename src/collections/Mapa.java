package collections;
import java.util.HashMap;
public class Mapa {

	public static void main(String[] args) {
		//capitais indexa capitais (valor) por meio do nome do país (chave).
		HashMap<String, String> capitais = new HashMap<String, String>(); 
		capitais.put("Brasil", "Brasília"); 
		capitais.put("Argentina", "Buenos Aires"); 
		capitais.put("Paraguai", "Assunção"); 
		capitais.put("Uruguai", "Montevidéu"); 
    	System.out.println(capitais);//Imprimindo tudo 
		System.out.println(capitais.get("Uruguai"));//Imprimindo a capital do Uruguai 
	}

}

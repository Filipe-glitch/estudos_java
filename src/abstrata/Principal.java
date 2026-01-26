package abstrata;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		FormaGeometrica forma; 
		
		//Forma é um circulo 
		forma = new Circulo(); 
		forma.calculaArea(teclado); 
		System.out.println(forma.area); 

		//Forma agora é um quadrado 
		forma = new Quadrado(); 
		forma.calculaArea(teclado); 
		System.out.println(forma.area); 
		
		teclado.close();
	}

}

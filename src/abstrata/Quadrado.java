package abstrata;

import java.util.Scanner;

class Quadrado extends FormaGeometrica{
	@Override
	public void calculaArea(Scanner teclado){  
		System.out.println("Digite a medida do lado");
		double lado = teclado.nextDouble(); 
		area = lado*lado; 
}
}
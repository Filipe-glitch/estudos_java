package abstrata;

import java.util.Scanner;

class Circulo extends FormaGeometrica {
	@Override
	public void calculaArea(Scanner teclado){ 
		System.out.println("Digite o raio"); 
		double raio = teclado.nextDouble(); 
		area = raio*raio*Math.PI; 
		} 
	}

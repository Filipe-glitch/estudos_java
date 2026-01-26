package exerquatro;

public class Principal {

	public static void main(String[] args) {
		Nota mario = new Nota();
		
		Nota luigi = new Nota(2, 5, 9);
		
		System.out.println("media luigi");
		luigi.resultado();
		System.out.println();
		mario.setNota1(9);
		mario.setNota2(5);
		mario.setFaltas(5);
		//mario.nota(1) não aparece
		mario.resultado();
		
		mario.setNota1(6);
		mario.setFaltas(15);
		mario.resultado();
	}

}

package erroexcessao;

public class Principal {

	public static void main(String[] args) {
		try { 
			int[] meusNumeros = {1, 2, 3}; 
			System.out.println(meusNumeros[10]); 
			}
		catch (Exception e) { 
			System.out.println("Problema = " + e); 
			} 
		finally { 
			System.out.println("Terminado o try catch."); //executa independente de erro
			}    
		} 
	}


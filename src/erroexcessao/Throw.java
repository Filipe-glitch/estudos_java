package erroexcessao;

public class Throw {
	class Principal{ 
		static void funcao(){ 
		   try{ 
		      throw new NullPointerException("Problema!");
		      }
		catch(NullPointerException e){ 
			System.out.println("funcao() :" + e); 
			throw e; // jogando a exceção novamente 
		    } 
		    }
		public static void main(String args[]){ 
			try{ 
			funcao(); 
			} 
			catch(NullPointerException e){ 
			System.out.println("main() :" + e); 
			} 
		} 
		}
}

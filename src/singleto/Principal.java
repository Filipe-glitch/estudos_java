package singleto;

public class Principal {

	public static void main(String[] args) {
		// instanciando a classe singleton com variável x
		//instancia == null que cria um objeto e numero = 20
        Singleton x = Singleton.getInstance();  
        
        //instancia já existe e nenhum outro objeto é criado,y e z pro mesmo objeto de x
        Singleton y = Singleton.getInstance();  
        //instanciando a classe singleton com variável z
        Singleton z = Singleton.getInstance();  
        
        //mudando variável da instancia x
        x.numero+=10;  //altera o valor que todos veem, altera 
   
        System.out.println("x: " + x.numero);  
        System.out.println("y: " + y.numero);  
        System.out.println("z: " + z.numero);  
        System.out.println("\n");  
        //Todos imprimem 30 
      
        z.numero-=5;  
   
        System.out.println("x: " + x.numero);  
        System.out.println("y: " + y.numero);  
        System.out.println("z: " + z.numero);  
        System.out.println("\n");  
        //Todos imprimem 25 
	}

}
//usar singleton: Configurações do sistema, Conexão com banco, Logger,Controle central (ex: sessão)
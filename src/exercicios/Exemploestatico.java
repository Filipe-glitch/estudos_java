package exercicios;

public class Exemploestatico {
	static int numeroEstatico = 0;  
	// pertence à classe
	//todos os objetos compartilham o mesmo valor, se um objeto mudar,todos mudam.
    
	int numeroComum = 0;            
	// pertence a cada objeto separadamente
    //cada objeto tem sua própria cópia, um objeto incrementa não afeta o outro
    
	public void incremento() {
        numeroComum++;     // aumenta só deste objeto
        numeroEstatico++;  // aumenta para todos os objetos
        
        Exemploestatico obj1 = new Exemploestatico(); 
        //isso cria numeroComum = 0, numeroEstatico = (compartilhado)
       
        Exemploestatico obj2 = new Exemploestatico();
        //isso cria numeroComum = 0, numeroEstatico = (o MESMO valor)
        //Só existe UM numeroEstatico.
        
        System.out.println("numeroComum: " + numeroComum);
        System.out.println("numeroEstatico: " + numeroEstatico);
        
        obj1.incremento();
        obj2.incremento();
        //obj1 numero comum vira 1 e numero estatico vira 1
        //obj2 numero comum vira 1 pq é separado e numero estatico 2 pq é compartilhado
    }
}


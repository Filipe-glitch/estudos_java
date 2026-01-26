package singleto;

public class Singleton {
	// variável estática que armazenara a nossa única instancia 
	    private static Singleton instancia = null;  
	   
	    // variavel para teste 
	    public int numero;  
	   
	    //construtor privado 
	    private Singleton()  {  
	        numero =20;  
	    }  
	   
	    // método estático para criar a instancia 
	    public static Singleton getInstance()  {  
	        if (instancia == null)  
	            instancia = new Singleton(); 
	        return instancia;  
	    }  
	}  


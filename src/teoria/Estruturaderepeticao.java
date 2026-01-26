package teoria;

public class Estruturaderepeticao {

	public static void main(String[] args) {
		//while: verifica a condição antes de executar o bloco.
		int contador = 2;
		while(contador < 5) {
			System.out.println("Contador: "  + contador);
			contador++; //incremento, contador = contador + 1
			//Use quando você não sabe quantas vezes vai repetir(ex: esperar entrada do usuário, ler arquivo, etc.).
		}
		//do-while: O do while executa o bloco pelo menos uma vez, mesmo que a condição seja falsa.
		int numero = 1;
		do {
		   System.out.println("Número: " + numero);
		   numero++;
			} 
	    while (numero <= 5);
	          
	    //for: usado quando você sabe exatamente quantas vezes quer repetir.
        //for (inicialização; condição; incremento){
	  		  // código a ser repetido }
	   
		for (int i = 1; i <= 5; i++) {
	      System.out.println("Valor de i: " + i);
	  	  //Inicializa i = 1, Verifica i <= 5, Executa o bloco, Faz i++ e volta.
	  		}
	   
	   for(int i = 1; i <= 10; i++) {
		   if(i == 3) {
			   continue; //pula o número 3. pula para a próxima iteração
		   }
		   if(i == 7) {
			   break; // para o loop quando chegar a 7. Sai do laço
		   }
		   System.out.println(i);
		 }
	   }  
	}
 


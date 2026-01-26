package notas;

public class Media {
	double nota1;
	double nota2;
	double nota3;
	
	//cada método faz uma coisa
	double MA(){
		 return(nota1 + nota2 + nota3) / 3;
	   }
	double MP(){
		  return(nota1 * 2 + nota2 * 3 + nota3 * 4)/( 2 + 3 + 4);
		  //considerando pesos 2,3 e 4
	   }
}
//evite MA,MP ETC. prefira mediaAritmetica etc

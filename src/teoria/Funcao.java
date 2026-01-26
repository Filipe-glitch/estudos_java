package teoria;
public class Funcao {
    public static void alo(int horario) {
    	//método: tipoRetorno nomeMetodo(parâmetros)
    	System.out.println("ALO PESSOAL");
    	if(horario >=6 && horario <=12) {
    		System.out.println("Bom dia");
    	}
    	else if (horario > 12 && horario <=18) {
    		System.out.println("Boa tarde");
    	}
    	else {
    		System.out.println("Boa noite");
    	}
    }
    public static float media3(float a, float b, float c) {
    	//float media3(float a ...) sendo float o que essa função irá retornar
    	//media3 o nome da função, (float a...) recebe 3 números decimais.
    	float resultado = (a+b+c)/3;// cria um variável chamada resultado
    	return resultado; //devolve o valor calculado para que chamou a função
    }
    public static void main(String[] args) {
    	System.out.println("Média" + media3(4,5,9));
    	// void: não retorna valor
    	// Um método deve ter uma única responsabilidade
    }
}

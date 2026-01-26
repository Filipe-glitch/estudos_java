package sistemabancario;

public class Conta {
	String correntista; 
	float saldo; //ou float saldo, limiteSaque;
	float limiteSaque;
	
	public void sacar(float valor) {
		//A validação sempre na frente da lógica
		if (valor <= 0) {
	        System.out.println("Valor inválido para depósito");
	        return; // sai do método
		}
		//REGRA PRINCIPAL
		if (valor <= saldo + limiteSaque) {
			saldo -= valor;
			System.out.println("Saque realizado no valor de: " + valor);
		}
		else {
			System.out.println("Saque não pode ser realizado");
		}
	}
	
	public void depositar(float valor) {
		if (valor <= 0) {
	        System.out.println("Valor inválido para depósito");
	        return;
		}
		saldo += valor;
		System.out.println("Depósito realizado no valor de: " + valor);
	}
	
	public void info() {
		System.out.println("Correntista: " + correntista);
        System.out.println("Saldo: R$" + saldo);
        System.out.println("Limite de saque: R$" + limiteSaque);
	}
	
	public void transferir(Conta destino, float valor) {
		if (valor <= 0) {
	        System.out.println("Valor inválido para depósito");
	        return;
		}
		if (valor <= saldo + limiteSaque) {
            this.saldo -= valor;
            //this serve para deixar claro que está falando do atributo do objeto.
            destino.saldo += valor;
            System.out.println("Transferência de R$" + valor + " realizada para " + destino.correntista);
        } else {
            System.out.println("Transferência falhou: saldo insuficiente.");
        }
	}
}
//Em sistemas reais, dinheiro NÃO usa float/double. Usa-se BigDecimal
//Código duplicado é sinal de que pode virar método(if (valor <= saldo + limiteSaque))
//Você pode ter mais de um if no mesmo método, com objetivos diferentes.
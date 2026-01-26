package sistemabancario;

public class Principal {

	public static void main(String[] args) {
Conta mario = new Conta();
Conta luigi = new Conta();

mario.correntista = "Mario de Albuquerque";
mario.saldo = 1500;
mario.limiteSaque = 300;

luigi.correntista = "Luigi Samões";
luigi.saldo = 1871;
luigi.limiteSaque = 350;

mario.transferir(luigi, -150);
mario.info();
luigi.info();

luigi.depositar(-300);
luigi.info();

mario.sacar(600);
mario.info();
	}

}

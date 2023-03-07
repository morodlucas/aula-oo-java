package ex6;

public class Bilhete {
	int id;
	String nomeUsuario;
	double saldo;
	static double baseTarifa = 4.4;

	//consultar o saldo
	public double getSaldo() {
		return saldo;
	}
	
	//carregar o bilhete
	public void carregar(double valor) {
		saldo += valor;
	}
	
	//passar na catraca
	public void passarCatraca() {
		saldo -= baseTarifa;
	}
	
	//atualizar o valor da tarifa base
	public static void atualizarTarifa(double porcentagem) {
		baseTarifa += baseTarifa * porcentagem / 100;
	}
}

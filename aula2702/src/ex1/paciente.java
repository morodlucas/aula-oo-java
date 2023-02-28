package ex1;

public class paciente {

	//atributos
	String nome;
	double altura;
	double peso;
	double quadril;
	int idade;
	
	public double calcularImc(){
		double imc;
		imc = peso / (altura * altura);
		return imc;
	}
	
	public double calcularBai() {
		double bai;
		bai = quadril / (altura * Math.sqrt(altura)) - 18;
		return bai;
	}
	
	public int freqMax() {
		return 220 - idade;
	}
	
	public double[] freqAlvo() {
		double[] alvo = new double[2];
		alvo[0] = freqMax() * 0.5;
		alvo[1] = freqMax() * 0.85;
		return alvo;
	}
}

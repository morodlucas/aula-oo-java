package ex1;
//ex2
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);

		paciente paciente = new paciente();
		
		//entrada de dados
		System.out.print("Nome -> ");
		paciente.nome = kb.nextLine();
		System.out.print("Peso (kg) -> ");
		paciente.peso = kb.nextDouble();
		System.out.print("Altura (m) -> ");
		paciente.altura = kb.nextDouble();
		System.out.print("Quadril (cm) -> ");
		paciente.quadril = kb.nextDouble();
		System.out.print("Idade (an) -> ");
		paciente.idade = kb.nextInt();
		kb.close();
		
		System.out.println("IMC -> " + paciente.calcularImc());
		System.out.println("BAI -> " + paciente.calcularBai());
		System.out.println("Frequencia maxima -> " + paciente.freqMax());
		
		double[] alvo = paciente.freqAlvo();
		
		System.out.println("Frequencia alvo -> de " + alvo[0] +" a "+ alvo[1]);
		
	}

}

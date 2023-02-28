package ex5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// instanciação
		Scanner teclado = new Scanner(System.in);
		Bola bola1 = new Bola();
		Bola bola2 = new Bola();
		Bola bola3 = new Bola();

		// entrada de dados
		System.out.print("Cor da bola 1: ");
		bola1.cor = teclado.nextLine();
		System.out.print("Raio da bola 1: ");
		bola1.raio = teclado.nextDouble();

		// repete o código acima para as bolas 2 e 3
		Bola bola = maiorBola(bola1, bola2, bola3);
		System.out.println("A cor da maior bola é: " + bola.cor);
	}

	public static Bola maiorBola(Bola bola1, Bola bola2, Bola bola3) {
		if(bola1.raio > bola2.raio && bola1.raio > bola3.raio) {
			return bola1;
		}
		if(bola2.raio > bola1.raio && bola2.raio > bola3.raio) {
			return bola2;
		}else {
			return bola3;
		}

	}
}

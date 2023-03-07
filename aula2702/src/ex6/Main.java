package ex6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		Bilhete b1 = new Bilhete();
		b1.carregar(1000);
		
		b1.passarCatraca();
		b1.passarCatraca();
		
		
		System.out.println(b1.getSaldo());
		
		Bilhete.atualizarTarifa(10);
	
		b1.passarCatraca();
		b1.passarCatraca();
		
		System.out.println(b1.getSaldo());
	}

}

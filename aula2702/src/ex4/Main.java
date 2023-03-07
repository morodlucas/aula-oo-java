package ex4;

import java.util.Scanner;

public class Main {

	static Livro livro = new Livro();
	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {

		int opcao;
		do {
			System.out.println(gerarMenu());
			opcao = kb.nextInt();
			if (opcao < 1 || opcao > 5) {
				System.out.println("Opcao invalida");
				System.out.println("---------------");
			} else if (opcao == 1) {
				cadastrar();
			} else if(opcao == 2) {
				pesquisar();
			} else if(opcao == 3) {
				emprestar();
			} else if(opcao == 4) {
				devolver();
			}
			System.out.println();
		} while (opcao != 5);

		kb.close();
	}

	public static void devolver() {
		
		livro.devolver();
		
	}

	public static void emprestar() {
		
		livro.emprestar();
		
	}

	public static void pesquisar() {
		
		System.out.println(livro.getDados());
		
	}

	public static void cadastrar() {

		System.out.print("ID: ");
		livro.id = kb.nextInt();
		kb.nextLine();
		System.out.print("Titulo: ");
		livro.titulo = kb.nextLine();
		System.out.print("Autor: ");
		livro.autor = kb.nextLine();
		livro.disponivel = true;
	}

	public static String gerarMenu() {
		String aux = "Escolha uma opcao\n";
		aux += "1. Cadastrar\n";
		aux += "2. Pesquisar\n";
		aux += "3. Emprestar\n";
		aux += "4. Devolver\n";
		aux += "5. Finalizar\n";
		return aux;
	}

}

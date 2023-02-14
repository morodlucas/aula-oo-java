import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		
		Aluno a1 = new Aluno();
						//método construtor
		//System.out.println(a1);
		//^^ endereço de memória do obj
		
		
		//dados do primeiro obj
		System.out.print("Nome do objeto -> ");
		a1.nome = kb.nextLine();
		System.out.print("RM -> ");
		a1.rm = kb.nextInt();
		kb.nextLine();
		System.out.print("Nota 1 -> ");
		a1.nota1 = kb.nextDouble();
		System.out.print("Nota 2 -> ");
		a1.nota2 = kb.nextDouble();
		
		System.out.println(a1.nome);
		System.out.println(a1.rm);
		System.out.println(a1.media());
		
		//dados do segundo obj
		Aluno a2 = new Aluno();
		/*System.out.print("Nome do objeto 2 -> ");
		a2.nome = kb.nextLine();
		System.out.print("RM -> ");
		a2.rm = kb.nextInt();*/

		System.out.print("Nome do objeto -> ");
		a2.nome = kb.nextLine();
		a2.rm = kb.nextInt();
		kb.close();
		
	}
}

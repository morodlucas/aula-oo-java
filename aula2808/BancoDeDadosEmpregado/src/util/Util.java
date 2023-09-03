package util;

import static java.lang.Integer.parseInt;
import static java.lang.Double.parseDouble;

import static javax.swing.JOptionPane.*;

import java.sql.Date;

import DAO.ClienteDAO;
import DAO.FeedbackDAO;
import DAO.ProdutoDAO;
import entidades.Cliente;
import entidades.Feedback;
import entidades.Produto;

public class Util {

	public void app() {

		int opcao;
		do {
			opcao = parseInt(showInputDialog(gerarMenu()));
			switch (opcao) {
			case 0:
				showMessageDialog(null, "Programa encerrado");
				break;
			case 1:

				inserirCliente();

				break;
			case 2:

				inserirFeedback();

				break;
			case 3:

				inserirProduto();

				break;
			case 4:

				pesquisarProduto();

				break;
			case 5:
				
				atualizarProduto();
				
				break;
			case 6:
				
				excluirProduto();
				
				break;
			default:
				showMessageDialog(null, "Opção Inválida");
			}

		} while (opcao != 0);

	}
	
	private void excluirProduto() {
		ProdutoDAO dao = new ProdutoDAO();
		int id = parseInt(showInputDialog("ID"));
		Produto produto = dao.pesquisar(id);
		if(produto == null) {
			showMessageDialog(null, "Produto não cadastrado");
		}
		else {
			dao.remover(id);
			showMessageDialog(null, "Produto removido com sucesso!");
		}
		
	}
	
	private void atualizarProduto() {
		ProdutoDAO dao = new ProdutoDAO();
		int id = parseInt(showInputDialog("ID"));
		Produto produto = dao.pesquisar(id);
		if(produto == null) {
			showMessageDialog(null, "Empregado não cadastrado");
		}
		else {
			String nome = showInputDialog("Novo nome do produto: ");
			produto.setNomeProduto(nome);
			double valUnit = parseDouble(showInputDialog("Novo valor uniátio: "));
			produto.setValUnitario(valUnit);
			double qtdEstoque = parseDouble(showInputDialog("Nova quantidade em estoque: "));
			produto.setQtdEstoque(qtdEstoque);
			double unidadeMedida = parseDouble(showInputDialog("Nova unidade medida (centímetros) do produto: "));
			produto.setUnidadeMedida(unidadeMedida);
			String data = showInputDialog("Nova data da inclusão do produto: ");
			produto.setDataInclusao(data);
			int idEmpresa = parseInt(showInputDialog("Novo ID da empresa dona do produto: "));
			produto.setIdEmpresa(idEmpresa);
			int idTipoProduto = parseInt(showInputDialog("Novo ID do tipo do produto: "));
			produto.setIdTipoProduto(idTipoProduto);
			dao.atualizar(produto);
			showMessageDialog(null, "Produto atualizado com sucesso!");
		}
	}

	private void pesquisarProduto() {
		ProdutoDAO dao = new ProdutoDAO();
		int id = parseInt(showInputDialog("ID"));
		Produto produto = dao.pesquisar(id);
		if (produto == null) {
			showMessageDialog(null, "Produto não cadastrado");
		} else {
			showMessageDialog(null, produto.toString());
		}

	}

	public void inserirCliente() {
		Cliente cliente = new Cliente();
		ClienteDAO clienteDao = new ClienteDAO();
		int id = parseInt(showInputDialog("ID do cliente:"));
		cliente.setIdCliente(id);
		String nome = showInputDialog("Nome do cliente: ");
		cliente.setNome(nome);
		String cpfId = showInputDialog("CPF: ");
		cliente.setCpf(cpfId);
		String sexualidade = showInputDialog("Sexo do cliente: ");
		cliente.setSexo(sexualidade);
		String anos = showInputDialog("Data de nascimento do cliente: ");
		cliente.setDtNascimento(anos);
		int lugar = parseInt(showInputDialog("ID cidade: "));
		cliente.setUf(lugar);
		String email = showInputDialog("E-mail: ");
		cliente.setEmail(email);
		String telefone = showInputDialog("Telefone: ");
		cliente.setTelefone(telefone);

		clienteDao.inserir(cliente);
	}

	public void inserirFeedback() {
		Feedback feedback = new Feedback();
		FeedbackDAO feedbackDao = new FeedbackDAO();
		int id = parseInt(showInputDialog("ID do feedback:"));
		feedback.setIdFeddback(id);
		double nota = parseDouble(showInputDialog("Nota da avaliação:"));
		feedback.setNotaAvaliacao(nota);
		String data = showInputDialog("Data de post do feedback");
		feedback.setDataFeedback(data);
		int idCliente = parseInt(showInputDialog("ID do cliente dono feedback:"));
		feedback.setIdCliente(idCliente);
		int idProduto = parseInt(showInputDialog("ID do produto do feedback:"));
		feedback.setIdProduto(idProduto);
		int idCategoria = parseInt(showInputDialog("ID da categoria do feedback:"));
		feedback.setIdCategoria(idCategoria);
		int idTipo = parseInt(showInputDialog("Tipo do feedback: 1 para sugestão / 2 para reclamação"));
		feedback.setTipoFeedback(idTipo);

		feedbackDao.inserir(feedback);
	}

	public void inserirProduto() {
		Produto produto = new Produto();
		ProdutoDAO produtoDao = new ProdutoDAO();
		int id = parseInt(showInputDialog("ID do produto: "));
		produto.setIdProduto(id);
		
		produto = produtoDao.pesquisar(id);
		if(produto != null) {
			showMessageDialog(null, "Produto já cadastrado!");
		}
		else {
			Produto produtoAux = new Produto();
			produtoAux.setIdProduto(id);
			String nome = showInputDialog("Nome do produto: ");
			produtoAux.setNomeProduto(nome);
			double valUnit = parseDouble(showInputDialog("Valor uniátio: "));
			produtoAux.setValUnitario(valUnit);
			double qtdEstoque = parseDouble(showInputDialog("Quantidade em estoque: "));
			produtoAux.setQtdEstoque(qtdEstoque);
			double unidadeMedida = parseDouble(showInputDialog("Unidade medida (centímetros) do produto: "));
			produtoAux.setUnidadeMedida(unidadeMedida);
			String data = showInputDialog("Data da inclusão do produto: ");
			produtoAux.setDataInclusao(data);
			int idEmpresa = parseInt(showInputDialog("ID da empresa dona do produto: "));
			produtoAux.setIdEmpresa(idEmpresa);
			int idTipoProduto = parseInt(showInputDialog("ID do tipo do produto: "));
			produtoAux.setIdTipoProduto(idTipoProduto);

			produtoDao.inserir(produtoAux);
		}
		
		
	}

	public String gerarMenu() {
		String aux = "Interface de input ao banco de dados®\n";
		aux += "1. Inserir cliente\n";
		aux += "2. Inserir feedback\n";
		aux += "-------------------\n";
		aux += "3. Inserir produto\n";
		aux += "4. Pesquisar produto\n";
		aux += "5. Editar produto\n";
		aux += "6. Excluir produto\n";
		aux += "-------------------\n";
		aux += "0. Encerrar programa\n";
		return aux;
	}

}

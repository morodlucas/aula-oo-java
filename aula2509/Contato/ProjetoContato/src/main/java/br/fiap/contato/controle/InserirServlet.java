package br.fiap.contato.controle;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.contato.dao.ContatoDAO;
import br.fiap.contato.entidade.Contato;
import br.fiap.contato.util.Util;

/**
 * Servlet implementation class InserirServlet
 */
@WebServlet("/inserir")
public class InserirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InserirServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Util util = new Util();
		Contato contato = new Contato();
		ContatoDAO dao = new ContatoDAO();
		LocalDate data = util.converter(request.getParameter("data"));
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		String senha = util.criptografar(request.getParameter("senha"));
		String fone = request.getParameter("fone");
		
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setSenha(senha);
		contato.setTelefone(fone);
		contato.setDataNascimento(data);
		dao.inserir(contato);
		
		response.sendRedirect("index.jsp");
		
	}

}

package exercicio.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Exercicio1Servlet
 */
@WebServlet("/ex1")
public class Exercicio1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		int diaria = Integer.parseInt(request.getParameter("diaria"));
		double taxa, conta;
		
		if(diaria > 15) {
			taxa = 15.5;
		}
		else if(diaria == 15) {
			taxa = 36;
		}
		else {
			taxa = 58;
		}
		conta = (250 + taxa) * diaria;
		request.setAttribute("conta", conta);
		HttpSession session = request.getSession();
		session.setAttribute("nome", nome);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("form/formResultadoExercicio.jsp");
		dispatcher.forward(request, response);
	}

}

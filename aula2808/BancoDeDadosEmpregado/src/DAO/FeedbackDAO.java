package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.Conexao;
import entidades.Cliente;
import entidades.Feedback;
import entidades.Produto;

public class FeedbackDAO {

	private PreparedStatement ps;
	private String sql;
	private Conexao conexao;
	private ResultSet rs;

	public FeedbackDAO() {
		conexao = new Conexao();
	}

	public void inserir(Feedback feedback) {
		sql = "insert into tb_feedback(id_feedback, nota_avaliacao, data_feed, id_cliente, id_prod, id_categoria, id_tipo_feed) values(?, ?, ?, ?, ?, ?)";

		try (Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, feedback.getIdFeddback());
			ps.setDouble(2, feedback.getNotaAvaliacao());
			ps.setString(3, feedback.getDataFeedback());
			ps.setInt(4, feedback.getIdCliente());
			ps.setInt(5, feedback.getIdProduto());
			ps.setInt(6, feedback.getIdCategoria());
			ps.setInt(7, feedback.getTipoFeedback());
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

	public boolean pesquisar(Feedback feedback) {
		boolean aux = false;
		sql = "select * from java_feedback where id = ?";

		try (Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, feedback.getIdFeddback());
			rs = ps.executeQuery();
			if (rs.next()) {
				aux = true;
			}
			rs.close();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}

		return aux;
	}

}

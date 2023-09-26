package br.fiap.contato.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.fiap.contato.conexao.Conexao;
import br.fiap.contato.entidade.Contato;

public class ContatoDAO {
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	private Conexao conexao;
	
	public ContatoDAO() {
		conexao = new Conexao();
	}
	
	public void inserir(Contato contato) {
		sql = "insert into java_contato values(contato_sequence.nextval, ?, ?, ?, ?, ?)";
		
		try (Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getEmail());
			ps.setString(3, contato.getSenha());
			ps.setString(4, contato.getTelefone());
			ps.setDate(5, Date.valueOf(contato.getDataNascimento()));
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			System.out.println("Erro ao inserir no banco de dados\n" + e);
		}		
	}
	
}

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

public class ClienteDAO {
	
	private PreparedStatement ps;
	private String sql;
	private Conexao conexao;
	private ResultSet rs;
	
 	public ClienteDAO() {
		conexao = new Conexao();
	}
 	
 	public void inserir(Cliente cliente) {
 		sql = "insert into tb_cliente values(?, ?, ?, ?, ?, ?, ?, ?)"; 
		//(id_cliente, nm_cliente, dt_nascimento, sexo, cpf, e_mail, telefone, id_cidade)
		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, cliente.getIdCliente());
			ps.setString(2, cliente.getNome());
			ps.setString(3, cliente.getDtNascimento());
			ps.setString(4, cliente.getSexo());
			ps.setString(5, cliente.getCpf());
			ps.setString(6, cliente.getEmail());
			ps.setString(7, cliente.getTelefone());
			ps.setInt(8, cliente.getUf());
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
 	
 	

}

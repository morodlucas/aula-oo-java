package empregado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import empregado.conexao.Conexao;
import empregrado.entidade.Departamento;

public class DepartamentoDAO {

	private Connection connection;
	private PreparedStatement ps;
	private String sql;
	private Conexao conexao;
	private ResultSet rs;
	
	public DepartamentoDAO() {
		conexao = new Conexao();
	}
	
	
	//método p inserir um departamento no banco de dados
	public void inserir(Departamento departamento ) {
		sql = "insert into java_departamento(id, nome) values(?, ?)";
		
		try (Connection connection = conexao.conectar()){
			ps = connection.prepareStatement(sql);
			ps.setInt(1, departamento.getId());
			ps.setString(2, departamento.getNome());
			ps.execute();
			ps.close();
			connection.close();
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	//método p verificar se um departamento existe
	public boolean pesquisar(Departamento departamento) {
		boolean aux = false;
			try (Connection connection = conexao.conectar()){
				ps = connection.prepareStatement(sql);
				ps.setInt(1, departamento.getId());
				ps.setString(2, departamento.getNome());
				rs = ps.executeQuery();
				if(rs.next()) {
					aux = true;
				}
				rs.close();
				ps.close();
				connection.close();
			}
			catch(SQLException e) {
				System.out.println(e);
			}
		sql = "select * from java_departamento where id = ? or nome = ?";
		
		return aux;
	}
}

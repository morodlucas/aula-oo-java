package empregado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import empregado.conexao.Conexao;
import empregrado.entidade.Departamento;
import empregrado.entidade.Empregado;

public class EmpregadoDAO {

	private Connection connection;
	private PreparedStatement ps;
	private String sql;
	private Conexao conexao;
	private ResultSet rs;
	
	public EmpregadoDAO() {
		conexao = new Conexao();
	}
	
	//método p pesquisar um empregado pelo seu ID
	public Empregado pesquisar(int id) {
		Empregado empregado = null;
		sql = "select * from java_empregado where id = ?";
		
		try (Connection connection = conexao.conectar()){
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id));
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
		
		return empregado;
	}
}
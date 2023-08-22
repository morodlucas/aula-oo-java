package empregado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import empregado.conexao.Conexao;
import empregado.entidade.Departamento;
import empregado.entidade.Empregado;

public class EmpregadoDAO {
	private PreparedStatement ps;
	private String sql;
	private Conexao conexao;
	private ResultSet rs;
	
 	public EmpregadoDAO() {
		conexao = new Conexao();
	}
 	
 	// método para pesquisar um empregado pelo seu ID (matrícula)
 	public Empregado pesquisar(int id) {
 		Empregado empregado = null;
 		sql = "select * from java_empregado where id = ?";
 		
 		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				Departamento departamento = new Departamento(rs.getInt("id_departamento"), null);
				empregado = new Empregado(rs.getInt("id"), rs.getString("nome"), rs.getDouble("salario"), departamento);
			}
			rs.close();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
 		
 		return empregado;
 	}
 	
 	// método para inserir os dados de um empregado no banco de dados
 	public void inserir(Empregado empregado) {
 		sql = "insert into java_empregado values(?, ?, ?, ?)";
 		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, empregado.getId());
			ps.setString(2, empregado.getNome());
			ps.setDouble(3, empregado.getSalario());
			ps.setInt(4, empregado.getDepartamento().getId());
			ps.close();
			connection.close();
 		} catch (Exception e) {
			System.out.println(e);
		}
 	}
 	
 	// método para listar todos os empregados
 	public List<Empregado> lista = new ArrayList<>();
 	
}



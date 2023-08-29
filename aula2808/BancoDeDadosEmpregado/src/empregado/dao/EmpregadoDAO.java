package empregado.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
			ps.execute();
			ps.close();
			connection.close();
 		} catch (SQLException e) {
			System.out.println(e);
		}
 		
 	}

 	// método para listar todos os empregados
 	public List<Empregado> listar() {
 		List<Empregado> lista = new ArrayList<>();
 		sql = "select e.id as id, e.nome as nome, e.salario as salario, \r\n"
 				+ "    d.nome as nomeDep from java_empregado e\r\n"
 				+ "    join java_departamento d\r\n"
 				+ "    on e.id_departamento = d.id";
 		
 		try(Connection connection = conexao.conectar()) {
 			ps = connection.prepareStatement(sql);
 			rs = ps.executeQuery();
 			while(rs.next()) {
 				int id = rs.getInt("id");
 				String nome = rs.getString("nome");
 				double salario = rs.getDouble("salario");
 				String nomeDep = rs.getString("nomeDep");
 				Departamento departamento = new Departamento(0, nomeDep);
 				Empregado empregado = new Empregado(id, nome, salario, departamento);
 				lista.add(empregado);
 			}
 		} catch (SQLException e) {
 			System.out.println("Erro ao listar empregado" + e);
		}
 		
 		return lista;
 	}
 	
 	//método para remover um empregado pelo ID
 	public void remover(int id) {
 		sql = "DELETE FROM java_empregado WHERE id = ?";
 		
 		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
 	}
 	
 	//método para atualizar empregado pelo ID
 	public void atualizar(Empregado empregado) {
 		sql = "UPDATE java_empregado SET nome = ?, salario = ? WHERE id = ?";
 		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setString(1, empregado.getNome());
			ps.setDouble(2, empregado.getSalario());
			ps.setInt(3, empregado.getId());
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
 	}
}

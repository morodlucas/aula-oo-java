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

public class ProdutoDAO {

	private PreparedStatement ps;
	private String sql;
	private Conexao conexao;
	private ResultSet rs;

	public ProdutoDAO() {
		conexao = new Conexao();
	}

	public void inserir(Produto produto) {
		sql = "insert into tb_produto(id_prod, nm_prod, vl_unit, qtd_estoque, unid_medida, data_inclusao, id_empresa, id_tipo_produto) values(?, ?, ?, ?, ?, ?, ?, ?)";

		try (Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, produto.getIdProduto());
			ps.setString(2, produto.getNomeProduto());
			ps.setDouble(3, produto.getValUnitario());
			ps.setDouble(4, produto.getQtdEstoque());
			ps.setDouble(5, produto.getUnidadeMedida());
			ps.setString(6, produto.getDataInclusao());
			ps.setInt(7, produto.getIdEmpresa());
			ps.setInt(8, produto.getIdTipoProduto());
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public Produto pesquisar(int id) {
		Produto produto = null;
		sql = "select * from tb_produto where id_prod = ?";

		try (Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			if (rs.next()) {
				produto = new Produto(rs.getInt("id_prod"), rs.getDouble("vl_unit"), rs.getDouble("qtd_estoque"),
						rs.getDouble("unid_medida"), rs.getString("data_inclusao"), rs.getString("nm_prod"),
						rs.getInt("id_empresa"), rs.getInt("id_tipo_produto"));
			}
			rs.close();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}

		return produto;
	}
	
	public void atualizar(Produto produto) {
 		sql = "UPDATE tb_produto SET nm_prod = ?, vl_unit = ?, qtd_estoque = ?, unid_medida = ?, data_inclusao = ?, id_empresa = ?, id_tipo_produto = ? WHERE id_prod = ?";
 		try(Connection connection = conexao.conectar()) {
			ps = connection.prepareStatement(sql);
			ps.setString(1, produto.getNomeProduto());
			ps.setDouble(2, produto.getValUnitario());
			ps.setDouble(3, produto.getQtdEstoque());
			ps.setDouble(4, produto.getUnidadeMedida());
			ps.setString(5, produto.getDataInclusao());
			ps.setInt(6, produto.getIdEmpresa());
			ps.setInt(7, produto.getIdTipoProduto());
			ps.setInt(8, produto.getIdProduto());
			ps.execute();
			ps.close();
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
 	}
	
	public void remover(int id) {
 		sql = "DELETE FROM tb_produto WHERE id_prod = ?";
 		
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

}

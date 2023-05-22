package br.fiap.nota;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.fiap.produto.ItemProduto;

public class NotaFiscal {

	private int numero;
	private String cliente;
	private List<ItemProduto> lista;
	
	public NotaFiscal(String cliente) {
		this.numero = gerarNumero();
		this.cliente = cliente;
		this.lista = new LinkedList<>();
	}
	
	private int gerarNumero() {
		Random r = new Random();
		return r.nextInt(1000, 999);
	}

	public void inserirItemProduto(ItemProduto item) {
		lista.add(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		for (ItemProduto item : lista) {
			total += item.getQuantidade() * item.getProduto().getPreco();
		}
		return total;
	}
}

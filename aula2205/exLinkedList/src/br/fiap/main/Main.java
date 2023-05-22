package br.fiap.main;

import br.fiap.nota.NotaFiscal;
import br.fiap.produto.Produto;
import br.fiap.produto.ItemProduto;

public class Main {

	//1a nota fiscal
	NotaFiscal nf1 = new NotaFiscal("S");
	Produto p1 = new Produto("feijão", 420);
	Produto p2 = new Produto("b", 69.42);
	Produto p3 = new Produto("oi", 21.00);
	
	nf1.inserirItemProduto(new ItemProduto(p1, 3));
}

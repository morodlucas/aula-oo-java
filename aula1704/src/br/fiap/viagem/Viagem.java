package br.fiap.viagem;

import br.fiap.carga.Carga;

public class Viagem {

	private double capacidade;
	private int index;
	private Carga[] carga;

	public Viagem() {
		this.capacidade = 10000;
		this.index = 0;
		this.carga = new Carga[20];
	}

	public boolean reservar(Carga carga) {
		if (permitidoReservar(carga.getPeso())) {
			this.carga[index++] = carga;
			return true;
		}
		return false;
	}

	public double capacidadeReservada() {
		double total = 0;
		for (int i = 0; i < index; i++) {
			total += carga[i].getPeso();
		}
		return total;
	}

	public boolean permitidoReservar(double peso) {
		if (index < carga.length && capacidadeReservada() + peso <= capacidade)
			return true;
		return false;
	}
	
	//metodo get -> retorna os dados de todas as cargas reservadas
	public String getDados() {
		String aux = "";
		for (int i = 0; i < index; i++) {
			aux += carga[i].getDados() + "\n";
		}
		return aux;
	}
	
	public String getDados(int indice) {
		return carga[indice].getDados();
	}
	
	//pesquisa carga pelo cnpj
	//tem relação com o método cancelar
	public int pesquisar(int cnpj) {
		int aux = -1;
		for (int i = 0; i < index; i++) {
			if(carga[i].getCliente().getCnpj() == cnpj) {
				aux = i;
				break;
			}
		}
		return aux;
	}

	//cancelar ou remover uma carga reservada
	public void cancelar(int indice) {
		
		carga[indice] = carga[index-1];
		index--;
		
	}
	
}
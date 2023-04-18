package br.fiap.carga;

import java.util.Random;

import br.fiap.cliente.Cliente;

public class Carga {

	private int id;
	private String destino;
	private double peso;
	private Cliente cliente;

	public Carga(String destino, Cliente cliente) {
		this.destino = destino;
		this.cliente = cliente;
		this.id = gerarId();
		this.peso = gerarPeso();
	}

	private int gerarId() {
		Random gerador = new Random();
		return gerador.nextInt(1000, 10000);
	}

	private double gerarPeso() {
		return Math.random() * 10000 + 1;
	}

	public String getDados() {
		String aux = "";
		aux += "Id: " + id + "\n";
		aux += "Destino: " + destino + "\n";
		aux += "Peso: " + String.format("%.4f", peso) + "\n";
		aux += cliente.getDados();
		return aux;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
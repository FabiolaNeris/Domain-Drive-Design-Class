package br.com.fiap.beans;

public class Produto {

	private int codigo;
	private String tipo;
	private double valor;
	private String marca;
	
	//metodo vazio
	public Produto() {
		super();
	}

	//metodo cheio
	public Produto(int codigo, String tipo, double valor, String marca) {
		super();
		this.codigo = codigo;
		this.tipo = tipo;
		this.valor = valor;
		this.marca = marca;
	}

	//getters and setters
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	
	
}

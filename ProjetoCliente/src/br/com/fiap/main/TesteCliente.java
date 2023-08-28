package br.com.fiap.main;

import br.com.fiap.beans.Cliente;

public class TesteCliente {

	public static void main(String[] args) {
		// Instanciar objeto
		Cliente objetoCliente = new Cliente();

		//Entradas
		objetoCliente.setNome("Fabiola");
		objetoCliente.setIdade(23);
		objetoCliente.setValor(200);
		
		//Saídas
		System.out.println("Nome: " + objetoCliente.getNome() + 
				"\nIdade: " + objetoCliente.getIdade());
	
	}

}

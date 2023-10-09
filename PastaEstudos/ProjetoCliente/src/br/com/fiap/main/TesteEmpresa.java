package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Empresa;
import br.com.fiap.beans.Endereco;
import br.com.fiap.beans.Produto;

public class TesteEmpresa {

	public static void main(String[] args) {
		//instanciar objetos
		
		//String razaoSocial, String email, String segmento, int unidade
		Empresa objEmpresa = new Empresa(
				JOptionPane.showInputDialog("Digite a razão social"),
				JOptionPane.showInputDialog("Digite o email"),
				JOptionPane.showInputDialog("Digite o segmento"),
				Integer.parseInt(JOptionPane.showInputDialog("Qual a unidade"))
				);
		
		//String logradouro, int numero, String cep, String bairro, String cidade
		Endereco objeEndereco = new Endereco(
				JOptionPane.showInputDialog("Logradouro"),
				Integer.parseInt(JOptionPane.showInputDialog("Numero")),
				JOptionPane.showInputDialog("Cep"),
				JOptionPane.showInputDialog("Bairro"),
				JOptionPane.showInputDialog("Cidade")
				);
		
		objEmpresa.setEndereco(objeEndereco);
		
		//int codigo, String tipo, double valor, String marca
		Produto objProduto = new Produto(
				Integer.parseInt(JOptionPane.showInputDialog("Codigo do produto")),
				JOptionPane.showInputDialog("Tipo do produto"),
				Double.parseDouble(JOptionPane.showInputDialog("Valor")),
				JOptionPane.showInputDialog("Marca")
				);
		
		objEmpresa.setProduto(objProduto);
		
		
		//saida
		System.out.println("Empresa: " + objEmpresa.getRazaoSocial()+
				"\nEmail: " + objEmpresa.getEmail()+
				"\nSegmento: " + objEmpresa.getSegmento()+
				"\nUnidade: " + objEmpresa.getUnidade()+
				"\nLogradouro: " + objEmpresa.getEndereco().getLogradouro()+
				"\nNumero: " + objEmpresa.getEndereco().getNumero()+
				"\nCEP: " + objEmpresa.getEndereco().getCep()+
				"\nBairro: " + objEmpresa.getEndereco().getBairro()+
				"\nCidade: "  + objEmpresa.getEndereco().getCidade()+
				"\nCódigo produto"  +objEmpresa.getProduto().getCodigo()+
				"\nTipo: " + objEmpresa.getProduto().getTipo()+
				"\nValor: " + objEmpresa.getProduto().getValor()+
				"\nMarca: " + objEmpresa.getProduto().getMarca()
				);

	}

}

package br.com.via.lp;

public class Aula06Construtores {

	private String nome;
	private int idade;
	private String endereco;
	public String getNome() {
		return nome;
	}
	
	
	
	public Aula06Construtores(String nome, int idade, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
	}



	public Aula06Construtores() {
		}



	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	  


}

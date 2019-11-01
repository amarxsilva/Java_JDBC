package br.com.via.lp;

public class Aula07HerancaPessoaFisica extends Aula07HerancaPessoa {
	
	private String cpf;

	
	
	public Aula07HerancaPessoaFisica(String nome, String endereco, String telefone, String cpf) {
		this.cpf = cpf;
	}

	

	public Aula07HerancaPessoaFisica() {
		super();
	}


	@Override
	public void mostrarDados() {
		// TODO Auto-generated method stub
		
	}


	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}





		

				
	
	}
	



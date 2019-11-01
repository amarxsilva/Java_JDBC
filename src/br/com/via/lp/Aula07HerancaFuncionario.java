package br.com.via.lp;

public class Aula07HerancaFuncionario extends Aula07HerancaPessoaFisica {

	private String matricula;

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Aula07HerancaFuncionario() {
	
	}

	public void mostrarDados() {
		System.out.println(
				getNome()
				+getEndereco()
				+getTelefone()
				+getCpf()
				+getMatricula());
	}

	
	
		
}

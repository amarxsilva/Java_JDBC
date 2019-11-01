package br.com.via.lp;

public class Aula07UsaHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aula07HerancaPessoaFisica pf = new Aula07HerancaPessoaFisica();
		pf.setNome("Ricardo");
		pf.setEndereco("Rua um");
		pf.setTelefone("9999-9999");
		pf.setCpf("111.111.111.11");
		Aula07HerancaPessoaJuridica pj = new Aula07HerancaPessoaJuridica();
		pf.setNome("Via Varejo");
		pf.setEndereco("Rua dois");
		pf.setTelefone("9999-8888");
		pf.setCpf("11.111.111/0000-00");
	
		Aula07HerancaFuncionario funcionario = new Aula07HerancaFuncionario();
		funcionario.setNome("Alexandre");
		funcionario.setEndereco("Rua Brasilio");
		funcionario.setTelefone("9999-8888");
		funcionario.setCpf("319.531.878.46");
	}

}

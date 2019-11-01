package br.com.via.lp;

public class Aula06UsaConstrutores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aula06Construtores construtorVazio = new Aula06Construtores();
		construtorVazio.setNome("Ricardo");
		construtorVazio.setIdade(48);
		construtorVazio.setEndereco("Rua tal");
		
		System.out.println(construtorVazio.getNome()+
				           construtorVazio.getIdade()+
				           construtorVazio.getEndereco());
				
		Aula06Construtores construtorCheio = new Aula06Construtores("Oda ", 48, "rua um");
			
		System.out.println(construtorCheio.getNome()+	
						   construtorCheio.getNome()+
						   construtorCheio.getEndereco());
		
	}

}

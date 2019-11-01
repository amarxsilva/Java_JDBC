package br.com.via.lp;

public class Aula02UsaCachorro {

	public static void main(String[] args) {
		// instanciar 2 objetos e popular eles 
        // chamar o metodo
		
		Aula02Cachorro cachorroPreto = new Aula02Cachorro();
		Aula02Cachorro cachorroBranco = new Aula02Cachorro();
		
		cachorroBranco.sexo = "M";
		cachorroBranco.tamanho = 3;
		cachorroBranco.raca = "pitbull";
		cachorroPreto.raca = "doberman";
		cachorroPreto.tamanho = 6;
		cachorroPreto.sexo = "F";
		
		cachorroPreto.latir();
		cachorroBranco.latir();
		
		
	}

}

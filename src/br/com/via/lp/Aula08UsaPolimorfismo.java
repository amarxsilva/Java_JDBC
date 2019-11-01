package br.com.via.lp;

public class Aula08UsaPolimorfismo {

	public void fazerAnimalComer(Aula08PolimorfismoAnimal animal) {
	
		animal.comer();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Aula08UsaPolimorfismo teste = new Aula08UsaPolimorfismo(); 
	teste.fazerAnimalComer(new Aula08PolimorfismoAnimal());
	teste.fazerAnimalComer(new Aula08PolimorfismoTigre());
	teste.fazerAnimalComer(new Aula08PolimorfismoCao());
	
	Aula08PolimorfismoAnimal animal = new Aula08PolimorfismoTigre();
	animal.comer();
	
	Aula08PolimorfismoAnimal animal2 = new Aula08PolimorfismoCao();
	animal2.comer();		
	}

}

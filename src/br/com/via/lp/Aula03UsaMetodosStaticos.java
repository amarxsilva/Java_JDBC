package br.com.via.lp;

public class Aula03UsaMetodosStaticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Aula03MetodosStaticos frango1 = new Aula03MetodosStaticos();
    frango1.botar();
    frango1.botar();
    frango1.botar();
    
    Aula03MetodosStaticos frango2 = new Aula03MetodosStaticos();
    frango2.botar();
    frango2.botar();
    frango2.botar();
    frango2.botar();
    
    frango1.botar();
    frango1.botar();
    frango1.botar();
    
    System.out.println("Frango1: "+ frango1.ovos);
    System.out.println("Frango2: "+ frango2.ovos);
    System.out.println("Granja: " + Aula03MetodosStaticos.ovosDaGranja);
	}

}

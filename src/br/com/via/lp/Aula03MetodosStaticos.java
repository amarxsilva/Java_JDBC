package br.com.via.lp;

public class Aula03MetodosStaticos {

	public int ovos;
	public static int ovosDaGranja;
	
	public void botar() {

		this.ovos++;
		Aula03MetodosStaticos.ovosDaGranja++;
	}
}
package br.com.via.generics;

import java.util.ArrayList;

public class Baralho {

	public ArrayList<Cartas> cartas;
		
	public Baralho() {
		cartas = new ArrayList<>(52);
		inicializarCartas();
	}

	public void inicializarCartas() {
		Cartas.Naipe naipes[] = Cartas.Naipe.values();

		Cartas.Valor valores[] = Cartas.Valor.values();
		
		for(Cartas.Naipe naipe : naipes) {
			
			for(Cartas.Valor valor : valores) {
				cartas.add(new Cartas(naipe,valor));
			}
		}
			
	}

	public ArrayList<Cartas> getCartas() {
		return cartas;
	}

	public void setCartas(ArrayList<Cartas> cartas) {
		this.cartas = cartas;
	}
	
}

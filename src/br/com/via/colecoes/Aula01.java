package br.com.via.colecoes;

import java.util.ArrayList;
import java.util.Iterator;

public class Aula01 {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(5);
		lista.add(9);
		lista.add(7);
		lista.add(5);
		lista.add(0);
		lista.add(5);

		Iterator inte = lista.iterator();

		while (inte.hasNext()) {
			System.out.println("Lista com interator:" + inte.next());
		}
		
		for (Integer list : lista) {
			System.out.println("Lista com for: " + list);
			
		}
		System.out.println("Tamanho " + lista.size());
		System.out.println("1º ocorrencia" + lista.get(0));
		System.out.println("1º ocorrencia" + lista.isEmpty());

		lista.forEach(list -> System.out.println("Lista Java 8"));

		lista.forEach(list -> {
			if (list == 0) {
				System.out.println("zero");
			}

			else {
				System.out.println("outro");
			}

		});
	}

}

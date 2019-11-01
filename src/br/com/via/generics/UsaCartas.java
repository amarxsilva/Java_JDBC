package br.com.via.generics;

import javax.swing.JOptionPane;

public class UsaCartas {

	public static void main(String[] args) {

		Baralho baralho = new Baralho();
		
		JOptionPane.showMessageDialog(null, baralho.getCartas());
		
	}

}

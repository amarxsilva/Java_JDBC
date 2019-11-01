package br.com.via.lp;

public class Aula09InterfaceTVTubo extends Aula09InterfaceTV implements Aula09InterfaceControle {

	public Aula09InterfaceTVTubo(int tamanho) {
		super(tamanho);
		// TODO Auto-generated constructor stub
	}

	public void mudarCanal(int canal) {
		System.out.println("canal mudou para = " + canal);
		
	}

	public void aumentarVolume(int taxa) {
		this.setVolume(this.getVolume() + taxa);
		System.out.println("O volume agora aumentou em : " + taxa + " pontos, e agora é " + 
		this.getVolume());
	}

	public void diminuirVolume(int taxa) {
		this.setVolume(this.getVolume() - taxa);
		System.out.println("O volume agora diminuiu em : " + taxa + " pontos, e agora é " + 
		this.getVolume());
		
	}

	public boolean ligardesligar() {
		
		if (isLigada()) {
			this.setLigada(false);
			System.out.println("desligada");
			return false;
		}else{
			this.setLigada(true);
			System.out.println("ligada");
			return true;
		}
		
	}
	public boolean ligar() {
		
		if (isLigada()) {
			System.out.println("TV ja esta ligada");
		}else{
			this.setLigada(true);
			System.out.println("TV ligada");
		}
		return this.isLigada();

	}

	public boolean desligar() {
		
		if (isLigada()) {
			this.setLigada(false);
			System.out.println("TV desligada");
		}else{
			System.out.println("TV ja está ligada");
		}
		return this.isLigada();

	}

}

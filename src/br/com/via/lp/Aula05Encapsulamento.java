package br.com.via.lp;

public class Aula05Encapsulamento {
	
	private String tipoMaterial;
	private int capacidade;
	
	public void mostrarConteudo() {
		System.out.println("Material : " + getTipomaterial()+ 
						   "Capacidade : " + getCapacidade());	
	}
		
	public String getTipomaterial() {
		return tipoMaterial;
	}
	public void setTipomaterial(String tipomaterial) {
		this.tipoMaterial = tipomaterial;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	
}

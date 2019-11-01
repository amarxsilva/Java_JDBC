package br.com.via.lp;

public class Aula01Conta {

	String cliente;
	double saldo;
	
	void exibirSaldo() {
		System.out.println(cliente + "Seu Saldo é: "+saldo);
	}
	
	void saca(double valor) {
		
		saldo -= valor;
		System.out.println("Valor sacado e: "+ valor);
	}
	
	void deposito(double valor) {
	saldo += valor;
	
	System.out.println("Valor Depositado e:"+ valor);

	
	}
	
	void transferencia(Aula01Conta conta, double valor) {
		this.deposito(valor);
		conta.deposito(valor);
	}
	
}
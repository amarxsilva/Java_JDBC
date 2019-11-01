package br.com.via.lp;

public class Aula01UsaConta {

	public static void main(String[] args) {

		
		Aula01Conta contaProf = new Aula01Conta();
		Aula01Conta contaVia = new Aula01Conta();
		
		contaProf.cliente = "Ricardo Oda ";
		contaProf.saldo = 100.00;
		contaProf.exibirSaldo();
		contaVia.cliente = "Via Varejo ";
		contaVia.saldo = 10000.00;
		contaVia.exibirSaldo();
		
		contaProf.saca(50.00);
		contaProf.exibirSaldo();
		contaProf.deposito(100);
		contaProf.exibirSaldo();
		
		contaProf.transferencia(contaVia,  1000);
		contaProf.exibirSaldo();
		contaVia.transferencia(contaProf, 1000);
		contaProf.exibirSaldo();
	}

}

package br.com.via.lp;

public class Aula04MetodosComRetorno {

	public static double somar(double a, double b) {
	     return a + b;
	}
	public static double somar(int a, int b) {
	     return a + b;
	}
	
	
	public static String pares(int valor) {
		String retorno = " Espaço";
		for (int a = 0; a<= valor; a = a +2)
			retorno += a + "Espaço";
	
		return retorno;
	}
	
	public static int contaLetras(String palavra, char letra) {
		
		int quantidade = 0;
		
		palavra = palavra.toUpperCase();
		
		for(int i =0 ; i < palavra.length(); i++ ) {
			if(palavra.charAt(i) == letra) {
				quantidade++;
			}
	    
		}
	return quantidade;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(contaLetras("Alexandre",'x'));
	}

}

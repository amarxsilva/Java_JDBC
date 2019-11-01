package br.com.via.lp;

public class Aula04MetodosSemretorno {
	
public static void imprimir(String texto) {
	System.out.println(texto);
}
public static void somar(String a, int b, int c) {
	System.out.println(a+ b+ c);
}
public static void sexo(char c) {
	if (c== 'F') {
		System.out.println("feminino");
	}else if(c == 'M') {
		System.out.println("Masculino");
	}else {
		System.out.println("Sexo Indefinido");
	}
}
public static void main(String[] args) {
	imprimir("Via Varejo");
	somar("a", 10, 30);
	sexo('F');
}
}


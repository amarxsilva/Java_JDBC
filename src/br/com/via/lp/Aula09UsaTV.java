package br.com.via.lp;

public class Aula09UsaTV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Estanciar as 2 tvs e implemntar os metodos delamudar de canal etc

		Aula09InterfaceTVLCD tvlcd = new Aula09InterfaceTVLCD(0);	
		System.out.println("tvlcd");
		tvlcd.ligar();
		tvlcd.aumentarVolume(5);
		tvlcd.diminuirVolume(2);
		tvlcd.ligar();
		
		Aula09InterfaceTVTubo tvtubo = new Aula09InterfaceTVTubo(0);	
		System.out.println("tvtubo");
		tvtubo.ligar();
		tvtubo.aumentarVolume(5);
		tvtubo.diminuirVolume(2);
		tvtubo.ligar();
	
		
	}

}

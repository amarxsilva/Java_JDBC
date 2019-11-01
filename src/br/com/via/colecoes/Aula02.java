package br.com.via.colecoes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class Aula02 {

	public static void main(String[] args) {
		Map<Object,String > mp = new HashMap<Object,String>();
		mp.put(new Integer(1),"Um");
		mp.put(new Integer(2),"Dois");
		mp.put(new Integer(5),"Cinco");
		mp.put(new Integer(0),"Dois");
		mp.put(new Integer(1),"Tres");
		
		Set s = mp.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext()) {
			Map.Entry m = (Map.Entry) it.next();
			String valor = (String) m.getKey();
			int key  = (int) m.getValue();
			System.out.println("" + "Chave: " + key + "valor: "+ valor);
		}
		
		
	}

}

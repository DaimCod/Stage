package es1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Erogatore {

	public static void main(String[] args) throws BevandaNonValidaException {
		
		Scanner tastiera = new Scanner(System.in);
		HashMap<String, Bevande> mappa = new HashMap<String, Bevande>();
		boolean exit = false;
		Bevande b1 = new Bevande("Acqua", 0.20);
		Bevande b2 = new Bevande("Coca", 0.50);
		Bevande b3 = new Bevande("Latte", 0.40);
		
		mappa.put("A", b1);
		mappa.put("B", b2);
		mappa.put("C", b3);
		
		while(!exit) {
			System.out.println("Selezionare il codice del prodotto da acquistare");
			for(String key : mappa.keySet()) {
				System.out.println(key + "." + mappa.get(key).toString());
			}
			System.out.println("0 per uscire");
			String risposta = "";
			
			boolean isInvalid;
			do {
				isInvalid = false;
				risposta = "";
				System.out.print("Codice: ");
				risposta = tastiera.next();
				boolean control = true;
				
				if(risposta.charAt(0) == '0')
					control = false;
				
				for(int i=0; i<risposta.length() && control; i++) {
					if(risposta.charAt(i) < 'A' || risposta.charAt(i) > 'Z') {
						System.out.println("Inserire un codice");
						isInvalid = true;
					}
				}
				
			}while(isInvalid == true);
			
			if(risposta.equals("0")) {
				exit = true;
				System.out.println("Uscita programma");
			}
			
			else {
				if(mappa.containsKey(risposta) == true)
					System.out.println(mappa.get(risposta).getNome() + " " + mappa.get(risposta).getPrezzo());
				else
					throw new BevandaNonValidaException("Codice non valido");
			}
				
		}
	}

}

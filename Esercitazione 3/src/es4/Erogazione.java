package es4;
import es3.Colonna;
import es1.Bevande;
import es2.TesseraNonValida;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Erogazione {
	public static void main(String[] args) throws TesseraNonValida, CreditoInsufficiente, BevandaEsaurita {
		Scanner tastiera = new Scanner(System.in);
		
		Tessera tessera1 = new Tessera(191919, 0.21);
		Tessera tessera2 = new Tessera(101010, 0);
		ArrayList<Tessera> tessera = new ArrayList<>();
		tessera.add(tessera1);
		tessera.add(tessera2);
		
		Bevande b1 = new Bevande("Acqua", 0.20);
		Bevande b2 = new Bevande("Coca", 0.50);
		Bevande b3 = new Bevande("Latte", 0.35);
		
		HashMap<String, Bevande> distributore = new HashMap<>();
		distributore.put("A", b1);
		distributore.put("B", b2);
		distributore.put("C", b3);
		distributore.put("D", b1);
		
		ArrayList<Colonna> colonna = new ArrayList<>();
		Colonna c1 = new Colonna();
		Colonna c2 = new Colonna();
		Colonna c3 = new Colonna();
		Colonna c4 = new Colonna();
		colonna.add(c1);
		colonna.add(c2);
		colonna.add(c3);
		colonna.add(c4);
		
		colonna.get(0).aggiornaColonna(b1, 0);
		colonna.get(1).aggiornaColonna(b2, 25);
		colonna.get(2).aggiornaColonna(b3, 15);
		colonna.get(3).aggiornaColonna(b1, 10);
		
		for(String key : distributore.keySet()) {
			System.out.println(key + "." + distributore.get(key).toString());
		}
		
		boolean isInvalid;
		double prezzo = 0;
		String codice;
		do {
			isInvalid = false;
			codice = "";
			System.out.println("Inserire il codice della bevanda");
			codice = tastiera.next();
			
			if(codice.charAt(0) < 'A' || codice.charAt(0) > 'D') {
				System.out.println("Codice errato, scegliere tra:\nA, B, C, D");
				isInvalid = true;
			}
		}while(isInvalid == true);
		
		int lattineDisponibili = 0;
		for(int i = 0; i < colonna.size(); i++) {
			
			String nomeCol = colonna.get(i).getBevanda().getNome();
			String nomeDis = distributore.get(codice).getNome();
			if(nomeCol.equals(nomeDis)) {
				prezzo = colonna.get(i).getBevanda().getPrezzo();
				lattineDisponibili += colonna.get(i).getNumeroLattine();
			}
		}
		
		System.out.println("Lattine disponibili " + lattineDisponibili);
		
		String numeroTessera;
		if(lattineDisponibili > 0) {	
			do {
				isInvalid = false;
				numeroTessera = "";
				System.out.println("Inserire numero tessera");
				numeroTessera = tastiera.next();
				
				if(numeroTessera.charAt(0) < '1' || numeroTessera.charAt(0) > '9') {
					System.out.println("Il codice è composto da solo numeri");
					isInvalid = true;
				}
			}while(isInvalid == true);
			
			System.out.println("Verifico la tessera...");
			boolean found = false;
			Tessera card = new Tessera();
			
			for(int i = 0; i < tessera.size() && !found; i++) {
				if(tessera.get(i).getCodice() == Integer.parseInt(numeroTessera)) {
					card = tessera.get(i);
					found = true;
					System.out.println("Tessera verificata con successo");
				}
			}
			
			if(found == false)
				throw new TesseraNonValida("Non esiste tessera con questo codice");
			if(card.getCredito() < prezzo)
				throw new CreditoInsufficiente();
			
			System.out.println("Erogazione...");
			System.out.println("Soldi prima: " + card.getCredito());
			System.out.println("Colonna di erogazione " + eroga(card, colonna, distributore, codice));
			System.out.println("Soldi dopo: " + card.getCredito());
		}
		
		else {
			throw new BevandaEsaurita();
		}
	}
	
	public static int eroga(Tessera tessera, ArrayList<Colonna> col, HashMap<String, Bevande> hm, String codice) {
		int colonna = 0;
		for(int i = 0; i < col.size(); i++) {	
			String nomeCol = col.get(i).getBevanda().getNome();
			String nomeDis = hm.get(codice).getNome();
			if(nomeCol.equals(nomeDis)) {
				if(col.get(i).getNumeroLattine() > 0) {
					colonna = i+1;
					tessera.decrementaCredito(col.get(i).getBevanda().getPrezzo());
					col.get(i).setNumeroLattine(col.get(i).getNumeroLattine()-1);
				}
			}
		}
		return colonna;
	}
}

package es3;
import es1.Bevande;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

public class Distributore {
	
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		
		Bevande b1 = new Bevande("Acqua", 0.20);
		Bevande b2 = new Bevande("Coca", 0.50);
		Bevande b3 = new Bevande("Latte", 0.35);
		
		HashMap<String, Bevande> distributore = new HashMap<>();
		distributore.put("A", b1);
		distributore.put("B", b2);
		distributore.put("C", b3);
		distributore.put("D", b1);
		
		Colonna c1 = new Colonna();
		Colonna c2 = new Colonna();
		Colonna c3 = new Colonna();
		Colonna c4 = new Colonna();
		ArrayList<Colonna> colonna = new ArrayList<>();
		colonna.add(c1);
		colonna.add(c2);
		colonna.add(c3);
		colonna.add(c4);
		
		colonna.get(0).aggiornaColonna(b1, 40);
		colonna.get(1).aggiornaColonna(b2, 25);
		colonna.get(2).aggiornaColonna(b3, 15);
		colonna.get(3).aggiornaColonna(b1, 10);
		
		for(String key : distributore.keySet()) {
			System.out.println(key + "." + distributore.get(key).toString());
		}
		
		int lattineDisponibili = 0;
		boolean isInvalid;
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
		
		for(int i = 0; i < colonna.size(); i++) {
			String nomeCol = colonna.get(i).getBevanda().getNome();
			String nomeDis = distributore.get(codice).getNome();
			if(nomeCol.equals(nomeDis)) {
				lattineDisponibili += colonna.get(i).getNumeroLattine();
			}
		}
	
		
		System.out.println("Lattine disponibili: " + lattineDisponibili);
		
	}
}

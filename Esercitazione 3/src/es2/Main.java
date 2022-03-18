package es2;
import java.util.HashMap;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws TesseraNonValida{
		Scanner tastiera = new Scanner(System.in);
		HashMap<Integer, TesseraCredito> tessera = new HashMap<Integer, TesseraCredito>();
		TesseraCredito t1 = new TesseraCredito(12, 5.5);
		TesseraCredito t2 = new TesseraCredito(21, 10.0);
		TesseraCredito t3 = new TesseraCredito(99, 0.75);
		tessera.put(1, t1);
		tessera.put(2, t2);
		tessera.put(3, t3);
		
		String scelta = "";
	
		System.out.println("Di quale carta si vuole avere i dettagli?");
		System.out.println("Le tue tessere sono:");
		for(int key : tessera.keySet()) {
			System.out.println(key + " Codice: " + tessera.get(key).getCodice());
		}
		
		boolean isInvalid;
		do {
			isInvalid = false;
			scelta = "";
			System.out.print("Effettuare una scelta: ");
			scelta = tastiera.next();
			
			for(int i=0; i<scelta.length(); i++)
			if(scelta.charAt(i) < '1' || scelta.charAt(i) > '9') {
				System.out.println("Inserire un numero corrispondente a una tessera");
				isInvalid = true;
			}
		}while(isInvalid == true); 
		
		int sceltaCon = Integer.parseInt(scelta);
		
		if(tessera.containsKey(sceltaCon)) {
			System.out.println("Credito presente nella tessera numero: "+ tessera.get(sceltaCon).getCodice() + " e' pari a: " +tessera.get(sceltaCon).getCreditoDisponibile());
		}
		else
			throw new TesseraNonValida("tessera non valida");

	}

}

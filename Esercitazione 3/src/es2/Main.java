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
		
		System.out.println("Dato che siamo davanti ad una macchinetta "
				+ "c'e' la presenza di solo tastierino numerico\nquindi l'utente "
				+ "pur volendo inserire una stringa non ci riescirebbe e per questo\n"
				+ "non ho gestito le stringhe");
		
		int scelta = 0;
	
		System.out.println("Di quale carta si vuole avere i dettagli?");
		System.out.println("Le tue tessere sono:");
		for(int key : tessera.keySet()) {
			System.out.println(key + " Codice: " + tessera.get(key).getCodice());
		}
		System.out.print("Effettuare una scelta: ");
		scelta = tastiera.nextInt();
		if(tessera.containsKey(scelta)) {
			System.out.println("Credito presente nella tessera numero: "+ tessera.get(scelta).getCodice() + " e' pari a: " +tessera.get(scelta).getCreditoDisponibile());
		}
		else
			throw new TesseraNonValida("tessera non valida");

	}

}

package esercizio5;

import java.util.Scanner;

public class Question {
	
	Scanner tastiera = new Scanner(System.in);
	
	private String domanda, rispostaCorretta;
	private int punteggio;
	
	public Question() {
		
	}
	
	public Question(String domanda, String risposta, int punteggio) {
		this.domanda = domanda;
		this.rispostaCorretta = risposta;
		this.punteggio = punteggio;
	}
	
	public int ask() {
		System.out.println("La domanda e': " + this.getDomanda());
		System.out.print("Risposta: ");
		String risposta = tastiera.nextLine();
		System.out.println();
		if(risposta.equalsIgnoreCase(rispostaCorretta))
			return punteggio;
		else
			return 0;
	}

	public String getDomanda() {
		return domanda;
	}

	public String getRispostaCorretta() {
		return rispostaCorretta;
	}

	public int getPunteggio() {
		return punteggio;
	}
	
}

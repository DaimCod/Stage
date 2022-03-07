package esercizio5;

public class NumericQuestion extends Question {

	public NumericQuestion() {

	}

	public NumericQuestion(String domanda, String risposta, int punteggio) {
		super(domanda, risposta, punteggio);
		
	}
	
	@Override
	public int ask() {
		int risposta;
	
		System.out.println("La domanda e': " + this.getDomanda());
		System.out.println("Rispondere con un numero");
		System.out.print("Risposta: ");
		risposta = tastiera.nextInt();
		System.out.println();
	
		if(Integer.parseInt(this.getRispostaCorretta()) == risposta)
			return this.getPunteggio();
		else
			return 0;
	}

}

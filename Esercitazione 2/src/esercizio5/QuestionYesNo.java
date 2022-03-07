package esercizio5;

public class QuestionYesNo extends Question {

	public QuestionYesNo() {
		
	}

	public QuestionYesNo(String domanda, String risposta, int punteggio) {
		super(domanda, risposta, punteggio);
		
	}
	
	@Override
	public int ask() {
		String risposta;
		do {
			System.out.println("La domanda e': " + this.getDomanda());
			System.out.println("Rispondere con Yes oppure No");
			System.out.print("Risposta: ");
			risposta = tastiera.next();
			System.out.println();
		} while(!(risposta.equalsIgnoreCase("yes") || risposta.equalsIgnoreCase("no")));
		
		if(risposta.equalsIgnoreCase(this.getRispostaCorretta()))
			return this.getPunteggio();
		else
			return 0;
	}

}

package esercizio5;

public class MultipleQuestion extends NumericQuestion {

	private int multipleChoice;
	
	public MultipleQuestion() {

	}

	public MultipleQuestion(String domanda, String risposta, int punteggio, int n) {
		super(domanda, risposta, punteggio);
		this.multipleChoice = n;
	}
	
	@Override
	public int ask() {
		String risposta = "";
		boolean isInvalid;
		do {
			isInvalid = false;
			risposta = "";
			System.out.println("La domanda e': " + this.getDomanda());
			System.out.println("Rispondere con un numero");
			System.out.print("Risposta: ");
			risposta = tastiera.next();
			for(int i = 0; i < risposta.length() && !isInvalid; i++) {
				if(risposta.charAt(i) < '0' || risposta.charAt(i) > '9')
					isInvalid = true;
				
			}
		}while(isInvalid == true);
		
		if(Integer.parseInt(this.getRispostaCorretta()) == Integer.parseInt(risposta))
			return this.getPunteggio();
		else
			return 0;
	}
	
	public int getMultipleChoice() {
		return multipleChoice;
	}

}

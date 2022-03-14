package es2;

public class TesseraCredito {
	private int codice;
	private double creditoDisponibile;
	
	public TesseraCredito() {
		
	}
	
	public TesseraCredito(int codice, double credito) {
		this.codice = codice;
		creditoDisponibile = credito;
	}
	
	public void caricaTessera(double credito) {
		this.setCreditoDisponibile(credito);
	}

	public int getCodice() {
		return codice;
	}

	public void setCodice(int codice) {
		this.codice = codice;
	}

	public double getCreditoDisponibile() {
		return creditoDisponibile;
	}

	public void setCreditoDisponibile(double creditoDisponibile) {
		this.creditoDisponibile = creditoDisponibile;
	}

	@Override
	public String toString() {
		return "[codice=" + codice + ", creditoDisponibile=" + creditoDisponibile + "]";
	}
	
	
}

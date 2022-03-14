package es4;

public class Tessera {
	private int codice;
	private double credito;
	
	public Tessera() {
		
	}
	
	public Tessera(int codice, double credito) {
		this.codice = codice;
		this.credito = credito;	
	}
	
	public void decrementaCredito(double spesa) {
		double newCredito = getCredito() - spesa;
		setCredito(newCredito);
	}
	
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public double getCredito() {
		return credito;
	}
	public void setCredito(double credito) {
		this.credito = credito;
	}

	@Override
	public String toString() {
		return "[codice=" + codice + ", credito=" + credito + "]";
	}
	
	
	
	
}

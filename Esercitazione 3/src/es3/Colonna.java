package es3;
import es1.Bevande;
public class Colonna {
	private Bevande bevanda;
	private int numeroLattine;
	
	public Colonna() {
		
	}
	
	public Colonna(Bevande bevanda, int numeroLattine) {
		this.bevanda = bevanda;
		this.numeroLattine = numeroLattine;
	}
	
	public void aggiornaColonna(Bevande bevanda, int numeroLattine) {
		this.setBevanda(bevanda);
		this.setNumeroLattine(numeroLattine);
	}
	
	public void decrementaLattine() {
		int newLattine = getNumeroLattine() - 1;
		setNumeroLattine(newLattine);
	}
	
	public int lattineDisponibili() {
		return numeroLattine;
	}

	public Bevande getBevanda() {
		return bevanda;
	}

	public void setBevanda(Bevande bevanda) {
		this.bevanda = bevanda;
	}

	public int getNumeroLattine() {
		return numeroLattine;
	}

	public void setNumeroLattine(int numeroLattine) {
		this.numeroLattine = numeroLattine;
	}
	
	
}

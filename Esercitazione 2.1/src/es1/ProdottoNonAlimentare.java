package es1;

public class ProdottoNonAlimentare extends Prodotto {

	String materiale;
	
	public ProdottoNonAlimentare() {
		super();
		materiale = null;
	}
	
	public ProdottoNonAlimentare(String codiceBarre, String descrizione, int prezzo, String materiale) {
		super(codiceBarre, descrizione, prezzo);
		this.materiale = materiale;
	}
	
	@Override
	public int applicaSconto() {
		switch(this.materiale) {
		case "plastica": case "Plastica":
		case "vetro": case "Vetro":
		case "carta": case "Carta":
			return this.getPrezzo()-(this.getPrezzo()*10/100);
		default:
			return this.getPrezzo();
		}
	}

	public String getMateriale() {
		return materiale;
	}

	public void setMateriale(String materiale) {
		this.materiale = materiale;
	}
	
	

}

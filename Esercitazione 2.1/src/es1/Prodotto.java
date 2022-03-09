package es1;

public class Prodotto {
	private String codiceBarre;
	private String descrizione;
	private int prezzo;
	
	public Prodotto() {
		
	}
	
	public Prodotto(String codiceBarre, String descrizione, int prezzo) {
		this.codiceBarre = codiceBarre;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
	}
	
	public int applicaSconto() {
		return prezzo-(prezzo*5/100);
	}
	
	@Override
	public String toString() {
		return "["+codiceBarre+"]" + ", dettagli prodotto=" + descrizione + ", prezzo="+prezzo;
	}
	
	public String getCodiceBarre() {
		return codiceBarre;
	}
	
	public void setCodiceBarre(String nuovoCodice) {
		codiceBarre = nuovoCodice;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public int getPrezzo() {
		return prezzo;
	}
	
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
}

package es1;

import java.util.Date;

public class ProdottoAlimentare extends Prodotto {

	Date dataScadenza;
	Date today;
	
	public ProdottoAlimentare() {
		super();
		dataScadenza = new Date(0);
		today = new Date();
	}

	public ProdottoAlimentare(String codiceBarre, String descrizione, int prezzo, long data) {
		super(codiceBarre, descrizione, prezzo);
		dataScadenza = new Date(data);
		today = new Date();
	}
	
	@Override
	public int applicaSconto() {
		//864,000,000 sono i millisecondi che passano in 10 giorni
		if(today.getTime() - dataScadenza.getTime() == 864000000){
			return this.getPrezzo()-(this.getPrezzo()*20/100);
		}
		else
			return this.getPrezzo();
	}

	public Date getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(Date dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

}

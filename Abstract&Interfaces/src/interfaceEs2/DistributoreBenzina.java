package interfaceEs2;

public class DistributoreBenzina implements Comparable {
	
	private String citta, proprietario;
	private int capacita, benzinaAttuale, incasso;
	
	public DistributoreBenzina() {
		
	}
	
	public DistributoreBenzina(String citta, String proprietario, int capacita, int benzinaAttuale) {
		this.citta = citta;
		this.proprietario = proprietario;
		this.capacita = capacita;
		this.benzinaAttuale = benzinaAttuale;
		incasso = 0;
	}
	
	public void erogazione(int eroga) {
		if(eroga > getCapacita())
			return;
		setBenzinaAttuale(getCapacita() - eroga);
		setIncasso(eroga);
	}
	
	@Override
	public void compare(DistributoreBenzina other) {
		if(this.getCapacita() > other.getCapacita())
			System.out.print(this.getProprietario() + " ha più capacità");
		else
			System.out.print(other.getProprietario() + " ha più capacità");
	}
	
	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getCapacita() {
		return capacita;
	}

	public void setCapacita(int capacita) {
		this.capacita = capacita;
	}

	public int getBenzinaAttuale() {
		return benzinaAttuale;
	}

	public void setBenzinaAttuale(int benzinaAttuale) {
		this.benzinaAttuale = benzinaAttuale;
	}

	public int getIncasso() {
		return incasso;
	}

	public void setIncasso(int erogato) {
		this.incasso = erogato * 2;
	}

}

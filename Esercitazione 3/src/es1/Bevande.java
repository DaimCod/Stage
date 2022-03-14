package es1;
import java.util.Scanner;

public class Bevande {
	
	Scanner tastiera = new Scanner(System.in);
	private String nome;
	private double prezzo;
	private String descrizione;
	
	public Bevande() {
		
	}
	
	public Bevande(String nome, double prezzo) {
		this.nome = nome;
		this.prezzo = prezzo;
	}
	
	public void aggiungiBevanda() {
		System.out.println("Aggiungi una descrizione: ");
		descrizione = tastiera.nextLine();
		System.out.println("Descrizione aggiunta con successo");
	}
	
	@Override
	public String toString() {
		return "[nome=" + nome + ", prezzo=" + prezzo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Bevande other = (Bevande) obj;
		if (nome == null) {
			if (other.nome != null) {
				return false;
			}
		} else if (!nome.equalsIgnoreCase(other.nome)) {
			return false;
		}
		return true;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	public double getDescrizione() {
		return prezzo;
	}

	public void setDescrizione(String descr) {
		this.descrizione = descr;
	}
	
	
}

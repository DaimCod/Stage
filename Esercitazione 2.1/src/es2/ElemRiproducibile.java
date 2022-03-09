package es2;

public abstract class ElemRiproducibile implements Multimedia {
	
	private int durata;
	private int volume;
	private String titolo;
	
	public void esegui() {
		play();
	}
	public void weaker() {
		this.volume -= 1;
	}
	
	public void louder() {
		this.volume += 1;
	}
	
	public abstract void play();
	
	public int getDurata() {
		return durata;
	}
	public void setDurata(int durata) {
		this.durata = durata;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	
}

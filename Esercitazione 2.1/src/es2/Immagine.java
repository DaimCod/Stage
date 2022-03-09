package es2;

public class Immagine implements Multimedia {
	
	private String titolo;
	private int luminosita;
	
	public Immagine() {
		
	}
	
	public Immagine(String titolo, int luminosita) {
		this.titolo = titolo;
		this.luminosita = luminosita;
	}
	
	public void brighter() {
		luminosita -= 1;
	}
	
	public void darker() {
		luminosita += 1;
	}

	@Override
	public void esegui() {
		show();
	}
	
	public void show() {
		String ast = "";
		for(int i = 0; i < getLuminosita(); i++) {
			ast += "*";
		}
		System.out.println(titolo + ast);
	}
	
	public int getLuminosita() {
		return luminosita;
	}

	public void setLuminosita(int luminosita) {
		this.luminosita = luminosita;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

}

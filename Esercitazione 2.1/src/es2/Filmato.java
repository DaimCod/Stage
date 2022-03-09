package es2;

public class Filmato extends ElemRiproducibile {

	private int brightness;
	
	public Filmato() {
		
	}
	
	public Filmato(String titolo, int durata, int volume, int luminosita) {
		this.setTitolo(titolo);
		this.setDurata(durata);
		this.setVolume(volume);
		brightness = luminosita;
	}
	
	@Override
	public void play() {
		String punti = "";
		String asterischi = "";
		
		for(int i = 0; i < getVolume(); i++) {
			punti += "!";
		}
		for(int i = 0; i < getBrightness(); i++) {
			asterischi += "*";
		}
		for(int i = 0; i < getDurata(); i++) {
			System.out.println(getTitolo() + punti + asterischi);
		}
		
	}

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}

}

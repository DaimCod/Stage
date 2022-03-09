package es2;

public class Audio extends ElemRiproducibile {

	public Audio() {
		
	}
	
	public Audio(String titolo, int durata, int volume) {
		setTitolo(titolo);
		setDurata(durata);
		setVolume(volume);
	}
	

	@Override
	public void play() {
		String punti = "";
		
		for(int i = 0; i < getVolume(); i++) {
			punti += "!";
		}
		for(int i = 0; i < getDurata(); i++) {
			System.out.println(getTitolo() + punti);
		}
	}

}

package es1;

public class Cliente {
	boolean tesseraFedeltą;
	
	public Cliente() {
		tesseraFedeltą = false;
	}
	
	public Cliente(boolean tessera) {
		tesseraFedeltą = tessera;
	}

	public boolean getTesseraFedeltą() {
		return tesseraFedeltą;
	}

	public void setTesseraFedeltą(boolean tesseraFedeltą) {
		this.tesseraFedeltą = tesseraFedeltą;
	}
	
}

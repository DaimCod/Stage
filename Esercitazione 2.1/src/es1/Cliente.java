package es1;

public class Cliente {
	boolean tesseraFedeltà;
	
	public Cliente() {
		tesseraFedeltà = false;
	}
	
	public Cliente(boolean tessera) {
		tesseraFedeltà = tessera;
	}

	public boolean getTesseraFedeltà() {
		return tesseraFedeltà;
	}

	public void setTesseraFedeltà(boolean tesseraFedeltà) {
		this.tesseraFedeltà = tesseraFedeltà;
	}
	
}

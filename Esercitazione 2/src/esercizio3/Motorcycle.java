package esercizio3;

public class Motorcycle extends Vehicle {
	
	private int cilindrata;
	
	public Motorcycle() {
		super();
		cilindrata = 0;
	}

	public Motorcycle(String targa, String marca, String modello, boolean guasto, int cilindrata) {
		super(targa, marca, modello, guasto);
		this.cilindrata = cilindrata;
	}
	
	public int getCilindrata() {
		return cilindrata;
	}

}

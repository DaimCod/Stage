package esercizio3;

public class Car extends Vehicle {
	
	private String tipologia;
	
	public Car() {
		super();
		tipologia = null;
	}

	public Car(String targa, String marca, String modello, boolean guasto, String tipo) {
		super(targa, marca, modello, guasto);
		tipologia = tipo;
	}
	
	public String getTipologia() {
		return tipologia;
	}

}

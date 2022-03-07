package esercizio1;

public class Stagista extends Person {
	
	private int numberOfPresence, idNumber;
	

	public Stagista() {
		super();
		this.numberOfPresence = 0;
		idNumber = 0;
	}

	public Stagista(String surname, String name, String tax_code, String city, int numberOfPresence, int idNumber) {
		super(surname, name, tax_code, city);
		this.numberOfPresence = numberOfPresence;
		this.idNumber = idNumber;
	}

	public int getNumberOfPresence() {
		return numberOfPresence;
	}

	public void setNumberOfPresence(int numberOfPresence) {
		this.numberOfPresence = numberOfPresence;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

}

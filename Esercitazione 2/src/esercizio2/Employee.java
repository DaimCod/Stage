package esercizio2;

import esercizio1.Person;

public class Employee extends Person {
	
	private int annoAssunzione;
	private int stipendio;

	public Employee() {
		super();
		annoAssunzione = 0;
		stipendio = 0;
	}

	public Employee(String surname, String name, String tax_code, String city, 
			int annoAssunzione, int stipendio) {
		super(surname, name, tax_code, city);
		this.annoAssunzione = annoAssunzione;
		this.stipendio = stipendio;
	}
	
	public boolean gainsMore(Employee other) {
		if(this == other)
			return true;
		if(this.getStipendio() > other.getStipendio())
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		return "Employee ["
				+ "Nome=" + getName()
				+ ", Cognome=" + getSurname()
				+ ", tax code=" + getTax_code()
				+ ", annoAssunzione=" + getAnnoAssunzione() + ", stipendio=" + getStipendio() + "]";
	}

	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}
	
	public void setAnnoAssunzione(int annoAssunzione) {
		this.annoAssunzione = annoAssunzione;
	}
	
	public int getStipendio() {
		return stipendio;
	}
	
	public int getAnnoAssunzione() {
		return annoAssunzione;
	}
}

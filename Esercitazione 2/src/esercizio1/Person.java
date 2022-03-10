package esercizio1;

public class Person {
	private String surname, name, tax_code, city;
	
	public Person() {
		surname = null;
		name = null;
		tax_code = null;
		city = null;
	}
	
	public Person(String surname, String name, String tax_code, String city) { 
		this.surname = surname;
		this.name = name;
		this.tax_code = tax_code;
		this.city = city;
	}
	
	public String bornYear() {
		
		if(this.getTax_code() == null) {
			return "Error: invalid tax code";
		}
		
		String year = this.tax_code.substring(6, 8);
		int tmp = Integer.parseInt(year);
		
		if(tmp >= 00 && tmp <= 22) {
			year = "20"+year;
		}
		else {
			year = "19"+year;
		}
		return year;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTax_code() {
		return tax_code;
	}

	public void setTax_code(String tax_code) {
		this.tax_code = tax_code;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
}

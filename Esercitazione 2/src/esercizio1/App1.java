package esercizio1;

public class App1 {

	public static void main(String[] args) {
		Person persona = new Person("Scott", "Travis", "AAAAAA97B05B456B", "Milano");
		System.out.println("Person's name is " + persona.getName());
		System.out.println("Person's surname is " + persona.getSurname());
		System.out.println("Person's born year is " + persona.bornYear());
	
		Stagista[] stagista = new Stagista[3];
		stagista[0] = new Stagista("M", "Huncho", "BBBBBB97B05C456C", "California", 100, 8000);
		stagista[1] = new Stagista("Trippie", "Red", null, "New York", 120, 9000);
		stagista[2] = new Stagista("Post", "Malone", "DDDDDD95Z05Z456Z", "Dallas", 125, 5000);
		
		int pointer = 0;
		int min = 0, max = 0;
		for(int i = 0; i < stagista.length; i++) {
			if(stagista[i].getTax_code() != null) {
				min = Integer.parseInt(stagista[i].bornYear());
				if(min > max) {
					int tmp = min;
					max = min;
					min = tmp;
					pointer = i;
				}
			}
		}

		System.out.println("Youngest inter's name is "+stagista[pointer].getName());
		System.out.println("Youngest inter's surname is "+stagista[pointer].getSurname());
		System.out.println("Youngest inter's tax code is "+stagista[pointer].getTax_code());
		System.out.println("Youngest inter's city is "+stagista[pointer].getCity());
	
	}

}

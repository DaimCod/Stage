package esercizio2;

public class App2 {

	public static void main(String[] args) {
		
		Employee[] dipendente = new Employee[3];
		dipendente[0] = new Employee("A", "AA", "AAAAAA00A01A123A", "Milano", 2013, 1600);
		dipendente[1] = new Employee("B", "BB", "BBBBBB00B02A456B", "Roma", 2009, 2000);
		dipendente[2] = new Employee("C", "CC", "CCCCCC00C02C789C", "Napoli", 2019, 1500);
		
		for(int i=0; i< dipendente.length; i++) {
			for(int j = i+1; j < dipendente.length; j++) {
				if(dipendente[i].gainsMore(dipendente[j])) {
					Employee tmp = dipendente[j];
					dipendente[j] = dipendente[i];
					dipendente[i] = tmp;
				}
			}
		}
		
		for(int i=0; i < dipendente.length; i++)
			System.out.println(dipendente[i].toString());
	}

}

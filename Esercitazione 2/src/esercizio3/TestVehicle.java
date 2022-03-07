package esercizio3;

public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle[] veicolo = new Vehicle[5];
		veicolo[0] = new Car("AA000AA", "Audi", "RS4", false, "Station wagon");
		veicolo[1] = new Car("BB111BB", "Mercedes", "C-Class", false, "Sport");
		veicolo[2] = new Car("CC222CC", "Opel", "Corsa", false, "Utilitaria");
		veicolo[3] = new Motorcycle("DD444DD", "Harley-Davidson", "Street-glide", false, 1868);
		veicolo[4] = new Motorcycle("EE555EEE", "Husqvarna", "Norden 901", false, 889);
		
		veicolo[0].setGuasto(true);
		veicolo[1].setGuasto(true);
		veicolo[4].setGuasto(true);
		
		for(int i=0; i<veicolo.length; i++) {
			if(veicolo[i].isGuasto())
				System.out.println("Targa="+veicolo[i].getTarga());
		}

	}

}

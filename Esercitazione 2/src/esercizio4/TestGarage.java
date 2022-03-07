package esercizio4;
import esercizio3.*;

public class TestGarage {

	public static void main(String[] args) {
		
		Vehicle[] veicolo = new Vehicle[5];
		veicolo[0] = new Car("AA000AA", "Audi", "RS4", false, "Station wagon");
		veicolo[1] = new Car("BB111BB", "Mercedes", "C-Class", true, "Sport");
		veicolo[2] = new Car("CC222CC", "Opel", "Corsa", false, "Utilitaria");
		veicolo[3] = new Motorcycle("DD444DD", "Harley-Davidson", "Street-glide", false, 1800);
		veicolo[4] = new Motorcycle("EE555EEE", "Husqvarna", "Norden 901", true, 50);
		
		Garage garage = new Garage();
		
		for(int i=0; i < veicolo.length; i++) {
			System.out.println("Veicolo "+veicolo[i].getTarga());
			System.out.println("Prezzo riparazione" + garage.repair(veicolo[i]));
		}
	}

}

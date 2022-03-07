package esercizio4;

import esercizio3.Vehicle;
import esercizio3.Car;
import esercizio3.Motorcycle;

public class Garage {
	
	public Garage() {
		
	}
	
	public int repair(Vehicle veicolo) {
		int prezzo=0;
		Car macchina = new Car();
		Motorcycle moto = new Motorcycle();
		
		if(veicolo.isGuasto()) {
			if(veicolo.getClass() == macchina.getClass()) {
				macchina = (Car)veicolo;
				switch(macchina.getTipologia()) {
				case "Station wagon":
					prezzo = 100;
					break;
				case "Sport":
					prezzo = 300;
					break;
				case "Utilitaria":
					prezzo = 50;
					break;
				}
			}
			else {
				moto = (Motorcycle)veicolo;
				if(moto.getCilindrata() > 0 && moto.getCilindrata() < 50)
					prezzo = 50;
				else if(moto.getCilindrata() >= 50 && moto.getCilindrata() < 150)
					prezzo = 100;
				else if(moto.getCilindrata() >= 150)
					prezzo = 300;
			}
		}
		else {
			if(veicolo.getClass() == macchina.getClass())
				prezzo = 30;
			else
				prezzo = 20;
		}
		
		return prezzo;
	}
}

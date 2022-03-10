package es2;

import java.util.Scanner;

public class LettoreMultimediale {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		Multimedia[] m1 = new Multimedia[5];
		int counter = 0, durata, brightness, volume, conversioneScelta = 0;
		String titolo, scelta, durataStr, brightnessStr, volumeStr;
		
		for(int i = 0; i < m1.length; i++) {
			boolean isInvalid;
			do {
				isInvalid = false;
				scelta = "";
				System.out.println("Cosa vuoi aggiungere?\n1.Filmato\n2.Audio\n3.Immagine");
				System.out.print("Risposta: ");
				scelta = tastiera.next();
				for(int j = 0; j < scelta.length() && !isInvalid; j++) {
					if(scelta.charAt(j) < '0' || scelta.charAt(j) > '9')
						isInvalid = true;
				}
				if(isInvalid == true) {
					System.out.println("Devi inserire un numero da 1 a 3");
				}
			}while(isInvalid == true);
			
			conversioneScelta = Integer.parseInt(scelta);
			
			switch(conversioneScelta) {
			case 1:
				System.out.print("Come si chiama il filmato: ");
				titolo = tastiera.next();
				
				do {
					isInvalid = false;
					System.out.print("Quanto dura, inserire un numero: ");
					durataStr = tastiera.next();
					for(int j = 0; j < durataStr.length() && !isInvalid; j++) {
						if(durataStr.charAt(j) < '0' || durataStr.charAt(j) > '9')
							isInvalid = true;
					}
					if(isInvalid == true) {
						System.out.println("Devi inserire un numero");
					}
				}while(isInvalid == true);
				durata = Integer.parseInt(durataStr);
				
				do {
					isInvalid = false;
					System.out.print("A che volume si vuole vedere, inserire un numero: ");
					volumeStr = tastiera.next();
					for(int j = 0; j < volumeStr.length() && !isInvalid; j++) {
						if(volumeStr.charAt(j) < '0' || volumeStr.charAt(j) > '9')
							isInvalid = true;
					}
					if(isInvalid == true) {
						System.out.println("Devi inserire un numero");
					}
				}while(isInvalid == true);
				volume = Integer.parseInt(volumeStr);
				
				do {
					isInvalid = false;
					System.out.print("Quanto e' la luminosità, inserire un numero: ");
					brightnessStr = tastiera.next();
					for(int j = 0; j < brightnessStr.length() && !isInvalid; j++) {
						if(brightnessStr.charAt(j) < '0' || brightnessStr.charAt(j) > '9')
							isInvalid = true;
					}
					if(isInvalid == true) {
						System.out.println("Devi inserire un numero");
					}
				}while(isInvalid == true);
				brightness = Integer.parseInt(brightnessStr);
				
				m1[i] = new Filmato(titolo, durata, volume, brightness);
				break;
			case 2:
				System.out.print("Come si chiama l'audio?");
				titolo = tastiera.next();

				do {
					isInvalid = false;
					System.out.print("Quanto dura, inserire un numero: ");
					durataStr = tastiera.next();
					for(int j = 0; j < durataStr.length() && !isInvalid; j++) {
						if(durataStr.charAt(j) < '0' || durataStr.charAt(j) > '9')
							isInvalid = true;
					}
					if(isInvalid == true) {
						System.out.println("Devi inserire un numero");
					}
				}while(isInvalid == true);
				durata = Integer.parseInt(durataStr);
				
				do {
					isInvalid = false;
					System.out.print("A che volume si vuole vedere, inserire un numero: ");
					volumeStr = tastiera.next();
					for(int j = 0; j < volumeStr.length() && !isInvalid; j++) {
						if(volumeStr.charAt(j) < '0' || volumeStr.charAt(j) > '9')
							isInvalid = true;
					}
					if(isInvalid == true) {
						System.out.println("Devi inserire un numero");
					}
				}while(isInvalid == true);
				volume = Integer.parseInt(volumeStr);
				
				m1[i] = new Audio(titolo, durata, volume);
				break;
			case 3:
				System.out.print("Come si chiama l'immagine?");
				titolo = tastiera.next();
				do {
					isInvalid = false;
					System.out.print("Quanto e' la luminosità, inserire un numero: ");
					brightnessStr = tastiera.next();
					for(int j = 0; j < brightnessStr.length() && !isInvalid; j++) {
						if(brightnessStr.charAt(j) < '0' || brightnessStr.charAt(j) > '9')
							isInvalid = true;
					}
					if(isInvalid == true) {
						System.out.println("Devi inserire un numero");
					}
				}while(isInvalid == true);
				brightness = Integer.parseInt(brightnessStr);
				m1[i] = new Immagine(titolo, brightness);
				break;
			default:
				break;
			}
		}
		
		Filmato f1 = new Filmato();
		Audio a1 = new Audio();;
		Immagine i1 = new Immagine();
		String eseguiNum;
		
		do {
			
			for(int i = 0; i < m1.length; i++) {
				if(m1[i].getClass() == f1.getClass()) {
					f1 = (Filmato)m1[i];
					System.out.println(i+1 +"." + f1.getTitolo());
				}
				else if(m1[i].getClass() == a1.getClass()) {
						a1 = (Audio)m1[i];
						System.out.println(i+1 +"." + a1.getTitolo());
				}
				else if(m1[i].getClass() == i1.getClass()) {
						i1 = (Immagine)m1[i];
						System.out.println(i+1 +"." + i1.getTitolo());
				}
			}
			
			boolean isInvalid;
			do {
				isInvalid = false;
				eseguiNum = "";
				System.out.println("Cosa vuoi riprodurre?");
				System.out.print("Risposta: ");
				eseguiNum = tastiera.next();
				for(int j = 0; j < eseguiNum.length() && !isInvalid; j++) {
					if(eseguiNum.charAt(j) < '0' || eseguiNum.charAt(j) > '5')
						isInvalid = true;
				}
				if(isInvalid == true) {
					System.out.println("Devi inserire un numero da 1 a 5, 0 per uscire");
				}
			}while(isInvalid == true);
			
			conversioneScelta = Integer.parseInt(eseguiNum);
			
			if(conversioneScelta-1 >= 0 && conversioneScelta-1 <=5)
				m1[conversioneScelta-1].esegui();
			
		} while(conversioneScelta > 0 && conversioneScelta < 6);
		
		System.out.println("Uscita programma.");
	
	}

}

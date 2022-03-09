package es2;

import java.util.Scanner;

public class LettoreMultimediale {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		Multimedia[] m1 = new Multimedia[5];
		int counter = 0, durata, brightness, volume, scelta = 0;
		String titolo;
		
		for(int i = 0; i < m1.length; i++) {
			do {
			System.out.println("Cosa vuoi aggiungere?\n1.Filmato\n2.Audio\n3.Immagine");
			System.out.print("Scegli: ");
			scelta = tastiera.nextInt();
			} while(scelta < 1 || scelta > 3);
			
			switch(scelta) {
			case 1:
				System.out.print("Come si chiama il filmato: ");
				titolo = tastiera.next();
				System.out.print("Quanto dura: ");
				durata = tastiera.nextInt();
				System.out.print("A che volume si vuole vedere: ");
				volume = tastiera.nextInt();
				System.out.print("Quanto e' la luminosità: ");
				brightness = tastiera.nextInt();
				m1[i] = new Filmato(titolo, durata, volume, brightness);
				break;
			case 2:
				System.out.print("Come si chiama l'audio?");
				titolo = tastiera.next();
				System.out.print("Quanto dura?");
				durata = tastiera.nextInt();
				System.out.print("A che volume si vuole vedere?");
				volume = tastiera.nextInt();
				m1[i] = new Audio(titolo, durata, volume);
				break;
			case 3:
				System.out.print("Come si chiama l'immagine?");
				titolo = tastiera.next();
				System.out.print("Quanto e' la luminosità?");
				brightness = tastiera.nextInt();
				m1[i] = new Immagine(titolo, brightness);
				break;
			default:
				break;
			}
		}
		
		Filmato f1 = new Filmato();
		Audio a1 = new Audio();;
		Immagine i1 = new Immagine();
		int eseguiNum = 0;
		
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
			
			do {
			System.out.println("Quale oggetto eseguire? scegliere un numero da 1 a 5, 0 per uscire");
			eseguiNum = tastiera.nextInt();
			}while(eseguiNum > 5);
			
			if(eseguiNum-1 >= 0 && eseguiNum-1 <=5)
				m1[eseguiNum-1].esegui();
			
		} while(eseguiNum > 0 && eseguiNum < 6);
	
	}

}

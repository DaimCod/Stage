package es1;
import java.util.Scanner;

public class ListaSpesa {
	static Scanner tastiera = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(true);
		int costoTotale = 0, conversioneSelezione = 0;
		String selezione = "";

		Prodotto[] prodotto = new Prodotto[5];
		prodotto[0] = new ProdottoAlimentare("0111", "Bistecca di manzo", 8, 1646089200000L);
		prodotto[1] = new ProdottoAlimentare("0222", "Uova", 2, 1645916400000L);
		prodotto[2] = new ProdottoNonAlimentare("0333", "Specchio", 5, "vetro");
		prodotto[3] = new Prodotto("0444", "Portafoglio", 4);
		prodotto[4] = new ProdottoNonAlimentare("0555", "Scrivania", 25, "legno");
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Che prodotto vuoi acquistare? inserire il numero");
			for(int j = 0; j < 5; j++) {
				System.out.println((j+1)+"."+prodotto[j]);
			}

			boolean isInvalid;
			do {
				do {
					isInvalid = false;
					selezione = "";
					System.out.println("Rispondere con un numero");
					System.out.print("Risposta: ");
					selezione = tastiera.next();
					for(int k = 0; k < selezione.length() && !isInvalid; k++) {
						if(selezione.charAt(k) < '0' || selezione.charAt(k) > '9')
							isInvalid = true;
					}
				}while(isInvalid == true);
				conversioneSelezione = Integer.parseInt(selezione);
				if(conversioneSelezione > 5 || conversioneSelezione < 1) {
					System.out.println("Devi inserire un numero tra 1 e 5");
					isInvalid = true;
				}
			}while(isInvalid == true);
			
				
			if(c1.getTesseraFedeltà() == true) {
				switch(conversioneSelezione) {
					case 1:
						costoTotale += prodotto[0].applicaSconto();
						break;
					case 2:
						costoTotale += prodotto[1].applicaSconto();
						break;
					case 3:
						costoTotale += prodotto[2].applicaSconto();
						break;
					case 4:
						costoTotale += prodotto[3].applicaSconto();
						break;
					case 5:
						costoTotale += prodotto[4].applicaSconto();
						break;
				}
			}
			else {
				switch(conversioneSelezione ) {
				case 1:
					costoTotale += prodotto[0].getPrezzo();
					break;
				case 2:
					costoTotale += prodotto[1].getPrezzo();
					break;
				case 3:
					costoTotale += prodotto[2].getPrezzo();
					break;
				case 4:
					costoTotale += prodotto[3].getPrezzo();
					break;
				case 5:
					costoTotale += prodotto[4].getPrezzo();
					break;
				}
			}
		}
		
		System.out.print("il costo totale e' di " + costoTotale + " euro");

	}

}

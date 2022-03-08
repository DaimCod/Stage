package abstractEs2;

public class Dado extends Gioco {

	@Override
	public void lancia() {
		System.out.print("Lancio del dado..");
		int valore = (int)(Math.random()*100);
		
		if(valore < 15)
			System.out.println("E' uscito " + 1);
		else if(valore < 30)
			System.out.println("E' uscito " + 2);
		else if(valore < 45)
			System.out.println("E' uscito " + 3);
		else if(valore < 60)
			System.out.println("E' uscito " + 4);
		else if(valore < 75)
			System.out.println("E' uscito " + 5);
		else
			System.out.println("E' uscito " + 6);
		
	}

}

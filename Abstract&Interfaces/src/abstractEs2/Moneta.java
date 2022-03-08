package abstractEs2;

public class Moneta extends Gioco{
	@Override
	public void lancia() {
		int valore = (int)(Math.random()*100);
		System.out.print("Lancio della moneta..");
		if(valore < 50)
			System.out.println("E' uscito testa");
		else
			System.out.println("E' uscito croce");
	}
}

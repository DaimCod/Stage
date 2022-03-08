package abstractEs2;

public class TestGioco {

	public static void main(String[] args) {
		
		Gioco g1 = new Dado();
		g1.lancia();
		
		Gioco g2 = new Moneta();
		g2.lancia();

	}

}

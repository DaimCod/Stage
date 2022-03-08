package abstractEs1;

public class Test {

	public static void main(String[] args) {
		Figura f1 = new Parallelepipedo();
		f1.calcolaVolume(3, 5);
		f1.stampaVolume();
		
		Figura f2 = new Cilindro();
		f2.calcolaVolume(10, 3);
		f2.stampaVolume();

	}

}

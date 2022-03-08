package interfaceEs3;

public class Sum implements Operazione {

	private int somma;
	
	public Sum() {
		somma = 0;
	}
	
	public Sum(int a, int b) {
		somma = a + b;
	}
	
	@Override
	public int esegui(int a, int b) {
		Sum tot = new Sum(a, b);
		return tot.getSomma();
	}
	
	public int getSomma() {
		return somma;
	}

}

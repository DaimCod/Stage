package interfaceEs3;

public class Substract implements Operazione {

	private int sottrazione;
	
	public Substract() {
		sottrazione = 0;
	}
	
	public Substract(int a, int b) {
		sottrazione = a - b;
	}
	
	@Override
	public int esegui(int a, int b) {
		Substract tot = new Substract(a, b);
		return tot.getSottrazione();
	}
	
	public int getSottrazione() {
		return sottrazione;
	}

}

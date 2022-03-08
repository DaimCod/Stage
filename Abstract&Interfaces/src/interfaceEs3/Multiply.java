package interfaceEs3;

public class Multiply implements Operazione {

	private int moltiplicazione;
	
	public Multiply() {
		moltiplicazione = 0;
	}
	
	public Multiply(int a, int b) {
		moltiplicazione = a * b;
	}
	
	@Override
	public int esegui(int a, int b) {
		Multiply tot = new Multiply(a, b);
		return tot.getMoltiplicazione();
	}
	
	public int getMoltiplicazione() {
		return moltiplicazione;
	}

}

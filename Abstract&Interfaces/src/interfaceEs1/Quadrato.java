package interfaceEs1;

public class Quadrato implements Numero {
	
	public int a;
	
	public Quadrato(int a) {
		this.a = a*a;
	}
	
	@Override
	public Numero calcola(int a) {
		Numero quadrato = new Quadrato(a);
		return quadrato;
	}
	
	@Override
	public void getNumero() {
		System.out.println("Il quadrato del numero passato e' = " + a);
	}

}

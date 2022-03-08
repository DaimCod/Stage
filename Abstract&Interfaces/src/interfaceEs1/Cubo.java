package interfaceEs1;

public class Cubo implements Numero {

	public int a;
	
	public Cubo(int a) {
		this.a = a*a*a;
	}
	
	@Override
	public Numero calcola(int a) {
		Numero cubo = new Cubo(a);
		return cubo;
	}
	
	@Override
	public void getNumero() {
		System.out.println("Il quadrato del numero passato e' = " + a);
	}

}

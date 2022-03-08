package interfaceEs3;

public class Division implements Operazione {

	private int divisione;
	
	public Division() {
		divisione = 0;
	}
	
	public Division(int a, int b) {
		if(b == 0)
			System.out.print("ERRORE");
		else
			divisione = a/b;
	}
	
	@Override
	public int esegui(int a, int b) {
		Division tot = new Division(a, b);
		return tot.getDivisione();
	}
	
	public int getDivisione() {
		return divisione;
	}

}

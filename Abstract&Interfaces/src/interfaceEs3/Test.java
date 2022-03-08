package interfaceEs3;

public class Test {

	public static void main(String[] args) {
		Operazione somma = new Sum();
		Operazione sub = new Substract();
		Operazione mul = new Multiply();
		Operazione div = new Division();
		
		System.out.println("Somma " + somma.esegui(4, 3));
		System.out.println("Sottrazione " + sub.esegui(4, 3));
		System.out.println("Moltiplicazione " + mul.esegui(4, 3));
		System.out.println("Divisione " + div.esegui(4, 3));
	}

}

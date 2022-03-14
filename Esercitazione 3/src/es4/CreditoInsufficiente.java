package es4;

public class CreditoInsufficiente extends Exception {
	
	public CreditoInsufficiente() {
		super();
	}
	public CreditoInsufficiente(String msg) {
		super(msg);
	}
}

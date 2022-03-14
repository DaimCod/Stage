package es2;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Es2 {
	static Scanner tastiera = new Scanner(System.in);
	public static void main(String[] args) {
		int n;
		System.out.println("Da quanti valori deve essere costituita?");
		n = tastiera.nextInt();
		LinkedList<Integer> ll = creaRandomCrescente(n);
		
		Iterator iter = ll.iterator();
		stampa(iter);
		
		provaEx2();
	}
	
	public static LinkedList<Integer> creaRandomCrescente(int n) {
		int number = (int)(Math.random()*100);
		LinkedList<Integer> ll = new LinkedList<>();
		
		for(int i=0; i < n; i++) {
			ll.add(number);
			number += (int)(Math.random()*100);
		}
		return ll;
	}
	
	public static void provaEx2() {
		LinkedList<String> a = new LinkedList<>();
		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("5");
		a.add("6");
		a.add("7");
		a.add("8");
		a.add("9");
		a.add("10");
		//stringa che genera eccezione
		a.add("ciao");
		
		LinkedList<Integer> number = parseString(a);
		Iterator iter = number.iterator();
		stampa(iter);
	}
	
	public static LinkedList<Integer> parseString(LinkedList<String> a){
		LinkedList<Integer> list = new LinkedList<>();
		Iterator iter = a.iterator();
		while(iter.hasNext()) {
			int n = Integer.parseInt((String) iter.next());
			list.add(n);
		}
		return list;
	}
	
	public static void stampa(Iterator iter) {
		while(iter.hasNext()) {
			System.out.print("<" + iter.next() + ">, ");
		}
		System.out.println();
	}
}

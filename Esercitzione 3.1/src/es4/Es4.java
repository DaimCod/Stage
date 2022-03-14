package es4;
import java.util.LinkedList;
import java.util.Scanner;

public class Es4 {

	public static void main(String[] args) {
		int n = 0;
		Scanner tastiera = new Scanner(System.in);
		System.out.print("Inserire un numero: ");
		n = tastiera.nextInt();
		LinkedList<LinkedList<Integer>> result;
		result = insiemeDiInsiemi(n);
		
		stampa(result);
	}
	
	public static LinkedList<LinkedList<Integer>> insiemeDiInsiemi(int n){
		
		LinkedList<LinkedList<Integer>> smt = new LinkedList<LinkedList<Integer>>();
		for(int i=0; i<n; i++) {
			LinkedList<Integer> tmp = new LinkedList<>();
			for(int j=0; j<i; j++) {
				tmp.add(j);
			}
			smt.add(tmp);
		}
		return smt;
	}
	
	public static void stampa(LinkedList<LinkedList<Integer>> list) {
		System.out.println(list);
	}

}

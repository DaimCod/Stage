package es4;
import java.util.LinkedList;
import java.util.Scanner;

public class Es4 {

	public static void main(String[] args) {
		String n = "";
		Scanner tastiera = new Scanner(System.in);
		
		boolean isInvalid;
		do {
			isInvalid = false;
			n = "";
			System.out.println("Inserire un numero");
			n = tastiera.next();
			
			for(int i=0; i<n.length(); i++)
				if(n.charAt(i) < '0' || n.charAt(i) > '9') {
					isInvalid = true;
				}
		}while(isInvalid == true);
		
		int num = Integer.parseInt(n);
		
		LinkedList<LinkedList<Integer>> result;
		result = insiemeDiInsiemi(num);
		
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

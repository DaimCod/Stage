package es3;

import java.util.Iterator;
import java.util.LinkedList;

public class Es3 {

	public static void main(String[] args) {
		LinkedList<Integer> merged = provaEx3();
		Iterator i = merged.iterator();
		stampa(i);
	}
	
	public static LinkedList<Integer> provaEx3() {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		LinkedList<Integer> result = new LinkedList<>();
		
		list1.add(10);
		list1.add(30);
		list1.add(50);
		list1.add(70);
		list1.add(90);
		
		list2.add(20);
		list2.add(40);
		list2.add(60);
		list2.add(80);
		list2.add(100);
		
		Iterator iter1 = list1.iterator();
		Iterator iter2 = list2.iterator();
		
		result = mergeOrdinato(iter1, iter2);
		return result;
	}

	public static LinkedList<Integer> mergeOrdinato(Iterator<Integer> iter1, Iterator<Integer> iter2){
		LinkedList<Integer> merge = new LinkedList<>();
		boolean hasNext = true;
		while(hasNext) {
			if(iter1.hasNext() == true && iter2.hasNext()==true) {
				int a = iter1.next();
				int b = iter2.next();
				if(a <= b) {
					merge.add(a);
					merge.add(b);
				}
				else {
					merge.add(a);
					merge.add(b);
				}
			}
			else
				hasNext=false;
		}
		return merge;
	}
	
	public static void stampa(Iterator iter) {
		while(iter.hasNext()) {
			System.out.print("<" + iter.next() + ">, ");
		}
		System.out.println();
	}
}

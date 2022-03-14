package es1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Es1 {
	static Scanner tastiera = new Scanner(System.in);
	public static void main(String[] args) {
		provaEx1();
		provaEx1Array();
	}
	
	public static LinkedList<Integer> creaRandom(int n, int max){
		LinkedList<Integer> list = new LinkedList<>();
		int num;
		for(int i = 0; i < n; i++) {
			 num = (int)(Math.random()*max-1);
			list.add(num);
		}
		
		return list;
	}
	
	public static void stampa(Iterator iter) {
		while(iter.hasNext()) {
			System.out.print("<" + iter.next() + ">, ");
		}
		System.out.println();
	}
	
	public static void provaEx1() {
		System.out.println("*****************LINKED LIST*****************");
		
		int n = 4, max;
		
		System.out.print("Quale deve essere il max numero?");
		max = tastiera.nextInt();
		LinkedList<Integer> ll = creaRandom(n, max);
		
		Iterator iter = ll.iterator();
		stampa(iter);
	}
	
	public static void provaEx1Array() {
		System.out.println("*****************ARRAY LIST*****************");
		int n = 4, max;
		System.out.print("Quale deve essere il max numero?");
		max = tastiera.nextInt();
		ArrayList<Integer> ll = creaRandomArray(n, max);
		
		Iterator iter = ll.iterator();
		stampa(iter);
	}
	
	public static ArrayList<Integer> creaRandomArray(int n, int max){
		ArrayList<Integer> array = new ArrayList<>();
		int num;
		for(int i = 0; i < n; i++) {
			num = (int)(Math.random()*max-1);
			array.add(num);
		}
		return array;
	}
}

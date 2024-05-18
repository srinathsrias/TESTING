package org.list.indexof;

import java.util.*;

public class AddIndex {
	public static void main(String[] args) {
		List<Integer> l= new LinkedList(Arrays.asList(10,20,30,90,10,10,40,50));
		System.out.println(l);
		l.add(2, 50);
		System.out.println(l);
		
		
		l.add(70);
		System.out.println(l);
		
		l.add(8,80);
		System.out.println(l);
	
		l.add(10,100);
		System.out.println(l);
	}
}

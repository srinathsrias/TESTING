package org.list.indexof;

import java.util.*;

public class Removee {
	public static void main(String[] args) {
		List l= new LinkedList(Arrays.asList(10,20,30,40,50,60));
		l.remove(2);
		System.out.println(l);
		
		
//		List l1= new LinkedList(Arrays.asList(10,20,30,90,10,10,40));
//		l1.remove(10);
//		System.out.println(l1);// index out ofBound Exception
//		
		List l2= new LinkedList(Arrays.asList(10,20,30,90,10,10,40));
		l2.remove(5);
		System.out.println(l2);
	}

}

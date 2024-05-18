package org.list.indexof;

import java.util.*;

public class Replace {
	public static void main(String[] args) {
		List<Integer> l=new LinkedList(Arrays.asList(100,200,300,400,500,600,700));
		l.set(2, 350);
		System.out.println(l);
		
		List<Integer> l1=new LinkedList(Arrays.asList(10,20,30,90,10,10,40,50,10));
		l1.set(7, 90);
		System.out.println(l1);
		
		List<Integer> l2=new LinkedList<>(Arrays.asList(10,20,30,90,10,10,40,50,30));
		l2.set(4, 100);
		l2.set(5, 100);
		System.out.println(l2);
	}

}

package org.list.indexof;

import java.util.*;

public class Index {

	public static void main(String[] args) {
		List l=new LinkedList(Arrays.asList(10,20,30,90));
		int io = l.indexOf(10);
		System.out.println(io);
		
		List l2=new LinkedList(Arrays.asList(10,20,30,90,10,10,40,50));
		int io1 = l2.indexOf(50);
		System.out.println(io1);
		
		List l3= new LinkedList(Arrays.asList(10,20,30,90,10,10,40,50));
		int io2 = l3.indexOf(90);
		System.out.println(io2);
		
		List l4=new LinkedList(Arrays.asList(10,20,30,90,10,10,40,50,10));
		int io3 = l4.indexOf(10);
		System.out.println(io3);
		
		List l5= new LinkedList(Arrays.asList(10,20,30,90,10,10,40,50,10));
		int io4 = l5.indexOf(70);
		System.out.println(io4);
		
		
	}
}

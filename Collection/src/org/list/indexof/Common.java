package org.list.indexof;

import java.util.*;

public class Common {

	public static void main(String[] args) {
		List<Integer> l=new LinkedList(Arrays.asList(10,20,30,90,10,10,40,50));
		List<Integer> l2= new LinkedList(Arrays.asList(30,40,50,60,80));
		l2.retainAll(l);
		System.out.println(l2);
		
		List<Integer> l3=new LinkedList(Arrays.asList(10,20,30,90,10,10,40,50));
		List<Integer> l4=new LinkedList(Arrays.asList(10,20,60,50,40,70,80,90));
		l3.retainAll(l4);
		System.out.println(l3);
		
		
		List<Integer> l5= new LinkedList(Arrays.asList(10,20,30,40,50,60,70,80));
		List<Integer> l6=new LinkedList(Arrays.asList(100,200,300,400,500,600,700,8000));
		l5.retainAll(l6);
		System.out.println(l5);
	}
}

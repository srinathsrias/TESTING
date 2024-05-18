package org.list.indexof;

import java.util.*;

public class RemoveAll {
	public static void main(String[] args) {
		List<Integer> l= new ArrayList(Arrays.asList(10,20,30,90,10,10,40,50));
		List<Integer> l1=new ArrayList(Arrays.asList(30,40,50,60,80));
		l.removeAll(l1);
		l1.removeAll(l);
		System.out.println(l);
		System.out.println(l1);
		
		
		List<Integer> l2=new ArrayList<>(Arrays.asList(10,20,30,90,10,10,40,50));
		List<Integer> l3=new ArrayList<>(Arrays.asList(10,20,60,50,40,70,80,90));
		l3.removeAll(l2);
		l2.removeAll(l3);
		System.out.println(l3);
		System.out.println(l2);
		
		
		
		List<Integer> l4=new ArrayList<>(Arrays.asList(10,20,30,40,50,60,70,80));
		List<Integer> l5=new ArrayList<>(Arrays.asList(100,200,300,400,500,600,700,8000));
		l4.removeAll(l5);
		System.out.println(l4);
	}

}

package org.list.indexof;

import java.util.*;

public class GetIndex {
	public static void main(String[] args) {
		List l =new LinkedList(Arrays.asList(10,20,30,40,50,60));
		Object g = l.get(2);
		System.out.println(g);
	
	
		List l1= new LinkedList(Arrays.asList(100,200,300,400,500,600,700));
		Object g1 = l1.get(4);
		System.out.println(g1);
		
		List<Integer> l2=new LinkedList<>(Arrays.asList(105,205,305,405,505,605,705,805));
		Integer g2 = l2.get(7);
		System.out.println(g2);
		
		
		System.out.println("==============Normal for Loop============");
		for(int i=0;i<l2.size();i++) {
			System.out.println(l2.get(i));	
		}
		
		System.out.println("=============Enhanced for loop===========");
		for(int x : l2) {
			System.out.println(x);
		}
		
		
		System.out.println("========for each=======");
		l2.forEach(System.out::println);
	}

}

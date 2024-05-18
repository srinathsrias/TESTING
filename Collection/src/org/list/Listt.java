package org.list;

import java.util.*;

public class Listt {
	
	public static void main(String[] args) {
		
		List<Integer> li =new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(80);
		li.add(10);
		
		System.out.println(li); // insertion order
		
		//get
		
		Integer g = li.get(5);
		System.out.println(g);
		
		//size
		int s = li.size();
		System.out.println(s);
		
		//indexOf
		System.out.println("====io==");
		int io = li.indexOf(40);
		System.out.println(io);
		
		//sort
		
		
		li.sort(null);
		System.out.println(li);
		
		//lastIndexOf
		
		int lo = li.lastIndexOf(10);
		System.out.println(lo);
		
		//contains
		
		boolean c = li.contains(40);
		System.out.println(c);
		
		//remove
		
		li.remove(2);
		System.out.println(li);
		
		//clear

//		li.clear();
//		System.out.println(li);

		
		//isEmpty
		boolean e = li.isEmpty();
		System.out.println(e);

		
		List l2=new LinkedList();
		
		
		//addAll
		l2.addAll(li);
		System.out.println(l2);
		
		l2.add(100);
		System.out.println(l2);
		
		
//		add(index, element);
		l2.add(3,200);
		System.out.println(l2);
		
		//set
		l2.set(3, 4000);
		System.out.println(l2);
		
		
		
		//retainAll
		l2.retainAll(li);
		System.out.println(l2);
		
		//AllValues
		System.out.println("=======normal for loop=====");
		
		for(int i=0;i<l2.size();i++) {
			
			System.out.println(l2.get(i));
		}
		
		System.out.println("=======Enhanced For loop=====");
		for (int x: li) {
			System.out.println(x);
			
		}
		System.out.println("=====for each=====");
		li.forEach(System.out::println);
		
		
		
		
		
		
	}
	

}

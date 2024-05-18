package org.set;

import java.util.*;

public class Sett {

	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet(Arrays.asList(10,20,30,40,20,10,60,70,50,30,80,30));
	
		System.out.println(s);
		
		//size
		int s1 = s.size();
		System.out.println(s1);
		
		//contains
		boolean c = s.contains(80);
		System.out.println(c);
		
		//remove
		s.remove(60);
		System.out.println(s);
		
		//clear
//		s.clear();
//		System.out.println(s);
		
		List <Integer> l=new LinkedList(Arrays.asList(10,20,30,40,20,30,10,50,60));
		System.out.println(l);
		Set <Integer> s2=new LinkedHashSet();
		s2.addAll(l);
		System.out.println(s2);
		
		//equals
		boolean e = s2.equals(s);
		System.out.println(e);
		
		System.out.println("Duplicate count "+(l.size()-s2.size()));
		
		System.out.println("======Enhanced for loop======");
		for(int x:s2) {
			System.out.println(x);
		}
		
		System.out.println("=======for each======");
		s2.forEach(System.out::println);
		
		Set <Character> s3=new TreeSet(Arrays.asList('1',' ','a','A','4','*','@'));
		System.out.println(s3);
	}
}

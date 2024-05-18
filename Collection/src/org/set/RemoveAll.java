package org.set;

import java.util.*;

public class RemoveAll {
	public static void main(String[] args) {
	

		Set<Integer> s=new HashSet(Arrays.asList(10,20,30,90,10,10,40,50));
		Set<Integer> s1=new HashSet(Arrays.asList(30,40,50,60,80));
		s.removeAll(s1);
		System.out.println(s);
		
		

		Set<Integer> s2=new LinkedHashSet(Arrays.asList(10,20,30,90,10,10,40,50));
		Set<Integer> s3=new LinkedHashSet(Arrays.asList(10,20,60,50,40,70,80,90));
		s2.removeAll(s3);
		System.out.println(s2);
		
		
		
		Set<Integer> s4=new TreeSet(Arrays.asList(10,20,30,40,50,60,70,80));
		Set<Integer> s5=new TreeSet(Arrays.asList(100,200,300,400,500,600,700,8000));
		s4.removeAll(s5);
		System.out.println(s4);
		
	}
}

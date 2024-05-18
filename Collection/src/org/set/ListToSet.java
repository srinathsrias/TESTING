package org.set;

import java.util.*;

public class ListToSet {
	public static void main(String[] args) {
		
		List l=new LinkedList(Arrays.asList(10,20,30,90,10,10,40,50));
		System.out.println(l);
		
		Set s= new LinkedHashSet();
		s.addAll(l);
		System.out.println(s);
		
		
		
		List l1 =new ArrayList(Arrays.asList(105,205,305,405,505,605,705,805,505,605));
		System.out.println(l1);
		
		Set s2=new TreeSet();
		s2.addAll(l1);
		System.out.println(s2);
		
		
		
		List l3 =new Vector(Arrays.asList(100,200,300,400,500,600,700,100,300,500));
		System.out.println(l3);
		
		Set s3=new TreeSet();
		s3.addAll(l3);
		System.out.println(s3);
	}

}

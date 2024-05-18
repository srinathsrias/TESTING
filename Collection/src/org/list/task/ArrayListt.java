package org.list.task;

import java.util.*;

public class ArrayListt {

	public static void main(String[] args) {
		
		//ArrayList
		List<Integer> l=new ArrayList<>(Arrays.asList(10,20,30,90,10,10,40,50));
		System.out.println(l);
		
		int s = l.size();
		System.out.println(s);
		
		//LinkedList
		
		List l1=new LinkedList(Arrays.asList(100,200,300,400,500,600,700,800));
		System.out.println(l1);
		int s1 = l1.size();
		System.out.println(s1);
		
		//Vector
		
		List l2=new Vector(Arrays.asList(105,205,305,405,505,605,705,805));
		System.out.println(l2);
		int s2 = l2.size();
		System.out.println(s2);
	
		//Size
		List l3=new LinkedList(Arrays.asList(100,200,300,400,500,600,700));
		System.out.println(l3);
		int s3 = l3.size();
		System.out.println(s3);
	}
}

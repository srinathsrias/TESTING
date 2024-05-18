package org.set;

import java.util.*;

public class CreateSet {
	public static void main(String[] args) {
		Set s= new HashSet(Arrays.asList(10,20,30,40,50,60,70,80,90,10,20));
		System.out.println(s);
		
		Set s1 =new LinkedHashSet(Arrays.asList(10,20,30,40,50,60,70,80,90,10,20));
		System.out.println(s1);
		
		Set s2=new TreeSet(Arrays.asList(10,20,30,40,50,60,70,80,90,10,20));
		System.out.println(s2);
	}

}

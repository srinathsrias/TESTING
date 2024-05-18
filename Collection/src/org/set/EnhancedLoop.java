package org.set;

import java.util.*;

public class EnhancedLoop {
	public static void main(String[] args) {
		Set<Integer> s=new LinkedHashSet(Arrays.asList(105,205,305,405,505,605,705,805));
		for(int x :s){
			System.out.println(x);
		}
		System.out.println("======TreeSet=======");
		Set<Integer> s2=new TreeSet(Arrays.asList(10,20,30,40,50,60,70,80,90,10,20));
		for(int y :s2) {
			System.out.println(y);
		}
		
		System.out.println("===HashSet===");
		Set<Integer> s3=new HashSet(Arrays.asList(10,20,30,40,50,60,70,80,90,10,20));
		for(int z: s3) {
			System.out.println(z);
		}
		
	}

}

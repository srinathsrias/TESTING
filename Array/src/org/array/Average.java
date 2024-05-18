package org.array;

import java.util.*;

public class Average {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the length ");
		int len = s.nextInt();
		int a[]=new int[len];
		int sum=0;
		double avg;
		System.out.println("enter the values");
		for(int i=0;i<len;i++) {
			a[i]=s.nextInt();
			sum=sum + a[i];
			
		}
		avg =sum/len;
		System.out.println(avg);
		
	}
}

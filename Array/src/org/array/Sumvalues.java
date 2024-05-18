package org.array;

import java.util.*;

public class Sumvalues {
	public static void main(String[] args) {
//		int a[]= {1,2,3,4,5,6,7,8,9,10};
//		int sum=0;
//		for(int i=0;i<a.length;i++) {
//			sum=sum+a[i];
//		}
//		System.out.println(sum);
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of the number");
		int len = s.nextInt();
		int a[]=new int [len];
		int sum=0;
		System.out.println("Enter the values");
		for(int i=0;i<len;i++) {
			a[i]=s.nextInt();
			sum=sum+a[i];
		}
		System.out.println(sum);	
	}
}

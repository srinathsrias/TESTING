package org.array;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int a[]= {1,20,10,20,30,30,50,50,40,10,80,69,40,80,60,40,90,90};
		Arrays.sort(a);
		int temp[]=new int[a.length];
		int rd=0;
		for (int i=0;i<a.length;i++) {
			if(temp[rd]!=a[i]) {
				rd++;
				temp[rd]=a[i];
				System.out.println(temp[rd]);
			}
			
			
		}
	}

}
